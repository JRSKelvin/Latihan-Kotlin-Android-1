class Kendaraan{
    var merk: String
    var plat: String
    var np: String
    var jk: String

    constructor (_merk: String, _plat: String, _np: String, _jk: String){
        this.merk = _merk
        this.plat = _plat
        this.np = _np
        this.jk = _jk
        println("Info Pemilik Kendaraan")
        println("Pemilik Kendaraan : $np")
        println("Jenis Kendaraan : $jk")
        println("Merk Kendaraan : $merk")
        println("Plat Kendaraan : $plat")
    }
}

fun main(){
    Kendaraan("Toyota", "RI 1", "Jokowi", "Mobil")
}
