package com.example.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm.model.UserDAta
import com.example.mvvm.model.UserRepsitory
import kotlinx.coroutines.launch

class HomeViewmodel:ViewModel() {


    val userRepository: UserRepsitory = UserRepsitory()

    private val _userdata = MutableLiveData<UserDAta>()
    val userData: LiveData<UserDAta> = _userdata  //userdata for which we can provide to view


    fun getuserdata(){
        viewModelScope.launch {
            val userResult = userRepository.FetchUserData()
            _userdata.postValue(userResult)
        }
    }



}