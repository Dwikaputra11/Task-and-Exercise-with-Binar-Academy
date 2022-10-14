package com.example.protodatastore

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel(application: Application): AndroidViewModel(application) {
    private val repository = UserPreferencesRepository(application)
    val dataUser = repository.readData.asLiveData()


    fun editData(name: String, pass:String) = viewModelScope.launch{
        repository.saveData(name, pass)
    }

    fun deleteData() = viewModelScope.launch {
        repository.clearData()
    }
}