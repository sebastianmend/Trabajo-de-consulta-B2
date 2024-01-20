import akka.actor.ActorSystem
import akka.stream.scaladsl.Source
import scala.concurrent.ExecutionContextExecutor

object Main extends App {

  implicit val system: ActorSystem = ActorSystem("my-system")
  implicit val ec: ExecutionContextExecutor = system.dispatcher

  val source = Source(1 to 10)

  source.map(num => {
    println(s"Processing $num")
    num
  }).runForeach(num => println(s"Processed $num"))

  println("Done")

  system.terminate()

}
