fun main() {
    val time = readLine()!!.split(" ").toTypedArray()
    val date = readLine()!!.split(" ").toTypedArray()
    println("${time[0]}:${time[1]}:${time[2]} ${date[0]}/${date[1]}/${date[2]}")
}