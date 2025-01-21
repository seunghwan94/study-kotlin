package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()

//    setContentView(R.layout.list_layout)
    setContentView(R.layout.text_view)

//    val fruits = listOf("test1","test2","test3")
//    val listView: ListView = findViewById(R.id.listview)
//
//    val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
//    listView.adapter = adapter
//
//    listView.setOnItemClickListener { _, _, position, _ ->
//      val value = fruits[position]
//      Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
//    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  MyApplicationTheme {
    Greeting("Android")
  }
}