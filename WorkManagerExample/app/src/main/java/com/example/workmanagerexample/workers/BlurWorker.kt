package com.example.workmanagerexample.workers

import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import java.lang.IllegalArgumentException

class BlurWorker(context: Context, params: WorkerParameters): Worker(context, params) {
    override fun doWork(): Result {
        val appContext = applicationContext
        val resourceUri = inputData.getString(KEY_IMAGE_URI)

//        Show Notification
        makeStatusNotification("Blurring Image", appContext)

        return try {
//            make sure ResourceUri from data is not empty
            if(TextUtils.isEmpty(resourceUri)){
                Log.d("Uri Status", "doWork: Invalid input uri")
                throw IllegalArgumentException("Invalid Input Uri")
            }
//            buat bitmap dari gambar (decodeSource), picture yang nantinya akan diteruskan
            val resolver = appContext.contentResolver
            val picture = BitmapFactory.decodeStream(
                resolver.openInputStream(Uri.parse(resourceUri)))

//            nge blurin image - get versi blur bitmap
            val output = blurBitmap(picture, appContext)

            // Write bitmap to a temp file
            val outputUri = writeBitmapToFile(appContext, output)

//            buat output URI sementara, agar dapat diakses untuk proses selanjutnya
            val outputData = workDataOf(KEY_IMAGE_URI to outputUri.toString())
            Result.success(outputData)

        }catch (throwable: Throwable){
            Log.e("Blur Status", "Error applying blur")
            throwable.printStackTrace()
            Result.failure()
        }
    }
}