package com.keremmuhcu.cryptotracker.crypto.presentation.coin_list

import com.keremmuhcu.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}