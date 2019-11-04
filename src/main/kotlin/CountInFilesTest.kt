//small optimisation of Kotlin code from https://habr.com/ru/company/oleg-bunin/blog/462505/

import java.io.File

fun countLinesInFiles(fileNames: List<String>): Int = fileNames.sumBy { File(it).useLines { it.count() } }