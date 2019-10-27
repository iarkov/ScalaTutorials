package Chapter_2.tutodial_02

object ScalaStringInterpolation extends App {
  /*
   * Using String Interpolation to Print a Variable
   */
  println("Step 1: Using String Interpolation to Print a Variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  /*
   * Using String Interpolation on Object Properties
   */
  println("\nStep 2: Using String Interpolation on Object Properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut =  Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  /*
   * Using String Interpolation to Evaluate Expressions
   */
  println("\nStep 3: Using String Interpolation to Evaluate Expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buyning 10 donuts = ${qtyDonutsToBuy == 10}")

  /*
   * Using String Interpolation for Formatting Text
   */
  println("\nStep 4: Using String Interpolation for Formatting Text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  /*
   * Using String Interpolation to Format Numbers
   */
  println("\nStep 5: Using String Interpolation to Format Numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")

  /*
   * Using Raw Interpolation
   */
  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")
}
