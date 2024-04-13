package com.example.calmstate.utilities

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ShowImage(imageResId: Int) {
    Image(
        painter = painterResource(imageResId),
        contentDescription = "Person Meditating"
    )
}