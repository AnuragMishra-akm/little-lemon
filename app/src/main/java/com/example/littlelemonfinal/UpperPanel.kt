package com.example.littlelemonfinal

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPanel() {
    var context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .background(Color(0xFF495E57))
            .padding(top = 15.dp, start = 10.dp, end = 10.dp)
    )
    {
        Text(
            text = stringResource(id = R.string.Little_Lemon),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFF4CE14)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFEDEFEE)
        )
        Row(
            Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.Start
        ) {
            Column {
                Text(
                    text = stringResource(id = R.string.description),
                    Modifier
                        .fillMaxWidth(0.6f)
                        .padding(top = 20.dp),
                    color = Color(0xFFEDEFEE),

                    )
                Button(
                    modifier = Modifier.padding(top = 50.dp), onClick = {
                        Toast.makeText(
                            context, "Order Sucessfull",
                            Toast.LENGTH_SHORT
                        ).show()
                    }, shape = RoundedCornerShape(15.dp), colors = ButtonDefaults
                        .buttonColors(Color(0xFFF4CE14))
                ) {
                    Text(
                        text = "Order",
                        color = Color.Black,
                        fontSize = 18.sp, fontWeight = FontWeight.Bold
                    )
                }
            }
            Image(
                painter = painterResource(id = R.mipmap.img1),
                contentDescription = "",
                Modifier.padding(bottom = 15.dp)
                    .clip(RoundedCornerShape(30.dp))


            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun uperPanelPreview() {

        UpperPanel()

}