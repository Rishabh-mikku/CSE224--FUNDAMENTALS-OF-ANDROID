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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun SecondScreen(navController: NavHostController) {

    var email_id by remember {
        mutableStateOf(TextFieldValue())
    }

    var password by remember {
        mutableStateOf(TextFieldValue())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {

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
                    .padding(start = 20.dp)
                    .align(Alignment.CenterVertically)
            )

            Button(
                onClick = {
                    navController.navigate(route = Screens.FirstScreen.route)
                },
                modifier = Modifier
                    .align(Alignment.CenterVertically)
//                    .size(100.dp)
                    .padding(start = 135.dp),
//                    .padding(start=150.dp)
//                    .width(50.dp),
                shape = RectangleShape
            ) {
                Text(
                    text = "REGISTER",
                    fontSize = 14.sp
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 140.dp)
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
                modifier = Modifier.padding(top=20.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            OutlinedTextField(
                value = email_id,
                onValueChange = {
                    email_id = it
                },
                singleLine = true,
                label = {
                    Text(
                        text = "Email Id"
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                )
            )

            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                singleLine = true,
                label = {
                    Text(
                        text = "Password"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                textStyle = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif
                ),
                visualTransformation = PasswordVisualTransformation()
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
                    text = "Login",
                    fontSize = 18.sp
                )
            }
        }
    }
}
