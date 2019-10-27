package Chapter_2.tutodial_01

object DeclareVariablesAndTypes extends App {
  /*
   * Immutable Variable
   */
  val donutsToBuy: Int = 5
  /* donutsToBuy = 10 - impossible to reassign the variable val due to immutability */

  /*
   * Mutable Variable
   */
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"

  /*
   * Lazy Initialization
   */
  lazy val donutService: String = "initialize some donut service"

  /*
   * Scala Supported Types
   */
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutStoreName: String = "Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  /*
   * Declare a Variable with No Initialization
   */

  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "PlainDonut"
}
