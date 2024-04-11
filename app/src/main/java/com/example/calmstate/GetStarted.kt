package com.example.calmstate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calmstate.ui.theme.TechMono


@Composable
fun GetStartedPage() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(top = 180.dp), verticalArrangement = Arrangement.Top
        ) {
            ShowImage(R.drawable.calm)
            Spacer(modifier = Modifier.padding(top = 50.dp))
            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = "Keep Your",
                fontSize = 40.sp,
                fontWeight = FontWeight(600),
                fontFamily = TechMono

            )
            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = "Mind Fresh",
                fontSize = 40.sp,
                fontWeight = FontWeight(600),
                fontFamily = TechMono

            )



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Get started",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = TechMono,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(end = 10.dp)
                )

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .padding(top = 10.dp, end = 20.dp)
                        .size(100.dp)
                        .align(Alignment.CenterVertically),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Icon(
                        Icons.Default.ArrowForward, contentDescription = "Arrow Forward"
                    )
                }
            }
        }
    }
}