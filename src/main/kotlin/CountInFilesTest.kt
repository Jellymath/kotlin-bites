import java.io.File

fun countLinesInFiles(fileNames: List<String>): Int =
//    fileNames.map { File(it).useLines { it.count() } }.sum()
    fileNames.sumBy { File(it).useLines { it.count() } }