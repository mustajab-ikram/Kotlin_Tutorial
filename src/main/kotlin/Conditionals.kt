/*
    If-Else Statement
        Humans have decision-making ability - they can take decisions based on the conditions. For e.g, if it is raining outside then it is better to take an umbrella.
        We want computers to make decisions based on the conditions and inputs we provide. This is where if-else comes into the picture.
        This is a control flow statement i.e. it decides the flow of the code based on the conditions. These are also known as conditional statements.
    if(booleanCondition) {
      // this code executes if the condition is true
    }
    else {
      // this code executes if the condition is false
    }

- You can nest if-else statements as well i.e. you can use if-else inside if and/or else statements.
      if(condition1) {
       	  if(condition2){}
          else{}
      }
      else {

      }

 */
fun main(args: Array<String>) {
    val number = 5
    if(number % 2 == 0)
    {
        println("Number is Even")
    }
    else
    {
        println("Number is Odd")
    }

    // We can have multiple if-else conditions as well if you want to check multiple conditions. This is known as an else if ladder.
    val a = 13
    val b = 2

    if(a > b)
    {
        println("a is greater than b")
    }
    else if(a < b)
    {
        println("a is less than b")
    }
    else
    {
        println("a is equal to b")
    }


    // In Kotlin, you can use if-else as an expression as well i.e. you can assign if-else to a variable. Result of the if-else is assigned to the variable.
    // Let us look at some previous examples
    val num = 12
    val result = if(num % 2 == 0)
    {
        "Number is Even"
    }
    else
    {
        "Number is Odd"
    }
    println(result)
    /*
        You can also remove the braces if you want, so it will look something like this -
        val result = if(number %2 == 0) "Even" else "Odd"
     */

    ////////////////////////////////////////////////////////////////////////////////////////

    // IN OPERATOR
    // Checks if a value is in the range.
    // !in is the opposite of in.
    var x = 2
    var res = if (x in 1..5) "x is in range from 1 to 5" else "x is not in 1 .. 5"
    println(res)

    x = 5
    res = if(x in 1 until 5) "x is in range from 1 to 4" else "x is greater than 4"
    if (x !in 5..10)
        print("x is not in range from 6 to 10")

    ////////////////////////////////////////////////////////////////////////////////////////

    // When is used in complex if-else if else logic to improve the readability.
    // Just like if-else, when can be used as an expression i.e. result of when expression can be assigned to a variable.
    // Let's take the above example and write it as expression -
    val animal = "Dog"

    val pet = when(animal)
    {
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        "Horse" -> "Animal is Horse"
        else -> "Animal Not Found"
    }
    println(pet)

    val age = 14
    val myAge = when(age)
    {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teenager"
        else -> "adult"
    }
    println(myAge)
    // It seems simple but very powerful way of writing conditional statements when you want to evaluate results based on multiple conditions.
}