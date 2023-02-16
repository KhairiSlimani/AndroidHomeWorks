package com.example.workshop3

import android.annotation.SuppressLint
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun YourResume(
    fullName: String?,
    email: String?,
    age: String?,
    selected: String?,
    androidSlider: String?,
    iosSlider: String?,
    flutterSlider: String?,
    ar: String?,
    fr: String?,
    en: String?,
    mu: String?,
    ga: String?,
    sp: String?,
    navController: NavHostController,
    ) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Your Resume") },
            backgroundColor = primary
        )

    }) {

        //spacer
        Spacer(modifier = Modifier.height(12.dp))
        //spacer

        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                .padding(20.dp),

            ) {
            Text(
                text = "Name: $fullName",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "Email: $email",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "Age: $age",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "Gender: $selected",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "AndroidSkill: $androidSlider",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "IosSkill: $iosSlider",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "FlutterSkill: $flutterSlider",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "Languages: $ar $fr $en",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )

            Text(
                text = "Hobbies: $mu $ga $sp",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = primary,
                )
            )
        }
    }
}

