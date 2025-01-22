package com.example.littlelemonfinal

interface Destination {
    val route : String
}

object  Home : Destination {
    override val route  = "Home"
}

object  Onboarding : Destination {
    override val route  = "Onboarding"
}

object  Profile : Destination {
    override val route  = "Profile"
}

object DishDetails : Destination {
    override val route = "Menu"
    const val argDishId = "dishId"
}