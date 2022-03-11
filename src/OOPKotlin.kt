open class Persons{
    fun canWalk(){
        println("Saya Bisa Berjalan")
    }
    fun canTalk(){
        println("Saya Bisa Bicara Sama Kamu")
    }
    fun canEat(){
        println("Saya Bisa Makan")
    }

    open fun skillUnik(){
        println("Setiap Orang Memiliki Skill Unik")
    }
}

class MathTeacher: Persons() {
    override fun skillUnik(){
        super.skillUnik()
        println("Saya Seorang Guru Khusus Mata Pelajaran Matematika")
    }
}

class Footballer: Persons() {
    override fun skillUnik(){
        super.skillUnik()
        println("Saya Seorang Guru Khusus Mata Pelajaran Olahraga Terutama Pemain Bola")
    }
}

class Businessman: Persons() {
    override fun skillUnik(){
        super.skillUnik()
        println("Saya Seorang Guru Khusus Mata Pelajaran Manajemen Terutama Berbisnis")
    }
}

fun main(){
    val persons = Persons()
    persons.canWalk()
    persons.canTalk()
    persons.canEat()
    persons.skillUnik()

    val footBaller = Footballer()
    footBaller.canWalk()
    footBaller.canTalk()
    footBaller.canEat()
    footBaller.skillUnik()

    MathTeacher().skillUnik()
    Businessman().skillUnik()
}