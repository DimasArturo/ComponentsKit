package com.example.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
fun TextScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back")
                    }
                },
                title = { Text(text = "TextScreen") })
        })
    {
        Column(modifier = Modifier.padding(it)){
            Text(text = "This is a text", fontSize = 24.sp)
            HorizontalDivider()
            Text(text = "Practicando para Android Dev con composable", fontSize = 24.sp)
            HorizontalDivider()
            Text(
                modifier = Modifier.padding(16.dp),
                text = buildAnnotatedString {
                    append("Hola mi nombre ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 26.sp)
                    ) {
                        append("Dimas Lopez")
                    }
                    append (" y soy desarrollador ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.Green)
                    ){
                        append("android")
                    }
                },
                fontSize = 18.sp,
            )
        }
    }
}