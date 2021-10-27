fun main(args: Array<String>) {
    var contador: Int = 0
    var soma: Int = 0
    var media: Int = 0

    while(contador<4){
        println("Digite uma nota: ")
        var nota = readLine()!!.toInt
        soma = soma + nota
        contador++
    }
    media = soma / contador

    println("A média é igual a: $media")
}