package Chapter_4.tutorial_07

case class Donut(name: String, price: Double, productCode: Option[Long] = None)

object TypeAlias extends App {
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  val glazedDonut: Donut = Donut("Glazed", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  type CartItem[Donut, Int] = (Donut, Int)

  val cartItem = new CartItem(vanillaDonut, 4)
  println(cartItem)
  println(cartItem._1)
  println(cartItem._2)

  def calculateTotalCost(shoppingCartItems: List[CartItem[Donut, Int]]): Double = {
    val totalCost = shoppingCartItems.head._1.price * shoppingCartItems.head._2


    shoppingCartItems.tail.length match {
      case lol > 0 => val nextTotalCost = calculateTotalCost(shoppingCartItems.tail)
    }
  }
}
