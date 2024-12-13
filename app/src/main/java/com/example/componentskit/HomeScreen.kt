package com.example.componentskit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.LinearScale
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Pages
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.SpaceBar
import androidx.compose.material.icons.filled.SwipeLeft
import androidx.compose.material.icons.filled.WifiProtectedSetup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Components Kit") })
        }
    ) { padding ->
        Column(modifier = Modifier
            .padding(padding)
            .verticalScroll(
                rememberScrollState()
            )
        ){

            ItemComponent("Text",
                Icons.Default.Edit,
                Modifier.clickable{
                    navController.navigate("text")
                }
            )

            ItemComponent("Icons",
                Icons.Default.Face,
                Modifier.clickable{
                    navController.navigate("icon")
                }
            )
            ItemComponent("Buttons",
                Icons.Default.AdsClick,
                Modifier.clickable{
                    navController.navigate("buttons")
                }
            )

            ItemComponent("TextField",
                Icons.Default.SpaceBar,
                Modifier.clickable{
                    navController.navigate("textfield")
                }
            )
            ItemComponent("CheckBox",
                Icons.Default.CheckBox,
                Modifier.clickable{
                    navController.navigate("checkbox")
                }
            )
            ItemComponent("Switch",
                Icons.Default.SwipeLeft,
                Modifier.clickable{
                    navController.navigate("switch")
                }
            )
            ItemComponent("Radio",
                Icons.Default.RadioButtonChecked,
                Modifier.clickable{
                    navController.navigate("radio")
                }
            )
            ItemComponent("Image",
                Icons.Default.Image,
                Modifier.clickable{
                    navController.navigate("image")
                }
            )
            ItemComponent("Indicators",
                Icons.Default.WifiProtectedSetup,
                Modifier.clickable{
                    navController.navigate("indicators")
                }
            )
            ItemComponent("Badge",
                Icons.Default.Notifications,
                Modifier.clickable{
                    navController.navigate("badge")
                }
            )
            ItemComponent("Sliders",
                Icons.Default.LinearScale,
                Modifier.clickable{
                    navController.navigate("slider")
                }
            )
            ItemComponent("DropDown",
                Icons.Default.ArrowDropDown,
                Modifier.clickable{
                    navController.navigate("dropdown")
                }
            )
            ItemComponent("Card",
                Icons.Default.Inbox,
                Modifier.clickable{
                    navController.navigate("card")
                }
            )
            ItemComponent("Pager",
                Icons.Default.Pages,
                Modifier.clickable{
                    navController.navigate("pager")
                }
            )
        }
    }
}