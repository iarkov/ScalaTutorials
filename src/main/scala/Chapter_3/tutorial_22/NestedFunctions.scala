package Chapter_3.tutorial_22

object NestedFunctions extends App {
  def checkDonutAvailability(donutName: String): Boolean = {
    val listDonutsFromStock: List[String] = List("Vanilla Donut","Strawberry Donut","Plain Donut","Glazed Donut")

    val isDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)

    isDonutInStock
  }

  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")

  def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {
    val listDonutsFromStock: List[String] = List("Vanilla Donut","Strawberry Donut","Plain Donut","Glazed Donut")

    val validateContent = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    val validateAvailability = (name: String, nameList: List[String]) => {
      nameList contains name
    }

    validateContent(donutName) && validateAvailability(donutName,listDonutsFromStock)
  }

  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")
}
