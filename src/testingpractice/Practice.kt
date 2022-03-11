package testingpractice

fun main(){
    main1()
    println()
    main2()
    println()
    main3()
    println()
    main4()
    println()
    main5()
    println()

    val returnedInt = convertNumber("123")
    print(returnedInt)
}

fun main1(){
    var nilai = 125
    while (nilai <= 200){
        if (nilai % 5 == 0 ){
            println("nilai $nilai")
        }
        nilai++
    }

}

fun main2(){
    for (counter in 4 downTo 0){
        println(counter)
    }
}

fun main3(){
    val rows = 5
    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun main4(){
    val rows = 5
    var k = 0
    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }
}

fun main5(){
    val vArray = Array(10) { i -> i * 1 }
    vArray[0] = 5
    println("Array ${vArray[0]}")
    println("Array $vArray")

    val mList = mutableListOf(1, "x", false, "Binarian")
    println("mList 1 : $mList")
    mList.add("Vijay")
    mList += "Krisna"
    println("mList 1 : $mList")
}

fun convertNumber(namaString: String) = namaString.toInt()