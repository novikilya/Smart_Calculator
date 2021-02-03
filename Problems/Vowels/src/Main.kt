fun main() {
    val vowels = mutableMapOf(
        1 to 'a',
        5 to 'e',
        9 to 'i',
        15 to 'o',
        21 to 'u'
    )
    val letter = readLine()!!.toLowerCase().first()
    var output = 0
    for (i in vowels.keys) {
        if (letter == vowels[i]) output = i
    }
    println(output)
}