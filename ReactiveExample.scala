import scala.concurrent.{Future, Promise}
import scala.io.reactive.{Observable, Observer}

object ReactiveExample {
  def main(args: Array[String]): Unit = {
    // Ejemplo de cómo crear un Observable que emite valores cada segundo
    val intervalObservable: Observable[String] = Observable.interval(1).map(i => s"Value emitted at $i")

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores
    val sequenceObservable: Observable[String] = Observable.fromArray(Array("A", "B", "C"))

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina
    val rangeObservable: Observable[String] = Observable.range(1, 5).map(i => s"Value at $i")

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un error
    val errorObservable: Observable[String] = Observable.range(1, 5).map(i => s"Value at $i").last(5).mapError(e => "Error: " + e.getMessage)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado
    val completedObservable: Observable[String] = Observable.range(1, 5).map(i => s"Value at $i").last(5).mapComplete(())

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutObservable: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapComplete(())

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithErrorObservable: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionObservable: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(())

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable2: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable3: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable4: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable5: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable6: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

    // Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina con un completado después de un tiempo
    val timeoutWithCompletionErrorObservable7: Observable[String] = Observable.interval(1).take(5).map(i => s"Value at $i").ignoreElementsAfter(5).mapError(e => "Error: " + e.getMessage).ignoreElementsAfter(10).mapComplete(()).ignoreElementsAfter(10)

// Ejemplo de cómo crear un Observable que emite una secuencia de valores y luego termina
  }