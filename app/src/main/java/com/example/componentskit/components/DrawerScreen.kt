package com.example.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerScreen(navController: NavHostController){

    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)) {
                    AsyncImage(
                        modifier = Modifier.padding(bottom = 20.dp).clip(CircleShape).size(100.dp),
                        model = "https://scontent.fisj3-3.fna.fbcdn.net/v/t39.30808-6/453541159_1206642330652772_6992720926581728870_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=6ee11a&_nc_eui2=AeGKV9GQf7V4wDJwu75uHAaSmRM0teNXYqiZEzS141diqHXY3uh2MS0URb7ezGizEPPmb27CL43SyIEBJgyhKQW6&_nc_ohc=DdyxdUXkA2QQ7kNvgG9a9MK&_nc_zt=23&_nc_ht=scontent.fisj3-3.fna&_nc_gid=AgvSWm-97K51nxEKqtP0Zgx&oh=00_AYCXeDN6nY3xpOZb9HcVgSe_V3tNKZEVf53QGtCiIS_kjw&oe=67627B50",
                        contentDescription = "Dimas")
                    Text(text = "Hola Dimas...", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                    Text(text = "Item 1")
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                    Text(text = "Item 2")
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                    Text(text = "Item 3")
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                    Text(text = "Item 4")
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                    TextButton(onClick = {navController.popBackStack()}){
                        Text(text = "Volver al inicio")
                    }
                }
            }
        }) {
        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch{
                                drawerState.apply {
                                    if(isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(imageVector = Icons.Default.Menu,
                                contentDescription = "Go back")
                        }
                    },
                    title = { Text(text = "DrawerScreen") })
            })
        {
            Column(modifier = Modifier.padding(it)){

            }
        }
    }
}