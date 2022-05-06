fun main() {
    val amountPeople = 42

    val remainder = amountPeople % 10
    var likedString = "Понравилось $amountPeople ${if (remainder === 1 && amountPeople != 11) "человеку" else "людям"}"

    println(likedString);

}