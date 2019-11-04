package Chapter_3.tutorial_06
import DonutConversions._

object ImplicitFunction extends App {
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  println(s"${glazedDonut.isFavoriteDonut}")
  println(s"${vanillaDonut.isFavoriteDonut}")

  println(s"${glazedDonut.isDonut}")
  println(s"${vanillaDonut.isDonut}")
}
