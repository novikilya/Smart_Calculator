fun main() {
        val input = readLine()!! + " "

        val vowels = "aeiouy"
        var n = 0
        var counter = 0
        for (i in 1..input.lastIndex) {
            if (input[i] in vowels && input[i - 1] in vowels) {
                n++
            } else if (input[i] !in vowels && input[i - 1] !in vowels && input[i] != ' ') {
                n++
            } else {
                counter += n / 2
                n = 0
            }
        }

        println(counter)
}