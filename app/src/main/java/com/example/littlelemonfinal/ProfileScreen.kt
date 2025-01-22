package com.example.littlelemonfinal

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonfinal.Intro.email
import com.example.littlelemonfinal.Intro.firstName
import com.example.littlelemonfinal.Intro.lastName

@Composable
fun ProfileScreen(){

    val context = LocalContext.current
    Column(

        modifier = Modifier.fillMaxSize(),

        ) {
        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "logo",
            Modifier.fillMaxWidth()
        )
        Text(
            text = "Let's get to know you",
            color = Color(0xFFEDEFEE),
            fontSize = 40.sp,
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF495E57))
                .padding(
                    top = 45.dp,
                    start = 5.dp
                )
        )
        Text(
            text = "Personal information",
            color = Color(0xFF333333),
            fontSize = 30.sp,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 25.dp)
        )
        Text(
            text = "First Name",
            color = Color(0xFF333333),
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp)
        )
        Text(
            text = firstName,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color.White)
                .border(border = BorderStroke(1.dp, Color.Black), shape = RoundedCornerShape(8.dp))
        )

        Text(
            text = "Last Name",
            color = Color(0xFF333333),
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 10.dp, top = 15.dp, bottom = 5.dp)
        )
        Text(
            text = lastName,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color.White)
                .border(border = BorderStroke(1.dp, Color.Black), shape = RoundedCornerShape(8.dp))
        )

        Text(
            text = "Email Id",
            color = Color(0xFF333333),
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 10.dp, top = 15.dp, bottom = 5.dp)
        )
        Text(
            text = email,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color.White)
                .border(border = BorderStroke(1.dp, Color.Black), shape = RoundedCornerShape(8.dp))
        )

        Button(
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 50.dp)
                .height(50.dp),
            border = BorderStroke(1.dp, Color.Yellow),
            elevation = ButtonDefaults.buttonElevation(20.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Log Out", color = Color(0xFF333333), fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}