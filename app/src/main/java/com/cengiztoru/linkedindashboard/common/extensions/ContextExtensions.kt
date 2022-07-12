package com.cengiztoru.linkedindashboard.common.extensions

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(
        this,
        message,
        length
    ).show()
}