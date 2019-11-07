package Chapter_3.tutorial_16

object FunctionCompositionUsingAndThen extends App {
  val totalCost: Double = 10

  val applyDiscount = (totalCost: Double) => {
    val discount = 0.1
    totalCost * (1 - discount)
  }

  val applyTax = (totalCost: Double) => {
    val tax = 0.2
    totalCost * (1 + tax)
  }

  // apply functions with and Then
  print(s"Total cost = ${(applyTax andThen applyDiscount)(totalCost)}")
}
