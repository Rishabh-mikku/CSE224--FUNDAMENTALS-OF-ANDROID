package com.example.cricketapp

import com.example.cricketapp.Screens.FirstScreen.route

sealed class Screens(val route : String){
    object FrontScreen : Screens("front_screen")
    object FirstScreen : Screens("first_screen")
    object SecondScreen : Screens("second_screen")
    object ThirdScreen : Screens("third_screen")
    object WC2011 : Screens("world_cup_2011")
    object WC2015 : Screens("world_cup_2015")
    object WC2019 : Screens("world_cup_2019")
    object Facts : Screens("facts")
    object Captains : Screens("captains")
}
