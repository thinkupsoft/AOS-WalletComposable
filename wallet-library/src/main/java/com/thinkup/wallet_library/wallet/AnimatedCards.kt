package com.thinkup.wallet_library.wallet

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.thinkup.mvi.ui.screens.home.home.ui.wallet.CardView
import com.thinkup.wallet_library.R
import models.Card

@Composable
fun CardsStack(cards: List<Card>, areCardsStacked: Boolean, modifier: Modifier) {
    val cardHeight = 190.dp
    val spacing = 20.dp
    val animationSpec: AnimationSpec<Dp> = spring(
        dampingRatio = Spring.DampingRatioLowBouncy,
        stiffness = Spring.StiffnessVeryLow
    )

    val containerHeight by animateDpAsState(
        targetValue = if (areCardsStacked) {
            cardHeight + ((cards.size - 1) * spacing.value).dp
        } else {
            (cards.size.toFloat() * cardHeight.value).dp + ((cards.size - 1) * spacing.value).dp
        },
        animationSpec = animationSpec,
        label = ""
    )

    Box(
        modifier = modifier
            .padding(top = 8.dp)
            .height(containerHeight),
        contentAlignment = Alignment.TopCenter
    ) {
        cards.forEachIndexed { index, card ->
            val offset by animateDpAsState(
                targetValue = if (areCardsStacked) {
                    index * spacing
                } else {
                    (cards.size - index - 1) * (cardHeight + spacing)
                },
                animationSpec = animationSpec,
                label = ""
            )

            val scale by animateFloatAsState(
                targetValue = if (areCardsStacked) {
                    1f - (0.05f * (cards.size - index - 1)).coerceAtMost(0.2f)
                } else {
                    1f
                },
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessVeryLow
                ),
                label = ""
            )

            CardView(
                card = cards[index],
                modifier = Modifier
                    .offset(y = offset)
                    .padding(bottom = if (areCardsStacked) 5.dp else 0.dp)
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                    }

            )
        }
    }
}

@Composable
fun EmptyWallet(modifier: Modifier = Modifier) {
    val primary = MaterialTheme.colorScheme.primary
    val stroke = Stroke(
        width = 6f,
        pathEffect = PathEffect.dashPathEffect(floatArrayOf(20f, 10f), 0f)
    )
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(DIMEN_X_NORMAL)
            .clip(RoundedCornerShape(RADIUS_X_NORMAL))
            .background(Color.LightGray)
            .drawBehind {
                drawRoundRect(color = primary, style = stroke, cornerRadius = CornerRadius(60f, 60f))
            }

    ) {
        Column(
            Modifier.padding(DIMEN_XX_NORMAL).align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.empty_wallet_image),
                contentDescription = "cards icon"
            )
            SecondarySubtitle(
                text =  "Bienvenido",
                color = primary,
                modifier = Modifier.padding(vertical = DIMEN_XX_SMALL)
            )
            SecondarySubtitleRegular(
                text =  "¡Toca aquí para agregar \\n tu primer tarjeta!",
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun walletPreview() {
    Column {
        EmptyWallet()
        CardsStack(
            cards = listOf(
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
                    color = "#9A7CB1",
                    last4 = "1234",
                    brand = "VISA",
                    status = "active",
                    type = "DEBIT",
                    expirationDate = "12/2022",
                    bank = "ABC Bank",
                    isDefault = false
                )
            ),
            areCardsStacked = true,
            modifier = Modifier.padding(8.dp)
        )
        CardsStack(
            cards = listOf(
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
                    color = "#9A7CB1",
                    last4 = "1234",
                    brand = "VISA",
                    status = "active",
                    type = "DEBIT",
                    expirationDate = "12/2022",
                    bank = "ABC Bank",
                    isDefault = false
                )
            ),
            areCardsStacked = false,
            modifier = Modifier.padding(8.dp)
        )
    }
}
