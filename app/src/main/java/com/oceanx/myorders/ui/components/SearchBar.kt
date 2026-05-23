package com.oceanx.myorders.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Sort
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchBar() {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .weight(1f)
                .height(56.dp),
            placeholder = {
                Text(
                    text = "Search by Order ID / Location",
                    color = Color(0xFF7A808A),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 15.sp
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null,
                    tint = Color(0xFF6B7280)
                )
            },
            shape = RoundedCornerShape(16.dp),
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 15.sp,
                color = Color(0xFF111827)
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedBorderColor = Color(0xFFCFD8E3),
                unfocusedBorderColor = Color(0xFFDCE3EC),
                cursorColor = Color(0xFF1F2937)
            )
        )

        SmallActionButton(icon = Icons.Outlined.FilterList)
        SmallActionButton(icon = Icons.AutoMirrored.Outlined.Sort)
    }
}

@Composable
fun SmallActionButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector
) {
    Surface(
        modifier = Modifier
            .size(56.dp)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { },
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF182027),
        shadowElevation = 4.dp
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFFF4F4F5)
            )
        }
    }
}
