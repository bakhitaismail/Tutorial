fun main() {
    var userName: String = "Bakhita"
    printHello()
    println("Hello, $userName.")
    var y =add(23, 16)
     println(y)
    sayHelloWorld()
    sayForgiveness()
    exampleString()
    var x = divide(50, 10)
}
fun printHello() {
    println("Hello,")

}
fun add(num1: Int, num2: Int): Int {
    var sum = num1+num2
    return sum


}
fun sayHelloWorld() {
    println("Hello, world!")
}
fun sayForgiveness() {
    println("I am sorry.")
}
fun exampleString() {
    println("Trevor")
}
fun divide(num2: Int, num1: Int): Int{
    var division = num1/num2
    return division

}
