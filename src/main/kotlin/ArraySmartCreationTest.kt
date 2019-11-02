fun main() {
    val height = 8
    val result = (0 until 16 * height).mapNotNull {
        //simplified example
        if (it % 16 == 0) {
            null
        } else {
            (it * it).toString()
        }
    }.toTypedArray()

//    val resultAlt = Array(16 * height) {
//        (it * it).toString()
//    }
}