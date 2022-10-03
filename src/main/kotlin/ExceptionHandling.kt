import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    val array = arrayOf(1, 2, 3, null)
    val indexFourValue = try {
        array[4]
    } catch (e: IndexOutOfBoundsException) {
        println("Index is out of bounds.")
    } finally {
        println("This executes no matter what")
    }

    val indexThird = try {
        array[3]
    } catch (ex: NullPointerException) {
        println("Value is Null")
    } catch (ex: IndexOutOfBoundsException) {
        println("Index out of bounds.")
    } catch (e: Exception) {
        println("Some other kind of exception")
    } finally {
        println("Executes, No matter what")
    }

    createUserList(5)
    // createUserList(null)
    createUserList(-1)

}

fun createUserList(i : Int?) {
    if(i == null) {
        throw NullPointerException("Can't create a list of null size")
    } else if(i < 0) {
        throw IllegalArgumentException("Size have to be greater than 0")
    } else {
        println("Created a list of $i users")
    }
}