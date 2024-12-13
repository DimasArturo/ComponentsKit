package com.example.componentskit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardScreen(navController: NavHostController) {
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
                title = { Text(text = "CardScreen") })
        })
    {
        Column(modifier = Modifier.padding(it)) {

            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://static.wikia.nocookie.net/doblaje/images/5/59/Estaci%C3%B3n_Zombie_poster_hd.jpg/revision/latest?cb=20231225230733&path-prefix=es",
                        contentDescription = "Estacion Zombie"
                    )
                    Text(
                        text = "Estación Zombie",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://static.wikia.nocookie.net/doblaje/images/5/52/Boruto_-_La_pel%C3%ADcula.jpg/revision/latest?cb=20220801155019&path-prefix=es",
                        contentDescription = "Boruto"
                    )
                    Text(
                        text = "Boruto The Movie",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://es.web.img3.acsta.net/pictures/13/12/16/10/16/070759.jpg",
                        contentDescription = "Survivor"
                    )
                    Text(
                        text = "The Survivor",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://static.wikia.nocookie.net/doblaje/images/5/59/Estaci%C3%B3n_Zombie_poster_hd.jpg/revision/latest?cb=20231225230733&path-prefix=es",
                        contentDescription = "Estacion Zombie"
                    )
                    Text(
                        text = "Estación Zombie",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://static.wikia.nocookie.net/doblaje/images/5/52/Boruto_-_La_pel%C3%ADcula.jpg/revision/latest?cb=20220801155019&path-prefix=es",
                        contentDescription = "Boruto"
                    )
                    Text(
                        text = "Boruto The Movie",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(
                        model = "https://es.web.img3.acsta.net/pictures/13/12/16/10/16/070759.jpg",
                        contentDescription = "Survivor"
                    )
                    Text(
                        text = "The Survivor",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
            }

        }

    }

}
