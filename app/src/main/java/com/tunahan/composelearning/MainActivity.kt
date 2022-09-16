package com.tunahan.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tunahan.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainScreen()
        }




    }


}

@Composable
fun MainScreen(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        CustomText(text = "Hello Android!")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin!")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Compose")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

            CustomText(text = "Row 1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Row 2")

        }

    }


}

@Composable
fun CustomText(text:String){
    Text(modifier = Modifier
        .background(Color.Black)
        .padding(start = 3.dp, top = 5.dp, end = 3.dp, bottom = 5.dp)
        .clickable {
            println("click")
        }
        //.fillMaxSize(0.5f)
        ,
        text = "Hello Android!",
        color = Color.Blue,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold)
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}