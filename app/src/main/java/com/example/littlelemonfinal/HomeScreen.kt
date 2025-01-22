package com.example.littlelemonfinal

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.littlelemonfinal.Dishes.dishes

@Composable
fun HomeScreen(modifier: androidx.compose.ui.Modifier, navController: NavHostController) {

    Column(modifier = Modifier.padding(top = 30.dp)) {
        TopAppBar()
        UpperPanel()
        MenuListScreen(navController, dishes = dishes)

//                       Row  (modifier = Modifier
//                           .horizontalScroll(rememberScrollState())
//                           .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
//                           categories.forEach {
//                               MenuCategory(cotegory = it)
//                           }
//                       }
//                       LowerPanel()


    }

//    Column {
//        Text(
//            text = "Home Screen",
//            fontSize = 30.sp,
//            modifier = androidx.compose.ui.Modifier.padding(16.dp)
//        )
//
//        Button(
//            onClick = {
//
//                navController.navigate(Profile.route)
//
//            },
//            colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14)),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp, vertical = 50.dp)
//                .height(50.dp),
//            border = BorderStroke(1.dp, Color.Yellow),
//            elevation = ButtonDefaults.buttonElevation(20.dp),
//            shape = RoundedCornerShape(8.dp)
//        ) {
//            Text(text = "Profile", color = Color(0xFF333333), fontSize = 20.sp)
//        }
//    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    val navController = null
    navController?.let {
        HomeScreen(
            androidx.compose.ui.Modifier.Companion.padding(10.dp),
            navController = it
        )
    }
}