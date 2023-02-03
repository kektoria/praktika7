fun main(args: Array<String>)
{
    try
    {
        println("Введите три числа")
        var a:Double
        var b:Double
        var c:Double

        var srarf:Double
        var srgeom:Double

        a= readLine()!!.toDouble()
        b= readLine()!!.toDouble()
        c= readLine()!!.toDouble()

        srarf =(a+b+c)/3
        srgeom=(Math.pow(a*b*c,1.0/3.0))

        println("Среднее арифметическое: ")
        println(String.format("%.2f",srarf))

        println("Среднее геометрическое: ")
        println(String.format("%.2f",srgeom))
    }
    catch (e:Exception)
    {
        println(e.message)
    }

}
