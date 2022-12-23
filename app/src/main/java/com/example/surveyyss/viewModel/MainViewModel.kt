package com.example.surveyyss.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.surveyyss.repository.SurveyRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = SurveyRepository()
    var data = MutableLiveData<String>()

    fun getAllData() = viewModelScope.launch {
        repository.getClientData {
            data.value = it
        }
    }

}