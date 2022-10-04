fun main() {
    //  #Remove Duplicate Strings
    // There are many ways to remove duplicate strings from an array:
// Maintain the original order of items
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    println(devs.distinct()) // [Amit, Ali, Sumit, Himanshu]

// Maintain the original order of items
    val devs2 = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    println(devs2.toSet()) // [Amit, Ali, Sumit, Himanshu]

// Maintain the original order of items
    val devs3 = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    println(devs3.toMutableSet()) // [Amit, Ali, Sumit, Himanshu]

// DO NOT Maintain the original order of items
    val devs4 = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    println(devs4.toHashSet()) // [Amit, Ali, Sumit, Himanshu]

    //  # Convert an array or list to a string
          //  You can convert an array or list into a string by using joinToString.For example, if you are having a list of cities(Delhi, Mumbai, Bangalore), then you can convert that list into a string such as "India is one the best countries for tourism. You can visit Delhi, Mumbai, Bangalore, etc, and enjoy your holidays". Here, Delhi, Mumbai, Bangalore are the list items which you were having.
    val someKotlinCollectionFunctions = listOf(
        "distinct", "map",
        "isEmpty", "contains",
        "filter", "first",
        "last", "reduce",
        "single", "joinToString"
    )

    val message = someKotlinCollectionFunctions.joinToString(
        separator = ", ",
        prefix = "Kotlin has many collection functions like: ",
        postfix = "and they are awesome.",
        limit = 3,
        truncated = "etc "
    )

    println(message) // Kotlin has many collection functions like: distinct, map, isEmpty, etc and they are awesome.

//    # Transform a collection into a single result
//    If you want to transform a given collection into a single result, then you can use reduce function. For example, you can find the sum of all the elements present in a list:
    val numList2 = listOf(1, 2, 3, 4, 5)
    val result = numList2.reduce { result, item ->
        result + item
    }
    println(result) // 15

// NOTE: If the list is empty, then it will throw a RuntimeException

//    Find if all elements are satisfying a particular condition
//    If you have an array or list of data elements and you want to find whether or not all the elements are satisfying a particular condition, then you can use “all” in Kotlin.
    data class Users(val id: Int, val name: String, val isCricketLover: Boolean, val isFootballLover: Boolean)

    val user1 = Users(id = 1, name = "Amit", isCricketLover = true, isFootballLover = true)
    val user2 = Users(id = 2, name = "Ali", isCricketLover = true, isFootballLover = true)
    val user3 = Users(id = 3, name = "Sumit", isCricketLover = true, isFootballLover = false)
    val user4 = Users(id = 4, name = "Himanshu", isCricketLover = true, isFootballLover = false)

    val users2 = arrayOf(user1, user2, user3, user4)

    val allLoveCricket = users2.all { it.isCricketLover }
    println(allLoveCricket) // true

    val allLoveFootball = users2.all { it.isFootballLover }
    println(allLoveFootball) // false

//    Find a particular element based on a certain condition
//    You can find a particular element from a list of elements that is satisfying a particular condition by using find and single in Kotlin . For example, out of a list of students, you can find the student having roll number 5.
//    The find returns the first element matching the given condition or null if no such element was found.While single returns the single element matching the given condition or it will throw an exception if there are more than one matching element or no matching element in the list .
    data class User3(val id: Int, val name: String)

    val users3 = arrayOf(
        User3(1, "Amit"),
        User3(2, "Ali"),
        User3(3, "Sumit"),
        User3(4, "Himanshu")
    )

    val userWithId3 = users3.single { it.id == 3 }
    println(userWithId3) // User(id=3, name=Sumit)

    val userWithId1 = users3.find { it.id == 1 }
    println(userWithId1) // User(id=1, name=Amit)

//    Break your list into multiple sublists of smaller size
//    There are many cases when you have a bigger list and you want to divide it into smaller parts and then perform some operation on those sublists.So, this can be easily achieved using the chunked function.
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chunkedLists = numList.chunked(3)
    println(chunkedLists) // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]

//    Making copies of the array
//    You can make copies of your existing array by using various functions such as :
 //   copyInto: This will replace the elements of one array into another array or it will throw an exception if the destination array can't hold the elements of the original array due to size constraints or the indexes are out of bounds.
    val arrayOne = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val arrayTwo = arrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    arrayOne.copyInto(destination = arrayTwo, destinationOffset = 2, startIndex = 0, endIndex = 4)
    arrayTwo.forEach { print("$it ") } // 11 12 1 2 3 4 17 18 19 20
//    Similarly, there are other functions that can be used to copy the elements of an array. For example:
//    copyOfRange(fromIndex, toIndex): Returns a new array which is a copy of the specified range of the original array.
//    copyOf() or copyOf(newSize): Returns a new array which is a copy of the original array, resized to the given newSize, or if the newSize is not passed then the whole array will be copied.

//    Changing type of collection to other
//            Depending on the situation, you can change the type of collection. Here, either you can change the type of one collection to another type by making a new collection or by referring to the older one. For example:
//    toIntArray, toBooleanArray, toLongArray, toShortArray, toByteArray, toDoubleArray, toList, toMap, toSet, toPair, etc can be used to change the type of one collection to another type.
    var uIntArr = UIntArray(5) { 1U }
    var intArr = uIntArr.toIntArray()
    intArr[0] = 0
    println(uIntArr.toList()) // [1, 1, 1, 1, 1]
    println(intArr.toList()) // [0, 1, 1, 1, 1]
//    Here, we are making a new collection and changes in the new collection will not be reflected in the older one. But, at the same time, you can change the type of collection by keeping the reference to the older one i.e. changes in one collection will automatically be reflected in the other. For this instead of to, we need to use as . For example:
//    asIntArray, asLongArray, asShortArray, asByteArray, asList, etc.
    var uIntArray = UIntArray(5) { 1U }
    var intArray = uIntArray.asIntArray()
    intArray[0] = 0
    print(uIntArray.toList()) // [0, 1, 1, 1, 1]
    print(intArray.toList()) // [0, 1, 1, 1, 1]

//    Associating the data using some key
//            If you are having a list of data and you want to associate the data with the help of some key present in your data element, then you can use associateBy.
    data class Contact(val name: String, val phoneNumber: String)

    val contactList = listOf(
        Contact("Amit", "+9199XXXX1111"),
        Contact("Ali", "+9199XXXX2222"),
        Contact("Himanshu", "+9199XXXX3333"),
        Contact("Sumit", "+9199XXXX4444")
    )

////    val phoneNumberToContactMap = contactList.associateBy { it.phoneNumber }
//    println(phoneNumberToContactMap)
//// Map with key: phoneNumber and value: Contact
//// {
////     +9199XXXX1111=Contact(name=Amit, phoneNumber=+9199XXXX1111),
////     +9199XXXX2222=Contact(name=Ali, phoneNumber=+9199XXXX2222),
////     +9199XXXX3333=Contact(name=Himanshu, phoneNumber=+9199XXXX3333),
////     +9199XXXX4444=Contact(name=Sumit, phoneNumber=+9199XXXX4444)
//// }
    /*
    In the above example, the key is phoneNumber and the value is Contact. If you don't want to have the whole Contact as the value, then you can simply pass the desired value like this:
    val phoneNumberToContactMap = contactList.associateBy({ it.phoneNumber }, { it.name })

    print(phoneNumberToContactMap)
    */
// Map with key: phoneNumber and value: name
// {
//     +9199XXXX1111=Amit,
//     +9199XXXX2222=Ali,
//     +9199XXXX3333=Himanshu,
//     +9199XXXX4444=Sumit}
// }

//    Finding distinct elements in a collection
//            We can use the distinct function to get the list of unique elements of a collection .
    val list2 = listOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    println(list2.distinct()) // [1, 2, 3, 4]

//    Union of collections
//    You can use the union function to get the unique elements of two collections . The order of the elements of both the collections will be preserved but the elements of the second collection will be added after the elements of the first collection .
    val listx = listOf(1, 2, 3, 3, 4, 5, 6)
    val listy = listOf(2, 2, 4, 5, 6, 7, 8)
    println(listx.union(listy)) // [1, 2, 3, 4, 5, 6, 7, 8]

//    Intersection of collections
//    To get the elements that are common in two collections, you can use the intersect function which returns a set containing the common element of both collections.
    val listxx = listOf(1, 2, 3, 3, 4, 5, 6)
    val listyy = listOf(2, 2, 4, 5, 6, 7, 8)
    println(listxx.intersect(listyy)) // [2, 4, 5, 6]

//    Keep the specified elements only
//    If in a collection, you want to keep the specified elements only then you can use retainAll function. Since this function will modify your list, so make sure that your list or array is mutable.
//    retainAll will return true if any element is removed from the collection otherwise it will return false.
    val listxxx = mutableListOf(1, 2, 3, 3, 4, 5, 6)
    val listyyy = listOf(1, 2, 3, 3, 4, 5, 6)
    val listzzz = listOf(1, 2, 3, 3, 4, 5, 7)
    println(listxxx.retainAll(listyyy)) // false
    println(listxxx.retainAll(listzzz)) // true
    println(listxxx) // [1, 2, 3, 3, 4, 5]
//    Similarly, you can use removeAll to remove all the elements of one collection that are present in another collection.

//    Filter a collection based on some condition
//    You can filter a collection based on certain conditions by using the filter.This returns a list containing elements that satisfy the given condition.
    val list4 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val filteredLst = list4.filter { it % 2 == 0 }
    println(filteredLst) // [2, 4, 6, 8]
//    Similarly, you can filter the collection based on the index of elements by using filterIndexed.
//    If you want to store the filtered elements in some collection, then you can use the filterIndexedTo:
    val list5 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val filteredList = mutableListOf<Int>()
    list4.filterIndexedTo(filteredList) { index, i -> list5[index] % 2 == 0 }
    println(filteredList) // [2, 4, 6, 8]
//    You can also find the elements that are instances of a specified type in a collection by using filterIsInstance.
    val mixedList = listOf(1, 2, 3, "one", "two", 4, "three", "four", 5, 6, "five", 7)
    val strList = mixedList.filterIsInstance<String>()
    println(strList) // [one, two, three, four, five]

//    Zip collections
//            zip returns a list of pairs . The first element of the pair will be taken from the first collection and the second element of the pair will be taken from the second collection . The size of the returned list will be equal to the size of the shortest collection.
    val listOne = listOf(1, 2, 3, 4, 5)
    val listTwo = listOf("a", "b", "c", "d", "e", "f")
    println(listOne zip listTwo) // [(1, a), (2, b), (3, c), (4, d), (5, e)]
//    Zip with next in a collection
//            zipWithNext return a list of pairs . The elements of the pair will be the adjacent elements of the collection .
    val list5_1 = listOf(1, 2, 3, 4, 5)
    println(list5_1.zipWithNext()) // [(1, 2), (2, 3), (3, 4), (4, 5)]

//    Unzip a collection
//    unzip returns a pair of lists . The first list is made from the first elements of each pair and the second list is made from the second element of each pair.
    val list6 = listOf("Amit" to 8, "Ali" to 10, "Sumit" to 4, "Himanshu" to 2)
    val (players, footballSkills) = list6.unzip()
    println(players) // [Amit, Ali, Sumit, Himanshu]
    println(footballSkills) // [8, 10, 4, 2]
//    Split array into two parts based on some condition
//    If you want to split your data into two parts based on some conditions like isFootballFan, then you can use partition.
    data class User(val id: Int, val name: String, val isFootballLover: Boolean)

    val users = listOf(
        User(1, "Amit", true),
        User(2, "Ali", true),
        User(3, "Sumit", false),
        User(4, "Himanshu", false)
    )

    val (footballLovers, nonFootballLovers) = users.partition { it.isFootballLover }
    println(footballLovers) // [User(id=1, name=Amit, isFootballLover=true), User(id=2, name=Ali, isFootballLover=true)]
    println(nonFootballLovers) // [User(id=3, name=Sumit, isFootballLover=false), User(id=4, name=Himanshu, isFootballLover=false)]

//    Reverse a list
//    You can reverse a list in Kotlin by using the reversed and asReversed function .
    val list7 = listOf(1, 2, 3, 4, 5)
    print(list7.reversed()) // [5, 4, 3, 2, 1]
    print(list7.asReversed()) // [5, 4, 3, 2, 1]
    /*
    Both are giving the same output but these functions are different.The reversed () function can be applied on Array, List, and MutableList. It generates a new list that is the reverse of the original list.
    But the asReversed() function can be applied on List and MutableList.It doesn 't generate a new list because, after reversal, the new elements are still referring to the old one. So any change in one of them will result in a change in the other one.
    Similarly, there are other functions that can be used to reverse the elements such as reversedArray(), reverse().
    */

//    Group elements of a collection based on some condition
//    You can use groupBy () to group the elements of a collection based on certain conditions . For example, the below code will group the elements of the list based on the remainder when divided by 4 i.e. 4 groups will be there(when remainder = 0, 1, 2, and 3)
    val list8 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(list8.groupBy { it % 4 })
// {
//     1=[1, 5, 9],
//     2=[2, 6, 10],
//     3=[3, 7],
//     0=[4, 8]
// }

//    Sort element of a collection
//    You can sort the elements of a collection by using the sorted () function . This will return a sorted list.
    val list = listOf(10, 4, 1, 3, 7, 2, 6)
    println(list.sorted()) // [1, 2, 3, 4, 6, 7, 10]
//    Similarly, there are other functions that can be used to sort the collection based on certain conditions. Some of these functions are sortedArray, sortedArrayWith, sortedBy, sortedByDescending, sortedArraydescending, sortedWith, etc.

}