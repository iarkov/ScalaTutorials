package Chapter_1.tutorial_06

object HelloWorldWithArguments extends App {
  println("Hello World with Arguments Scala Application")

  println("Command line arguments are: ")
  println(args.mkString(", "))
}
