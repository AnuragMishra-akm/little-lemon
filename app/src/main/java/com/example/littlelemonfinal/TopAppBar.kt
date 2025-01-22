package com.example.littlelemonfinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar() {
    Row( horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "App Logo",
            Modifier
                .fillMaxWidth(0.5f)
                .padding(horizontal = 20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "App Logo", contentScale = ContentScale.None,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp).size(50.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
        TopAppBar()
}