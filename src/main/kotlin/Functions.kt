/*
    FUNCTIONS
    - Complex application has thousands of lines of code. Writing them inside the main function is certainly not a good idea.
    - We split this code into separate and manageable chunks - each chunk with its dedicated functionality. This chunk is known as Function.
    - In simple words - a function is a block of code that performs a specific task or functionality.

Now whenever we need this functionality somewhere in our code, we call this function. This function can take inputs and based on the inputs, it performs some actions and provides the output.
This prevents code duplication and helps in code reuse. You can just define a function and call it whenever you need that particular functionality.

- For instance, An ATM acts as a function i.e. a standalone unit that takes input and provides you the output. Once you provide the card information, pin, and amount you want - it does some processing and gives you the required money. Similarly, in programming, we create self-contained functions.
- There are predefined functions that come with the Kotlin library, but we can define our own functions as well. We have been using the println function - this helps in printing the output to the console. We just call this with the input and it prints onto the console.
Let's create functions -
*/

fun main(args: Array<String>) {
    val result = add(3, 4)
    /*
        Using a function is a 2-step process - first, we define the function, and then we call it.
        - fun name(param1: param1_type, param2: param2_type) : return_type { // Code to be executed }
        - Calling a function is easy - just write functionName(comma separated inputs) - this is how you call a function.
          If the function returns any output, you can store it in a variable.

        - In computer science terminology, inputs passed to the functions are known as Arguments, and variables defined inside the function are known as Parameters.
        - So we pass arguments to the function which gets mapped to the parameters. This mapping is 1:1. i.e. the first argument maps to the first parameter, the second argument maps to the second parameter, and so on.
    */


    printMessage("There")


    println(add(2.5, 3.5))
    println(add(2, 5, 7))


    printMessage(5) //prints Hello CheezyCode 5 times
    printMessage() //prints Hello CheezyCode once - it uses default value


    val address = getAddress(street = "123,A Street", city = "Noida")
    // Sequence can be changed
    val address2 = getAddress(city = "Noida", street = "123,A Street")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//Single Line Function
//If there is only one expression, we can shorten the function. Refer to the snippet below -
fun subtract(a: Int, b: Int) : Int =  a - b

//Kotlin can infer the return type
fun multiply(a: Int, b: Int) =  a / b

//Unit Data Type
//When a function does not return any value - the return data type, in this case, is Unit.
// You can explicitly define a function with a return type as Unit but Kotlin is smart enough to inference.

// Kotlin can infer the return value in this case
fun printMessage(msg : String)
{
    println("Hi ! " + msg)
}
// In other programming languages like Java or C#, when the function does not return any value it is indicated using a void keyword. But Kotlin has a specific data type for this scenario.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Function Overloading
// You can define multiple functions with the same name but either the parameter count should be different or the type of the parameters need to be different. This concept is known as function overloading.

// fun add(a: Int, b: Int) = a + b  -> Already defined above
// count is different
fun add(a: Int, b: Int, c: Int) = a + b + c

// type is different
fun add(a: Double, b: Double) = a + b

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Default Value
// There are scenarios when you want to pass a default value to the arguments.
// One way to achieve this is to pass the value every time or you can use the concept of the default values.
fun printMessage(count: Int = 1)
{
    println("Hello CheezyCode")
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Named Arguments
// When there are multiple parameters say 10 or more - passing values while calling the method becomes problematic. Developers need to remember the sequence of parameters. The concept of Named Arguments in Kotlin can be used here by passing values with names.

fun getAddress(street: String, city: String ) : String
{
    val address = street + " " + city
    return address
}