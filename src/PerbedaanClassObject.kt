object Object1 {
    fun nama(): String {
        return "Binarian"
    }

    fun usia(): Int {
        return 25
    }
}

class Class1{
    fun nama(): String {
        return "Binarian"
    }

    fun usia(): Int {
        return 25
    }
}

fun main(){
    val result1 = "${Object1.nama()} ${Object1.usia()}"
    val result2 = "${Class1().nama()} ${Class1().usia()}"
    println(result1)
    println(result2)
}