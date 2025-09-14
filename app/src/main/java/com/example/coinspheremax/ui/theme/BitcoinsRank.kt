package com.example.coinspheremax.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.coinspheremax.Surface
import com.example.coinspheremax.TextDim
import com.example.coinspheremax.TextMain

@Composable
fun CryptoList() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(cryptoList) { crypto ->
            CryptoListItem(crypto)
        }
    }
}

@Composable
fun CryptoListItem(crypto: BitcoinsRank) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Surface,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(vertical = 16.dp, horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "${crypto.id}",
            modifier = Modifier.width(30.dp),
            color = TextDim,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier
                .width(16.dp)
        )

        AsyncImage(
            model = crypto.image,
            contentDescription = "${crypto.title} logo",
            modifier = Modifier.size(36.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(
            modifier = Modifier
                .width(16.dp)
        )

        Text(
            text = crypto.title,
            modifier = Modifier.weight(1f),
            color = TextMain,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = crypto.price,
            color = TextMain,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}
