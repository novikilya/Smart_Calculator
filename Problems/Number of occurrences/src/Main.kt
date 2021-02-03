fun solution(strings: List<String>, str: String): Int {
    var counter = 0
    for (i in strings) {
        if (i == str) counter++
    }
    return counter
}