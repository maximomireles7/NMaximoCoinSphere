package com.example.coinspheremax.ui.theme

import coil3.Image

data class BitcoinsRank(
    val id: Int,
    val title : String,
    val price : String,
    val image: String
)

val cryptoList = listOf(
    BitcoinsRank(1,"Bitcoin", "$109,797.37", "https://cdn.pixabay.com/photo/2021/04/30/16/47/btc-logo-6219386_1280.png"),
    BitcoinsRank(2,"Ethereum", "$4,321.21", "https://cryptologos.cc/logos/ethereum-eth-logo.png"),
    BitcoinsRank(3,"Tether", "$1.0000", "https://cryptologos.cc/logos/tether-usdt-logo.png"),
    BitcoinsRank(4,"XRP", "$2.8100", "https://cryptologos.cc/logos/xrp-xrp-logo.png"),
    BitcoinsRank(5,"BNB", "$845.0000", "https://cryptologos.cc/logos/bnb-bnb-logo.png"),
    BitcoinsRank(6,"Solana", "$201.8500", "https://cryptologos.cc/logos/solana-sol-logo.png"),
    BitcoinsRank(7,"USDC", "$0.9998", "https://cryptologos.cc/logos/usd-coin-usdc-logo.png"),
    BitcoinsRank(8,"Dodgecoin", "$0.1320", "https://cryptologos.cc/logos/dogecoin-doge-logo.png"),
    BitcoinsRank(9,"TRON", "$0.3630", "https://cryptologos.cc/logos/tron-trx-logo.png"),
)