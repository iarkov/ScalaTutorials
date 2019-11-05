package Chapter_3.tutorial_14

object CallbackFunctionParameter extends App {
  def printReport(sendEmailCallback: => Unit): Unit = {
    println("Reporting...")
    sendEmailCallback
  }

  printReport(println("Sending Report"))
  println("")

  def printReport2(sendEmailCallback: () => Unit): Unit = {
    println("Reporting...")
    sendEmailCallback()
  }

  printReport2(() => println("Sending Report"))
  println("")

  def printReport3(sendEmailCallback: Option[() => Unit] = None): Unit = {
    println("Reporting")
    //sendEmailCallback.getOrElse(println("No report to send"))
    sendEmailCallback.map(callback => callback())
  }

  printReport3()
  printReport3(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))
  println("")

  def printReport4(sendEmailCallback: => Option[Unit] = None): Unit = {
    println("Reporting")
    sendEmailCallback.getOrElse(println("No report to send"))
    //sendEmailCallback.map(callback => callback())
  }

  printReport4()
  printReport4(Some(println("Sending email wrapped in Some() ... finished")
  ))
  println("")
}
