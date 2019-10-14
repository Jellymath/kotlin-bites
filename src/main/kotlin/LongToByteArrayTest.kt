fun longToBytes(l: Long): ByteArray {
    var l = l
    val result = ByteArray(8)
    for (i in 7 downTo 0) {
        result[i] = (l and 0xFF).toByte()
        l = l shr 8
    }
    return result
}