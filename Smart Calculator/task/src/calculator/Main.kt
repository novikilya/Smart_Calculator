package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val vars = mutableMapOf<String, Int>()

    loop@ while (true) {
        val input = scanner.nextLine()
        if (input == "") continue@loop
        if (input == "/exit") break@loop
        if (input == "/help") {
            println("The program calculates the expression")
            continue@loop
        }
        if (input.first() == '/') {
            println("Unknown command")
            continue@loop
        }

        val numbers = input.split(" ").toMutableList()

        numbers.removeAll { it == "" }

        if (input.contains('=')) {

            var assignment = ""
            for (i in numbers) assignment += i

            for (i in assignment.substringBefore('=')) {
                if (i !in "abcdefhijklmnopqrstuvwxyz") {
                    println("Invalid identifier")
                    continue@loop
                }
            }
            try {
                vars[assignment.substringBefore('=')] = getNumber(assignment.substringAfter('='), vars).toInt()
            } catch (e: Exception) {
                println("Invalid assignment")
            }
            continue@loop
        }

        var sum = 0
        var operation = '+'
        var numbersAmount = 0
        var operationsAmount = 0
        for (i in numbers) {
            if (!checkIfItsAnOperation(i) && getNumber(i, vars) == "Unknown variable") {
                println("Unknown variable")
                continue@loop
            }

            try {
                sum = when (operation) {
                    '+' -> sum + getNumber(i, vars).toInt()
                    else -> sum - getNumber(i, vars).toInt()
                }
                numbersAmount++
            } catch (e: Exception) {
                var minuses = 0
                for (k in i) {
                    if (k == '-') minuses++
                }
                operation = when (minuses % 2) {
                    1 -> '-'
                    else -> '+'
                }
                operationsAmount++
            }
        }

        if (operationsAmount == numbersAmount - 1) {
            println(sum)
        } else {
            println("Invalid expression")
        }
    }

    println("Bye!")
}

fun getNumber(i: String, vars: MutableMap<String, Int>): String {
    return try {
        i.toInt().toString()
    } catch (e: Exception) {
        try {
            vars[i]!!.toString()
        } catch (e: Exception) {
            "Unknown variable"
        }
    }
}

fun checkIfItsAnOperation(str: String): Boolean {
    var a = 0
    for (i in str) {
        if (i !in "+-") a++
    }

    return a == 0
}