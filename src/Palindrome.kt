import java.util.*

fun isPalindrome(angkaMasuk: Int){
    var num = angkaMasuk
    var angkaKebalik = 0
    var alatBantuPengambilanPerAngka: Int
    val angkaOriginal: Int

    angkaOriginal = num

    // Melawankan Urutan Karakter Angka
    while (num != 0) {
        alatBantuPengambilanPerAngka = num % 10
        angkaKebalik = angkaKebalik * 10 + alatBantuPengambilanPerAngka
        num /= 10
        println("alatBantuPengambilanPerAngka $alatBantuPengambilanPerAngka")
        println("angkaKebalik $angkaKebalik")
        println("num $num")
    }

    // Pengecekan Apakah Angka Original Dan Angka Yang Sudah Dikebaikan Palindrome
    if (angkaOriginal == angkaKebalik)
        println("Angka $angkaOriginal Adalah Palindrome.")
    else
        println("Angka $angkaOriginal Bukan Palindrome.")
}

fun String.toTitleCaseEverything():String { // Extension Function
    return this.split(" ").joinToString(" ") {
        it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}

fun isHigherPalindrome(angkaMasuk1: Int, angkaMasuk2: Int, panggilFunction: (Int) -> Unit){ // Higher Order Function
    val jumlahKeduaAngka = {angkaJumlah1 : Int, angkaJumlah2 : Int -> angkaJumlah1 + angkaJumlah2} // Lambda Function
    val hasilJumlah = jumlahKeduaAngka(angkaMasuk1, angkaMasuk2) // Pemanggilan Lambda Function

    val textMuncul = "angka yang anda masukkin adalah "

    println(textMuncul.toTitleCaseEverything() + hasilJumlah) // Pemanggilan Extension Function
    panggilFunction(hasilJumlah)
}


fun main(){
    isHigherPalindrome(112, 10, ::isPalindrome) // Pemanggilan Higher Order Function
}