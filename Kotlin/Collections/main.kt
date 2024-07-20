fun main()
{
  // Collections
  // Lists : ordered collections of items
  // Sets : Unique unordered collections of items
  // Maps : Sets of key-value pairs where keysa re unique and map to only one value
  // each collection type can be mutable or read-only
  
  // List
  // Store items in the order that they are added & allow for duplicate items.
  // listOf() : create list (read-only)
  // mutableListOf() : create list (mutable)

  // To declare the type explicitly add the type within angled brackets <>
  // Read only list
  val readOnlyShapes = listOf("triangle", "square", "circle")
  println(readOnlyShapes)
  // [triangle, square, circle]

  // Mutable list with explicit type declaration
  val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
  println(shapes) // [triangle, square, circle]

  // Casting
  val shapesLocked: List<String> = shapes 

  // Lists -> ordered (access item in a list) []
  val names: List<String> = listOf("ahmed", "mohamed", "ziad", "ibrahim")

  println("The first name of names = ${names[0]}") // The first name of names = ahmed
  
  // get first & last item .first() and .last() functions
  println("First Item .first() ${names.first()}") // First Item .first() ahmed
  println("Last Item .last() ${names.last()}") // Last Item .last() ibrahim

  // .first(), .last() are examples of extension functions.
  // . and everything after it is called extension.

  // get number of items in a list
  val count = names.count()
  println(count) // 4

  // check an item in a list 'in'
  println("ziad" in names) // true

  // add or remove items from a mutable list
  // .add(), .remove() functions

  val newNames: MutableList<String> = mutableListOf("one", "ziad", "person", "atef", "ahmed", "mounir", "bassem")
  // .add(): add item at the end of the list.
  newNames.add("Mostafa")
  newNames.add("Morsy")
  println(newNames) // [one, ziad, person, atef, ahmed, mounir, bassem, Mostafa, Morsy]

  // .remove(): remove item from the end of the list.
  newNames.remove("ziad")
  println(newNames) // [one, person, atef, ahmed, mounir, bassem, Mostafa, Morsy]

  // Sets like Lists but we will mention 
  // read-only, Set, setOf()
  // mutable, MutableSet, mutableSetOf()
  // <>
  // .count()
  // in
  // .add(), .remove()

  // Map
  // read-only, Map, mapOf()
  // mutable, MutableMap, mutableMapOf()
  // <>
  // to
  // []
  // .count()
  // .put(), .remove()
  // .containsKey()
  // .keys   (property)
  // .values (property)
  val freqs = mapOf("apple" to 10, "banana" to 20, "cherry" to 30)
  println(freqs) // {apple=10, banana=20, cherry=30}

}