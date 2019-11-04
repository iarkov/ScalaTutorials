package Chapter_3.tutorial_07

object TypedFunction extends App {
  // define a function with a String type parameter
  def applyDiscount(couponCode: String): Unit = {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  // define a function with a Double type parameter
  def applyDiscount(percentageDiscount: Double): Unit = {
    println(s"${percentageDiscount*100}% will be applied")
  }

  applyDiscount("c1234")
  applyDiscount(0.1)

  // define a generic typed function which will specify the type of its parameter
  def applyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
      case d: Double =>
        println(s"${d*100}% will be applied")
      case _ =>
        println("Unsupported discount type")
    }
  }

  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](0.1)
}
