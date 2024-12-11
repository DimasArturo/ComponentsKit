package com.example.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(navController: NavHostController) {
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
                title = { Text(text = "TextFieldScreen") })
        })
    {
        Column(

            modifier = Modifier.padding(it)){
            var text by rememberSaveable {
                mutableStateOf("") }
            TextField(
                modifier = Modifier.padding(16.dp),
                value = text,
                onValueChange = {newValue ->
                text = newValue
            })

            HorizontalDivider()

            var text2 by rememberSaveable {
                mutableStateOf("") }
            TextField(
                modifier = Modifier.padding(16.dp),
                label = {Text(text = "Label") },
                value = text2,
                onValueChange = {newValue ->
                text2 = newValue
            })
            HorizontalDivider()

            var text3 by rememberSaveable {
                mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier.padding(16.dp),
                label = {Text(text = "Label") },
                value = text3,
                onValueChange = {newValue ->
                    text3 = newValue
                })
            HorizontalDivider()

            var text4 by rememberSaveable {
                mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier.padding(16.dp),
                label = {Text(text = "Label") },
                value = text4,
                onValueChange = {newValue ->
                    text4 = newValue
                },
                singleLine = true,
                maxLines = 1
            )
            HorizontalDivider()

            var text5 by rememberSaveable {
                mutableStateOf("")
            }
            var passwordVisible by rememberSaveable {
                mutableStateOf(false)
            }
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        if (passwordVisible){
                            Icon(imageVector = Icons.Default.Visibility,
                                contentDescription = "Visibility")
                        }else{
                            Icon(imageVector = Icons.Default.VisibilityOff,
                                contentDescription = "VisibilityOff")
                        }
                    }
                },
                modifier = Modifier.padding(16.dp),
                label = {Text(text = "Password") },
                value = text5,
                onValueChange = {newValue ->
                    text5 = newValue
                },
                singleLine = true,
                maxLines = 1,
                visualTransformation = if (passwordVisible) VisualTransformation.None
                else PasswordVisualTransformation()
            )
        }
    }
}