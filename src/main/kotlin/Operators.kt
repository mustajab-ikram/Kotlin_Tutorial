// Just like any other programming language, Kotlin has different operators -
// arithmetic operators (+, -, *, /, %),
// relational operators (>, <, >=, <=, ==, !=), and
// logical operators (&&, ||, !)
// Let's understand them one by one -
fun main(args: Array<String>) {
    // Arithmetic
    var i = 13
    val j = 2

    println( i + j ) // 15
    println( i - j ) // 11
    println( i * j ) // 26
    println( i / j ) // 6
    println( i.toFloat() / j ) // 6.5
    println( i % j ) // 1


    // Relational
    println( i > j ) // 13 > 2 = true
    println( i < j ) // 13 < 2 = false
    println( i >= j ) // 13 >= 2 = true
    println( i <= j ) // 13 <= 2 = false
    println( i == j ) // 13 == 2 = false
    println( i != j ) // 13 != 2 = true


    // Increment - Decrement
    var k = 0
    println(k++)
    println(k)
    println(--k)


    // Logical
    i = 4
    var result = (i % 2 == 0) && (i % 3 == 0)
    println(result) // False

    result = (i % 2 == 0) || (i % 3 == 0)
    println(!result) // !true = false

    // Short Circuiting
    //      For && operator and || operator - this is an important concept that needs to be understood.
    //          In the case of && AND operator, the result is only true when both of the conditions are true. Now when the program runs and it turns out that the first condition is false, the runtime does not evaluate the 2nd condition because there is no point in evaluating the 2nd condition. After all, the result will remain false no matter what's the output of 2nd condition.
    //          Similarly, for the || OR operator, if the first condition is true, 2nd condition is not evaluated because the result will be true.

    i = 2
    result = (i == 2) && (++i == 3)
    println(result) // true
    println(i) // i becomes 3

    i = 4
    result = (i == 2) && (i++ == 4) // Short Circuiting at work
    println(result) // i is not 2, Hence FALSE
    println(i) // i remains 4

    i = 3
    result = (i == 3) || (++i == 4) // Short Circuiting at work
    println(result) // TRUE. Since first expression is TRUE only, it is not evaluated further
    println(i) // i remains 3
}