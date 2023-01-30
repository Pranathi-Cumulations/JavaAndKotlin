
class JavaKotlin : JavaInKotlin(){
    override fun printSomething():Unit{
        println("this is inside the sub class")
    }

}

fun main(args: Array<String>) {
    println("Hello World!")

    var x = JavaInKotlin()
    x.printSomething()

    var y = JavaKotlin()
    y.printSomething()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}