package com.example.fileprocessingexample.Utils

import android.content.Context
import android.os.Environment
import androidx.core.content.ContextCompat
import java.io.File

object Utils {
    const val pdfUrl = "https://kotlinlang.org/assets/kotlin-media-kit.pdf"
    const val viewType = "viewType"
    const val storage = "storage"
    const val internet = "internet"
    const val assets = "assets"
    fun getPdfNameFromAssets(): String {
        return "kotlin-media-kit.pdf"
    }
    fun getRootDirPath(context: Context): String {
        return if (Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()) {
            val file: File = ContextCompat.getExternalFilesDirs(
                context.applicationContext,
                null
            )[0]
            file.absolutePath
        } else {
            context.applicationContext.filesDir.absolutePath
        }
    }
}