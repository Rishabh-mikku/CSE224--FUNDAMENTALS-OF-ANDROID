package com.example.cricketapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavHostController){
    var first_name by remember {
        mutableStateOf(TextFieldValue())
    }

    var last_name by remember {
        mutableStateOf(TextFieldValue())
    }

    var email_id by remember {
        mutableStateOf(TextFieldValue())
    }

    var contact_no by remember {
        mutableStateOf(TextFieldValue())
    }



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp)
                .background(Color.LightGray)
                .height(40.dp)
        ){
            Text(
                text = "CricketWorld!!!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start=20.dp)
                    .align(Alignment.CenterVertically)
            )

            Button(
                onClick = {
                    navController.navigate(route = Screens.SecondScreen.route)
                },
                modifier = Modifier
                    .align(Alignment.CenterVertically)
//                    .size(100.dp)
                    .padding(start=155.dp),
//                    .padding(start=150.dp)
//                    .width(50.dp),
                shape = RectangleShape
            ) {
                Text(
                    text = "LOGIN",
                    fontSize = 14.sp
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.img),
                contentDescription = "Cricket App",
                modifier = Modifier
                    .size(100.dp)
                    .padding(10.dp)
            )
            Text(
                text = "CricketWorld",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.padding(top=30.dp)
            )
        }
        Text(
            text = "Personal Info",
            fontSize = 18.sp,
//            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top=30.dp, start=10.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
                OutlinedTextField(
                    value = first_name,
                    onValueChange = {
                        first_name = it
                    } ,
                    singleLine = true,
                    label = {
                        Text(
                            text = "First Name"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif
                    )
                )

                OutlinedTextField(
                    value = last_name,
                    onValueChange = {
                        last_name = it
                    } ,
                    singleLine = true,
                    label = {
                        Text(
                            text = "Last Name"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    textStyle = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif
                    )
                )

                OutlinedTextField(
                    value = email_id,
                    onValueChange = {
                        email_id = it
                    } ,
                    singleLine = true,
                    label = {
                        Text(
                            text = "Email Id"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    textStyle = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif
                    )
                )

                OutlinedTextField(
                    value = contact_no,
                    onValueChange = {
                        contact_no = it
                    } ,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    singleLine = true,
                    label = {
                        Text(
                            text = "Contact Number"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    textStyle = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif
                    )
                )

                Spacer(modifier = Modifier.size(40.dp))

                Button(
                    onClick = {
                        navController.navigate(route = Screens.ThirdScreen.route)
                    },
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally)

                ){
                    Text(
                        text = "Register",
                        fontSize = 18.sp
                    )
                }
            }

        }
    }
}