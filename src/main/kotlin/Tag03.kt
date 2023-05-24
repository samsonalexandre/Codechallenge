import kotlin.math.PI
import kotlin.math.roundToInt

fun main() {
    //Null Pointer Exception

    var a: String = "Hello"
    // a = null // Keine chance

    println(a.length) // OK

    var b: String? = null
    // b.length // Problem :-))

    println(b?.length) // Kein Problem

    val pi = PI

    println(pi)

    var arr = intArrayOf(23, 1, 56, 21, 234, 5678, 43, 3542)

    arr.sort()
    for (i in arr)
        println(i)


}