package com.example.wavewash.presentation.orders.new_order.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wavewash.R
import com.example.wavewash.ui.theme.Shapes
import com.example.wavewash.ui.theme.TextColor
import com.example.wavewash.ui.theme.nunitoSans
import com.example.wavewash.utils.ComposeString

@Composable
fun TextMinutes(
    text:String = ComposeString.resource(R.string.add_order).value(),
    time: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            fontFamily = nunitoSans,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = TextColor
        )
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0XFFD3DDEC),
                    shape = Shapes.small
                )
                .padding(horizontal = 34.dp, vertical = 10.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "$time минут"
            )
        }
    }
}