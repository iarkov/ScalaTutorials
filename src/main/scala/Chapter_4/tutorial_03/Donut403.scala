package Chapter_4.tutorial_03

import Chapter_4.tutorial_03.classes._

object Donut403 {
  def apply(name: String): Donut403 = {
    name match {
      case "Glazed Donut" => new GlazedDonut403(name)
      case "Vanilla Donut" => new VanillaDonut(name)
      case _ => new Donut403(name)
    }
  }
}
