package Chapter_3.tutorial_03

object OptionInFunctionParameters extends App {
  println("Step 1: How to define an Option in a function parameter")

  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    val totalCost = couponCode match {
      case Some(coupon) => quantity * 2.50 * 0.9
      case None => 2.50 * quantity
    }

    totalCost
  }

  println("\nStep 2: How to call a function which has an Option parameter")
  println(s"""Total cost = ${calculateDonutCost("Kek", 3, Some("LOL"))}""")

  val kek: Option[String] = None
  println(s"${kek.getOrElse("lol")}")
}
