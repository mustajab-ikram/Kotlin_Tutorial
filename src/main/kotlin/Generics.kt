inline fun <reified T> genericsExample(value: T) {
    println(value)
    println("Type of T: ${T::class.java}")
}
fun main() {
    genericsExample<String>("Learning Generics!")
    genericsExample<Int>(100)
}

