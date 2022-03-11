class Kucing(
    nama: String = "",
    ras: String = "",
    warna: String = "",
    makanan: String = "",
    jumlah: Int = 0,
    berat: Int = 0
) {
    var nama: String = nama
    private var ras: String = ras
    var warna: String = warna
    var makanan: String = makanan
    var jumlah: Int = jumlah
    var berat: Int = berat

    constructor(_nama: String, _ras: String) : this() {
        this.nama = _nama
        this.ras = _ras
        println("Ini secondari constructor dari $nama rasnya $ras")
    }

    init {
        println("Nama: $nama")
        println("Ras: $ras")
        println("Warna: $warna")
        println("Makanan: $makanan")
        println("Jumlah: $jumlah")
        println("Berat: $berat")
    }

    fun kenalan() = println("halo $nama nama kucingku  kucing")
    fun menggonggong() = println("$nama menggonggong")
}

fun main(){
    Kucing("Tes")
    val running2 = Kucing(nama = "Oren", berat = 4)
    running2.kenalan()
    running2.menggonggong()
    Kucing("Doni", "Kampung")

}