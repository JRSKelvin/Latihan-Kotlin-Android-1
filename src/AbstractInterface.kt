interface NamaInterface {
    val nameInterface : String
    fun testingFunInterface (namaString : String)
}

class NamaClass(override val nameInterface: String) : NamaInterface {
    override fun testingFunInterface(namaString: String) {
        println("Halo $nameInterface $namaString")
    }
}

class NamaClass2(namaPanggil : String) : NamaInterface{
    override val nameInterface: String = "Hi Hi, $namaPanggil"
    override fun testingFunInterface(namaString: String) {
        println(nameInterface)
    }
}

// Batasan Perbedaan

abstract class AbstractClass {
    abstract val namaVar : String
    abstract fun testingFunAbstract()
}

class PanggilAbstractClass(namaPanggil : String) : AbstractClass(){
    override val namaVar: String = namaPanggil
    override fun testingFunAbstract() {
        println("")
    }
}

// Utama Main

fun main(){
    NamaClass("Kelvin").testingFunInterface("Kelvin")
    PanggilAbstractClass("Kelvin2").testingFunAbstract()
    NamaClass2("Kelvin").testingFunInterface("Kelvin")
}