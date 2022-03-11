class ChallangeCH1TOP5NO2 {
    fun hitungBagi(Muncul: Int = 10){
        var awal = 0
        var akhir = 1

        for(i in 1..Muncul){
            if (i == Muncul){
                print("$awal ")
            } else {
                print("$awal, ")
            }
            val jumlah = awal + akhir // Alasan Kenapa Tidak Boleh Pakai Akhir += Awal Karena Variabel Awal Telah Ganti
            awal = akhir
            akhir = jumlah
        }
    }
}

fun main(){
    val initChal = ChallangeCH1TOP5NO2()
    val muncul = 10
    print("Fibbonaci $muncul Adalah ")
    initChal.hitungBagi(muncul)
}