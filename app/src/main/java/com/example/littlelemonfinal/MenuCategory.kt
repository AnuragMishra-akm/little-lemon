package com.example.littlelemonfinal

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MenuCategory(cotegory:String){
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Gray), shape = RoundedCornerShape(40)
        , modifier = Modifier.padding(5.dp)) {
        Text(text = cotegory)
    }
}

@Preview
@Composable
fun MenuCategoryPreview(){
    MenuCategory(cotegory = "Category")
}