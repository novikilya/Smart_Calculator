fun main() {
    val n = readLine()!!.toInt()
    var counter = 0
    loop@ for (i in 1..n) {
        for (k in 1..i) {
            if (counter >= n) break@loop
            print("$i ")
            counter++
        }
    }
}