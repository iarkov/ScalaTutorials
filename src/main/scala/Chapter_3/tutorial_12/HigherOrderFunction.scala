package Chapter_3.tutorial_12

object HigherOrderFunction extends App {

  // Create higher order function
  def totalCost(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  // Apply higher order function with anonymous function
  val donutsCost = totalCost("Glazed Donuts")(5){Cost =>
    val discount = 0.1
    Cost - Cost * discount
  }
  println(s"Donuts cost = $donutsCost")

  // Apply higher order function with regular function
  def applyDiscount(totalCost: Double): Double = {
    val discount = 0.1
    totalCost - totalCost * discount
  }

  println(s"Total cost = ${totalCost("Glazed Donuts")(5)(applyDiscount)}")
}
