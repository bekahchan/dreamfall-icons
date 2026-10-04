package com.example.dreamfall_icons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamfallIcons()
        }
    }
}

@Composable
fun DreamfallIcons() {
    val icons: List<Int> = listOf(
        R.drawable.icon_phone,
        R.drawable.icon_camera,
        R.drawable.icon_messages,
        R.drawable.icon_photos,
        R.drawable.icon_file,
        R.drawable.icon_music,
        R.drawable.icon_clock,
        R.drawable.icon_mail,
        R.drawable.icon_settings,
        R.drawable.icon_weather,
        R.drawable.icon_maps,
        R.drawable.icon_notes
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            icons.take(4).forEach {
                Image(
                    painter = painterResource(it),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
            }
        }

        Row(
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            icons.drop(4).take(4).forEach {
                Image(
                    painter = painterResource(it),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
            }
        }

        Row(
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            icons.drop(8).forEach {
                Image(
                    painter = painterResource(it),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
            }
        }

        Text(
            text = "DREAMFALL ICONS VOL. 01",
            modifier = Modifier.padding(top = 24.dp)
        )
    }
}
