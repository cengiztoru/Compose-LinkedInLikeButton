package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PostItem(
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        LikeButton()
    }
}

@Preview
@Composable
fun PostItemPreview() {
    PostItem()
}
