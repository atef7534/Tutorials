/*
  Functions
  - fun keyword
  - (p1, p2) function parameters
  - each parameter must have a type
  - return type written after the function's parenthesis ()
  - the body is written within curly braces
  - return keyword is used to exit or return something from a function
  - if a function doesn't return anything useful, the return type and return keyword can be omitted.
  - coding conventions: function names start with a lowercase letter and use camel case with no underscores
  - Named arguments:
    -- include parameter names make your code easier to read
    -- can write parameters in any order
    -- any parameter with a default value can be omitted when calling your function. (=)
  - Functions without return:
    -- function doesn't return a useful value then its return type is Unit.
    -- Unit is a type with only one value - Unit
    -- return = return Unit
  - Single-Expression functions
    -- make function shortened
    -- remove curly braces and declare the function body using the assignment operator =
    -- due to kotlin's type inference, you can also omit the return type.
  Note: Omitting the return type is only possible with your function has no body {} unless your function's return type is Unit

  Lambda expressions
  -- lambda expressions can be hard to understand at first glance
  -- are written with curly braces
  -- the parameters followed by an ->
  -- the function body after the ->
  -- ways:
    -- assign a lambda to a variable that can then invoke later
    -- pass a lambda expression as a parameter to another function
    -- return a lambda expression from a function
    -- invoke a lambda expression on its own
*/
fun greet(name: String)
{
  return println("Hello, ${name.uppercase()}!")
}

fun printMessageWithPrefix(message: String, prefix: String)
{
  println("[$prefix] $message")
}

fun returnUnit()
{
  return Unit
}

fun sum(x: Int, y: Int): Int
{
  return x + y
}

fun sumS(x: Int, y: Int) = x + y

fun toSeconds(time: String): (Int) -> Int = when (time)
{
  "hour" -> { value -> value * 60 * 60 }
  "minute" -> { value -> value * 60 }
  else -> { value -> value}
}

fun main()
{
  greet("atef") // Hello, ATEF!
  
  // uses named arguments with swapped parameter order
  printMessageWithPrefix(prefix = "Log", message = "Hello")
  // [Log] Hello

  println(returnUnit()) // Kotlin.unit

  println(sum(1, 2)) // 3

  println(sumS(10, 20)) // 30

  // Lambda expressions
  // 1) assign to variable
  var upperCaseString = {text: String -> text.uppercase()}
  println(upperCaseString("atef yasser"))
  // 2) pass to another function
  // .filter() function on collections
  val numbers = listOf(1, -2, -3, 4, 5)
  val positives = numbers.filter { x -> x > 0 }
  val negatives = numbers.filter { x -> x < 0 }
  println(positives.count()) // 3
  println(negatives.count()) // 2
  // .map() function on collections
  val mulBy2 = numbers.map { x -> x * 2 }
  val mulBy3 = numbers.map { x -> x + x + x }
  println(mulBy2) // [2, -4, -6, 8, 10]
  println(mulBy3) // [3, -6, -9 12, 15]
  // parameters with type string and return type string in lambda expression
  val lambdaUpperCaseString : (String) -> String = { text -> text.uppercase() }
  println(lambdaUpperCaseString("my name is atef!"))
  // 3) Return from a function
  val timeInMinutes = listOf(10, 20, 40, 30)
  val min2sec = toSeconds("minute")
  val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
  println("Total time is $totalTimeInSeconds secs")
  // 4) Invoke separately
  println({ text: String -> text.uppercase() }("welcome atef!")) // WELCOME ATEF!
  return Unit
}