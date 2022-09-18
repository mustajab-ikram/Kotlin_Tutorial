// INTERFACE -
//  - When you want your class to exhibit certain behavior irrespective of the class hierarchy they belong to - Use Interface. Interfaces help you to implement polymorphism based on the behavior defined in the interface.
//  - Methods defined in the interfaces are 100% abstract but in Kotlin you can also define methods that are non-abstract i.e. methods can have a body. Non-abstract methods in interfaces do not have any state they can rely on - they are just simple functions.
//  - A class that implements an interface has the responsibility of providing the body of the abstract members.
abstract class Animal: Cloneable {
}
interface Cloneable {
    fun clone()
}
class Dog: Animal() {
    override fun clone() = println("Dog is being cloned")
}
class Person: Cloneable {
    fun sayHi() = println("Hi")

    override fun clone() = println("Person is being cloned")
}
/*
    # Explanation -
        - Here we have defined an interface named Cloneable. It has one abstract method by the name clone. Now whoever implements this interface has the responsibility of providing the body of this method.
        - Child classes Dog and Person implements Cloneable and implements the clone method based on their own functionality. The cloneable interface does not care how the child classes define the method. It just makes sure that everyone who implements this interface, provides the body of the abstract methods defined inside the interface.

    # Advantages of Interfaces
        - Polymorphism loves interfaces. When we have classes from different class hierarchies, interfaces help in implementing polymorphism. Let's take one example -
*/
fun cloneObjects(list: Array<Cloneable>) {
    for(obj in list)
    {
        obj.clone()
    }
}

fun main() {

    cloneObjects(arrayOf(Dog(), Person()))
    // # Explanation -
// - Clone Objects function takes an array of objects that implement this interface. It does not care if the objects belong to the same hierarchy or not. The only requirement of this function is that objects should implement the cloneable interface.
// - In the main method, we have passed Dog object and Person object. They are totally different objects. But still, we can achieve polymorphic behavior because of Interfaces.
// - In the future, if we have new classes that implement this interface can also be passed to this method without changing anything in this function. This makes the code extensible and thus maintainable.


    // # Type Checking in Kotlin
// - For certain scenarios, we need to check the type of the object i.e. we need to identify the class of the object before executing any function on that object.
// - Consider a scenario where you have different types of objects in an array. You are looping on that array and executing some functionality. If you call a method that does not exist in the object, an error will be thrown at the runtime.
// - To prevent such errors, we do type checking. In Kotlin, we have an "is operator" that helps in checking the type of the object.
    var p1 = Person()
    if(p1 is Person) // Use of is operator
    {
        p1.sayHi()
    }
// Explanation -
// Here, we are checking the type of p1 instance that if it is of type Person - call its sayHi() method.
// In this case, it is evident that the object is of type Person only but for scenarios where we need to check the type - we use an "is operator".
}

// # Some Facts -
// - Interface is defined as a contract as they force the child classes to provide the body of the abstract members.
// - Interfaces cannot contain a state, but you can define abstract properties.
// - A class can implement multiple interfaces but can only inherit from one parent class.
//
