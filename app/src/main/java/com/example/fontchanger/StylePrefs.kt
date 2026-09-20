package com.example.fontchanger

import android.content.Context

object StylePrefs {
    private const val PREFS = "fontchanger_prefs"
    private const val KEY = "selected_style"

    fun getStyle(context: Context): FontStyle {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val name = prefs.getString(KEY, FontStyle.SMALL_CAPS.name) ?: FontStyle.SMALL_CAPS.name
        return try {
            FontStyle.valueOf(name)
        } catch (e: Exception) {
            FontStyle.SMALL_CAPS
        }
    }

    fun setStyle(context: Context, style: FontStyle) {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY, style.name).apply()
    }
}
