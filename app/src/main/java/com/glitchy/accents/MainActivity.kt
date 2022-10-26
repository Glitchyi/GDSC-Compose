package com.glitchy.accents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.glitchy.accents.ui.theme.AccentsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Display_Accent()
                }
            }
        }
    }
}

@Composable
fun Display_Accent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ACCENT COLOURS BASED ON YOUR WALLPAPER", fontSize = 30.sp,fontWeight = FontWeight.Bold)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Text(text = "First Primary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.primary)
        Text(text = "Second Primary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.primaryContainer)
        Text(text = "First Secondary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.secondary)
        Text(text = "Second Secondary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.secondaryContainer)
        Text(text = "First Tertiary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.tertiary)
        Text(text = "Second Tertiary Colour", fontSize = 40.sp,color= MaterialTheme.colorScheme.tertiaryContainer)

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AccentsTheme {
       Display_Accent()
    }
}