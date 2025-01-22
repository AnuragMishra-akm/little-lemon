package com.example.littlelemonfinal

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemonfinal.Intro.email
import com.example.littlelemonfinal.Intro.firstName

@Composable
fun Navigation(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =   if (firstName=="" && Intro.lastName=="" && email==""){
        Onboarding.route
    }else{
        Home.route
    }) {
        composable(Home.route) {
            HomeScreen(modifier = Modifier.Companion.padding(), navController)
        }
        composable(Onboarding.route) {
            Onboarding(modifier = Modifier.Companion.padding(), navController)
        }
        composable(Profile.route) {
            ProfileScreen()

        }
    }
}
