package challangechapter

fun main(){
    // Sesi Pembukaan
    println("Selamat Datang Di Sistem Pada Challange 1 Binar Academy")
    println("Perkenalkan Nama Saya Kelvin Dari Binar Android Developer Kelas 6")
    println("")
    println("Selanjutnya Silahkan Anda Memilih Nomor Berikut Sesuai Dengan Hasil Yang Akan Dimunculkan")

    // Array Yang Akan Nanti Munculkan Pada ForEach
    val arrayMenuUtama = arrayListOf(
        "1. Munculkan Segitiga/Piramida Bintang",
        "2. Munculkan Segitiga/Piramida Bintang (Terbalik)",
        "3. Munculkan Segitiga/Piramida Bintang (Sempurna)",
        "4. Munculkan Bintang Berbentuk X",
        "5. Munculkan Bintang Berbentuk Segitiga Siku-Siku",
        "6. Munculkan Bintang Berbentuk Plus (+)"
    )
    arrayMenuUtama.forEach{
        println(it)
    }
    println()

    // Import Dari Class Lain (Class Pengecekan)
    val importPengecekan = Pengecekan()
    val returnedValue = importPengecekan.pengecekanApakahAngka()

    println()
    println("Berikut Selanjutnya Sistem Akan Menjalankan Permintaan Yang Telah Diinput, Yaitu Ke $returnedValue")
    println("Sebelum Memunculkan Fungsi, Silahkan Memasukkan Angka Untuk Menentukan Jumlah Baris (Direkomendasikan Angka Ganjil Untuk Menghindari Kesalahan Bentuk)")
    println("Input Yang Diterima Maksimum 100")

    val jumlahBaris = importPengecekan.pengecekanApakahInterger()

    val importBintang = FungsiBintang()
    when (returnedValue) {
        1 -> {
            importBintang.bintangPiramida(jumlahBaris)
        }
        2 -> {
            importBintang.bintangPiramidaTerbalik(jumlahBaris)
        }
        3 -> {
            importBintang.bintangPiramidaSempurna(jumlahBaris)
        }
        4 -> {
            importBintang.bintangHurufX(jumlahBaris)
        }
        5 -> {
            importBintang.bintangPiramidaSiku(jumlahBaris)
        }
        6 -> {
            importBintang.bintangBerbentukTambah(jumlahBaris)
        }
    }

    println("Apakah Ingin Kembali Ke Menu Utama? Y (Iya) Atau T (Tidak)")
    fun repeatPertanyaan(){
        when (readLine().toString()) {
            "Y" -> {
                print("\b \b")
                main()
            }
            "T" -> {
                println("Terima Kasih Telah Menggunakan Sistem Saya")
            }
            else -> {
                println("Mohon Mengisi Y Atau T")
                repeatPertanyaan()
            }
        }
    }
    repeatPertanyaan()

//    if (returnedValue == 1){
//        importBintang.bintangPiramida(jumlahBaris)
//    } else if (returnedValue == 2){
//        importBintang.bintangPiramidaTerbalik(jumlahBaris)
//    } else if (returnedValue == 3){
//        importBintang.bintangPiramidaSempurna(jumlahBaris)
//    } else if (returnedValue == 4){
//        importBintang.bintangHurufX(jumlahBaris)
//    } else if (returnedValue == 5){
//        importBintang.bintangPiramidaSiku(jumlahBaris)
//    } else if (returnedValue == 6){
//        importBintang.bintangBerbentukTambah(jumlahBaris)
//    }
}