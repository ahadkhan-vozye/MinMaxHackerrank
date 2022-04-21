fun maxMin(k: Int, arr: Array<Int>): Int {
    val unfairnessList = ArrayList<Int>()
    if (arr.isEmpty())
        return 0

    val sortedList = arr.toList().sorted()

    for (i in 0 until arr.size - k + 1) {
        println(i)
        println(i + k)
        val max = sortedList[i + k - 1]
        val min = sortedList[i]
        unfairnessList.add(max - min)
    }

    return if (unfairnessList.isEmpty())
        0
    else
        unfairnessList.minOrNull()!!
}

fun main() {
    val n = 7

    val k = 3

    val arr = Array<Int>(n, { 0 })
    arr[0] = 100
    arr[1] = 200
    arr[2] = 300
    arr[3] = 350
    arr[4] = 400
    arr[5] = 401
    arr[6] = 402

    val result = maxMin(k, arr)

    println(result)
}