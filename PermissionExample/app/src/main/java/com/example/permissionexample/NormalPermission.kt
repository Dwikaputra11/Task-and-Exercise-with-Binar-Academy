package com.example.permissionexample

import android.R
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.example.permissionexample.databinding.ActivityNormalPermissionBinding


class NormalPermission : AppCompatActivity() {
    private lateinit var binding: ActivityNormalPermissionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWifi.setOnClickListener {
            if(isWifiConnected(this)){
                Toast.makeText(this, "Wifi Connected", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Wifi Not Connected", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnInternetCheck.setOnClickListener {
            if(isInternetConnected(this)){
                Toast.makeText(this, "Internet Connected", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Internet Not Connected", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnBluetooth.setOnClickListener {
            if(isBluetoothActive(this)){
                Toast.makeText(this, "Bluetooth Is Active", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Bluetooth Not Active", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnPushNotif.setOnClickListener {
            displayNotification("Hello")
        }
    }

    private fun displayNotification(msg: String) {
        Log.d("Normal Permission", "Preparing to send notification...: $msg")
        val notificationManager = this
            .getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(
                "My_CH",
                "My Notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            // Configure the notification channel.
            notificationChannel.description = "Channel description"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.vibrationPattern = longArrayOf(0, 1000, 500, 1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        val builder: NotificationCompat.Builder = NotificationCompat.Builder(
            this, "My Ch"
        ).setSmallIcon(R.drawable.alert_dark_frame)
            .setContentTitle("GCM Notification")
            .setAutoCancel(true)
            .setDefaults(Notification.DEFAULT_ALL)
            .setStyle(NotificationCompat.BigTextStyle().bigText(msg))
            .setContentText(msg)
        notificationManager.notify(0,builder.build())
        Log.d("Normal Permission", "Notification sent successfully.")
    }

    private fun isBluetoothActive(context: Context): Boolean {
        val bluetoothAdapter = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
            (context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager).adapter
        }else{
            @Suppress("DEPRECATION")
            BluetoothAdapter.getDefaultAdapter()
        }

        return if(bluetoothAdapter == null){
            Toast.makeText(context, "Bluetooth is Not Supported in Your Device", Toast.LENGTH_SHORT).show()
            false
        }else{
            bluetoothAdapter.isEnabled
        }
    }

    private fun isInternetConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val network = connectivityManager.activeNetwork ?: return false
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

            return when{
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                else -> false
            }
        }else{
            @Suppress("DEPRECATION") val networkInfo = connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }

    }

    private fun isWifiConnected(context: Context): Boolean {
        val wifiManager: WifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        return if(wifiManager.isWifiEnabled){
            val wifiInfo = wifiManager.connectionInfo
            wifiInfo.networkId != -1
        }else false
    }
}