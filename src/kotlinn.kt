fun main() {
    var userName: String = "Bakhita"
    printHello()
    println("Hello, $userName.")
    var x =division(50, 10)
     println(x)
    sayHelloWorld()
    sayForgiveness()
    exampleString()
    var y =modulus(45, 15)
    println(y)
    var b = getFullName("Marcus", "Rashford")
    println(b)
    var c = sweetFruit()
    println(c)
    var j = brandNewCar()
    println(j)
    var k =add(70,30)
    println(k)


}
fun printHello() {
    println("Hello,")

}
fun division(num1: Int, num2: Int): Int {
    var x = num1/num2
    return x


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
fun modulus(num1: Int, num2:Int): Int {
    var y = num1%num2
    return y
}
fun getFullName(firstName: String, lastName: String): String {
    var name = ("$firstName $lastName")
    return name

}
fun sweetFruit(): String {
    var fruit = ("Pineapple")
    return fruit
}
fun brandNewCar(): String {
    var car = ("jeep")
    return car
}
fun add(num1: Int, num2: Int): Int {
    var sum = num1+num2
    return sum
}
