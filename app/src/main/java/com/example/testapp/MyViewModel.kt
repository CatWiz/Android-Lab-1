package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var _counter = MutableLiveData<Int>(0)

    val counter: LiveData<Int> = _counter

    fun setCount(count: Int) {
        _counter.value = count
    }
}