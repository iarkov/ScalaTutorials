package Chapter_3.tutorial_04

object FunctionWithOptionReturnType extends App {
  println("Step 1: How to define a function which returns an Option of type String")
  def dailyCouponCode(): Option[String] = {
    val couponCode = "LOL"
    Option(couponCode).filter(_.nonEmpty)
  }

  println(s"\nStep 2: Call function with Option return type using getOrElse")
  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"Today's coupon = ${dailyCouponCode().getOrElse("NO COUPON")}")

  println(s"\nStep 3: Call function with Option return type using pattern matching")

  dailyCouponCode() match {
    case Some(coupon) => println(s"Coupon code = $coupon")
    case None => println("No coupon today")
  }

  println(s"\nStep 4: Call function with Option return type using map")
  dailyCouponCode().map(couponCode => println(s"Today's coupon = $couponCode"))

  def kek(): List[String] = {
    List("Kek","Lol")
  }
  kek().map(dich => println(s"$dich, kakaya dich"))

  println("\nStep 5: Review function from previous tutorial which has an Option parameter")

  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    val totalCost =
    couponCode match {
      case Some(coupon) => 2.50 * quantity * 0.9
      case None => 2.50 * quantity
    }

    totalCost
  }

  println(s"Total cost with daily coupon code = ${calculateDonutCost("Dodonut", 10, dailyCouponCode())}")
}
