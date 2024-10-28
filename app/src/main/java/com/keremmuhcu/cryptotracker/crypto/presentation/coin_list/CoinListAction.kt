package com.keremmuhcu.cryptotracker.crypto.presentation.coin_list

import com.keremmuhcu.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}