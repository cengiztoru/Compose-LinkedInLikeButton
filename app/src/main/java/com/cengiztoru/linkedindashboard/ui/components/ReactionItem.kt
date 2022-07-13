package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ReactionItem(
    reactionType: ReactionType,
    modifier: Modifier = Modifier,
    description: String = "",
    size: Dp = 48.dp,
    onItemClicked: (itemType: ReactionType) -> Unit
) {

    var currentState: BounceState by remember { mutableStateOf(BounceState.Released) }
    val transition = updateTransition(targetState = currentState, label = "animation")

    val scale: Float by transition.animateFloat(
        transitionSpec = { spring(stiffness = 900f) }, label = ""
    ) { state ->
        if (state == BounceState.Pressed) {
            1f
        } else {
            0.6f
        }
    }

    Box(modifier) {
        Image(
            painter = painterResource(reactionType.imageId),
            contentDescription = description,
            modifier = Modifier.size(size).pointerInput(Unit) {
                detectTapGestures(onPress = {
                    currentState = BounceState.Pressed
                    tryAwaitRelease()
                    currentState = BounceState.Released
                }, onTap = {
                    onItemClicked.invoke(reactionType)
                })
            }.graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
        )
    }
}

enum class BounceState { Pressed, Released }

@Preview
@Composable
fun ReactionItemPreview() {
    ReactionItem(ReactionType.LOVE) {}
}