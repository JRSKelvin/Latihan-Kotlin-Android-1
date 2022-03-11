package accessmodifier

// Public == Bisa Diakses Dimana Pun
// Internal == Hanya Bisa Diakses Didalam Module Atau Proyek Yang Sama
// Protected == Hanya Bisa Diakses Dalam 1 Class Atau Sub Class
// Private == Hanya Bisa Diakses Dalam 1 Class

open class AccessModifier {
    var accessPublic : Int = 0
    internal var accessInternal : Int = 1
    protected var accessProtected : Int = 2
    private var accessPrivate : Int = 3

    fun panggilModifierDiClassSama(){
        println("panggilModifierDiClassSama $accessPublic")
        println("panggilModifierDiClassSama $accessInternal")
        println("panggilModifierDiClassSama $accessProtected")
        println("panggilModifierDiClassSama $accessPrivate")
    }
}

class AccessChild : AccessModifier() {
    fun panggilModifierDiSuperSubClass(){
        println("panggilModifierDiSuperSubClass $accessPublic")
        println("panggilModifierDiSuperSubClass $accessInternal")
        println("panggilModifierDiSuperSubClass $accessProtected")
        // println("panggilModifierDiSuperSubClass $accessPrivate") // Error Private Only Single Class
    }
}

fun main(){
    val callClassAM = AccessModifier()
    callClassAM.panggilModifierDiClassSama()
    println("Main -> AccessModifier ${callClassAM.accessPublic}")
    println("Main -> AccessModifier ${callClassAM.accessInternal}")
    // println("Main -> AccessModifier ${callClassAM.accessProtected}") // Error Protected Only Class Subclass
    // println("Main -> AccessModifier ${callClassAM.accessPrivate}") // Error Private Only Single Class


    val callClassChild = AccessChild()
    callClassChild.panggilModifierDiSuperSubClass()
    println("Main -> AccessChild ${callClassAM.accessPublic}")
    println("Main -> AccessChild ${callClassAM.accessInternal}")
}