fun main(args: Array<String>)
{
    try
    {
    println("Введите номера членов арифметической прогрессии")
    var m: Int
    var n: Int
    m = readLine()!!.toInt()
    n = readLine()!!.toInt()

    if (m>n)
    {
        var temp:Int
        temp=m
        m=n
        n=temp
    }

    if(m==n)
    {
        println("Одинаковые номера")
    }

    else
    {
        println("Введите первый член арифметической прогрессии")
        var a1: Int
        a1 = readLine()!!.toInt()
        println("введите шаг(разность) арифметической прогрессии")
        var d: Int
        d = readLine()!!.toInt()
        var am: Int
        var an: Int
        am = a1 + (m - 1) * d
        an = a1 + (n - 1) * d
        var sum: Int
        sum = ((am + an) / 2) * (n - m)
        println("Сумма членов от M до N $sum")
        println("$am $an")
    }
    }
    catch (ex:Exception)
    {
    println(ex.message)
    }
}