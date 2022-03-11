package challangechapter

class Pengecekan {
    // Pengecekan Apakah Yang Diinput Adalah Hanya Angka
    private val integerChars = '0'..'9'
    private fun isInteger(input: String) = input.all { it in integerChars }

    fun pengecekanApakahAngka(): Int {
        val hasilInputan = readLine()!!
        return if (hasilInputan== ""){
            println("Mohon Untuk Tidak Mengosongkan Inputannya")
            pengecekanApakahAngka()
        } else if (isInteger(hasilInputan)){
            val returnInputan = pengecekanApakahSesuaiArray(hasilInputan.toInt())
            returnInputan
        } else {
            println("Mohon Memasukkan Angka Yang Valid")
            pengecekanApakahAngka()
        }
    }

    // Pengecekan Apa Isi Angka Inputan
    private fun pengecekanApakahSesuaiArray(hasilInputan : Int) : Int {
        return if (hasilInputan in 1..6){
            println("Anda Memilih $hasilInputan")
            println("Ok Mantap, Terima Kasih Telah Memasukkan Angka Yang Valid")
            hasilInputan
        } else {
            println("Angka Yang Input Diluar Yang Telah Disediakan, Mohon Input Ulang Sesuai Yang Telah Ditampilkan Di Awal")
            pengecekanApakahAngka()
        }
    }

    fun pengecekanApakahInterger(): Int {
        val hasilInputan = readLine()!!
        return if (hasilInputan== ""){
            println("Mohon Untuk Tidak Mengosongkan Inputannya")
            pengecekanApakahInterger()
        } else if (isInteger(hasilInputan)){
            if(hasilInputan.toInt() <= 100){
                hasilInputan.toInt()
            } else {
                println("Mohon Memasukkan Angka Yang Tidak Melebihi 100")
                pengecekanApakahInterger()
            }
        } else {
            println("Mohon Memasukkan Angka Yang Valid")
            pengecekanApakahInterger()
        }
    }
}