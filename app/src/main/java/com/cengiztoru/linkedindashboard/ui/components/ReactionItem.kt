package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cengiztoru.linkedindashboard.common.extensions.noRippleClickable

@Composable
fun ReactionItem(
    reactionType: ReactionType,
    modifier: Modifier = Modifier,
    description: String = "",
    size: Dp = 36.dp,
    onItemClicked: (itemType: ReactionType) -> Unit
) {
    Image(
        modifier = modifier.then(
            Modifier.size(size)
                .noRippleClickable {
                    onItemClicked.invoke(reactionType)
                }),
        painter = painterResource(reactionType.imageId),
        contentDescription = description
    )
}

@Preview
@Composable
fun ReactionItemPreview() {
    ReactionItem(ReactionType.LOVE) {}
}