// Every object has 2 things - Properties and Methods.
// To initialize properties with the default values, constructors are used.
// Once the object is created, properties are initialized using the constructor.
// Let's understand this with an example -
fun main() {
    var car = Automobile("Car", 4, 4)
    var auto = Automobile("Auto", 3, 3)
    var truck = Automobile2("truck", 8, 4)
}
class Automobile(val name: String, val tyres: Int, val maxSeating: Int)
{
    fun drive() {}
    fun applyBrakes() {}
}
/*
    Explanation -
    - Here we have defined a class named Automobile. It has 3 properties - name, tyres, and max seating. This portion of the class definition (val name: String, val tyres: Int, val maxSeating: Int) is known as Constructor.
    - In the main method, we have created 2 instances of this Automobile class and passed the required values for properties. For car instance, we have passed, name as Car, tyres and max seating as 4.
    - Values we have passed are used to initialize the properties of the Car Object. Similarly, for the Auto instance, we have passed different values.
    - A constructor is considered as a special method that gets called when the object is created. It is used to initialize properties and execute some initialization logic.
*/


// Kotlin has 2 types of Constructors
//  In Kotlin, there are 2 types of constructors, Primary constructor, and Secondary Constructor. In the above code snippet, we have defined the primary constructor.
//  Primary constructors defined above cannot contain any code. If you want to execute any code during the initialization, we have to define an init block.
class Automobile2(val name: String, val tyres: Int, val maxSeating: Int)
{
    init {
        println("Init Block 1")
    }
    fun drive() {}
    init {
        println("Init Block 2")
    }

    fun applyBrakes() {}
}
// This is how we define init block in Kotlin class. Any initialization code, you want to execute can be written inside these init blocks.
// You can define multiple init blocks inside a class and they are executed in the sequence defined in the class.

/*
    Primary constructor can be defined using different variations as well -
    - You can leave the primary constructor empty and define properties inside a class
    - You can pass parameters just like a method and use these parameters to assign initial values to the properties.
*/

// Properties are defined inside class
class Automobile3()
{
    val name: String = ""
    val tyres : Int = 0
}

// Parameters are passed to initialize properties inside class
class Automobile4(nameParam: String, tyresParam: Int)
{
    val name: String = nameParam
    val tyres: Int = tyresParam
}
// Defining constructor this way provides you a way to do some manipulation while assigning the values. For example, if you have a User class that has email property, you can convert that to lowercase or you can check if the user is an adult by putting a condition of age > 18.
// This is how you can define a Primary Constructor in Kotlin.


/*
    Secondary Constructor In Kotlin
    - When you want to provide different ways of creating an object - you can define a secondary constructor. There are scenarios where you want to have different ways of initializing an object - you define multiple constructors in a class.
    - Let's for an Automobile, general car objects have 4 tyres and 4 max seating capacity. You can define a secondary constructor where you don't need to pass these values every time you create a Car instance from the Automobile class.
- Important Note:
    If you define a secondary constructor then you have to call the primary constructor no matter what using this keyword. Refer below code snippet -
*/
// Does same thing as above, just a more concise and less redundant
//fun main() {
//    var car = Automobile("Car", 4, 4)
//    var car2 = Automobile("Car2")
//}
//
//class Automobile(val name: String, val tyres: Int, val maxSeating: Int)
//{
//    constructor(nameParam: String): this(nameParam, 4, 4)
//}

/*
    Explanation -
    - Here secondary constructor is added to the Automobile class using the constructor keyword
    - The secondary constructor calls the primary constructor and passes all the required values using this keyword.
    - In the main method, we have created objects using both constructors. For the Car2 instance, we don't need to pass other values. We just passed the name parameter.
*/