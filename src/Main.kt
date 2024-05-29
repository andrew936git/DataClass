//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val ticketsSold = ArrayList<Ticket>()
    var i = 1
    var index = 0
    while (i != 0) {
        var film = choiceFilm()
        var time = choiceTime()
        while (true) {
            println("Выберите ряд и место")
            var row = readln().toInt()
            var place = readln().toInt()
            val ticket = Ticket(film, time, row, place,)
            if (ticketsSold.contains(ticket)) {
                println("Место уже выкупленно, выберите другое")
            } else {
                ticketsSold.add(ticket)
                index++
                break
            }
        }

        println("Купить еще один билет: 1 -да/ 0 - нет")
        i = readln().toInt()
    }
    println(ticketsSold)

}
fun choiceFilm():String{
    println("""Выберите фильм на который хотите пойти
            |1-Майор Гром: Игра
            |2-Сто лет тому вперед
            |3-Планета обезьян: Новое царство
        """.trimMargin())
    val item = readln().toInt()
    var nameFilm = ""
    when(item){
        1 -> nameFilm = "Майор Гром: Игра"
        2 -> nameFilm = "Сто лет тому вперед"
        3 -> nameFilm = "Планета обезьян: Новое царство"
        else -> nameFilm = "Ошибка"
    }
    return nameFilm
}
fun choiceTime(): String{
    println("""Выберите время начала сеанса
        |1 - 16:00
        |2 - 18:00
        |3 - 20:00
    """.trimMargin())
    val item = readln().toInt()
    var timeSession = ""
    when (item){
        1 -> timeSession = "16:00"
        2 -> timeSession = "18:00"
        3 -> timeSession = "20:00"
        else -> timeSession = "Ошибка"
    }
    return timeSession
}