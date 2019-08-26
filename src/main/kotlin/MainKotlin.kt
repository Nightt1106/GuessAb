import java.io.InputStreamReader

fun main(){

    val ab =GuessAbKotlin(4)
    println(ab.secret)
    val reader = readLine()
    println(ab.check(reader.toString()))
}