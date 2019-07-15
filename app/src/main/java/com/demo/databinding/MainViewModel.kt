package com.demo.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    val user = MutableLiveData<User>()

    fun changeInfo() {
        user.value = User("Tuan Anh", Random.nextInt(0,100))
    }
}