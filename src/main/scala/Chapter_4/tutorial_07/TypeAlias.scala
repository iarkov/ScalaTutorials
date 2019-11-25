package Chapter_4.tutorial_07

case class Donut(name: String, price: Double, productCode: Option[Long] = None)

object TypeAlias extends App {
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  val glazedDonut: Donut = Donut("Glazed", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  type CartItem[Donut, Int] = (Donut, Int)

  val cartItem1 = new CartItem(vanillaDonut, 4)
  val cartItem2 = new CartItem(glazedDonut, 8)

  val cartItemList = List(cartItem1,cartItem2)

  def calculateTotalCost(shoppingCartItems: List[CartItem[Donut, Int]]): Double = {
    if (shoppingCartItems.isEmpty) {
      0.0
    } else {
      val a1 = shoppingCartItems.head._1.price * shoppingCartItems.head._2
      a1 + calculateTotalCost(shoppingCartItems.tail)
    }
  }

  println(calculateTotalCost(cartItemList))

  /*val dummyList = List(1,2,3)

  def funcSum(list: List[Int]): Int = {
    if (list.isEmpty) {
      0
    } else {
      val a1 = list.head
      a1 + funcSum(list.tail)
    }
  }

  println(funcSum(dummyList))*/
}
