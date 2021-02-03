fun parseCardNumber(cardNumber: String): Long {
    var output = 0L
    for (i in 0..18) {
        if (cardNumber[i] != ' ') {
            output = output * 10 + cardNumber[i].toString().toInt()
        }
    }
    return output
}