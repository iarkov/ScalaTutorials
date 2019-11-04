package Chapter_3.tutorial_08

object PolymorphicFunction extends App {
  // generic typed function
  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }

  // polymorphic typed function with a generic return type
  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount,discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount,discount)

      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount,discount)
    }
  }

  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}\n")

  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}\n")

  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}\n")
}
