package com.example.fontchanger

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

    fun toSmallCaps(input: String): String {
        val sb = StringBuilder()
        for (ch in input) {
            sb.append(smallCaps[ch] ?: ch)
        }
        return sb.toString()
    }
}
