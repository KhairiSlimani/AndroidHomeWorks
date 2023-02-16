package com.example.workshop3

sealed class NavScreens(val route: String) {
    object SplashScreen : NavScreens("SplashScreen")
    object CreateYourResumeP1 : NavScreens("CreateYourResumeP1")
    object CreateYourResumeP2 : NavScreens("CreateYourResumeP2")
    object YourResume : NavScreens("YourResume")
}