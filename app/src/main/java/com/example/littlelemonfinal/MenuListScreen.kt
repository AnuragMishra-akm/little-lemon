package com.example.littlelemonfinal

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MenuListScreen(navController: NavHostController, dishes: List<Dish> = listOf()){
    Column {
        LazyRow {
            items(Categories){category->
                MenuCategory(cotegory = category)
            }
        }
        // Divider(modifier = Modifier.padding(8.dp), color = Color.Gray, thickness = 1.dp)
        WeeklySpecialCard()
        LazyColumn {
            itemsIndexed(dishes){_, dish->
                MenuDish(navController = navController,dish = dish)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MenuListScreenPreview(){
    MenuListScreen(navController = rememberNavController())
}

@Composable
fun WeeklySpecialCard(){
    Card (modifier = Modifier.fillMaxWidth()) {
        Text(text = "Weekly Special", color = Color(0xFF36454f) ,fontSize = 26.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuDish(navController: NavHostController? = null, dish: Dish) {
    Card (onClick = {
        Log.d("AAA", "Click ${dish.id}")
        navController?.navigate(DishDetails.route+ "/${dish.id}")
    }){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            Column {
                Text(text = dish.name, color = Color(0xFF36454f), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(
                    text = dish.description,
                    color = Color(0xFF495E57), modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f)
                )
                Text(text = dish.price, fontWeight = FontWeight.Bold, color = Color(0xFF495E57))
            }
            Image(painter = painterResource(id = dish.image), contentDescription = "", modifier = Modifier.clip(
                RoundedCornerShape(20.dp)
            ))
        }
        Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp), thickness = 1.dp, color = Color(0xFFF4CE14))
    }
}