/*
 * Copyright (c) 2021 syahbudinhamwar.All Rights Reserved
 */

package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }

    private val mNim = MutableLiveData<String>()
    val nim: LiveData<String>
        get() = mNim
    fun setNim(nim: String) {
        mNim.value = nim
    }

    private val mJurusan = MutableLiveData<String>()
    val jurusan: LiveData<String>
        get() = mJurusan
    fun setJurusan(jurusan: String) {
        mJurusan.value = jurusan
    }
 
}
