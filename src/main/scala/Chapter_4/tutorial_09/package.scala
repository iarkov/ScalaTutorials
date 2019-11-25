package Chapter_4

package object tutorial_09 {
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  implicit class AugmentedDonut (donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(0)}"
  }

  type DateTime = org.joda.time.DateTime
}
