// POLYMORPHISM
//  - Polymorphism is one of the most important topics in Object-Oriented Programming. It goes hand in hand with Inheritance.
//  - Poly means many and morph means forms i.e. the same method behaves differently based on the object. Here we have different forms of the method that exhibit different behavior based on the object.
//  - To define Polymorphism in simple words - A parent can hold a reference to its child and can call methods which are provided by the parent class.

// Let's understand this with an example -
fun main() {
    val circle : Shapes = CircleII(4.0)
    val square : Shapes = SquareII(4.0)


    val shapes = arrayOf(circle, square)
    calculateAreas(shapes)
}
open class Shapes {
    open fun area() :Double{
        return 0.0
    }
}
class CircleII(val radius:Double) : Shapes() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class SquareII(val side:Double) : Shapes() {
    override fun area(): Double {
        return side * side
    }
}
// Explanation -
//  - Here we have defined a Shape class which is a base class and open for inheritance. Using this Shape class as a base class, we have defined 2 other classes - Circle and Square.
//  - Both Circle and Square have an overridden area method that defines a way to calculate the area of these shapes.
//  - In the main method, we have defined 2 objects of these classes - Circle and Square but we have created a reference to the Shape class. i.e. Shape class is a parent class that can hold a reference of its child classes.
//  - This is one part of the term polymorphism where we can store objects of child classes in parent's class reference. Simply, we have stored the child objects in the parent's class reference. Let's move on to the next step.

fun calculateAreas(shapes: Array<Shapes>){
    for(shape in shapes){
        println(shape.area())
    }
}
/*
- In this above code snippet, we have defined a function to calculate areas - you can pass an array of Shape objects and it just calls the area method on each of the objects.
- This function shape.area() is exhibiting polymorphic behavior because it does not know what shape it is - it just calls the area method and calculates the area of that particular shape object. This small snippet is extensible in nature.
- You can pass any shape object - shapes that are currently present in your application or any other shape that might come up in the future. You don't need to change this piece of code in your application in the future.
- This is Polymorphism - area method is taking up many forms based on the object. At runtime, it decides which area method it should actually invoke.
- Let's say in the future, you have Triangle class as well - you can use this same snippet of code and it does not need any change - it just works exactly the same.
*/

// Advantages of using Polymorphism
//  1. It helps to write extensible and hence maintainable code - software accumulates features over a period of time and it is always a good practice to write code that is extensible.
//  2. We could have defined the calculateAreas function by taking particular types of shapes - for instance, fun calculateAreas(circles: Array<Circle>, squares: Array<Square>) - but this code is not extensible. It is limited to this set of classes only. For future shapes, this code also requires changes.
//  3. Polymorphism helps in writing code that does not depend on the actual implementation of the objects - it helps in programming to an interface.
//  4. Here shape defines a contract that every shape has an area method - writing code using this contract in mind creates a loosely coupled application.



// There is a famous code as well - "Program to an interface, not an implementation." Using Polymorphism helps in writing loosely coupled code - we program to an interface not the exact implementation of this interface.
