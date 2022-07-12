package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cengiztoru.linkedindashboard.R

@Composable
fun Reactions() {
    Row(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        ReactionItem(R.drawable.ic_like_filled)
        ReactionItem(R.drawable.ic_celebrate_filled)
        ReactionItem(R.drawable.ic_love_filled)
        ReactionItem(R.drawable.ic_insightful_filled)
        ReactionItem(R.drawable.ic_curious_filled)

    }
}

@Preview
@Composable
fun ReactionsPreview() {
    Reactions()
}