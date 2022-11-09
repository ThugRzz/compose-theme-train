package com.example.composethemetrain.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

data class Shape(
    val small: CornerBasedShape,
    val medium: CornerBasedShape,
    val large: CornerBasedShape,
)

val Shapes = Shape(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(20.dp),
    large = RoundedCornerShape(40.dp)
)

val LocalShapes = staticCompositionLocalOf<Shape> {
    Shapes
}