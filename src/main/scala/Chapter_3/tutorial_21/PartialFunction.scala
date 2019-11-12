package Chapter_3.tutorial_21

object PartialFunction extends App {
  val donut = "Glazed Donut"
  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")

  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }

  println(s"isVeryTasty = ${isVeryTasty("Glazed Donut")}")

  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut@_ => s"Unknown taste for donut = $donut"
  }

  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste

  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))
}
