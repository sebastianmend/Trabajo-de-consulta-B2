

import akka.actor.ActorSystem
import akka.stream.scaladsl.Source
import akka.stream.Materializer
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {
  implicit val system: ActorSystem = ActorSystem("reactive-system")
  implicit val materializer: Materializer = Materializer.createMaterializer(system)

  val fuenteDeDatos = Source(1 to 10)
  fuenteDeDatos.runForeach(println)

  // Asegurarse de que el sistema se cierre correctamente
  scala.io.StdIn.readLine()
  system.terminate()
}
