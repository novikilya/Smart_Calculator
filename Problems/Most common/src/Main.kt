fun main() {
    val words = mutableMapOf<String, Int>()

    do {
        val input = readLine()!!
        if (input == "stop") break
        if (words.containsKey(input)) {
            words[input] = words[input]!! + 1
        } else {
            words[input] = 1
        }
    } while (true)

    var max = 0
    var mostCommonWord = "null"
    for (key in words.keys) {
        if (words[key]!! > max) {
            max = words[key]!!
            mostCommonWord = key
        }
    }

    println(mostCommonWord)
}