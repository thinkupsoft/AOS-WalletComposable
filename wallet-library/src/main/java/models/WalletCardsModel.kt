package models

import com.google.gson.annotations.SerializedName

data class WalletCardsData (
    @SerializedName("cards")
    val cards: List<Card>,
    @SerializedName("background")
    val background: String,

): SDUIComponent()
