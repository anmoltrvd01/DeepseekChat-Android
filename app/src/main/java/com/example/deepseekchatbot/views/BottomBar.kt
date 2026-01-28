package com.example.deepseekchatbot.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.deepseekchatbot.R


@Composable
fun BottomBar() {
    var inputText by remember { mutableStateOf("") }
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
    ) {
        OutlinedTextField(
            value = inputText,
            onValueChange = { text->
                inputText = text
            },
            modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
            placeholder = {
                Text(text = "Type your message here...",
                    modifier = Modifier,
                    color = Color(0xff8a8a8e)
                )
            }
        )
        Spacer(modifier = Modifier.padding(6.dp))
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                "DeepThink R1",
                modifier = Modifier.background(Color.Gray, RoundedCornerShape(10.dp))
            )
            Text(
                "Search",
                modifier = Modifier.background(Color.Gray, RoundedCornerShape(10.dp)

                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(R.drawable.send),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 4.dp)
            )
        }
    }
}
