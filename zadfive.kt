fun main(args: Array<String>)
{
    try
    {
        println("Введите два числа")
        var a = readLine()!!.toInt();
        var b = readLine()!!.toInt();

        when
        {
            (a % 2 == 0 && b % 2 == 0) -> println("оба числа чётные")
            (a % 2 != 0 || b % 2 == 0) -> println("одно число чётное")
            (a % 2 == 0 || b % 2 != 0) -> println("одно число чётное")
            (a % 2 != 0 || b % 2 != 0) -> println("оба числа нечётные")
        }

    }

    catch (e:Exception)
    {
        println(e.message)
    }
}