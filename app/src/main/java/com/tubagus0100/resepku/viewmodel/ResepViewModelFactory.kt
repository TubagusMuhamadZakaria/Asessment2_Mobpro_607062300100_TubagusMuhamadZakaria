package com.tubagus0100.resepku.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tubagus0100.resepku.data.PreferenceManager
import com.tubagus0100.resepku.data.ResepRepository
import com.tubagus0100.resepku.ui.ResepViewModel

class ResepViewModelFactory(
    private val repository: ResepRepository,
    private val preferences: PreferenceManager
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResepViewModel::class.java)) {
            return ResepViewModel(repository, preferences) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}
