package models

import com.google.gson.annotations.SerializedName
import com.google.gson.Gson

data class Card(
    @SerializedName("card_holder") val cardHolder: String,
    @SerializedName("alias") val alias: String,
    @SerializedName("id") val id: String,
    @SerializedName("color") val color: String,
    @SerializedName("last_4") val last4: String,
    @SerializedName("brand") val brand: String,
    @SerializedName("status") val status: String,
    @SerializedName("type") val type: String,
    @SerializedName("expiration_date") val expirationDate: String,
    @SerializedName("bank") val bank: String,
    @SerializedName("is_default") val isDefault: Boolean
)

enum class CardType{
    CREDIT,
    DEBIT
}

enum class CardBrand{
    MASTERCARD,
    VISA
}