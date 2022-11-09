package com.example.composethemetrain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import com.example.composethemetrain.ui.theme.AppTheme
import com.example.composethemetrain.ui.theme.ComposeThemeTrainTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeThemeTrainTheme {
                Box {
                    LazyColumn(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        item {
                            Text(
                                text = stringResource(R.string.header),
                                style = AppTheme.typography.header,
                                color = AppTheme.colors.primary,
                            )
                        }
                        item {
                            Text(
                                modifier = Modifier.padding(top = AppTheme.dimensions.smallPadding),
                                text = stringResource(R.string.text),
                                style = AppTheme.typography.text,
                                color = AppTheme.colors.secondary,
                            )
                        }
                        item {
                            ExampleIcon(
                                modifier = Modifier.padding(top = AppTheme.dimensions.smallPadding),
                                size = AppTheme.dimensions.smallIcon,
                                tint = AppTheme.colors.primary,
                            )
                        }
                        item {
                            ExampleIcon(
                                modifier = Modifier.padding(top = AppTheme.dimensions.mediumPadding),
                                size = AppTheme.dimensions.mediumIcon,
                                tint = AppTheme.colors.secondary,
                            )
                        }
                        item {
                            ExampleIcon(
                                modifier = Modifier.padding(top = AppTheme.dimensions.largePadding),
                                size = AppTheme.dimensions.largeIcon,
                                tint = AppTheme.colors.background,
                            )
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .padding(top = AppTheme.dimensions.mediumPadding)
                                    .size(AppTheme.dimensions.largeIcon)
                                    .background(
                                        color = AppTheme.colors.primary,
                                        shape = AppTheme.shapes.small,
                                    ),
                            )
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .padding(top = AppTheme.dimensions.mediumPadding)
                                    .size(AppTheme.dimensions.largeIcon)
                                    .background(
                                        color = AppTheme.colors.primary,
                                        shape = AppTheme.shapes.medium,
                                    ),
                            )
                        }
                        item {
                            Box(
                                modifier = Modifier
                                    .padding(top = AppTheme.dimensions.mediumPadding)
                                    .size(AppTheme.dimensions.largeIcon)
                                    .background(
                                        color = AppTheme.colors.primary,
                                        shape = AppTheme.shapes.large,
                                    ),
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ExampleIcon(
    size: Dp,
    tint: Color,
    modifier: Modifier = Modifier,
) {
    Icon(
        painter = painterResource(R.drawable.ic_baseline_android_24),
        contentDescription = null,
        modifier = modifier.size(size),
        tint = tint,
    )
}