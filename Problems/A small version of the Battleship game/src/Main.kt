import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    val y3 = scanner.nextInt()

    val xs = arrayOf(x1, x2, x3)
    val ys = arrayOf(y1, y2, y3)

    val field = Array(5) { IntArray(5) }

    var xstring = ""
    var ystring = ""

    for (x in 1..5) {
        if (x in xs) {
            continue
        }
        xstring += "$x "
    }

    for (y in 1..5) {
        if (y in ys) {
            continue
        }
        ystring += "$y "
    }

    println(xstring.trim())
    println(ystring.trim())
}