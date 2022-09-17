// ABSTRACT CLASSES
//  1. What are Abstract Classes? A class that cannot be instantiated i.e. we cannot create the objects of an abstract class. Generally used as a parent class that defines the common protocol for the child classes.
//  2. What are Abstract Methods? Abstract methods are those methods that do not have a body. These methods can only be defined inside an abstract class i.e. if you mark the method as abstract, you need to mark that class as abstract.

/*
    Let's understand this with an example -
    - Suppose, we have this class hierarchy and we need to display these shapes and there is a method to calculate the area of these shape objects.
    - We know how to display a square, a circle, or a triangle. But what about shape? If we define a shape class as a normal class - we can also create an instance of this Shape class. But there is a problem here.
    - We don't know how a Shape looks like and we cannot even calculate its area because we don't know how it looks. So does it make sense to allow users to create an instance of a Shape class? No.
    - For these scenarios, we have a concept of Abstract class. We need to mark this Shape class as abstract. We don't want others to create an instance of Shape class. Similarly, we need to mark the display method and area method abstract as well because we don't know the actual implementation of these methods.
    - Now the question is -  when we cannot create an instance of this Shape class, what's the point of defining a Shape class? Shape class act as a parent class - it defines a protocol for the child classes.
    - Classes that inherit from an abstract class follow the same protocol i.e. every child class has a display method and a method to calculate area. This protocol is enforced using this abstract class.
*/
fun main() {
    val circle = CircleAbs(4.0)
    println(circle.area())
    circle.display()
}
abstract class ShapeAbstract{
    var name: String = ""
    abstract fun area() :Double
    abstract fun display()
}
class CircleAbs(val radius:Double) : ShapeAbstract(){
    override fun area(): Double =   Math.PI * radius * radius
    override fun display() {
        println("Circle is getting displayed")
    }
}
/*
    # Explanation -
        - Here shape is marked as abstract and area and display methods are defined as abstract. Since we don't know the actual implementation of these methods, we have marked these methods as abstract.
        - Just like a normal class, Circle class simply inherits this Shape class and overrides the abstract methods. We don't need to mark these methods as open - all the abstract methods are open by default because we want child classes to provide the implementation for these methods.
        - When you inherit the abstract class containing abstract methods - you either have to override all the abstract methods or mark the child class as abstract.
        - Generally, concept related classes are marked as Abstract. For example - Shape is abstract, Vehicle is abstract, Chair is abstract, etc. It all depends on your application whether to mark a class as abstract or not. For instance, if you don't want to distinguish between different chairs, you can simply define a non-abstract chair class and it just works fine.


    # Some Facts -
        - A class that has an abstract method or property - must be marked abstract.
        - Abstract classes can be defined without any abstract method or property. If we don't want users to create an instance of a particular class, we can mark that class as abstract.
        - Abstract class, Abstract Methods, and Abstract Properties are open by default. We don't have to explicitly mark them open - they are meant to be overridden.
        - Abstract classes are used to define a common protocol for the child classes.
        - We can group classes based on what they are i.e. based on inheritance. The circle is a shape, Square is a shape - these classes belong to the Shape hierarchy because they are Shapes.
        - We can also group classes based on what they do or what behavior they exhibit. A circle object can be dragged, a person object can be dragged - here we have grouped classes Circle and Person based on the behavior dragging.
        - Even if the classes do not belong to a single class hierarchy, we can group them based on the behavior. This is where Interfaces come into the picture.
*/