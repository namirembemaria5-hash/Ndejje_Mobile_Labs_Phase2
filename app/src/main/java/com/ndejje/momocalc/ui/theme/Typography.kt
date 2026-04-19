package com.ndejje.momocalc.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ndejje.momocalc.R

// Define Font Families
val PlayfairDisplay = FontFamily(
    Font(R.font.playfair_display_regular, FontWeight.Normal),
    Font(R.font.playfair_display_bold, FontWeight.Bold)
)

val SourceSans3 = FontFamily(
    Font(R.font.source_sans3_regular, FontWeight.Normal),
    Font(R.font.source_sans3_semibold, FontWeight.SemiBold)
)

// Material 3 Typography Mapping
val MoMoTypography = Typography(
    // App title — large, bold, serif
    headlineMedium = TextStyle(
        fontFamily = PlayfairDisplay,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    // Fee result label
    bodyLarge = TextStyle(
        fontFamily = SourceSans3,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    // Input field label and all general text
    bodyMedium = TextStyle(
        fontFamily = SourceSans3,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    // Error message text
    bodySmall = TextStyle(
        fontFamily = SourceSans3,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    )
)