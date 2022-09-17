// Overriding in Kotlin
// - Methods and properties defined in the parent class can be used in child classes using Inheritance. This prevents code duplication as child classes can re-use the functionality provided by the parent.
// - But sometimes, we don't want to use the same behavior provided by the parent - we want to override a few of the methods that are specific to the child's class.
// - We can do so using the override keyword in Kotlin. To make this work, we have to mark the property or method in the parent class as open and then in the child we can override that. Let's see this in action -
fun main() {
    val square = Square()
    println(square.name)
    square.display()

    val circle = Circle()
    println(circle.name)
    circle.display()


    val triangle = Triangle()
    println(triangle)
    println(triangle.toString())
}
open class Shape {
    open var name: String = "Shape"
    open fun display() = println("Shape is displayed")
}
class Square: Shape() {
    override var name: String = "Square"
    override fun display() = println("Square is displayed")
}
// Explanation -
// - Here, Shape is a parent class that is marked as open and has one property name and one method display. Both of them are also marked as open. Open keyword allows these properties and methods to be overridden in child.
// - Square inherits from Shape class and overrides parent's class behavior using override keyword.
// - Inside the main method, when Square's display method is called - it will print Square is displayed because we have overridden that particular method in child class.


// Super Keyword in Kotlin
// - From child class, if you still want to access parent's methods or properties, you can use super keyword. Super means superclass (parent class) and subclasses are child classes.
// - In the above code snippet, if you want to access the parent's display method as well - you can use super.display() in square's display method.
class Circle: Shape() {
    override var name: String = "Circle"
    override fun display()
    {
        super.display()
        println("Circle is displayed")
    }
}
/*
    Any Class in Kotlin
    - Every class in Kotlin inherits this Any class. Any class provides 3 useful methods -
        - equals - to check object equality
        - toString - provides the string representation of the object.
        - hashCode - provides the hashcode value of the object.
    - We can override these methods to provide custom behavior for these methods. The most common method is toString which is generally used to provide custom representation for the object.
    - When you call println(object) in Kotlin, behind the scenes it calls println(object.toString())
*/
// Let's override the toString method and see it in action -

class Triangle: Shape() {
    override var name: String = "Triangle"
    override fun display()
    {
        super.display()
        println("Triangle is displayed")
    }
    override fun toString(): String{
        return "Triangle's to String Method"
    }
}

/* Output -
Square
Square is displayed

Circle
Shape is displayed
Circle is displayed

Triangle's to String Method
Triangle's to String Method
*/

