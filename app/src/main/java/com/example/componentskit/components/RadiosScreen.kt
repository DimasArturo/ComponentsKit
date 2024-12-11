package com.example.componentskit.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RadioScreen(navController: NavHostController) {
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
                title = { Text(text = "Radio Screen") })
        })
    {
        Column(modifier = Modifier.padding(it)) {
            //Ejemplo basico
            var selectedOption by remember { mutableStateOf(false)}
            RadioButton(selected = selectedOption, onClick = { selectedOption = !selectedOption })
        HorizontalDivider()

            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                var selectedOption2 by remember { mutableStateOf(false)}
                RadioButton(selected = selectedOption2,
                    onClick = { selectedOption2 = !selectedOption2 })
                Text(text = "Option 2", modifier = Modifier.clickable { selectedOption2 = !selectedOption2 })
            }

            HorizontalDivider()

            var optionsSelected by remember { mutableStateOf(1)}

            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                RadioButton(selected = (optionsSelected == 1),
                    onClick = { optionsSelected = 1 })
                Text(text = "Option 1",
                    modifier = Modifier)
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                RadioButton(selected = (optionsSelected == 2),
                    onClick = { optionsSelected = 2 })
                Text(text = "Option 2",
                    modifier = Modifier)
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                RadioButton(selected = (optionsSelected == 3),
                    onClick = { optionsSelected = 3 })
                Text(text = "Option 3",
                    modifier = Modifier)
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                RadioButton(selected = (optionsSelected == 4),
                    onClick = { optionsSelected = 4 })
                Text(text = "Option 4",
                    modifier = Modifier)
            }

            Text(text = optionsSelected.toString(),
                fontSize = 50.sp,
                modifier = Modifier.padding(24.dp))
            HorizontalDivider()

            RadioButton(
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Red,
                    unselectedColor = Color.Blue,
                    disabledSelectedColor = Color.Green,
                    disabledUnselectedColor = Color.Yellow
                ),
                enabled = false,
                selected = false,
                onClick = { /*TODO*/ })
        }
    }
}