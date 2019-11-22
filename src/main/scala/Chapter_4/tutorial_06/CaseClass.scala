package Chapter_4.tutorial_06

case class Donut (name: String, price: Double, productCode: Option[Long])

object CaseClass extends App {
  val vanillaDonut = Donut("Vanilla Donut", 2.00, None)
  val glazedDonut = Donut("Glazed Donut", 2.50, None)
  println(vanillaDonut)

  val shoppingCart: Map[Donut, Int] = Map(vanillaDonut -> 3, glazedDonut -> 4)
  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of vanilla donuts = ${shoppingCart(vanillaDonut)}")
  println(s"Quantity of glazed donuts = ${shoppingCart(glazedDonut)}")
}
