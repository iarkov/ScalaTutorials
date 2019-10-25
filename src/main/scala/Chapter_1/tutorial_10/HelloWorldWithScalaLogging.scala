package Chapter_1.tutorial_10

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("Hello World from Scala Logging")
}
