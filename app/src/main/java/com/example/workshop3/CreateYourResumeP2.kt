package com.example.workshop3

import android.annotation.SuppressLint
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor


@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun CreateYourResumeP2(
    navController: NavHostController,
    fullName: String?,
    email: String?,
    age: String?,
    selected: String?
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Create Your Resume") },
            backgroundColor = primary
        )
    }) {

        var androidSlider by remember { mutableStateOf(0f) }
        var iosSlider by remember { mutableStateOf(0f) }
        var flutterSlider by remember { mutableStateOf(0f) }
        var arRadio = remember { mutableStateOf(true) }
        var frRadio = remember { mutableStateOf(true) }
        var engRadio = remember { mutableStateOf(true) }
        var musicRadio = remember { mutableStateOf(true) }
        var sportRadio = remember { mutableStateOf(true) }
        var gamesRadio = remember { mutableStateOf(true) }

        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "SKILLS",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Android",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = androidSlider, onValueChange = { androidSlider = it })
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "IOS",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = iosSlider, onValueChange = { iosSlider = it })
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Flutter",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = flutterSlider, onValueChange = { flutterSlider = it })
                }

            }

            //spacer
            Spacer(modifier = Modifier.height(20.dp))
            //spacer

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Language",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )

                //spacer
                Spacer(modifier = Modifier.height(20.dp))
                //spacer

                Row(verticalAlignment = Alignment.CenterVertically) {


                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = arRadio.value,
                            onCheckedChange = { arRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Arabic")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = frRadio.value,
                            onCheckedChange = { frRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "French")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = engRadio.value,
                            onCheckedChange = { engRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "English")
                    }
                }

            }

            //spacer
            Spacer(modifier = Modifier.height(20.dp))
            //spacer

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Hobbies",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {


                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = musicRadio.value,
                            onCheckedChange = { musicRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Music")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = sportRadio.value,
                            onCheckedChange = { sportRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Sport")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = gamesRadio.value,
                            onCheckedChange = { gamesRadio.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Games")
                    }
                }
            }

            //spacer
            Spacer(modifier = Modifier.height(20.dp))
            //spacer

            Button(
                onClick = {
                    var ar = " "
                    var fr = " "
                    var en = " "
                    var mu = " "
                    var ga = " "
                    var sp = " "

                    if(arRadio.value)
                        ar = "Arabic"

                    if(frRadio.value)
                        fr = "French"

                    if(engRadio.value)
                        en = "English"

                    if(musicRadio.value)
                        mu = "Music"

                    if(gamesRadio.value)
                        ga = "Games"

                    if(sportRadio.value)
                        sp = "Sport"

                    navController.navigate(NavScreens.YourResume.route + "/${fullName}"+ "/${email}"+"/${age}"+"/${selected}"+"/${androidSlider}"+"/${iosSlider}"+"/${flutterSlider}"+"/${ar}"+"/${fr}"+"/${en}"+"/${mu}"+"/${ga}"+"/${sp}")
                },
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)

            ) {
                Text(
                    text = "Submit",
                    style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp,),
                )
            }
        }
    }
}