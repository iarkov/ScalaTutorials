package Chapter_3.tutorial_06

object DonutConversions {
  implicit def stringToDonutString(s: String) = new DonutString(s)
}
