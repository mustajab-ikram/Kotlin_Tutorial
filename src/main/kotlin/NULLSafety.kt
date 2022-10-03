
// Any programming language which has the concept of null reference throws a NullPointerException. It has been referred to as a billion-dollar mistake.
fun main(args: Array<String>) {
// Nullable and Non-Nullable Type
// Kotlin aims at eliminating the risk of NullPointerException. It distinguishes between nullable and non-nullable references as a part of its type system. In Kotlin, all variables are non-nullable by default. So, we cannot assign a null value to a variable because it’ll throw a compilation error:
    var country: String = "India"
    // country = null // compilation error

// To define a nullable variable, we must append a question mark(?) to the type declaration:
    var city: String? = "Kolkata"
    city = null

// We can call a method or access a property on a non-nullable variable. However, in the case of nullable variables, we need to handle the null case explicitly. Otherwise, it will throw a compilation error since Kotlin knows that the variable contains null references:
    val a: Int = country.length
    // val b : String = city.length // compilation error

    /*
    Let’s look at the different ways we can handle null references safely in Kotlin.
    Working With Nullable Types
    2.1. Null Check
    We can use the if-else expression to explicitly check for nullable variables. However, this option works only where the variable is immutable. Depending on the complexity of the conditions, this can also lead to nested expressions.
    Let’s look at an example:
*/
    var state: String? = "Telangana"
    val len = if(state != null) {
        state.length
    } else {
        println("sate is an empty string")
        0
    }
    state = null
    println(len)
    /*
2.2. Safe Call Operator (?.)
Kotlin has a safe call operator (?.) to handle null references. This operator executes any action only when the reference has a non-null value. Otherwise, it returns a null value. The safe call operator combines a null check along with a method call in a single expression.
Let’s see how to use a safe call operator:

*/
    var cntry: String? = "India"
    assertEquals(5, cntry?.length)
    cntry = null
    val cty: String? = null
    assertNull(cty?.length)

// In addition, we can also use the safe call operator for multiple chain calls:
    val state1: State? = State("Telangana","Hyderabad",3)
    val code1: String? = state1?.code?.toString()
   assertEquals("3", code1)
// However, the chain calls return null if any of the properties are null:
    val state2: State? = State(null, null, null)
    val code2: String? = state2?.code?.toString()
    assertNull(code2)


//    2.3. Using let() Method
//            We can use the let() method along with the safe call operator to act on a non-nullable variable:
    val cities: List<String?> = listOf("Kolkata", null, "Mumbai")
    var name: List<String?> = emptyList()
    for (city in cities) {
        city?.let { name = name.plus(it) }
    }
    println(name)
    assertEquals(2, name.size)

//    2.4. Using also() Method
//            We can use the also() method to execute additional operations like logging and printing of the non-nullable variables. Furthermore, this method can be used in a chain with the let() or run() method.
//    Here’s how we can use also() method along with let() method:
    val citiesName: List<String?> = listOf("Kolkata", null, "Mumbai")
    var duplicateName: List<String?> = emptyList()
    for (city in citiesName) {
        city?.let {
            duplicateName = duplicateName.plus(it)
            it
        }?.also { println("Logging the value: $it") }
    }
    println(duplicateName)
    assertEquals(2, duplicateName.size)


//    2.5. Using run() Method
//            We can use the run() method to execute some operations on a non-nullable reference. This method operates using this reference and returns the value of the lambda result:
    val countries: List<String?> = listOf("India", null, "Germany")
    var nameCountries: List<String?> = emptyList()
    for (country in countries) {
        country?.run {
            nameCountries = nameCountries.plus(this)
            this
        }?.also { println("Logging the value: $it") }
    }
    print(nameCountries)
    assertEquals(2, nameCountries.size)

}

fun assertEquals(i: Int, length: Int?) = (i == length)
fun assertEquals(i: String, value: String?) = (i == value)
fun assertNull(length: Int?) = (length == null)
fun assertNull(length: String?) = (length == null)


data class State(
    val state: String?,
    val town: String?,
    val code: Int?
)
/*


2.6. Elvis Operator (?:)
We can use the Elvis operator (?:) to return a default value only if the original variable has a null value. If the left-side expression of the Elvis operator has a non-nullable value, then it is returned. Otherwise, the right-side expression is returned.
Let’s take a look at how the Elvis operator works:
val country: Country? = Country(City("New Delhi", null))
val result = country?.city?.code ?: "Not available"
assertEquals("Not available", result)

We can use the Elvis operator with a safe call operator to invoke a method or property of the variable:
val country: Country? = Country(City("Mumbai", "002"))
val result = country?.city?.code ?: "Not available"
assertEquals("002", result)

We can also use the throw and return expression in the right-side expression of the Elvis operator. So instead of default values, we can throw specific exceptions in the right-side expressions of the Elvis operator:
val country: Country? = Country(City("Chennai", null))
val result = country?.city?.code ?: throw IllegalArgumentException("Not a valid code")
assertThrows<IllegalArgumentException> { result }

2.7. Not Null Assertion Operator (!!)
We can use the not-null assertion operator (!!) to explicitly throw a NullPointerException. This operator converts any reference to its non-nullable type and throws an exception if the reference has a null value. Let’s have a look into how we can throw NullPointerException using not-null assertion operator(!!):
val country: String? = null
val result : Int = country!!.length
assertThrows<NullPointerException> { result }

However, if the reference has a non-nullable value, then it is executed successfully:
val country: String? = "India"
val result : Int = country!!.length
assertEquals(5, result)

The not-null assertion operator should be used carefully since it’s a potential sign of a NullPointerException. We should avoid using multiple non-null assertions like the following since it makes it harder to debug which property is null:
country!!.city!!.code

Additionally, We should always try to use safe call operator in such cases to ensure NullPointerException doesn’t occur:
country?.city?.code
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////

// 3. Nullability in Collections
// Kotlin collections are non-nullable by default. So, in order to define a collection of nullable types in Kotlin, we have to append the question mark (?) to the type declaration:
// val countries: List<String?> = listOf("India", null, "Germany", "Russia", null)
//
// We can use the following way to define a nullable collection in Kotlin:
// var countries: List<String>? = listOf("India", "Germany", "Russia")
// countries = null
//
// 3.1. Filtering Nullable Types
// We can filter a list that contains nullable values to return only the non-nullable values using the filterNotNull() method. Let’s have a look at an example:
// val countries: List<String?> = listOf("India", null, "Germany", "Russia", null)
// val result: List<String> = countries.filterNotNull()
// assertEquals(3, result.size)
// assertEquals("Russia", result[2])
