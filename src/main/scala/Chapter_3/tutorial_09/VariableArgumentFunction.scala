package Chapter_3.tutorial_09

object VariableArgumentFunction extends App {
  def printReport(names:String*): Unit = {
    println(s"""Donut Report = ${names.mkString(" - ")}""")
  }

  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")

  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts: _*)

  val seqDonuts: Seq[String] = Seq("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(seqDonuts: _*)

  val arrDonuts: Array[String] = Array("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(arrDonuts: _*)
}
