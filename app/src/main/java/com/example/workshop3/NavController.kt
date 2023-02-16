package com.example.workshop3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavController(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = NavScreens.SplashScreen.route
    ) {

        composable(route = NavScreens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(route = NavScreens.CreateYourResumeP1.route) {
            CreateYourResumeP1(navController = navController)
        }

        composable(route = NavScreens.CreateYourResumeP2.route+"/{fullName}"+"/{email}"+"/{age}"+"/{selected}") { navBackStack ->
            val fullName = navBackStack.arguments?.getString("fullName")
            val email = navBackStack.arguments?.getString("email")
            val age = navBackStack.arguments?.getString("age")
            val selected = navBackStack.arguments?.getString("selected")

            CreateYourResumeP2(navController = navController,fullName= fullName,email=email,age=age,selected=selected)
        }
        composable(route = NavScreens.YourResume.route+"/{fullName}"+"/{email}"+"/{age}"+"/{selected}"+"/{androidSlider}"+"/{iosSlider}"+"/{flutterSlider}"+"/{ar}"+"/{fr}"+"/{en}"+"/{mu}"+"/{ga}"+"/{sp}") { navBackStack ->

            val fullName = navBackStack.arguments?.getString("fullName")
            val email = navBackStack.arguments?.getString("email")
            val age = navBackStack.arguments?.getString("age")
            val selected = navBackStack.arguments?.getString("selected")

            val androidSlider = navBackStack.arguments?.getString("androidSlider")
            val iosSlider = navBackStack.arguments?.getString("iosSlider")
            val flutterSlider = navBackStack.arguments?.getString("flutterSlider")

            val ar = navBackStack.arguments?.getString("ar")
            val fr = navBackStack.arguments?.getString("fr")
            val en = navBackStack.arguments?.getString("en")
            val mu = navBackStack.arguments?.getString("mu")
            val ga = navBackStack.arguments?.getString("ga")
            val sp = navBackStack.arguments?.getString("sp")

            YourResume(navController = navController, fullName = fullName , email = email, age = age, selected =selected,androidSlider=androidSlider,iosSlider = iosSlider,flutterSlider=flutterSlider,ar=ar,fr=fr,en=en,mu=mu,ga=ga,sp=sp )

        }
    }
}