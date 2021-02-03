fun main() {
    val input = readLine()!!
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    for (i in alphabet) {
        if (i !in input) print(i)
    }
}