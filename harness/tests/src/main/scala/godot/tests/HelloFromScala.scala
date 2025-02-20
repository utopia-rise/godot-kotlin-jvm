package godot.tests

import godot.annotation.{RegisterClass, RegisterFunction, RegisterProperty, RegisterSignal}
import godot.api.Node
import godot.core.Signal2

@RegisterClass
class HelloFromScala extends Node {

  @RegisterSignal(parameters = Array("param1", "param2"))
  val mySignal: Signal2[String, String] = Signal2.create(this, "test_signal_2")

  @RegisterProperty
  var myInt: Int = 0

  @RegisterFunction
  override def _ready(): Unit = {
    println("Hello from scala")
  }

  @RegisterFunction
  def sayHello(): Unit = {
    println("hello")
  }
}
