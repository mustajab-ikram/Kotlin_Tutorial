// Smart Casting
//  - Kotlin is smart - we do not have to explicitly cast i.e. whenever we use “is” operator, Kotlin does the smart casting for us. It infers the type of the instance and behaves according to the object. Let's understand this with an example -
fun main() {
    var arr = arrayOf(Gadget(), Tool())
    for(obj in arr)
    {
        if(obj is Gadget)
        {
            obj.powerOn() // This obj behaves like Gadget object
        } else {
            println((obj as Tool).toString()) // Smart cast to Tool object
        }
    }
}
class Gadget{
    fun powerOn() = println("On")
}
class Tool{
    override fun toString(): String {
        return "Tool's toString() method is called."
    }
}

// Explanation
//  - Here, inside the highlighted if block - obj is treated as Gadget object because Kotlin's compiler knows that code inside this if block will only be executed if obj is of type Gadget.
//  - If you write this code inside Android Studio or Intelli J, autocompletion will show the methods and properties of the Gadget class.
//  - This is known as Smart Casting as it is smartly done by Kotlin's compiler :)

// Explicit Casting
//  - When you explicitly want to cast an object to a particular type - you can do so by using "as operator" in Kotlin.
// Highlighted portion in the above code shows the way to explicitly cast the object to Tool. If we are sure that this is going to be a Tool object then we can use this operator.
// We have to be careful while using explicitly casting the object using as operator as it can throw ClassCastException
