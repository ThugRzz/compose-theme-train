package com.example.composethemetrain.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val smallPadding: Dp,
    val mediumPadding: Dp,
    val largePadding: Dp,
    val smallIcon: Dp,
    val mediumIcon: Dp,
    val largeIcon: Dp,
)

private val dimensions = Dimensions(
    smallPadding = 8.dp,
    mediumPadding = 16.dp,
    largePadding = 24.dp,
    smallIcon = 24.dp,
    mediumIcon = 36.dp,
    largeIcon = 48.dp,
)

val LocalDimensions = staticCompositionLocalOf<Dimensions> {
    dimensions
}