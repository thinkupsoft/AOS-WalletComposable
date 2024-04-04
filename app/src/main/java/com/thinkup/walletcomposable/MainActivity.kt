package com.thinkup.walletcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thinkup.wallet_library.wallet.WalletCardsComponent
import com.thinkup.walletcomposable.ui.theme.WalletComposableTheme
import models.Card
import models.SDUIComponent
import models.WalletCardsData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WalletComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box (Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        WalletCardsComponent(WalletCardsData(
                            listOf(
                                Card(
                                    cardHolder = "John Doe",
                                    alias = "Main Card",
                                    id = "123456789",
                                    color = "#9A7CB1",
                                    last4 = "1234",
                                    brand = "VISA",
                                    status = "active",
                                    type = "DEBIT",
                                    expirationDate = "12/2022",
                                    bank = "ABC Bank",
                                    isDefault = false
                                ),
                                Card(
                                    cardHolder = "John Doe",
                                    alias = "Main Card",
                                    id = "123456789",
                                    color = "#364C6A",
                                    last4 = "1234",
                                    brand = "MASTERCARD",
                                    status = "active",
                                    type = "DEBIT",
                                    expirationDate = "12/2022",
                                    bank = "ABC Bank",
                                    isDefault = false
                                ),
                                Card(
                                    cardHolder = "John Doe",
                                    alias = "Main Card",
                                    id = "123456789",
                                    color = "#15263D",
                                    last4 = "1234",
                                    brand = "VISA",
                                    status = "active",
                                    type = "DEBIT",
                                    expirationDate = "12/2022",
                                    bank = "ABC Bank",
                                    isDefault = false
                                )
                            ),
                            background = "BACKGROUND"
                        ), event = object : SDUIComponent.EventHandler {
                            override fun onClick(action: SDUIComponent.Action?) {
                                action?.let { event ->
                                }
                            }
                        })
                    }                }
            }
        }
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
    WalletComposableTheme {
        Greeting("Android")
    }
}