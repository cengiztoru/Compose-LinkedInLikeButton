package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cengiztoru.linkedindashboard.R
import com.cengiztoru.linkedindashboard.common.extensions.toast

@Composable
fun LikeButton(
    modifier: Modifier = Modifier,
) {
    var reactionsShown by remember { mutableStateOf(false) }
    var selectedReaction by remember { mutableStateOf<ReactionType?>(null) }

    Box(modifier = modifier) {
        Icon(
            painterResource(R.drawable.ic_like), "LikeButton", modifier = Modifier
                .size(64.dp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onLongPress = {
                            reactionsShown = reactionsShown.not()
                        },
                    )
                }
        )

        ReactionDialog(expanded = reactionsShown) { selectedReactionType ->
            reactionsShown = reactionsShown.not()
            selectedReaction = selectedReactionType
        }

        selectedReaction?.let { reactionType ->
            LocalContext.current.toast("${reactionType.name} selected")
        }
    }
}

@Preview
@Composable
fun LikeButtonPreview() {
    LikeButton()
}