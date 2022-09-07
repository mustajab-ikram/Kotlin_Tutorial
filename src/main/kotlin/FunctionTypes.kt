// In Kotlin, functions are treated as values.
// Just like your integer values or strings - you can assign functions to a variable.
// Kotlin is considered as First-Class Function Language i.e. functions are treated as values.
// You can store them in a variable, pass them as parameters and return a function from a function.

/*

    Function Type
    Since functions are just like other values, there is a type that is associated with the functions. That type is known as Function Type. Let's look at some examples -

    1. (Double, Double) -> Double
        - This is how we define a function type. If a variable has this data type then it can take any function which takes 2 doubles as input parameters and returns the output as Double.
        - Function signature contains 2 things - What is the type of input parameters and what is the return type of the function. So when you define a function type you need to mention these 2 things.
        - Before the arrow (->) you define the types of input parameters i.e. Double, Double in this case and the return type of the function is written after the arrow (->) which is also Double in this case.

    Refer Below Code Snippet -

*/
fun main()
{
    val fn: (Double, Double) -> Double = ::add
    println( fn( 2.0, 3.0) )
    val gn: (Double, Double) -> Double = ::power
    println( gn( 2.0, 3.0) )


    val greet: ()-> Unit = ::printMessage
    greet()
}

fun Double.add(a: Double): Double
{
    return a + this
}

fun power(a: Double, b:Double): Double
{
    return Math.pow(a,b)
}
/*
    Explanation -
        - Here we have defined 2 functions add and power. They both have the same signature.
        - Inside the main function, we have defined a variable fn whose type is defined as
            (Double, Double) -> Double.
        - This is a function type as discussed above. Since the signature matches with the function type, we can store both add and power in this variable.
        - We have stored add function in fn and the power function in gn. To reference function, we have used method referencing operator denoted by 2 colons (: :) This is how we store functions in a variable.
        - Using these variables, we have called these functions - calling remains the same but the flexibility we get and the power we get by storing functionality in variables is amazing.

    In simple words, you can store a function in a variable if the signature of the function matches with the function type.
*/


/*
    2. ( ) -> Unit
        Another example of function type - here we do not accept any parameters and the return type is Unit.
        You can store functions that share the same signature.
        Simply put, no input and no output.

    Refer Below Code Snippet -
 */
fun printMessage()
{
    println("Hello CheezyCode")
}
/*
    Explanation -
        printMessage can be stored in a variable greet because the function type matches the signature of this function.
        You can omit the function type if you are using the method referencing operator because Kotlin can infer the type based on the value provided.
*/


// NOTE 👉 Storing functions in a variable is a very powerful concept - you can pass the functionality in a function along with the parameters. Based on the conditions, you can execute any function. This forms the basis of functional programming concepts in Kotlin.