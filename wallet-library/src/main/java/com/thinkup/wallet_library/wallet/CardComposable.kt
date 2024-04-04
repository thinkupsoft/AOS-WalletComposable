package com.thinkup.mvi.ui.screens.home.home.ui.wallet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thinkup.wallet_library.R
import com.thinkup.wallet_library.wallet.BodyRegular
import com.thinkup.wallet_library.wallet.DIMEN_NORMAL
import com.thinkup.wallet_library.wallet.DIMEN_XXX_SMALL
import com.thinkup.wallet_library.wallet.DIMEN_XX_NORMAL
import com.thinkup.wallet_library.wallet.DIMEN_X_NORMAL
import com.thinkup.wallet_library.wallet.DIMEN_X_SMALL
import com.thinkup.wallet_library.wallet.DIMEN_X_SMEDIUM
import com.thinkup.wallet_library.wallet.RADIUS_XXX_SMALL
import com.thinkup.wallet_library.wallet.RADIUS_X_NORMAL
import com.thinkup.wallet_library.wallet.RADIUS_X_SMALL
import com.thinkup.wallet_library.wallet.SecondaryBodyRegular
import models.Card
import models.CardBrand
import models.CardType

@Composable
fun CardView(modifier: Modifier, card: Card) {
    val colorStr = card.color
    val color = colorStr.toColor()
    Box(
        modifier = modifier
            .width(311.dp)
            .height(190.dp)
            .clip(RoundedCornerShape(RADIUS_X_NORMAL))
            .background(color)
            .padding(vertical = DIMEN_X_NORMAL, horizontal = DIMEN_XX_NORMAL)
    ) {
        if (card.isDefault) {
            IsDefaultComposable(
                modifier = Modifier.align(Alignment.TopEnd)
            )
        }
        Column {
            GetCardBrandLogo(brand = card.brand)
            Spacer(modifier = Modifier.height(DIMEN_X_SMALL))
            GetCardType(type = card.type)
            Spacer(modifier = Modifier.weight(1f))
            SecondaryBodyBold(
                text = card.alias,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.height(DIMEN_NORMAL))
            CardNumberComposable(cardNumber = card.last4)
        }
    }
}


@Composable
fun CardNumberComposable(modifier: Modifier = Modifier, cardNumber: String) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(RADIUS_X_SMALL))
            .background(color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.30f)),
        contentAlignment = Alignment.Center
    ) {
        SecondarySubtitleLight(
            text = "**** **** **** $cardNumber",
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(horizontal = DIMEN_X_SMEDIUM, vertical = DIMEN_X_SMEDIUM)

        )
    }
}

@Composable
fun IsDefaultComposable(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(RADIUS_XXX_SMALL))
            .background(MaterialTheme.colorScheme.secondary)
            .padding(horizontal = DIMEN_XXX_SMALL, vertical = DIMEN_XXX_SMALL)
    ) {
        BodyRegular(
            text = "Predeterminada",
            color = Color.Black

        )
    }
}

fun String.toColor() = Color(android.graphics.Color.parseColor(this))

@Composable
fun GetCardType(type: String) {
    when (type) {
        CardType.CREDIT.name -> SecondaryBodyRegular(
            "Crédito",
            color = MaterialTheme.colorScheme.onPrimary
        )

        CardType.DEBIT.name -> SecondaryBodyRegular(
            "Débito",
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun GetCardBrandLogo(brand: String) {
    when (brand) {
        CardBrand.VISA.name -> Image(
            modifier = Modifier,
            imageVector = ImageVector.vectorResource(R.drawable.visa_logo_brand),
            contentDescription = brand
        )

        CardBrand.MASTERCARD.name -> Image(
            modifier = Modifier,
            imageVector = ImageVector.vectorResource(R.drawable.mastercard_logo_brand),
            contentDescription = brand
        )
    }
}


@Composable
fun SecondaryBodyBold(
    text: String,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 18.sp
) =
    Text(
        text = text,
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )


@Composable
fun SecondarySubtitleLight(
    text: String,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 22.sp
) =
    Text(
        text = text,
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 18.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Preview
@Composable
fun CardPreview() {
    CardView(
        modifier = Modifier,
        card = Card(
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
            isDefault = true
        )
    )
}
