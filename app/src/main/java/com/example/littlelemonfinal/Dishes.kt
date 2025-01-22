package com.example.littlelemonfinal



object Dishes{
    val dishes= listOf<Dish>(
        Dish(1,"Greek Salad","12.99","The Famous Greek Salad Of Crispy Lettuce, peppers, olives and our Chicago ...", R.mipmap.greeksalad) ,
        Dish(2,"Bruschetta","5.99","The Famous Bruschetta is made from grilled bread that has been smeared with garlic and seasoned with salt and olive oil...", R.mipmap.bruschetta) ,
        Dish(3,"Lemon Dessert","9.99"," This comes straight from grandma recipe book, every last ingredient has...", R.mipmap.lemondessert),
        Dish(4,"Grilled Fish","19.99","Fish marinated in fresh orange and lemon juice, Grilled with orange and lemon wedges...", R.mipmap.grilledfish) ,
        Dish(5,"Pasta","8.99","Penne with fried aubergines, cherry tomatoes, tomato sauce, fresh chilli, garlic, basil & salted ricotta cheese.", R.mipmap.pasta) ,
        Dish(6,"Lasagne","7.99"," Oven-baked layers of pasta stuffed with Bolognese sauce, béchamel sauce, ham, Parmesan & mozzarella cheese .", R.mipmap.lasagne),
        Dish(7,"Greek Salad","12.99","The Famous Greek Salad Of Crispy Lettuce, peppers, olives and our Chicago ...", R.mipmap.greeksalad) ,
        Dish(8,"Bruschetta","5.99","The Famous Bruschetta is made from grilled bread that has been smeared with garlic ...", R.mipmap.bruschetta) ,
        Dish(9,"Lemon Dessert","9.99"," This comes straight from grandma recipe book, every last ingredient has...", R.mipmap.lemondessert)

    )
    fun getDish(id: Int) = dishes.firstOrNull { it.id == id }
}
data class Dish(
    val id:Int,
    val name:String,
    val price:String,
    val description:String,
    val image:Int
)