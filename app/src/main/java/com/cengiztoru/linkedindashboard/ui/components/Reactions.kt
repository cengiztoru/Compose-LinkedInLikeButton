package com.cengiztoru.linkedindashboard.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cengiztoru.linkedindashboard.R

@Composable
fun Reactions(
    modifier: Modifier = Modifier,
    onReactionClicked: (reaction: ReactionType) -> Unit
) {
    Row(
        modifier = modifier.then(Modifier.padding(start = 8.dp, end = 8.dp)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        ReactionItem(ReactionType.LIKE, onItemClicked = onReactionClicked)
        ReactionItem(ReactionType.CELEBRATE, onItemClicked = onReactionClicked)
        ReactionItem(ReactionType.LOVE, onItemClicked = onReactionClicked)
        ReactionItem(ReactionType.INSIGHTFUL, onItemClicked = onReactionClicked)
        ReactionItem(ReactionType.CURIOUS, onItemClicked = onReactionClicked)

    }
}

@Preview
@Composable
fun ReactionsPreview() {
    Reactions {}
}

enum class ReactionType(@DrawableRes val imageId: Int) {
    LIKE(R.drawable.ic_like_filled),
    CELEBRATE(R.drawable.ic_celebrate_filled),
    LOVE(R.drawable.ic_love_filled),
    INSIGHTFUL(R.drawable.ic_insightful_filled),
    CURIOUS(R.drawable.ic_curious_filled),
}