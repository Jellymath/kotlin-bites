// inspired by https://www.youtube.com/watch?v=zp4BMR88260

import java.net.URL

fun main() {
    val bannedChars = setOf('g', 'k', 'm', 'q', 'v', 'w', 'x', 'z', 'i', 'o')
    URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt")
        .readText()
        .lineSequence()
        .filter { word -> bannedChars.none { it in word } }
        .maxBy { it.length }
        .let(::println)
}