package Chapter_2.tutorial_05

object IfElseStatement extends App {
  /*
   * Using If Clause as Statement
   */
  println("Step 1: Using If Clause as Statement")
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  /*
   *  Using IfElse Clause as Statement
   */
  println(s"\nStep 2: Using IfElse Clause as Statement")
  val defaultDonutsToBuy = 8

  if (numberOfPeople > 4)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = ${defaultDonutsToBuy}")

  /*
   * Using IF, Else If, and Else Clauses as Statement
   */
  println(s"\nStep 3: Using IF, Else If, and Else Clauses as Statement")
  if (numberOfPeople > 4) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("No need to buy donuts")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  /*
   * Using If and Else Clauses as Expression
   */
  println(s"\nStep 4: Using If and Else Clauses as Expression")
  val numberOfDonutsToBuy = if (numberOfPeople > 4) (numberOfPeople * donutsPerPerson) else (defaultDonutsToBuy)
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")

}
