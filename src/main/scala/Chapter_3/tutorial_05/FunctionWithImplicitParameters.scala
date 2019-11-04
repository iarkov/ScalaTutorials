package Chapter_3.tutorial_05

object FunctionWithImplicitParameters extends App {
  println("Step 1: How to define a function with an implicit parameter")
  implicit val lol = "Kek Store"
  implicit val kek = 0.1

  def totalCost (donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"Calculating the price for $quantity $donutType donuts in $storeName")

    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println(s"Total cost = ${totalCost("Glazed",2)}")
}
