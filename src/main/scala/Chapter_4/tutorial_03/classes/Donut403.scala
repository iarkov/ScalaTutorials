package Chapter_4.tutorial_03.classes

class Donut403 (name: String, productCode: Option[Long] = None) {
  def print = println(s"name = $name, productCode = ${productCode.getOrElse("Absent")}")
}
