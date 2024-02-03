import akka.actor.ActorSystem
import akka.stream.scaladsl.Source
import scala.concurrent.ExecutionContextExecutor

object Main extends App {

  implicit val system: ActorSystem = ActorSystem("my-system")
  implicit val ec: ExecutionContextExecutor = system.dispatcher

  val source = Source(1 to 100)

  source.map(num => {
      println(s"Procesando $num")
      num
    })
    .runForeach(num =>

       if (num % 5 == 0 && num % 3 == 0) {
        println(s"$num es múltiplo de 3 y 5")
      }
       else if (num % 3 == 0) {
        println(s"$num es múltiplo de 3")
      }
       else if (num % 5 == 0) {
         println(s"$num es múltiplo de 5")
       }
    )

  println("Done")

  system.terminate()
}
