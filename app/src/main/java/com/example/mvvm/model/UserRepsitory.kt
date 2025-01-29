package com.example.mvvm.model

import kotlinx.coroutines.delay

class UserRepsitory {


     suspend fun FetchUserData():UserDAta{
        delay(3000)
        return UserDAta("John",25)

    }
}