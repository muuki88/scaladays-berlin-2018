package rocks.muki

import scala.io.{Source, StdIn}
import scala.util.Random


object Main extends App {

  Source.fromResource("headline.txt").getLines().foreach { line =>
    Thread.sleep(100L + (500.0 * Random.nextDouble()).toLong)
    println(line)
  }
  StdIn.readLine("Press any key to terminate")

}
