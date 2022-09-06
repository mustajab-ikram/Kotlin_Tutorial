// Variable is a box where you store your data. It has a name by which you access this data or update this data.
// Let's take one example - you are playing a game where you have your score. Every time you do something in the game - your score increments.
// This score is stored as a variable in your application. So simply put - a variable is a place to store data that changes when your application runs.
// That's why it is named as variable - something that varies.

// Declaring values is done using either "var" or "val". "val" declarations cannot be reassigned, whereas "vars" can.


/*
    Data Types In Kotlin
        As said above, variables are simple boxes. Now we need to define the size of the box, and we need to define the type of data you will be storing in these boxes.
        For this information, we have data types - Data Types define the type of the data you will be storing in a variable and also defines the size.
        Kotlin has a variety of data types to store text data, numbers, and booleans. These are as follows -

    Numbers - Superclass for all platform classes representing numeric values.
        INTEGER (Byte, Short, Int, Long) - Numbers without decimals. E.g. 1, -5, 10, 224545
        FLOATING POINT ( Float, Double) - Numbers with decimals. E.g. 11.23, 3.14 etc
        CHAR - Stores single character E.g. M or F

    Text Data -
        String - Store multiple characters. E.g. Hello, Kotlin, etc.

    Boolean
        True/False

 */
fun main(args: Array<String>) {
    /*
        Kotlin has powerful type inference, which means that the Kotlin compiler can automatically identify the data type of the variable.
        The compiler knows this from the initializer. So, if you’ve initialized the value of the variable on the declaration, you don’t need to define the data type explicitly because every primitive type has a default value.
        The compiler will directly assume the size and type of the variable by that.
    */
    val intNumber: Int = 10                // Declares an immutable variable of typr int and initializes it
    var pi: Float = 3.14F                  // Declares a mutable variable and initializes it.
    val precisePi: Double = 3.14159265359  // Declares an immutable variable and initializes it.
    val bigNum = 20L                       // Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Long.
    var state: Byte                        // Declares a variable without initialization.


    var myNumber: Number = 1903  // Superclass for all platform classes representing numeric values.
    myNumber = 19.03 // Returns the value of this number as a Double, which may involve rounding.
    myNumber = 1903F // Returns the value of this number as a Float, which may involve rounding.
    myNumber = 1903L // Returns the value of this number as a Long, which may involve rounding or truncation.
// Same for Int, Char, Short, Byte

    val simpleString = "Hello, World!"

    // A raw string is delimited by a triple quote (""").
    // Raw strings can contain newlines and any other characters.
    val rawString = """
- Kotlin is a statically typed language. This means that a variable can only be assigned to objects of one fixed type, the type of variable.
- An advantage of statically typed language is that the compiler can catch the type errors during the compilation before the program is even run.
- A good compiler can also generate more efficient code for a statically typed language, as the type of objects is already known during the compilation. 
- Consider the function to add two numbers:
                    fun test(a: Int, b: Int) {
	                  println(a + b)
                    }
- Here, it is clear to the compiler that the + operator means integer addition and so the code for the function can immediately add two numbers.
One disadvantage of statically typed languages is that one has to write type names everywhere but kotlin saves us from that through its powerful type inference
"""
    println(rawString)
}
