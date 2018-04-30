package rocks.muki

import scala.util.Random


object Main extends App {

  while(true) {
    Thread.sleep(100L + (500.0 * Random.nextDouble()).toLong)
    println(s"[${System.currentTimeMillis()}] Hello, scala days")
  }

}
