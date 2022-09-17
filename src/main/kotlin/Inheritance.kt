// INHERITANCE
/*
    - Just like in real life, we inherit features and behaviors from our parents. Our parents inherit from their grandparents. We can apply this same logic in programming.
    - While designing the classes we can extract out common properties and behavior in a separate class and other classes that require these features will inherit from this class - this will create a parent-child relationship among the classes.
    - In simple words, Inheritance is a way of organizing code in a parent-child relationship that helps in reducing code duplication. You define the functionality in a parent class that will be inherited by child classes. You don't need to define the same functionality in a child class - child classes will have it from its parent.
*/

// Inheritance in Kotlin
/*
    - Inheritance in Kotlin is no different than any other programming language that supports Object-Oriented Programming.
    - But in Kotlin, if you want to allow a class to be inheritable, you have to explicitly mark it as Open i.e. open for inheritance. Let's understand this with an example -
*/
open class Parent {
    var parentProperty: String = "Parent"
    fun parentFn() = println("Parent function is called")
}
class Child: Parent() {
    var childProperty: String = "Child"
    fun childFn() = println("Child function is called")
}

// Explanation -
// - Here we have defined 2 classes - Parent and Child. A parent is marked as open i.e. open for inheritance. This class has one property and one method.
// - Another class Child inherits from Parent class using a colon(:) followed by the name of Parent Class Constructor call i.e Parent()
// - This is how we inherit a class in Kotlin. Simply put a colon followed by the name of the parent class constructor call.
// - Now child class objects have access to all the properties and methods defined in the parent class. They can treat these methods and properties as their own.
fun main() {
    val child = Child()
    println(child.parentProperty) // Parent
    child.parentFn() // Parent function is called
    child.childFn() // Child function is called
} // As you can see above, you can access parent's properties and methods from the Child class's object.
/*
    # IS-A Relationship
    - Inheritance is also known as defining the IS-A relationship. While defining your class structure, you can look for classes and arrange them in a hierarchy if they follow IS-A relationship. For e.g.
    - Car is a Vehicle, Truck is a Vehicle. Vehicle can be defined as a Parent Class.
    - Circle is a Shape, Square is a Shape. Shape can be defined as Parent Class.
    - Full-Time Employee, Part-Time Employee. Employee can be defined as Parent Class.
    - Savings Account, Current Account, Credit Card Account, Loan Account. Account can be defined as a Parent Class.
    - As you can see wherever we have an IS-A relationship, we can arrange those classes in a hierarchy and define the class structure accordingly.
    - One more concept that is very common in Object-Oriented Programming is the HAS-A relationship. For instance, Car has Engine. Engine has Cylinder and Piston. This also defines a relationship which is known as Composition.
*/

// Some Facts -
// - Parent's Constructor is called before Child's constructor. Child can’t exist w/o its parents.
// - A class can have only one parent i.e. it can inherit from one single class.
// - You have to explicitly mark the class as Open if we want to make it inheritable.
