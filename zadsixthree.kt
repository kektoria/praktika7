import kotlin.math.ln

fun main(args: Array<String>)
{
    try
    {
        println("Введите х")
        var x: Double
        x = readLine()!!.toDouble()

        var rez: Double

        rez = (Math.sqrt(Math.abs(x)) * ln(Math.pow(x,2.0))/-5/4*x+Math.exp(x/2))
        println(String.format("%.2f",rez))
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}