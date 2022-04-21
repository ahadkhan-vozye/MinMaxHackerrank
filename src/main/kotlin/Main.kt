import java.util.*


fun maxMin(k: Int, arr: Array<Int>): Int {
    val unfairnessList = ArrayList<Int>()
    if (arr.isEmpty())
        return 0

    val sortedList = arr.toList().sortedDescending()

    for (i in 0 until arr.size - k) {
        println(i)
        println(i + k)
        val tempList = sortedList.subList(i, i + k)
        val max = tempList.maxOrNull()!!
        val min = tempList.minOrNull()!!
        unfairnessList.add(max - min)
    }

    return if (unfairnessList.isEmpty())
        0
    else
        unfairnessList.minOrNull()!!
}

fun main() {
    val n = 20

    val k = 5

    val arr = Array<Int>(n, { 0 })
    arr[0] = 4504
    arr[1] = 1520
    arr[2] = 5857
    arr[3] = 4094
    arr[4] = 4157
    arr[5] = 3902
    arr[6] = 822
    arr[7] = 6643
    arr[8] = 2422
    arr[9] = 7288
    arr[10] = 8245
    arr[11] = 9948
    arr[12] = 2822
    arr[13] = 1784
    arr[14] = 7802
    arr[15] = 3142
    arr[16] = 9739
    arr[17] = 5629
    arr[18] = 5413
    arr[19] = 7232

    val result = maxMin(k, arr)

    println(result)
}