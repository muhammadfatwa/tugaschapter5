package com.example.kertasbatugunting

import android.content.Context
import android.content.Intent
import android.widget.Toast

fun Context.toast(message: String) = Toast.makeText(this,message,Toast . LENGTH_SHORT).show()

fun Context.intentTo(clazz: Class <*>, beforeStar: (Intent) -> Unit ) {
    val intent = Intent(this, clazz)
    beforeStar.invoke(intent)
    startActivity(intent)
}


