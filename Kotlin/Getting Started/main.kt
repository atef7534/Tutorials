// simple program to print "Hello, world!"
fun main()
{
  println("Hello, world!")
  // Hello, world!

  // Let's break down the previous command.
  // * fun is used to declare a function
  // * main() function is where you program starts from
  // the body of a function is written with curly braces {}
  // println() and print() functions print their arguments to standard output

  // Variables
  // * store data
  // * val : read-only variables
  // * var : mutable variables
  // * = : assign value to a variable
  val age = 22
  val day = 4
  var items = 100

  println(age) // 22
  println(day) // 4

  // mutable variable its value can be reassigned after declaration.
  items = 20
  println(items) // 20

  // String templates
  // template expression : access data stored in variables and other objects and convert them into strings.
  // "" is a string.
  // template expression starts with $
  // $variable, ${piece of code}
  println("There are $items items") // There are 20 items
  println("There are ${items + 1} items") // There are 21 items
}