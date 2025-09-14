package com.example.coinspheremax.ui.theme


data class BitcoinsRank(
    val id: Int,
    val image: String,
    val title : String,
    val price : String,
)

val cryptoList = listOf(
    BitcoinsRank(1,"https://assets.coingecko.com/coins/images/1/large/bitcoin.png","Bitcoin", "$109,797.37"),
    BitcoinsRank(2,"https://assets.coingecko.com/coins/images/279/large/ethereum.png","Ethereum", "$4,321.21"),
    BitcoinsRank(3,"https://assets.coingecko.com/coins/images/325/large/tether.png","Tether", "$1.0000"),
    BitcoinsRank(4,"https://assets.coingecko.com/coins/images/44/large/xrp.png","XRP", "$2.8100"),
    BitcoinsRank(5,"https://assets.coingecko.com/coins/images/825/large/binance-coin-logo.png","BNB", "$845.0000"),
    BitcoinsRank(6,"https://assets.coingecko.com/coins/images/4128/large/solana.png","Solana", "$201.8500"),
    BitcoinsRank(7,"https://assets.coingecko.com/coins/images/6319/large/usdc.png","USDC", "$0.9998"),
    BitcoinsRank(8,"https://assets.coingecko.com/coins/images/5/large/dogecoin.png","Dogecoin", "$0.1320"),
    BitcoinsRank(9,"https://coin-logos.simplr.sh/images/tron/large.png","TRON", "$0.3630"),
)
