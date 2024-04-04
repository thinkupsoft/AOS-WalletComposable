package com.thinkup.wallet_library.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import models.SDUIComponent
import models.WalletCardsData

@Composable
fun WalletCardsComponent(
    data: WalletCardsData,
    event: SDUIComponent.EventHandler
) {
    var stacked by remember { mutableStateOf(true) }
    Box(
        Modifier
            .fillMaxWidth()
            .background(color = getComponentColor(color = data.background))
            .padding(bottom = 24.dp)

    ) {
        if (data.cards.isEmpty()) {
            return EmptyWallet(
                modifier = Modifier
                    .align(Alignment.Center)
            )
        } else {
            CardsStack(
                cards = data.cards,
                areCardsStacked = stacked,
                modifier = Modifier
                    .fillMaxWidth()
                    .noRippleClickable { stacked = !stacked }
            )
        }
    }
}

@Composable
fun getComponentColor(color: String): Color {
    return when (color) {
        ComponentColors.PRIMARY.name -> MaterialTheme.colorScheme.primary
        ComponentColors.SECONDARY.name -> MaterialTheme.colorScheme.secondary
        ComponentColors.TERTiARY.name -> MaterialTheme.colorScheme.tertiary
        ComponentColors.BACKGROUND.name -> MaterialTheme.colorScheme.background

        else -> { MaterialTheme.colorScheme.background }
    }
}

enum class ComponentColors {
    BACKGROUND,
    PRIMARY,
    SECONDARY,
    TERTiARY
}



inline fun Modifier.noRippleClickable(
    crossinline onClick: () -> Unit
): Modifier = composed {
    clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() }
    ) {
        onClick()
    }
}
