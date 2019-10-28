package Chapter_2.tutorial_06

object ForComprehension extends App {
  println("Step 1: A Simple Loop from 1 to 5 Inclusive")
  for (numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 2: A Simple Loop from 1 to 5 Exclusive")
  for (numberOfDonuts <- 1 until 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 3: Filter Values Using If Conditions in For Loop")
  val donutIngredients = List("flour","sugar","egg yolks","syrup","flavouring")
  for (ingredient <- donutIngredients if ingredient == "sugar") {
    println(s"Found sweetening ingredient = $ingredient")
  }

  println("\nStep 4: Filter Values Using If For Loop and Return the Result Back Using the Yield Keyword")
  val sweeteningIngredients = for (
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  ) yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  println("\nStep 5: Using For Comprehension to Loop through 2-Dimensional Array")
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"
  for {x <- 0 until 2
       y <- 0 until 2
       } {
    println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")
  }
}
