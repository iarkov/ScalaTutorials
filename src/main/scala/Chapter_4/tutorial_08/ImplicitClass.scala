package Chapter_4.tutorial_08

import DonutImplicit.AugmentedDonut

case class Donut(name: String, price: Double, productCode: Option[Long] = None)

object ImplicitClass extends App {
  val vanillaDonut: Donut  = Donut("Vanilla", 1.50)

  print(vanillaDonut.uuid)
}
