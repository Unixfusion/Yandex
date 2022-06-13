fun main(args: Array<String>) {
    var count = readLine()!!.toInt()
    println(count)
    var text = readLine()
    println(text)

    var set = readLine()!!.split(" ").map { it.toInt() }

    var time = mutableListOf<Int>()
    time.add(set[0])
    var index = 0
    var temp = set[0]
    for (i in 1 until count) {
        try {
            time.add(set[i] - set[i-1])
        } catch (e: Exception) {
            //NOP
        }
        if (time[i] >= temp) {
            temp = time[i]
            index = i
        }
    }
    println(text!![index])
}