fun main() {
    val objOuter: Outer = Outer()
    // println(objOuter.a) -> private, can be accessible only in that class
    // println(objOuter.b) -> protected, only visible in subclasses
    println(objOuter.c) // internal, same as public within a module
    println(objOuter.d) // public

    val objSubclass: Subclass = Subclass()
    // println(objSubclass.a) -> private, can be accessible only in that class
    // println(objSubclass.b) -> protected, only visible in subclasses
    println(objSubclass.c) // internal, same as public within a module
    println(objSubclass.d) // public
}
open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}

// Table of visibility modifiers along with accessibility

//  MODIFIERS    |   TOP LEVEL DECLARATIONS  |   CLASS MEMBERS
// ------------------------------------------------------------
//  public       |   everywhere              |   everywhere
//  private      |   within a file           |   within a class
//  protected    |   N/A                     |   only in subclasses
//  internal     |   within a module         |   within a module
