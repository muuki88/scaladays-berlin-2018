package rocks.muki

import scala.io.{Source, StdIn}
import scala.util.Random


object Main extends App {

  require(args.length == 1, "requires exactly one file as input.")
  val filePath = args(0)

  Source.fromFile(filePath)

  Source.fromFile(filePath).getLines().foreach { line =>
    Thread.sleep(100L + (500.0 * Random.nextDouble()).toLong)
    println(line)
  }
  StdIn.readLine("Press any key to terminate")

}
