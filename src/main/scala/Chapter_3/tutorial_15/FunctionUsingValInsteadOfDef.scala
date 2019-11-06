package Chapter_3.tutorial_15

object FunctionUsingValInsteadOfDef extends App {
  val listDonuts = List(("Glazed Donut",3),("Vanilla Donut",1),("Strawberry Donut",1),("Plain Donut",1))

  // Higher higher order function
  def totalCost (donutOrders: List[(String, Int)]): Double = {
    var totalCost = 0.0

    donutOrders.foreach{ order =>
      totalCost += costWithDiscountFunctionParameter(order._1)(order._2)(applyDiscount)
    }

    totalCost
  }

  // Higher order function
  def costWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: (String,Double) => Double): Double = {
    quantity match {
      case 1 => println(s"Calculating cost for $quantity $donutType")
      case _ => println(s"Calculating cost for $quantity $donutType"+"s")
    }

    val price = donutType match {
      case "Glazed Donut" => 3.00
      case "Vanilla Donut" | "Strawberry Donut" => 2.50
      case _ => 2.00
    }
    val cost = price * quantity
    f(donutType,cost)
  }

  // Pass function
  def applyDiscount(donutType:String, cost:Double): Double = {
    val discount: Option[Double] = donutType match {
      case "Glazed Donut" => Some(0.05)
      case "Vanilla Donut" | "Strawberry Donut" => Some(0.1)
      case _ => None
    }
    cost * (1.00 - discount.getOrElse(0.0))
  }

  // Call higher order function
  println(f"Total cost of purchase = ${totalCost(listDonuts)}%.2f")
  println("")

  // Function using val keyword
  val totalCost2: List[(String, Int)] => Double = donutOrders => {
    var totalCost = 0.0

    donutOrders.foreach{ order =>
      totalCost += costWithDiscountFunctionParameter(order._1)(order._2)(applyDiscount)
    }

    totalCost
  }

  // Call higher order val function
  println(f"Total cost of purchase = ${totalCost2(listDonuts)}%.2f")
}
