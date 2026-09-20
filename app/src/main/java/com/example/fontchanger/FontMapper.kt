package com.example.fontchanger

import com.example.fontchanger.fonts.Style1_Flowing
import com.example.fontchanger.fonts.Style2_Glyphs
import com.example.fontchanger.fonts.Style3_Coptic
import com.example.fontchanger.fonts.Style4_Canadian
import com.example.fontchanger.fonts.Style5_Runes
import com.example.fontchanger.fonts.Style6_Ethiopic
import com.example.fontchanger.fonts.Style7_Greek
import com.example.fontchanger.fonts.Style8_Chinese

enum class FontStyle(val displayName: String) {
    SMALL_CAPS("Small Caps (по умолчанию)"),
    FLOWING("Flowing Script"),
    GLYPHS("Glyphs"),
    COPTIC("Коптский"),
    CANADIAN("Канадский слог"),
    RUNES("Руны"),
    ETHIOPIC("Эфиопия"),
    GREEK("Greek"),
    CHINESE("Chinese")
}

object FontMapper {

    private val smallCaps = mapOf(
        'а' to 'ᴀ', 'б' to 'б', 'в' to 'ʙ', 'г' to 'г', 'д' to 'д',
        'е' to 'ᴇ', 'ё' to 'ё', 'ж' to 'ж', 'з' to 'з', 'и' to 'и',
        'й' to 'й', 'к' to 'ᴋ', 'л' to 'ᴧ', 'м' to 'ʍ', 'н' to 'н',
        'о' to 'ᴏ', 'п' to 'ᴨ', 'р' to 'ᴩ', 'с' to 'ᴄ', 'т' to 'ᴛ',
        'у' to 'у', 'ф' to 'ф', 'х' to 'х', 'ц' to 'ц', 'ч' to 'ч',
        'ш' to 'ɯ', 'щ' to 'щ', 'ъ' to 'ъ', 'ы' to 'ы', 'ь' to 'ь',
        'э' to 'э', 'ю' to 'ю', 'я' to 'я',
        'А' to 'ᴀ', 'Б' to 'Б', 'В' to 'ʙ', 'Г' to 'Г', 'Д' to 'Д',
        'Е' to 'ᴇ', 'Ё' to 'Ё', 'Ж' to 'Ж', 'З' to 'З', 'И' to 'И',
        'Й' to 'Й', 'К' to 'ᴋ', 'Л' to 'ᴧ', 'М' to 'ʍ', 'Н' to 'Н',
        'О' to 'ᴏ', 'П' to 'ᴨ', 'Р' to 'ᴩ', 'С' to 'ᴄ', 'Т' to 'ᴛ',
        'У' to 'У', 'Ф' to 'Ф', 'Х' to 'Х', 'Ц' to 'Ц', 'Ч' to 'Ч',
        'Ш' to 'ɯ', 'Щ' to 'Щ',
        'a' to 'ᴀ', 'b' to 'ʙ', 'c' to 'ᴄ', 'd' to 'ᴅ', 'e' to 'ᴇ',
        'f' to 'ꜰ', 'g' to 'ɢ', 'h' to 'ʜ', 'i' to 'ɪ', 'j' to 'ᴊ',
        'k' to 'ᴋ', 'l' to 'ʟ', 'm' to 'ᴍ', 'n' to 'ɴ', 'o' to 'ᴏ',
        'p' to 'ᴘ', 'q' to 'ǫ', 'r' to 'ʀ', 's' to 'ꜱ', 't' to 'ᴛ',
        'u' to 'ᴜ', 'v' to 'ᴠ', 'w' to 'ᴡ', 'x' to 'x', 'y' to 'ʏ',
        'z' to 'ᴢ'
    )

    fun getMap(style: FontStyle): Map<Char, Char> = when (style) {
        FontStyle.SMALL_CAPS -> smallCaps
        FontStyle.FLOWING -> Style1_Flowing.map
        FontStyle.GLYPHS -> Style2_Glyphs.map
        FontStyle.COPTIC -> Style3_Coptic.map
        FontStyle.CANADIAN -> Style4_Canadian.map
        FontStyle.RUNES -> Style5_Runes.map
        FontStyle.ETHIOPIC -> Style6_Ethiopic.map
        FontStyle.GREEK -> Style7_Greek.map
        FontStyle.CHINESE -> Style8_Chinese.map
    }

    fun transform(input: String, style: FontStyle): String {
        val map = getMap(style)
        val sb = StringBuilder()
        for (ch in input) {
            sb.append(map[ch] ?: ch)
        }
        return sb.toString()
    }
}
