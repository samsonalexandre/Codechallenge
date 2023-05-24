fun main(args: Array<String>) {
    val items = mutableListOf("apple", "banana", "orange")

    val arr = arrayOf(7, 6, 1, 89, 134, 4, 56, 3567)
    arr.sort()
    for (x in arr)
    println("$x")


    for(item in items)
        println(item)

    var index = 0
    while (index < items.size){
        println("Item at $index is ${items.size}")
        index ++
    }

    println(5 in 3..10) // true

    for(i in 1..10) // vorwerts
        println(i)
    for (i in 10 downTo 1) // von hinten nach vorne
        println(i)

    for (i in 0..100 step 10)
        println(i)

    println("Tippe eine Zahl") // String to Int
    var a = readln().toUInt()

    println("Tippe eine Zahl") // String to Int
    var b = readln().toUInt()

    var sum = a + b

    println("Summa von deinen Zahlen ist $sum")

    println()

    testWhen("1767676767")

    for(q in 0..100 % 2) // Sort
        println(q)

}



fun testWhen(input: Any) { //Verzweigung
    when (input) {
        1 -> println("Eins")
        2 -> println("Zwei")
        in 10..20 -> println("Von 10 bis 20")
        is String -> println("Eine Zeile wurde angetippt ${input.length}")
        else -> println("Irgend was.....")
    }
}