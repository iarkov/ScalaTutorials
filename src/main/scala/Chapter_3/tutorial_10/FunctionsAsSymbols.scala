package Chapter_3.tutorial_10

object FunctionsAsSymbols extends App {
  class DonutCostCalculator {
    val totalCost = 100

    def - (discount: Double): Double = {
      totalCost - discount
    }

    def +++ (taxAmount: Double): Double = {
      totalCost + taxAmount
    }
  }

  val donutCostCalculator = new DonutCostCalculator()
  println(s"${donutCostCalculator.-(5)}")
  println(s"${donutCostCalculator - 5}")
  println(s"${donutCostCalculator +++ 5}")
}
