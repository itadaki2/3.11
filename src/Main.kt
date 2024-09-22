fun main() {
    print("введите натуральное число: ")
    val chislo = readLine()!!.toInt()

    // четное ли число
    if (chislo % 2 == 0) {
        println("$chislo четное")
    } else {
        println("$chislo нечетное")
    }

    // оканчивается ли число на 7
    if (chislo % 10 == 7) {
        println("$chislo оканчивается на 7")
    } else {
        println("$chislo не оканчивается на 7")
    }
}