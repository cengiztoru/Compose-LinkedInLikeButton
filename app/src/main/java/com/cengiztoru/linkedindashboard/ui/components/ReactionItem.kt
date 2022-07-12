package com.cengiztoru.linkedindashboard.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cengiztoru.linkedindashboard.R

@Composable
fun ReactionItem(
    @DrawableRes id: Int,
    modifier: Modifier = Modifier,
    description: String = "",
    size: Dp = 36.dp
) {
    Image(
        modifier = modifier.then(Modifier.size(size)),
        painter = painterResource(id),
        contentDescription = description
    )
}

@Preview
@Composable
fun ReactionItemPreview() {
    ReactionItem(R.drawable.ic_love_filled)
}