// Loops in programming are used to do any task repetitively
fun main(args: Array<String>)
{
    /*
        While Loop: Kotlin has different variations of the loop. We will start with the while loop in Kotlin first.
 SYNTAX:
    while(booleanCondition)
    {
    	//block of code will be executed until the condition becomes false
    }
     */
    val num = 2
    var index = 1

    while(index < 11) // Condition is checked, if it is true, a block of code is executed.
    {
        // Inside this block of code or body of the loop.
        println(num * index)
        // The index variable is incremented by 1.
        index++

        // Then control again reaches the while loop condition, it again checks if the condition still holds true, if yes then the block of code is executed again.
        // Once the index value reaches 11 (as it is incremented every time), the condition is checked again, and this time it is false loop exits
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        DO-WHILE
        There is a small difference between the while and do-while loop.
        In while loops, the condition is checked before executing the code whereas in the do-while condition is checked at the end.
        So in the case of do-while, body of the loop is executed once no matter what.

     */
    index = 5
    do
    {
        println("Condition is false but I will be printed")
        index++
    }
    while(index < 5) // Explanation - Here the condition is checked at the end. Thus, body of the loop is executed once. When the execution reaches the end, it checks the condition - if the condition evaluates to true, body of the loop is executed again otherwise loop exits.

    // NOTE: Do make sure to have a termination condition; otherwise, the loop will run forever, i.e. infinite loop.

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
        FOR LOOP
        Just like while loop, we have a different looping syntax in Kotlin - For Loops.
        For loops are used to execute the statements a certain number of times.
        With Kotlin Range, for loop becomes more powerful. Let's look at some examples -
    */
    for(i in 1..5)
    {
        println("Hello from $i")
    }
    // Explanation - This loop will print Hello CheezyCode 5 times. 1..5 is a concept of range in Kotlin. This for loop will start from 1 and ends at 5. After every iteration, the value of i is incremented by 1.

    // Using step in for Loop
    // You can increment the step count by using the step keyword followed by the number inside for loop i.e. This step value is used for incrementing the value of a counter variable. After every iteration, the value will be incremented by the step. Refer to the code snippet below -
    for(i in 1..5 step 2)
    {
        println("Hello, there are ${i} iterations till now")
    }

    // Decrementing For Loop or Reverse For Loops
    // You can even write for loops that are decrementing, or you can say that running a for loop in reverse.
    // Starting from 5 and going down to 1. For this, Kotlin has downTo which is used inside for loop.
    // Refer below snippet -
    for(i in 5 downTo 1)
    {
        println("Hello ${i}")
    }

}
/*
    NOTE - The main use for loop comes into the picture when we want to iterate through a set of elements i.e. collections like arrays, lists, etc.
    This loop becomes handy in those cases as the syntax for iterating through elements is very concise.
*/