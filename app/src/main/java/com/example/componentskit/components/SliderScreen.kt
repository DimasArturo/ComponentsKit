package com.example.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back")
                    }
                },
                title = { Text(text = "SliderScreen") })
        })
    {
        Column(modifier = Modifier.padding(it)){
            var sliderValue by remember{
                mutableFloatStateOf(0.2f)
            }
            Slider(
                colors = SliderDefaults.colors(
                    thumbColor = Color.LightGray,
                    activeTrackColor = Color.Blue,
                    inactiveTrackColor = Color.Black
                ),
                value =sliderValue ,
                onValueChange = {
                sliderValue = it
            })
            Text(text = sliderValue.toString(), fontSize = 30.sp)

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 20.dp)
            )

            var sliderValue2 by remember{
                mutableFloatStateOf(0.2f)
            }
            Slider(
                steps = 5,
                value =sliderValue2 ,
                onValueChange = {
                    sliderValue2 = it
                })
            Text(text = sliderValue2.toString(), fontSize = 30.sp)

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 20.dp)
            )

            var sliderValue3 by remember{
                mutableFloatStateOf(0f)
            }
            Slider(
                modifier = Modifier.padding(16.dp),
                steps = 9,
                valueRange = 0f..10f,
                value =sliderValue3 ,
                onValueChange = {
                    sliderValue3 = it
                })
            Text(text = sliderValue3.toString(), fontSize = 30.sp)

        }
    }
}