package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReactionDialog(
    expanded: Boolean,
    modifier: Modifier = Modifier,
    onDismissRequest: (selectedReactionType: ReactionType?) -> Unit
) {
    DropdownMenu(
        modifier = modifier.wrapContentSize(),
        expanded = expanded,
        onDismissRequest = { onDismissRequest(null) }
    ) {
        Reactions { selectedReaction ->
            onDismissRequest(selectedReaction)
        }
    }
}

@Preview
@Composable
fun ReactionDialogPreview() {
    ReactionDialog(
        expanded = true,
        onDismissRequest = { _ -> }
    )
}
