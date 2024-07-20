/*
  Classes
  1) class keyword
  2) properties
  3) instance creation
  4) access properties
  5) member functions
  6) data classes
*/
import kotlin.random.Random

// Declare a class without properties
class Customer 

// Declare a class with properties without body
class Contact(val id: Int, var email: String)

// Declare a class with properties & body
class Car(var model: String, var brand: String) {
  var type: String = "Mustange"
  
  // Create a member function 
  fun getName() {
    println("From member function (getName()) the brand is $brand")
  }
}

// Create a data class
data class User(val name: String, val id: Int)

// Create class RandomEmployeeGenerator
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
  val names = listOf("Atef", "Ziad", "Mona", "Yasser", "Maher", "Mohamed", "Ahmed", "Mostafa")
  fun generateEmployee() = User(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}


fun main() {
  // Create Instance of the Car class
  var bmw = Car("2024", "bmw")

  // Access property brand
  println("Access property brand in bmw object (${bmw.brand})")

  // Update property brand
  bmw.brand = "Unknown"
  println("Updated property brand in bmw object (${bmw.brand})")

  // Call member function getName
  bmw.getName()

  // Create data class User
  var user = User("Atef", 2034)
  println("Print as string [data class] $user")

  // Compare instances
  var user2 = User("Ziad", 2044)
  println("Compare instances [data class] (user == user2) -> ${user == user2}")

  // Copy instance
  // 1) copy the whole instance user
  var whole = user.copy()
  println("Copy the whole user [properties and all things..] $whole")

  // 2) copy the whole instance user and change name to Ibrahim
  var some = user.copy("Ibrahim")
  println("Copy the whole user and change the name of the copied user to ${some.name} $some")

  // Create empGen Instance
  val empGen = RandomEmployeeGenerator(10, 50)
  for (itr in 1..3) {
    println("generated employee $itr = ${empGen.generateEmployee()}")
  }
  return Unit
}
/*
  Notes
  The most useful predefined member functions of data classes are:
  1) .toString() : prints a readable string of the class instance and its properties
  2) .equal() or == : compares instance of a class
  3) .copy() : creates a class instance by copying another, potentially with some different properties
  4) to print a readable string of a class instance, we can explicitly call the .toString() function, or use print functions [println, print] which automatically call .toString() for us.
  5) we can use keyword arguments in .copy() function
*/
/*
  Recommendations
  1) Declare properties as read-only (val) unless they need to be changed after an instance of the class is created.
  2) We can declare properties without val or var withing parentheses but these properties are not accessible after an instance has been created.
*/