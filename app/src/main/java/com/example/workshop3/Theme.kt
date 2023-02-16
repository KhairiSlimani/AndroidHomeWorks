package com.example.workshop3

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme


private val DarkColorPalette = darkColors(
    primary = primaryDark,
    primaryVariant = primary,
    secondary = colorSecondaryDark
)

private val LightColorPalette = lightColors(
    primary = primaryLight,
    primaryVariant = primary,
    secondary = colorSecondaryLight
)
@Composable
fun SplashScreenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        content = content
    )
}

@Composable
fun BarColorsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        content = content
    )
}