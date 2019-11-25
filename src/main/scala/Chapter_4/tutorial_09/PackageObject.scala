package Chapter_4.tutorial_09

object PackageObject extends App {
  val vanillaDonut: Donut = Donut("Vanilla Donut", 2.50)
  println(vanillaDonut.uuid)

  val today = new DateTime()
  println(today)
}
