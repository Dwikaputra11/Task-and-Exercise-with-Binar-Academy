package com.example.permissionexample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.FileProvider
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.example.permissionexample.databinding.ActivityDangerousPermissionBinding
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URI
import java.util.*


class DangerousPermission : AppCompatActivity() {
    private lateinit var binding: ActivityDangerousPermissionBinding
    private lateinit var uri: Uri
    companion object{
        const val STORAGE_PERMISSION_CODE = 41
        const val CAMERA_PERMISSION_CODE = 30
        const val CAMERA_REQUEST = 20
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDangerousPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenStorage.setOnClickListener {
            if(checkReadStoragePermission(this)){
                goToStorage()
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
            }else{
                requestPermissionsReadStorage(this)
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnOpenCamera.setOnClickListener {
            if(checkCameraPermission(this)){
                openCamera()
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
            }else{
                requestPermissionCamera(this)
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun requestPermissionCamera(context: Context) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(android.Manifest.permission.CAMERA), CAMERA_PERMISSION_CODE)
    }

    private fun checkCameraPermission(context: Context): Boolean {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val result = context.checkSelfPermission(android.Manifest.permission.CAMERA)
            return result == PackageManager.PERMISSION_GRANTED
        }
        return false
    }

    private fun requestPermissionsReadStorage(context: Context) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),STORAGE_PERMISSION_CODE)
    }

    private fun checkReadStoragePermission(context: Context): Boolean {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val result = context.checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            return result == PackageManager.PERMISSION_GRANTED
        }
        return false
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == STORAGE_PERMISSION_CODE){
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                goToStorage()
            }else{
                Toast.makeText(this, "User Denied Open storage Permission", Toast.LENGTH_SHORT).show()
            }
        }else if(requestCode == CAMERA_PERMISSION_CODE){
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                openCamera()
            }else{
                Toast.makeText(this, "User Denied Open Camera Permission", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private val takePicture = registerForActivityResult(ActivityResultContracts.TakePicture()){ success ->
        if(success){
            Glide.with(this)
                .load(uri)
                .placeholder(R.mipmap.ic_launcher_round)
                .circleCrop()
                .into(binding.ivCamera)
        }

    }

    private fun openCamera() {
        val photoFile = File.createTempFile(
            "IMG_",
            ".jpg",
            this.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        )

        Log.d("Dangerous Permission", "openCamera: ${photoFile.path}")

        uri  = FileProvider.getUriForFile(
            this,
            "${this.packageName}.provider",
            photoFile
        )
        Log.d("Dangerous Permission", "openCamera uri: ${uri.path}")
        takePicture.launch(uri)
    }


    private fun goToStorage(){
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        val uri = Uri.parse(Environment.getExternalStorageDirectory().path)
        intent.setDataAndType(uri, "text/csv")
        startActivity(Intent.createChooser(intent, "Open Folder"))
    }
}