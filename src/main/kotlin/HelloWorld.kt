/*
Before starting out, let us first look at what a function is -
A function is just a set of instructions that does something i.e. a block of code that performs a task.
syntax:
    fun name(....parameters) : return_type {
        // Code to be executed everytime it is called.
    }
*/

// There is a special method/function that runs when we start executing our program. Our program starts execution by calling this function.
// This special method is known as the MAIN Method, main is the Entry point of any program. The return type is not specified, which means that the function returns nothing.
fun main(args: Array<String>) {
    print("Hello, ")
    println("World!")
    // Prints Hello, World! in console.
    // println prints the output and move the cursor to the next line whereas print just prints the output.
}

/*
Compilation :
    - Now, what happens behind the scene when you run this program - Kotlin Compiler runs to check the errors in your code and convert that code into something that JVM can understand.
    - This compiled code is what is known as Bytecode.
    - This bytecode is then passed to JVM to run the code, JVM starts executing instructions defined in the main method.
    ___                _______        ____                               #####
  /.kt/  kotlinc-jvm  /.class/       |####| ->Kotlin Runtime JAR file    #####
 /___/  -----------> /______/ ----------------------------------------->  JVM --------> OUTPUT

 */