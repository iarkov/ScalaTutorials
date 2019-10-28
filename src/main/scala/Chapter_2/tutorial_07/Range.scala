package Chapter_2.tutorial_07

object Range extends App {
  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1To5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5")

  println("\nStep 2: Create a simple numeric range from 1 to 5 exclusive")
  val from1Until5 = 1 until 5
  println(s"Range from 1 to 5 exclusive = $from1Until5")

  println("\nStep 3: Create a numeric range from 0 to 10 increment with 2")
  val from0To10By2 = 0 to 10 by 2
  print(s"Range from 0 to 10 by 2 = $from0To10By2")

  println("\nStep 4: Create an alphabetical range from a to z")
  val AToZ = 'A' to 'z'
  println(s"Alphabetical range = $AToZ")

  println("\nStep 5: Character ranges with user specified increment")
  val AToZBy2 = 'A' to 'z' by 2
  println(s"Alphabetical range with increment 2 = $AToZBy2")

  println("\nStep 6: Storing our ranges into into collections")
  val listFrom1to5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1to5.mkString(" ")}")

  val setFrom1to5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1to5.mkString(" ")}")

  val seqFrom1to5 = (1 to 5).toSeq
  println(s"Range to sequence = ${seqFrom1to5.mkString(" ")}")

  val arrayFrom1to5 = (1 to 5).toArray
  println(s"Range to array = ${arrayFrom1to5.mkString(" ")}")
}