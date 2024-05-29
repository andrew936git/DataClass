data class Ticket(
    val nameFilm: String,
    val startTime: String,
    val row: Int,
    val place: Int
) {
    override fun toString(): String {
        return "Фильм - $nameFilm\t время сеанса - $startTime\tряд - $row\tместо - $place\n"
    }
}