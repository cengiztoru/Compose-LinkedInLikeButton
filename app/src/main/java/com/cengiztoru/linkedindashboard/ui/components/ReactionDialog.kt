package com.cengiztoru.linkedindashboard.ui.components

import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReactionDialog(
    expanded: Boolean,
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit
) {
    DropdownMenu(
        modifier = modifier,
        expanded = expanded,
        onDismissRequest = onDismissRequest,
    ) {
        Reactions()
    }
}

@Preview
@Composable
fun ReactionDialogPreview() {
    ReactionDialog(
        expanded = true,
        onDismissRequest = { },
    )
}
