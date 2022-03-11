class Arrays {
    fun belajarArray(){
        val dataArray = Array(10){ 1 * (it + 1)}

        for (i in dataArray.indices){
            println("Uploading Data $i Equal ${dataArray[i]} To Server")
        }

        println("")
        val dataList = mutableListOf("Default")

        println("Ok, Hobi Anda Apa?")
        val hobi = readLine().toString()
        dataList.add(hobi)
        println("Ok, Makanan Kesukaan Anda Apa?")
        val makanan = readLine().toString()
        dataList += makanan
        println("Ok Terakhir, Apakah Anda Suka Diluar Bersama Teman? (Jawab 'Suka' Atau 'Tidak Suka')")
        val keluar = readLine().toString()
        dataList.add(keluar)

        println("Jadi Hobi Anda ${dataList[1]}, Makanan Kesukaan Anda ${dataList[2]}, Dan Anda ${dataList[3]} Keluar Sama Teman")
        println(dataList)
        println(dataList.first())
        println(dataList.last())
    }
}