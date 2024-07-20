fun main()
{
  // Control flow or conditional expressions
  // if & when
  // note :: when leads to more robust and safer programs.

  // If
  val age: Int
  val check: Boolean = true

  if (check)
  {
    age = 20
  }
  else
  {
    age = 23
  }
  println(age) // 20

  // there's no ternary operators in kotlin 
  // but we can use if condition else 
  val a: Int = 1
  val b: Int = 2
  println(if (a > b) a else b)

  // when [statement or expression]
  // -> separate each condition from each action
  // all branch conditions are checked sequentially until one of them is satisfied
  val name = "atef"

  // statement
  when (name)
  {
    "ziad" -> println("ziad")
    "hello" -> println("greeting")
    else -> println("Unknown")
  }
  // Unknown

  // expression
  // else is mandatory
  // unless the compiler can detect that all possible cases are covered by the branch conditions
  val temp = 22
  val description: String = when 
  {
    temp < 0 -> "very cold"
    temp < 10 -> "a bit cold"
    temp < 20 -> "warm"
    else -> "hot"
  }
  println(description) // hot

  // Ranges
  // .. operator
  // 1..4 = 1, 2, 3, 4
  // ..< declare range the doesn't include the end value
  // 1..<4 = 1, 2, 3
  // downTo declare range in reverse order
  // 4 downTo 1 = 4, 3, 2, 1
  // 1..5 step 2 declare range with step 2
  // 1..5 step 2 = 1, 3, 5
  // also with Char ranges
  // 'a'..'d' = 'a', 'b', 'c', 'd'
  // 'z' downTo 'x' = 'z', 'y', 'x'

  // while & for

  // for
  for (n in 1..5)
  {
    print(n)
  }
  // 12345
  println()

  // Collections can also be iterated over by loops
  val cakes = listOf("carrot", "cheese", "chocolate")
  for (cake in cakes)
  {
    println("Yummy, it's a $cake cake!")
  }
  // Yummy, it's a carrot cake!
  // Yummy, it's a cheese cake!
  // Yummy, it's a chocolate cake!

  // while & do-while
  var cakesEaten: Int = 0
  while (cakesEaten < 3)
  {
    println("Eat a cake!")
    cakesEaten++
  }
  // Eat a cake!
  // Eat a cake!
  // Eat a cake!

  // do-while
  var cakesBaked: Int = 0
  do 
  {
    println("Bake a cake!")
    cakesBaked++
  }
  while (cakesEaten > cakesBaked)
  // Bake a cake!
  // Bake a cake!
  // Bake a cake!
}