package com.example.dreamfall_icons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DreamfallHome()
        }
    }
}

@Composable
fun DreamfallHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B0912))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "DREAMFALL",
            color = Color(0xFFF5E9FF),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "ICONS • VOL. 01",
            color = Color(0xFFC9A7FF),
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Dreamcore Icon Pack",
            color = Color(0xFFD8D0E3),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
