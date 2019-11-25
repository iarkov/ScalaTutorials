package Chapter_4.tutorial_11

abstract class Donut(name: String) {
  def printName: Unit
}

case class VanillaDonut(name:String) extends Donut(name) {
  override def printName: Unit = println(name)
}

case class GlazedDonut(name:String) extends Donut(name) {
  override def printName: Unit = println(name)
}

object CaseClassInheritance extends App {
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  val glazedDonut: Donut = GlazedDonut("Glazed Donut")

  vanillaDonut.printName
  glazedDonut.printName
}
