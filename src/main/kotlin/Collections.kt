/*
    KOTLIN COLLECTIONS
        Similar to Java Collections, Kotlin also introduced the concept of collections. A collection usually contains a number of objects of the same type and these objects in the collection are called elements or items. Kotlin Standard Library provides a rich set of tools for managing collections.

    Types of Collections
    - Kotlin collections are divided into two forms.
        - Immutable Collection
        - Mutable Collection

    1. Immutable Collection
    It means that it supports only read-only functionalities and can not modify its elements. Immutable Collections and their corresponding methods are:
    List – listOf() and listOf<T>()
    Set – setOf()
    Map – mapOf()
List – It is an ordered collection in which we can access elements or items by using indices – integer numbers that define a position for each element. Elements can be repeated in a list any number of times. We can not perform add or remove operations in the immutable list. Kotlin program to demonstrate the immutable list:
*/
// An example for immutable list

fun main(args: Array<String>) {
    val immutableList = listOf("Mahipal","Nikhil","Rahul")
    // gives compile time error
    // immutableList.add = "Parveen"
    for(item in immutableList){
        println(item)
    }

    // Set – It is a collection of unordered elements and it does not support duplicate elements. It is a collection of unique elements. Generally, the order of set elements does not have a significant effect. We can not perform add or remove operations because it is an immutable Set. Kotlin program to demonstrate the immutable set:
    // initialize with duplicate values
    // but output with no repetition
    var immutableSet = setOf(6,9,9,0,0,"Mahipal","Nikhil")
    // gives compile time error
    // immutableSet.add(7)
    for(item in immutableSet){
        println(item)
    }

    // Map – Map keys are unique and hold only one value for each key, it is a set of key-value pairs. Each key maps to exactly one value. The values can be duplicates but keys should be unique. Maps are used to store logical connections between two objects, for example, a student ID and their name. As it is immutable its size is fixed and its methods support read-only access. Kotlin program to demonstrate the immutable map:
    // An example for immutable map
    var immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul")
    // gives compile time error
    // immutableMap.put(9,"Praveen")
    for(key in immutableMap.keys){
        println(immutableMap[key])
    }
/*
2. Mutable Collection
It supports both read and write functionalities. Mutable collections and their corresponding methods are:
List – mutableListOf(),arrayListOf() and ArrayList
Set – mutableSetOf(), hashSetOf()
Map – mutableMapOf(), hashMapOf() and HashMap
List – Since mutable list supports read and write operation, declared elements in the list can either be removed or added. Kotlin program to demonstrate the mutable list:
*/

    var mutableList = mutableListOf("Mahipal","Nikhil","Rahul")
    // we can modify the element
    mutableList[0] = "Praveen"
    // add one more element in the list
    mutableList.add("Abhi")
    for(item in mutableList){
        println(item)
    }

    // Set – The mutable Set supports both read and write functionality. We can access, add or remove elements from the collections easily and it will preserve the order of the elements. Kotlin program to demonstrate the mutable set:
    var mutableSet = mutableSetOf<Int>(6,10)
    // adding elements in set
    mutableSet.add(2)
    mutableSet.add(5)
    for(item in mutableSet){
        println(item)
    }

    // Map – It is mutable so it supports functionalities like put, remove, clear, etc. Kotlin program to demonstrate the mutable map.
    var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
    // we can modify the element
    mutableMap.put(1,"Praveen")
    // add one more element in the list
    mutableMap.put(4,"Abhi")
    for((key, value) in mutableMap){
        println("$key = $value")
    }
}