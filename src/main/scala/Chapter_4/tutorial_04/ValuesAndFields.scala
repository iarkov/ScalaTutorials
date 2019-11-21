package Chapter_4.tutorial_04

class Donut404(name: String, productCode: Option[Long] = None) {
  def print = println(s"Name = $name, product code = ${productCode.getOrElse(0)}, uuid = ${Donut404.uuid}")
}

object Donut404 {
  private val uuid = 1

  def apply(name: String, productCode: Option[Long]): Donut404 = new Donut404(name, productCode)

  def apply(name: String): Donut404 = new Donut404(name)
}

object ValuesAndFields extends App {
  val donut = Donut404("Vanilla Donut")
  donut.print
}
