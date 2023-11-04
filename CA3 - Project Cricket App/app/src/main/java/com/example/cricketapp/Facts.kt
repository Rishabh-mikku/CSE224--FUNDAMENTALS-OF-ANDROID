package com.example.cricketapp

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Facts(navController: NavController) {
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
    ) {
        item {
            TopAppBar(
                title = {
                    Text(
                        "Cricket World - Facts",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
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

                        DropdownMenuItem(text = { Text("Captains Corner") },
                            onClick = {
                                Toast.makeText(context, "Captains Corner", Toast.LENGTH_SHORT)
                                    .show()
                                navController.navigate(route = Screens.Captains.route)
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

        item {
            FactsSection(
                title = "World Cup 2011 Facts",
                facts = listOf(
                    "1- The 2011 Cricket World Cup was co-hosted by three countries: India, Sri Lanka, and Bangladesh.",
                    "2- India won their second World Cup title, 28 years after their first triumph in 1983.",
                    "3- This edition featured 14 teams and a total of 49 matches."
                )
            )
        }

        item {
            FactsSection(
                title = "World Cup 2015 Facts",
                facts = listOf(
                    "1- The 2015 World Cup was jointly hosted by Australia and New Zealand.",
                    "2- Australia won their fifth World Cup title, defeating New Zealand in the final.",
                    "3- There were 14 teams and 49 matches."
                )
            )
        }

        item {
            FactsSection(
                title = "World Cup 2019 Facts",
                facts = listOf(
                    "1- This was the fifth time that the Cricket World Cup was held in England and Wales.",
                    "2- England won the World Cup first time by defeating New Zealand in Final.",
                    "3- This was the first World Cup to be contested without all of the Full Member nations being present."
                )
            )
        }
    }

    // Add padding for the bottom of the screen to account for the navigation bar
    Spacer(modifier = Modifier.statusBarsPadding())
}

@Composable
fun FactsSection(title: String, facts: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 10.dp, top = 50.dp),
            color = Color.DarkGray
        )

        facts.forEach { fact ->
            Text(
                text = fact,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                color = Color.Gray
            )
        }
    }
}