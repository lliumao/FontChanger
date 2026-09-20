package com.example.fontchanger

import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StyleMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scroll = ScrollView(this)
        val container = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 40, 40, 40)
            setBackgroundColor(0xFF1E1E1E.toInt())
        }
        scroll.addView(container)

        val title = TextView(this).apply {
            text = "Выбери стиль"
            textSize = 22f
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(0, 0, 0, 30)
        }
        container.addView(title)

        val current = StylePrefs.getStyle(this)

        FontStyle.values().forEach { style ->
            val preview = FontMapper.transform(SAMPLE_PHRASE, style)
            val isCurrent = style == current

            val item = TextView(this).apply {
                text = "${if (isCurrent) "✓ " else "   "}${style.displayName}\n$preview"
                textSize = 16f
                setTextColor(if (isCurrent) 0xFF4CAF50.toInt() else 0xFFFFFFFF.toInt())
                setPadding(30, 30, 30, 30)
                setBackgroundColor(
                    if (isCurrent) 0xFF2A2A2A.toInt() else 0xFF1E1E1E.toInt()
                )
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 10, 0, 10)
                }
                setOnClickListener {
                    StylePrefs.setStyle(this@StyleMenuActivity, style)
                    finish()
                }
            }
            container.addView(item)
        }

        val cancel = TextView(this).apply {
            text = "Отмена"
            textSize = 18f
            setTextColor(0xFFFF6666.toInt())
            setPadding(30, 40, 30, 30)
            setOnClickListener { finish() }
        }
        container.addView(cancel)

        setContentView(scroll)
    }

    companion object {
        private const val SAMPLE_PHRASE = "Съешь ещё этих мягких французских булочек, да выпей чаю"
    }
}
