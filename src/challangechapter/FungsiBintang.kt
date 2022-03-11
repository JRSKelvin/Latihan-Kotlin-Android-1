package challangechapter

import kotlin.math.ceil

class FungsiBintang {
    fun bintangPiramida(jumlahBaris: Int){
        val baris = jumlahBaris
        var bintang = 0

        for (i in 1..baris) {
            for (spasi in 1..baris - i) {
                print("  ")
            }

            while (bintang != 2 * i - 1) {
                print("* ")
                ++bintang
            }

            println()
            bintang = 0
        }
    }

    fun bintangPiramidaTerbalik(jumlahBaris: Int){
        val baris = jumlahBaris

        for (i in baris downTo 1) {

            for (spasi in 1..baris - i) {
                print("  ")
            }

            for (bintang in i..2 * i - 1) {
                print("* ")
            }

            for (bintang in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }

    fun bintangPiramidaTerbalikPenuh(jumlahBaris: Int){
        val baris = jumlahBaris

        for (i in baris downTo 1) {
            print("  ")

            for (spasi in 1..baris - i) {
                print("  ")
            }

            for (bintang in i..2 * i - 1) {
                print("* ")
            }

            for (bintang in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }

    fun bintangPiramidaSempurna(jumlahBaris: Int){
        bintangPiramida(jumlahBaris)
        bintangPiramidaTerbalikPenuh(jumlahBaris - 1)
    }

    fun bintangHurufX(jumlahBaris: Int){
        val baris = jumlahBaris
        for(i in  0..baris - 1){
            for(j in 0..baris - 1){
                if (i == j || j==baris-1-i){
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }

    fun bintangPiramidaSiku(jumlahBaris: Int){
        val baris = jumlahBaris

        for (i in 1..baris) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }

    fun bintangBerbentukTambah(jumlahBaris: Int){
        val baris = jumlahBaris
        val half = (baris / 2).toDouble()
        for (i in 0..baris - 1){
            if(i == ceil(half).toInt()){
                for(j in 1..baris){
                    print("* ")
                }
            } else {
                for(j in 1..baris){
                    if(j == ceil(half).toInt() + 1) {
                        print("* ")
                    } else {
                        print("  ")
                    }
                }
            }
            println()
        }
    }
}