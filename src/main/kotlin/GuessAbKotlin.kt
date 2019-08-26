import java.util.*

class GuessAbKotlin(private val n : Int) {

    init {
        println("GuessAbKotlin be create!!!")
    }

    val secret: String = getSecretNumbers()

    private fun getSecretNumbers(): String {
        var mutableList : MutableList<String>?  = mutableListOf()
        for (i in 0..9)
            mutableList?.add(i.toString())
        mutableList?.shuffle()
        val sb : StringBuilder? = StringBuilder()
        for (i in 0 until this.n)
            sb?.append(mutableList?.get(i))
        return sb.toString()
    }

    fun check(data : String) :String{
        var a : Int = 0
        var b : Int = 0
        for( i in 0 until this.n){
            val index : Int = data.indexOf(this.secret[i])
            if(index == i )
                a++
            else if (index != -1)
                b++
        }
        return "$a A $b B"
    }

}