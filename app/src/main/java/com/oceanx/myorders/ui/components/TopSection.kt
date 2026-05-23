package com.oceanx.myorders.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFFD646), Color(0xFFFFC928))
                ),
                shape = RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp)
            )
            .padding(horizontal = 20.dp).padding(bottom = 24.dp)
    ) {
        Surface(
            modifier = Modifier
                .statusBarsPadding()
                .clip(CircleShape),
            color = Color(0x1A0F172A)
        ) {
            Text(
                text = "ORDER HISTORY",
                fontSize = 11.sp,
                color = Color(0xFF1F2937),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "My Orders",
            fontSize = 30.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF111111)
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "View your completed trips here. Download invoices or quickly book the same order again.",
            fontSize = 14.sp,
            lineHeight = 21.sp,
            color = Color(0xCC111111)
        )
    }
}
