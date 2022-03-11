import Profiles as importProf
import Arrays as importArr

fun main(){
    val x  = "Welcome Back"
    val y  = "Kotlin Learner"

    println("$x $y")
    Introductions().showCounter()
    importArr().belajarArray()
}

class Introductions{
    fun showCounter(){
        println("Silahkan Input Nama Anda")
        val nama = readLine()
        println("Ok, Selanjutnya Silahkan Input Umur Anda")
        val umur = readLine()
        println("Ok, Asal Institusi Atau Sekolah $nama")
        val sekolah = readLine()
        println("Siap, Terima Kasih Atas Inputan Data Anda, Mohon Untuk Verifikasi Lagi Sesuai Data Berikut\n")
        println("Nama Anda $nama \nUmur Anda $umur \nUniversitas/Sekolah Anda $sekolah\n")

        fun checkValid(){
            println("Apakah Data Sudah Sesuai? (Diisi Dengan 'Y' (Iya) Atau 'T' (Tidak)")
            val valid = readLine()
            if (valid == "Y") {
                println("Terima Kasih Atas Validasi Identitas Anda, Selamat Belajar Dan Semangat\n")
                importProf().checkValidProfile()
            } else if (valid == "T") {
                println("Mohon Maaf Atas Kesalahan Data, Mohon Untuk Mengulangi Dari Awal")
                showCounter()
            } else {
                checkValid()
            }
        }
        checkValid()
    }
}
