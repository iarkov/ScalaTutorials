package Chapter_3.tutorial_01

object Functions extends App {
  println("Step 1: How to define and use a function which has no parameters and has a return type")
  def favoriteDonut(): String = {
    "Glazed Donut"
  }
  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")

  println("\nHow to define a function with no parenthesis")
  def leastFavoriteDonut = "Plain donut"
  println(s"My least favorite donut is $leastFavoriteDonut")

  println("\nHow to define and use function with not return type")
  def printDonutSalesReport(): Unit = {
    // Lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()
}
