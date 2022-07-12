package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.cengiztoru.linkedindashboard.R

@Composable
fun LikeButton() {
    var reactionsShown by remember { mutableStateOf(false) }

    Icon(
        painterResource(R.drawable.ic_like), "LikeButton", modifier = Modifier
            .wrapContentSize()
            .pointerInput(Unit) {
                detectTapGestures(
                    onLongPress = {
                        reactionsShown = reactionsShown.not()
                    },
                )
            }
    )

    ReactionDialog(reactionsShown) {
        reactionsShown = reactionsShown.not()
    }
}

@Preview
@Composable
fun LikeButtonPreview() {
    LikeButton()
}