package com.example.componentskit.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back"
                        )
                    }
                },
                title = { Text(text = "DropDownScreen") })
        })
    {
        Column(modifier = Modifier.padding(it)) {

            var valuetext by remember {
                mutableStateOf("")
            }
            var expandedDropDown by remember {
                mutableStateOf(false)
            }

            Box(modifier = Modifier.fillMaxWidth().padding(16.dp)){
                TextField(
                    label = { Text(text = "Select an option") },
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = valuetext,
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = {
                        IconButton(onClick = { expandedDropDown = true }) {
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Go back"
                            )
                        }
                    }

                )

                DropdownMenu(
                    modifier = Modifier.fillMaxWidth(fraction = 0.9f),
                    expanded = expandedDropDown,
                    onDismissRequest = { }) {
                    DropdownMenuItem(text = { Text(text = "Kotlin") }, onClick = {
                        valuetext = "Kotlin"
                        expandedDropDown = false
                    })
                    DropdownMenuItem(text = { Text(text = "React Native") }, onClick = {
                        valuetext = "React Native"
                        expandedDropDown = false
                    })
                    DropdownMenuItem(text = { Text(text = "Flutter") }, onClick = {
                        valuetext = "Flutter"
                        expandedDropDown = false
                    })
                }
            }
        }
    }
}