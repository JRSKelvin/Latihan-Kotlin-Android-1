class Profiles {
    fun checkValidProfile() {
        println("Setelah Mengisi Data-Data Sebelumnya, Sekarang Kita Akan Mengisi Sedikit Lebih Dalam Informasinya")
        println("Anda Sedang Di Tingkat Pendidikan Apa? (SD/SMP/SMA/SMK/S1/S2/S3/...)")
        val pendidikan = readLine()
        println("Ok, Silahkan Input Semester Atau Kelas Anda (Jika SMP 1, Maka Tulisnya 1, Jika Kuliah Tulisnya Semester Angka)")
        val kelas = readLine()
        var jurusan = ""

        if (pendidikan == "S1" || pendidikan == "S2" || pendidikan == "S3") {
            println("Jurusan Apa Yang Dipilih?")
            jurusan = readLine().toString()
        }

        println("Mata Pelajaran Atau Mata Kuliah Yang Paling Disukai Apa?")
        val matapelkul = readLine()

        println("Ok, Terima Kasih Telah Menginput Datanya, Silahkan Coba Periksa Lagi Dibawah\n")
        println("Anda Sedang Belajar Di $pendidikan Kelas/Semester $kelas")
        if (pendidikan == "S1" || pendidikan == "S2" || pendidikan == "S3") {
            println("Jurusan Yang Anda Pilih Adalah $jurusan")
        }
        println("Mata Pelajaran Atau Mata Kuliah Paling Disukai Adalah $matapelkul\n")

        fun checkValid(){
            println("Apakah Data Yang Ditampilan Sesuai? (Diisi Dengan 'Y' (Iya) Atau 'T' (Tidak)")
            val valid = readLine()
            if (valid == "Y") {
                println("Terima Kasih, Data Akan Simpan Di Server\n")
            } else if (valid == "T") {
                println("Mohon Maaf Atas Kesalahan Data, Mohon Untuk Mengulangi Dari Awal")
                checkValidProfile()
            } else {
                checkValid()
            }
        }
        checkValid()
    }
}