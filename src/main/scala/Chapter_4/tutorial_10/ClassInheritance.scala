package Chapter_4.tutorial_10

abstract class Donut(name: String) {
  def printName: Unit
}

class VanillaDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

object VanillaDonut {
  def apply(name: String): VanillaDonut = new VanillaDonut(name)
}

class GlazedDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

object GlazedDonut {
  def apply(name: String): Donut = new GlazedDonut(name)
}

object ClassInheritance extends App {
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  val glazedDonut: Donut = GlazedDonut("Glazed Donut")

  vanillaDonut.printName
  glazedDonut.printName
}
