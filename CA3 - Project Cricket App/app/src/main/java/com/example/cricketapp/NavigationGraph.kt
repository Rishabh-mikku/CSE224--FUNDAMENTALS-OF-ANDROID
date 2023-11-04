package com.example.cricketapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cricketapp.FirstScreen as FirstScreen

@Composable

fun NavigationGraph(navController : NavHostController) {
    NavHost(navController = navController, startDestination = Screens.FrontScreen.route){

        composable(route=Screens.FrontScreen.route){
            FrontScreen(navController = navController)
        }
        composable(route=Screens.FirstScreen.route){
            FirstScreen(navController = navController)
        }
        composable(route=Screens.SecondScreen.route){
            SecondScreen(navController = navController)
        }
        composable(route=Screens.ThirdScreen.route){
            ThirdScreen(navController = navController)
        }
        composable(route=Screens.WC2011.route){
            WC2011(navController = navController)
        }
        composable(route=Screens.WC2015.route){
            WC2015(navController = navController)
        }
        composable(route=Screens.WC2019.route){
            WC2019(navController = navController)
        }
        composable(route=Screens.Facts.route){
            Facts(navController = navController)
        }
        composable(route=Screens.Captains.route){
            Captains(navController = navController)
        }
    }
}