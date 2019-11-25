package Chapter_4.tutorial_08

object DonutImplicit {
  implicit class AugmentedDonut(donut: Donut) {
    val uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(0)}"
  }
}
