package Chapter_3.tutorial_19

import scala.util.control.TailCalls._

object RecursiveFunctionTailCalls extends App {

  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  def search(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if (donuts.length == index) {
      done(None)
    } else if (donuts(index) == donutName) {
      done(Some(true))
    } else {
      val nextIndex: Int = index + 1
      tailcall(search(donutName,donuts,nextIndex))
    }
  }

  val found = tailcall(search("Glazed Donut", arrayDonuts, 0))
  println(s"Donut is fount = ${found.result.getOrElse(false)}")
  //found.result.map(kek => println(s"Donut is found = $kek"))
}
