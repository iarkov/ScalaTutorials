package Chapter_4.tutorial_01

import Chapter_4.tutorial_01.Donut4

object ClassesAndObjects extends App {

  val vanillaDonut = new Donut4("Vanilla Donut",1111)
  val glazedDonut = new Donut4("Glazed Donut", 2222)

  glazedDonut.print
  vanillaDonut.print

}
