package rocks.muki

import scala.io.{Source, StdIn}
import scala.util.Random


object Main extends App {

  while(true) {
    Thread.sleep(100L + (500.0 * Random.nextDouble()).toLong)
    println(s"[${System.currentTimeMillis()}] Hello, scala days")
  }

}

object MemoryOptions extends App {

  println(">>> Xms and Xmx settings <<<")

  val maxMemory = Runtime.getRuntime.maxMemory() / (1024L * 1024L)
  println(s"  Max memory: $maxMemory")
  println(s"  CPUs available: ${Runtime.getRuntime.availableProcessors()}")

  println()

}

object Printer extends App {

  require(args.length == 1, "requires exactly one file as input.")
  val filePath = args(0)

  Source.fromFile(filePath).getLines().foreach { line =>
    Thread.sleep(100L + (500.0 * Random.nextDouble()).toLong)
    println(line)
  }
  StdIn.readLine("Press any key to terminate")

}
