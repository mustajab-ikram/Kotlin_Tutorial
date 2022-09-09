// This is not the second part of previous explanation of Objects and Classes,
// but a different perspective to look at them.

/*
    We have different types in Kotlin to store data such as Integers, Booleans, String, etc. These are pre-defined data types in Kotlin. What if we want to store Student Information or if we want to store information about Employees etc?
    For storing this data, we can define our own data types in Kotlin using classes i.e. User-Defined Data Types. User-Defined data types allow us to store related information for an entity.
    Let's say we want to store information about Cars like the name of the Car, type of engine, and seating capacity - we can define a type of Car using a class. Defining a type helps to store information as a unit. We can also define the methods i.e. the actions a car can perform in the same unit.
*/
fun main() {
    val beetle = Car("Beetle", "Petrol", 4)
    beetle.driveCar()
    beetle.applyBrakes()
}
class Car(val name: String, val type: String, val seatingCapacity: Int)
{
    fun driveCar() = println("$name is driving")
    fun applyBrakes() = println("Brakes applied on car - $name")
}
/*

    Explanation -
    - Here we have defined a type named Car that stores information about Cars. We can create multiple objects of this type just like we do for Integers or Strings.
    - Inside the main method, a Car object is created where you pass in the information about that Car. We have also defined a few methods like driveCar and applyBrakes that perform some actions.
    - Every class has some properties and methods. In this case, properties are name, type, and seating capacity and methods are driveCar and applyBrakes.
    - These methods act according to the data stored in the properties. Let's say, there is a fuel property as well. To drive a car, you need to have fuel, so inside your drive car method, you should add a check that if fuel is greater than 0 then only you will be able to drive that car.


    State and Behavior
    - Each object has a state that is defined by the current values of the properties. Based on this state, methods behave differently.
    - Methods act according to the current state of the object. For example - if fuel > 0 then driveCar method will behave differently and if fuel < 0 then driveCar method should behave differently.


    Objects - Behind The Scenes
    - Each object has a different memory location where the data is stored. When you create an object, memory is allocated to the object, and a reference of that memory location is assigned to the object.
    - Variables do not contain the actual object they just store the reference of the object. So when you access the properties of the object using dot operator i.e. beetle.name - reference of the object is used to access the memory location and data is fetched using this reference.
    - A variable reference is stored in one part of the memory called stack and the actual object is stored inside a different part of the memory called Heap.
    - For instance, in this statement  - val beetle = Car("Beetle", "Petrol", 2) - beetle is a reference variable - it contains the memory address of the object and stored on the stack whereas the actual Car object is stored in Heap memory which is Car("Beetle", "Petrol", 2).
    - Based on the type, runtime allocates the memory to the object then it assigns the default values to the newly created object that you have passed. Once the object is created, the reference of that object is stored inside the reference variable.

*/