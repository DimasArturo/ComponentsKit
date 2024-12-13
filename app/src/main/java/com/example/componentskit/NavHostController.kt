package com.example.componentskit

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.componentskit.components.BadgeScreen
import com.example.componentskit.components.ButtonsScreen
import com.example.componentskit.components.CardScreen
import com.example.componentskit.components.CheckBoxScreen
import com.example.componentskit.components.DropDownScreen
import com.example.componentskit.components.IconsScreen
import com.example.componentskit.components.ImageScreen
import com.example.componentskit.components.IndicatorsScreen
import com.example.componentskit.components.PagerScreen
import com.example.componentskit.components.RadioScreen
import com.example.componentskit.components.SliderScreen
import com.example.componentskit.components.SwitchScreen
import com.example.componentskit.components.TextFieldScreen
import com.example.componentskit.components.TextScreen

@Composable
fun NavHostController(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){HomeScreen(navController)}
        composable("text"){TextScreen(navController)}
        composable("icon"){IconsScreen(navController)}
        composable("buttons"){ButtonsScreen(navController)}
        composable("textfield"){TextFieldScreen(navController)}
        composable("checkbox"){CheckBoxScreen(navController)}
        composable("switch"){SwitchScreen(navController)}
        composable("radio"){RadioScreen(navController)}
        composable("image"){ImageScreen(navController)}
        composable("indicators"){IndicatorsScreen(navController)}
        composable("badge"){BadgeScreen(navController)}
        composable("slider"){SliderScreen(navController)}
        composable("dropdown"){DropDownScreen(navController)}
        composable("card"){CardScreen(navController)}
        composable ("pager"){PagerScreen(navController)}
    }
}