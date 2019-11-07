package Chapter_3.tutorial_18

object TailRecursiveFunctionAnnotationTailrec extends App {
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  @annotation.tailrec
  def kek(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if (donuts.length == index) {
      None
    } else if (donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      kek(donutName,donuts,nextIndex)
    }
  }

  def search (donutName: String, donuts: Array[String]): Option[Boolean] = {
    val index = 0
    kek(donutName, donuts, index)
  }

  val nameToSearch = "Vanilla Donut"

  if (search(nameToSearch,arrayDonuts).getOrElse(false)) {
    println(s"$nameToSearch is in stock")
  } else {
    println(s"$nameToSearch is not in stock")
  }

  print(s"${arrayDonuts(3)}")
}
