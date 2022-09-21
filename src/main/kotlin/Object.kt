/*
    Object Keyword
- Classes and objects in Kotlin work the same way as in most object-oriented languages: a class is a blueprint, and an object is an instance of a class. Usually, you define a class and then create multiple instances of that class.
- In Kotlin you also have the object keyword. It is used to obtain a data type with a single implementation.
- If you are a Java user and want to understand what "single" means, you can think of the Singleton pattern: it ensures that only one instance of that class is created even if 2 threads try to create it.
- To achieve this in Kotlin, you only need to declare an object: no class, no constructor, only a lazy instance. Why lazy? Because it will be created once when the object is accessed. Otherwise, it won't even be created.

*/
// object Expression
// - Here is a basic typical usage of an object expression: a simple object/properties structure. There is no need to do so in class declaration: you create a single object, declare its members and access it within one function. Objects like this are often created in Java as anonymous class instances.
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit      // Creates a function with parameters.

{
    val dayRates = object       // Creates an object to use when calculating the result value.
    {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special      // Accesses the object's properties.

    print("Total price: $$total")                                        // Prints the result.

}

////////////////////////////////////////////////////////////////////////////////////////////////////

// object Declaration
//  - You can also use the object declaration. It isn't an expression, and can't be used in a variable assignment. You should use it to directly access its members:
object DoAuth                                                // Creates an object declaration.
{
    fun takeParams(username: String, password: String)       // Defines the object method.
    {
        println("input Auth parameters = $username:$password")
    }
}

fun main()
{
    rentPrice(10, 2, 1)    // Calls the function. This is when the object is actually created.

    DoAuth.takeParams("foo", "qwerty")                       // Calls the method. This is when the object is actually created.
}

// By using object expressions we can create the objects of the anonymous class that is, the classes that have not been explicitly declared with the class also such classes are handy for one-time use we can define it from the scratch that can be inherited from the existing classes or implement with the interfaces the instance of the anonymous class are also defined as the anonymous object since it’s an expression it is not considered to be the name of the class.
// How does anonymous class work in Kotlin?
// The anonymous class is one of the features and concepts for the kotlin language. It is used to create the class instance by using the object expression. The object declarations are one of the singleton object patterns where the class can have only one instance; it is more useful for working in the backend like databases etc. In kotlin, we can achieve this by using the “Object” keyword; the object declaration contains properties, methods, and so on. However, it does not allow the constructor to create the object.
// Like that object, a keyword is used to create the objects of the anonymous class known as the anonymous object. They are used to create the object if it needs a slight modification of the same class or interface without declaring the subclass in the kotlin. For example, if we are implementing the class with a separate constructor to declare the anonymous object, we need to pass the appropriate constructor and parameters while calling the method in the main.
// The anonymous class and object are also achieved by using the interface; we can create the interface with some methods. The interface does not have a body, so we can create the object of the interface by using the object keyword, so the anonymous object is created at the time. Then, with the help of its reference, we can call the methods.
