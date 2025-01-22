package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonSayHi()
        }
    }
}



@Composable
fun ButtonSayHi ( ) {
    var textButton by remember { mutableStateOf("Nguyễn Đức San - PH32936") }
    Column(modifier = Modifier.safeContentPadding().fillMaxWidth().padding(0.dp,16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(textButton)

        Button(

            onClick = {
                textButton = "Say HI!"
            },

            ) {
            Text("Say HI!")
        }

        var number by rememberSaveable { mutableStateOf(0) }
        Text("Bạn đã bấm bài 3:  $number lần")


        Button(
            onClick = {
                number++
            }
        ) {
            Text("Bấm vào đây")

        }


    }
}



