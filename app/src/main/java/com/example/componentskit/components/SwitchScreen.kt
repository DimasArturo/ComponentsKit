package com.example.componentskit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SwitchScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back")
                    }
                },
                title = { Text(text = "Switch Screen") })
        })
    {
        Column(modifier = Modifier.padding(it)){
            var checkedValue by remember {
                mutableStateOf(false)
            }
            Switch(
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    checkedTrackColor = Color.Blue,
                    uncheckedThumbColor = Color.White,
                    uncheckedTrackColor = Color.Red
                ),
                modifier = Modifier.padding(16.dp),
                checked = checkedValue, onCheckedChange = {
                checkedValue = it
            })

            HorizontalDivider()

            var checkedValue2 by remember {
                mutableStateOf(false)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(16.dp).fillMaxWidth()
            ){
                Text(text = "Habilitar Notificaciones")
                Switch(
                    modifier = Modifier.padding(16.dp),
                    checked = checkedValue2, onCheckedChange = {
                        checkedValue2 = it
                    })
            }
        }
    }
}