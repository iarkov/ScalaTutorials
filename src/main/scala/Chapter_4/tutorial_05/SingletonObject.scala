package Chapter_4.tutorial_05

object kekBarakek {
  val price = 0.2

  def someConcat (names: List[String]): Unit = {
    println(names.mkString("_"))
  }
}

object SingletonObject extends App {
  println(kekBarakek.price)
  kekBarakek.someConcat(List("Pis","pis"))
}
