package com.example.coinspheremax

import com.example.coinspheremax.ui.theme.CryptoList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinspheremax.ui.theme.CoinSphereMaxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereMaxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Home(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

val Background = Color(0xFF0B1020)
val Surface = Color(0xFF151B2E)
val TextMain = Color(0xFFE8ECF8)
val TextDim = Color(0xFF9AA3B2)

@Composable
fun Card(title: String, value: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Surface, shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Column {
            Text(text = title, color = TextDim)
            Text(text = value, color = TextMain)
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Background)
            .padding(16.dp)
    ) {
        Text(
            text = "CoinSphere",
            color = TextMain
        )

        Spacer(
            Modifier
                .height(16.dp)
        )

        Card(title = "Global Market Cap", value = "$2.18T")
        Card(title = "Fear & Greed", value = "Neutral (54)")
        Card(title = "Altcoin Season", value = "No")

        Spacer(
            Modifier
                .height(16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "#", color = TextDim, modifier = Modifier.width(30.dp), fontWeight = FontWeight.Bold)
            Text(text = "Name", color = TextDim, modifier = Modifier.weight(1f).padding(start = 16.dp), fontWeight = FontWeight.Bold)
            Text(text = "Price", color = TextDim, fontWeight = FontWeight.Bold)
        }

        Spacer(
            Modifier
                .height(8.dp)
        )


        CryptoList()
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    CoinSphereMaxTheme {
        Home()
    }
}