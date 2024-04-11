package com.example.calmstate

sealed class Screen(val route: String) {

    object GetStarted: Screen("GetStarted")
    object HomePage: Screen("HomePage")

}