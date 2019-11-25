package Chapter_4.tutorial_12

abstract class Donut(name: String) {
  def printName: Unit
}

case class VanillaDonut(name:String) extends Donut(name) {
  override def printName: Unit = println(name)
}

case class GlazedDonut(name:String) extends Donut(name) {
  override def printName: Unit = println(name)
}

class ShoppingCart[D <: Donut] (donuts: Seq[D]) {
  def printCartItems = donuts.foreach(_.printName)
}

object TypedClass extends App {
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[Donut](Seq(vanillaDonut,glazedDonut))
  shoppingCart.printCartItems

  val falseShoppingCart: ShoppingCart[Donut] = new ShoppingCart[Donut](Seq("vanillaDonut"))
}
