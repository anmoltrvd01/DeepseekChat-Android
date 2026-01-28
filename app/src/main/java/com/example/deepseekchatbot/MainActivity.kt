package com.example.deepseekchatbot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deepseekchatbot.ui.theme.DeepseekChatbotTheme
import com.example.deepseekchatbot.views.BottomBar
import com.example.deepseekchatbot.views.ChatScreen
import com.example.deepseekchatbot.views.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeepseekChatbotTheme {
                Scaffold(
                    topBar = {
                        TopBar()
                    },

                    bottomBar = {
                        BottomBar()
                    }
                ){
                    ChatScreen()
                }

            }
        }
    }
}

