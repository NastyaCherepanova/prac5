fun main()
{
    println("Введите возраст")

    var a = readLine()!!.toInt();

    when(a)
    {
        in 0..2 -> print("младенец")
        in 3..13 -> print("ребенок")
        in 14..17 -> print("подросток")
        in 18..21 -> print("юношеский возраст")
        in 22..60 -> print("зрелый возраст")
        in 60..150 -> print("пожилой возраст")
        else -> print ("Число не подходит")
    }
}