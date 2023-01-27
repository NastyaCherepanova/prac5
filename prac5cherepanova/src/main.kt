fun main()
{
    println("Введите два числа")

    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()

    if(a>b)
    {
        a++;
    }
    else if (a==b)
    {
        a = Math.pow(a, 3.0)
    }
    else if (a<b)
    {
        b++;
    }
    println("$a $b")

}