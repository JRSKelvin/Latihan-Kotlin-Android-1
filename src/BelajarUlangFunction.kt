fun main(){
    val welcome = "SELAMAT DATANG DI KOTLIN BY KELVIN"
    println(welcome.toLowerCase())

    val hasilGabung = {namaDepan: String, namaBelakang: String -> "$namaDepan $namaBelakang"} // Lambda Function

    primaryFunction("IntelliJ")
    println(hasilGabung("Kelvin", "Kotlin"))

    higherOrder("Android Studio IDEA", ::receiverHigherOrder)
}

fun String.toLowerCase() : String{ // Extension Function
    return this.split(" ").joinToString(" "){
        it.lowercase()
    }
}

fun primaryFunction(namaTim: String){ // Normal Function
    println("System Loading... $namaTim")
}

fun higherOrder(namaIDEA : String, panggilFunction: (String) -> Unit){ // Higher Order Function
    panggilFunction(namaIDEA)
}

fun receiverHigherOrder(namaIDEA: String){
    println(namaIDEA)
}