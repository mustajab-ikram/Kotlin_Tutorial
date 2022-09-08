// Kotlin is an Object-Oriented Programming Language.
// Object-Oriented Programming is a paradigm that allows us to solve problems with the help of objects which represent real-world entities i.e.
// we break application code into objects that interact with each other to solve a particular problem.

/*
    Object-Oriented Programming in Layman Terms
    - In our real life, we take help from others to solve problems. Let's take one scenario - You want to repair your car. You go to a car mechanic and ask for help. The car mechanic agrees to repair your car with his/her tools.
    - If we look at this scenario, different objects are working together to solve a problem. You are an object, Car Mechanic is an object, Your Car is an object, Car Mechanic uses different objects (tools) to repair your car. So different objects are interacting with each other to repair your car.
    - This same principle or approach is used in Object-Oriented programming to solve a given problem. We create different objects that represent real-world entities and these objects interact to solve the problem.
*/


/*
    Class In Kotlin

    To create objects, we first need to define the structure of the objects i.e. blueprint or template of the objects.
    This template will define how the objects will look like. It mainly describes -
        1. What are the properties or features of the object?
        2. What are the things an object can do?

            Classes are just the blueprint or template
            Objects are the real thing.

    Let's take some example to design this template or class -
        - For a switchboard, we have properties like - color, the company of the switchboard, is it on or off?. There should be a way to switch on/off the switchboard
        - For a Car, we have properties like - name of the car, type of the car - is it Petrol, Diesel or Electric, seating capacity. There should be a way to drive the car, to apply brakes, and so on.

It all depends on your application what type of information is required for your particular problem.
For instance, if you are creating an application to sell old cars, you need to store the kilometers reading of the car, year of purchase, etc.
*/
class Car (val name: String, val type : String)
{
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBrakes(){
        println("Applied Brakes")
    }
}   // This is how we define a class that will act as a blueprint for creating objects.
    // Once the class is created, we can create objects using this class.

fun main() {
    val mustang = Car("mustang", "petrol")
    val beetle = Car("beetle", "diesel")

    println(mustang.name)
    println(beetle.name)

    mustang.driveCar()
    beetle.driveCar()
}

//  Explanation -
//  First, we created a Car Class that defines the template for the Car objects. Using this class, we can create multiple objects. Objects are the real thing.
//  In the main method, we have defined 2 car objects - Mustang and Beetle. We just need to pass the Car name and type of the car, a brand new Car object will be created for us.
//  Once you have the objects, you can access their properties and methods as shown above i.e. we accessed the car name and called the drive car method of each Car object.
//  There will be 2 objects that are created in the memory - both are stored at a different locations and both of the objects have different properties.

