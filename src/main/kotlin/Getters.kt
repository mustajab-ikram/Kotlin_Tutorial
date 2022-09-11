// Kotlin Getters With Examples
//  - Just like setters, we can also define getters. While accessing the property, the code inside the getter is executed.
//  - These getter functions are used to format any property value while accessing the value. Let's see this in action  -

fun main() {
    val user = User2("John", 20, "ABC@CheezyCode.com")
    println(user.email)

    val usr = User3()
    usr.setValue("John")
    println(usr.name)
}

class User2(nameParam: String, ageParam: Int, emailParam: String)
{
    var name : String = nameParam
    var age: Int = ageParam
    var email: String = emailParam
        get(){
            return field.lowercase()
        }
}
/*
    Explanation -
    In the above code snippet, we have defined a getter function - that is executed when you access email property.
    Emails are generally in lowercase, whatever the user has entered - you will always format it as a lowercase string.
    To do this, we have defined a getter that will return the email property in lowercase format. In the main function, we have passed email as ABC@CheezyCode.com - line after this where we have accessed user.email will print abc@cheezycode.com
*/

////////////////////////////////////
// Simple syntax for Getter & Setter -
//  var <propertyname>[: <propertytype>] [= <property_initializer>]
//  [<getter>]
//  [<setter>]

/*
    LateInit In Kotlin With Example
    When you want to initialize the value to a property later in the program, you mark the property as lateinit. LateInit means late initialization.
    While setting up the constructor if you don't know the value to be assigned - you use lateinit.
    Lateinit property is declared as var because we have to assign it a value later in the program. We cannot define these properties as primitive types such as Int, Byte, Long, etc.
    If you try to access a lateinit variable before assigning it a value, you will get kotlin.UninitializedPropertyAccessException.
*/
class User3
{
    lateinit var name:String
    fun setValue(nameParam: String){
        name = nameParam
    }
}
