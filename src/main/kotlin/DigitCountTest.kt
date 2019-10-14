fun countDigits(i: Int): Int {
    tailrec fun countDigits(i: Int, current: Int): Int = when (i) {
        0 -> current
        in -9..9 -> current + 1
        else -> countDigits(i / 10, current + 1)
    }
    return countDigits(i, 1)
}