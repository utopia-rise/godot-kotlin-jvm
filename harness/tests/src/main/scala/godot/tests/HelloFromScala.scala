package godot.tests

import godot.annotation.{script, Register, RegisterSignal, Visible}
import godot.api.Node
import godot.core.Signal2

@script
class HelloFromScala extends Node {

  //@RegisterSignal(parameters = Array("param1", "param2"))
  //val mySignal: Signal2[String, String] = Signal2.create(this, "test_signal_2")

  @Visible
  var myInt: Int = 0

  override def _ready(): Unit = {
    println("Hello from scala")
  }

  @Register
  def sayHello(): Unit = {
    println("hello")
  }
}
