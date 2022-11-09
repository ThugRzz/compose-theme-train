package com.example.composethemetrain.ui.theme

import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object AppTheme {
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: Shape
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val dimensions: Dimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensions.current
}

@Composable
fun ComposeThemeTrainTheme(
    colors: Colors = AppTheme.colors,
    typography: Typography = AppTheme.typography,
    shapes: Shape = AppTheme.shapes,
    dimensions: Dimensions = AppTheme.dimensions,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        LocalDimensions provides dimensions,
        content = content,
    )
}