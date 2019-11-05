package Chapter_3.tutorial_13

import scala.util.Random

object CallByNameFunction extends App {
  val listOrders = List(("Glazed Donut",5,2.50),("Vanilla Donut",10,3.50))

  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach { order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Fetching USD to GBP exchange rate = $exchangeRate")
      order._2 match {
        case 1 => println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
        case _ => println(s"Cost of ${order._2} ${order._1}s = £$costOfItem")
      }
      totalCost += costOfItem
    }
    totalCost
  }

  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach { order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Fetching USD to GBP exchange rate = $exchangeRate")
      order._2 match {
        case 1 => println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
        case _ => println(s"Cost of ${order._2} ${order._1}s = £$costOfItem")
      }
      totalCost += costOfItem
    }
    totalCost
  }

  def usdToGpd(): Double = {
    val rate = new Random().nextDouble()
    rate
  }

  println(s"Total cost of the order = ${placeOrder(listOrders)(usdToGpd())}")
  println()
  println(s"Total cost of the order = ${placeOrderWithByNameParameter(listOrders)(usdToGpd())}")
}
