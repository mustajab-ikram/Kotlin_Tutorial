//  Kotlin Getters & Setters With Example
//  If you want to execute some logic before setting or getting the property of an object, you can use getters and setters.
//  You can consider these as functions that are executed when you either get the property or set the property of an object.

//  But why we want to do this? Why we want to execute code before accessing it? Let's understand this with an example -
fun main() {
    val user = User("John", 20, "abc@cheezycode.com")
    user.age = -10
}

//class User(nameParam: String, ageParam: Int, emailParam: String)
//{
//    var name : String = nameParam
//    var age: Int = ageParam
//    var email: String = emailParam
//}
/*
    ##  Explanation -
    -   Here we have defined a User class - inside the main function, we are setting the value of age to a negative value.
    -   In a real-world scenario, you don't want any user to have negative age. So you also want to prevent this in your code. You don't want anybody to set a negative value to age property accidentally.
    -   To prevent this, you can create a setter - that gets called when you set the property. You can write the logic inside the setter to prevent this from happening. Let's see how to define a setter for age property -
*/
class User(nameParam: String, ageParam: Int, emailParam: String)
{
    var name : String = nameParam
    var age: Int = ageParam
        set(value) {
            if(value < 0)
            {
                println("Age can't be negative")
            }
            else
            {
                field = value
            }
        }
    var email: String = emailParam
}
/*
    ## Explanation -
    -   In the above code, we have created a setter on the age property. We have written custom code to prevent the value from being negative.
    -   Value inside the set(value) is just a variable name, you can name it whatever you want. This will hold the value which is assigned to the property.
    -   Inside the setter, we have added an if-else condition to check if the value assigned is negative or not. If the value is negative then "Age can't be negative" will be printed.
    -   In the else case, we have set the value to a field (a special variable that points to the property). This field is also known as the backing field. This backing field is used inside the setter to set the value to that property. (field = value)
*/