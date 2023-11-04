package com.example.cricketapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Captains(navController: NavController){
    var showMenu by remember {
        mutableStateOf(false)
    }

    val context = LocalContext.current
    var isClicked by remember {
        mutableStateOf(false)
    }

    val coroutineScope = rememberCoroutineScope()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        item {
            TopAppBar(
                title = {
                    Text(
                        "Cricket World - Captains Corner",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                },
                actions = {
                    IconButton(
                        onClick = {
                            // Handle the favorite button click here
                            Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show()
                            isClicked = !isClicked
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null,
                            tint = if (isClicked) Color.Red else Color.Black
                        )
                    }

                    IconButton(onClick = { showMenu = !showMenu }) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }

                    DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {

                        DropdownMenuItem(text = { Text("Facts") },
                            onClick = {
                                Toast.makeText(context, "Facts", Toast.LENGTH_SHORT).show()
                                navController.navigate(route = Screens.Facts.route)
                            })

                        DropdownMenuItem(text = { Text("World Cup 2011") },
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "World Cup 2011 Gallery",
                                    Toast.LENGTH_SHORT
                                ).show()
                                navController.navigate(route = Screens.WC2011.route)
                            })

                        DropdownMenuItem(text = { Text("World Cup 2015") },
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "World Cup 2015 Gallery",
                                    Toast.LENGTH_SHORT
                                ).show()
                                navController.navigate(route = Screens.WC2015.route)
                            })

                        DropdownMenuItem(text = { Text("World Cup 2019") },
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "World Cup 2019 Gallery",
                                    Toast.LENGTH_SHORT
                                ).show()
                                navController.navigate(route = Screens.WC2019.route)
                            })
                    }
                }

            )
        }

        item{
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=20.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_24),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_25),
                    contentDescription = null,
                    modifier = Modifier
//                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_26),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_27),
                    contentDescription = null,
                    modifier = Modifier
//                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp),
                Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_28),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(180.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_29),
                    contentDescription = null,
                    modifier = Modifier
//                        .padding(start = 10.dp)
                        .size(160.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp),
                Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_30),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_31),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp),
                Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_32),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_33),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp),
                Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_34),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_35),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=10.dp),
                Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_36),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img_37),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(200.dp)
                )
            }
        }

    }
}