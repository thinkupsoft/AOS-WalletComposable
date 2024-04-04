package com.thinkup.wallet_library.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


/**
 * Created by Martin Zarzar on 28/2/24.
 */

@Composable
fun Any.convertToAnnotatedString(): AnnotatedString {
    return when (this) {
        is String -> buildAnnotatedString { append(this@convertToAnnotatedString) }
        is AnnotatedString -> this
        else -> throw IllegalArgumentException("Unsupported text type: ${this.javaClass}")
    }
}

@Composable
fun SuperTitle(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 60.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 60.sp,
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
fun H1(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 40.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 32.sp,
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
fun H2(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 32.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp,
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
fun H3(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 32.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
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
fun H4(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 30.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 22.sp,
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
fun PrimarySubtitle(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 24.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
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
fun PrimarySubtitleLight(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 24.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 20.sp,
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
fun SecondarySubtitle(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 22.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
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

@Composable
fun SecondarySubtitleBold(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 22.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
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

@Composable
fun SecondarySubtitleRegular(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 22.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
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

@Composable
fun SecondarySubtitleLight(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 22.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
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

@Composable
fun BodyExtraBold(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp,
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
fun BodyBold(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
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
fun BodyRegular(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
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
fun BodyMedium(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
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
fun BodyLight(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
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
fun BodyBoldUnderline(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp,
            textDecoration = TextDecoration.Underline
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Composable
fun BodyRegularUnderline(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp,
            textDecoration = TextDecoration.Underline
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Composable
fun SecondaryBodyBold(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 18.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
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
fun SecondaryBodyRegular(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 18.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
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
fun SecondaryBodyBoldUnderline(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 18.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp,
            textDecoration = TextDecoration.Underline
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Composable
fun SecondaryBodyRegularUnderline(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 18.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = lineHeight,
            letterSpacing = 0.sp,
            textDecoration = TextDecoration.Underline
        ),
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Composable
fun TextButtonPrimary(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color ,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 24.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
        fontStyle = fontStyle,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
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
fun TextButtonSecondary(
    text: Any,
    modifier: Modifier = Modifier,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    color: Color ,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = 20.sp
) =
    Text(
        text = text.convertToAnnotatedString(),
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
@Preview(
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true
)
private fun TextOnePreview() {
        Column(
            Modifier
                .padding(DIMEN_NORMAL)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(DIMEN_NORMAL)
        ) {
            H1(text = "H1")
            H2(text = "H2")
            H3(text = "H3")
            H4(text = "H4")
            PrimarySubtitle(text = "PrimarySubtitle")
            PrimarySubtitleLight(text = "PrimarySubtitleLight")
            SecondarySubtitle(text = "SecondarySubtitle")
            SecondarySubtitleBold(text = "SecondarySubtitleBold")
            SecondarySubtitleRegular(text = "SecondarySubtitleRegular")
            SecondarySubtitleLight(text = "SecondarySubtitleLight")
            BodyExtraBold(text = "BodyExtraBold")
            BodyBold(text = "BodyBold")
            BodyRegular(text = "BodyRegular")
            BodyMedium(text = "BodyMedium")
            BodyLight(text = "BodyLight")
            BodyBoldUnderline(text = "BodyBoldUnderline")
            BodyRegularUnderline(text = "BodyRegularUnderline")
            SecondaryBodyBold(text = "SecondaryBodyBold")
        }
    }


@Composable
@Preview(
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true
)
private fun TextTwoPreview() {
        Column(
            Modifier
                .padding(DIMEN_NORMAL)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(DIMEN_NORMAL)
        ) {
            SecondaryBodyRegular(text = "SecondaryBodyRegular")
            SecondaryBodyBoldUnderline(text = "SecondaryBodyBoldUnderline")
            SecondaryBodyRegularUnderline(text = "SecondaryBodyRegularUnderline")
    }
}
