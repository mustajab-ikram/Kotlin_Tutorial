/*
    What is an Array?
        Let's understand Array with an example -
            - You need to store 50 favorite songs of the user. If you define 50 variables for storing these songs then it becomes messy to manage the code. Why? You will be handling all these 50 variables - managing functionality like previous and next, playing a particular song will be too complex.
            - Array comes into the picture to rescue. You will be only creating a single object that will store your 50 songs like a list i.e. list of 50 songs. Now you can access all these songs using just one variable i.e. array object.
            - Array - a simple object that can store multiple values of the same type and has a fixed size. You need to define the type of values that will be stored in the array and you need to define the size.
 */
fun main() {
    val songs = arrayOf("Hello", "Final Countdown", "Highway To Hell")
    //elements are stored at index starting from 0
    println(songs[0])
    println(songs[1])
    println(songs[2])


    // You can get or set the value of an array element by using its index.
    // But if you try to access elements beyond the array's size - you will get an exception (error) i.e. Array Index Out Of Bounds
    // Array operations
    //length of the array
    println(songs.size) // --> 3
    //Set the value
    songs[1] = "In the End"
    //check if array contains particular element
    println(songs.contains("Hello")) // --> true
    //index of a particular element
    println(songs.indexOf("Highway To Hell")) // --> 2

    // Looping through the array i.e. Traversing the array
    // You can use a for loop to loop through the elements of the array. In Kotlin, we can even access the index of the elements along with the value. Refer to below code snippet -
    for(song in songs) {
        println(song)
    }
    //with index
    for( (index, song) in songs.withIndex()){
        println(index.toString() + " - " + song)
    }
}


