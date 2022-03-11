package testingpractice

import java.util.*

fun main(){
    val titleText = "selamat datang di kotlin indonesia"
    val returnedTitle = capitalizeSentence(titleText)
    println(returnedTitle)
}

fun capitalizeSentence(titleText: String):String {
    return titleText.split(" ").joinToString(" ") {
        it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}