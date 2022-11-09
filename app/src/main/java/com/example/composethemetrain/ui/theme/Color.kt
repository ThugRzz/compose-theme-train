package com.example.composethemetrain.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class Colors(
    val primary: Color,
    val secondary: Color,
    val background: Color,
)

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

private val colorPalette = Colors(
    primary = Purple200,
    secondary = Purple700,
    background = Teal200,
)

val LocalColors = staticCompositionLocalOf<Colors> {
    colorPalette
}