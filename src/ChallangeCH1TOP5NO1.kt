class ChallangeCH1TOP5NO1 {
    fun hitungBagi(Angka: Int) : String{
        return if(Angka % 2 == 0) {
            "Angka $Angka Adalah Angka Genap"
        } else if (Angka % 2 == 1){
            "Angka $Angka Adalah Angka Ganjil"
        } else {
            "Angka $Angka Adalah Angka Negatif"
        }
    }
}

fun main(){
    val initChal = ChallangeCH1TOP5NO1()
    for(i in 1..100){
        val hitungBagi = initChal.hitungBagi(i)
        println(hitungBagi)
    }
}