package com.example.workshop3

import android.annotation.SuppressLint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.Text as Text
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateYourResumeP1(navController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Create Your Resume") },
            backgroundColor = primary
        )
    },

        content = {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize(),

                horizontalAlignment = Alignment.CenterHorizontally,

                verticalArrangement = Arrangement.Center,

                ) {

                val fullName = remember {
                    mutableStateOf("")
                }

                val email = remember {
                    mutableStateOf("")
                }

                val age = remember {
                    mutableStateOf("")
                }

                var selected by remember {
                    mutableStateOf("Male")
                }

                var errorFullname by rememberSaveable { mutableStateOf(false) }
                var errorAge by rememberSaveable { mutableStateOf(false) }
                var errorEmail by rememberSaveable { mutableStateOf(false) }

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                Image(
                    painterResource(
                        R.drawable.user_icon
                    ),
                    "logo",
                    modifier = Modifier
                        .size(150.dp),
                )

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                OutlinedTextField(
                    label = { Text(text = "FullName") },
                    modifier = Modifier.fillMaxWidth(),
                    value = fullName.value,
                    isError = errorFullname,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },
                    onValueChange = { fullName.value = it },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        backgroundColor = Color(0xFFFFFFFF),

                        )
                )
                if (errorFullname) {
                    Text(
                        text = "Error",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                OutlinedTextField(
                    label = { Text(text = "Email") },
                    value = email.value,
                    onValueChange = { email.value = it },
                    isError = errorEmail ,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },


                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color(0xFFFFFFFF)
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                if (errorEmail) {
                    Text(
                        text = "Error",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                OutlinedTextField(
                    label = { Text(text = "Age") },
                    value = age.value,
                    onValueChange = { age.value = it },
                    isError = errorAge ,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color(0xFFFFFFFF)
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                if (errorAge) {
                    Text(
                        text = "Error",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp)),

                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Gender",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryDark,

                            )
                    )

                    //spacer
                    Spacer(modifier = Modifier.height(20.dp))
                    //spacer

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(selected = selected == "Male", onClick = { selected = "Male" })
                        Text(
                            text = "Male",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 18.sp,
                                color = primaryDark,

                                ),
                            modifier = Modifier
                                .clickable(onClick = { selected = "Male" })


                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        RadioButton(
                            selected = selected == "Female",
                            onClick = { selected = "Female" })
                        Text(
                            text = "Female",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 18.sp,
                                color = primaryDark,

                                ),
                            modifier = Modifier
                                .clickable(onClick = { selected = "Female" })

                        )
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Button(
                        onClick = {
                            if(fullName.value.isEmpty())
                                errorFullname = true
                            else if (fullName.value.isNotEmpty())
                                errorFullname = false
                            if(email.value.isEmpty())
                                errorEmail = true
                            else if (email.value.isNotEmpty())
                                errorEmail = false
                            if(age.value.isEmpty())
                                errorAge = true
                            else if (age.value.isNotEmpty())
                                errorAge = false
                            if(!errorFullname && !errorAge && !errorEmail){
                                navController.navigate(NavScreens.CreateYourResumeP2.route + "/${fullName.value}"+ "/${email.value}"+"/${age.value}"+"/${selected}")
                            }

                        },
                        shape = RectangleShape,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)

                    ) {
                        Text(
                            text = "Next",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 20.sp,

                                ),
                        )
                    }
                }
            }
        })
}














