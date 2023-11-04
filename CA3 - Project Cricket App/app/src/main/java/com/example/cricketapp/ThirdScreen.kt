package com.example.cricketapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    ){

            var showMenu by remember {
                mutableStateOf(false)
            }

            val context = LocalContext.current

            var isClicked by remember {
                mutableStateOf(false)
            }

        TopAppBar(
            title = {
                Text(
                    "Cricket World - Insights",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(start=10.dp)
                )
            },
            actions = {
                IconButton(
                    onClick = {
                        Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show()
                        isClicked = !isClicked
                    }

                ){
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

                    DropdownMenuItem(text = { Text("Captains Corner") },
                        onClick = {
                            Toast.makeText(context, "Captains Corner", Toast.LENGTH_SHORT).show()
                            navController.navigate(route=Screens.Captains.route)
                    })

                    DropdownMenuItem(text = { Text("Facts") },
                        onClick = {
                            Toast.makeText(context, "Facts", Toast.LENGTH_SHORT).show()
                            navController.navigate(route=Screens.Facts.route)
                        })



                    DropdownMenuItem(text = { Text("World Cup 2011") },
                        onClick = {
                            Toast.makeText(context, "World Cup 2011 Gallery", Toast.LENGTH_SHORT).show()
                            navController.navigate(route=Screens.WC2011.route)
                        })

                    DropdownMenuItem(text = { Text("World Cup 2015") },
                        onClick = {
                            Toast.makeText(context, "World Cup 2015 Gallery", Toast.LENGTH_SHORT).show()
                            navController.navigate(route=Screens.WC2015.route)
                        })

                    DropdownMenuItem(text = { Text("World Cup 2019") },
                        onClick = {
                            Toast.makeText(context, "World Cup 2019 Gallery", Toast.LENGTH_SHORT).show()
                            navController.navigate(route=Screens.WC2019.route)
                        })
                }


            }
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = "World Cup 2011",
                modifier = Modifier
                    .padding(30.dp)
                    .size(100.dp)
            )

            ClickableText(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black, // Text color
                            fontSize = 18.sp,  // Text size
                            fontWeight = FontWeight.Bold  // Text weight
                        )
                    ) {
                        append("World Cup 2011")
                    }
                },
                onClick = {
                    navController.navigate(route = Screens.WC2011.route)
                }
            )

            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "World Cup 2015",
                modifier = Modifier
                    .padding(30.dp)
                    .size(100.dp)
            )

            ClickableText(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black, // Text color
                            fontSize = 18.sp,  // Text size
                            fontWeight = FontWeight.Bold  // Text weight
                        )
                    ) {
                        append("World Cup 2015")
                    }
                },
                onClick = {
                    navController.navigate(route = Screens.WC2015.route)
                }
            )

            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "World Cup 2015",
                modifier = Modifier
                    .padding(30.dp)
                    .size(100.dp)
            )

            ClickableText(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black, // Text color
                            fontSize = 18.sp,  // Text size
                            fontWeight = FontWeight.Bold  // Text weight
                        )
                    ) {
                        append("World Cup 2019")
                    }
                },
                onClick = {
                    navController.navigate(route = Screens.WC2019.route)
                }
            )
        }
        }
    }
