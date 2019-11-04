package Chapter_3.tutorial_11

object FunctionCurryingWithParameterGroups extends App {
  // defining function with currying parameter groups
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  // Create a partially applied function from a function with curried parameter groups
  val totalCostForGlazedDonuts = totalCost("Glazed Donuts") _
  println(s"Total cost for glazed donuts = ${totalCostForGlazedDonuts(10)(0.1)}")
}
