package godot.tests

import godot.annotation.{Script, Register, Visible, Emit}
import godot.api.Node
import godot.core.Signal2

@Script
class HelloFromScala extends Node {

  //@Emit(parameters = Array("param1", "param2"))
  //val mySignal: Signal2[String, String] = Signal2.create(this, "test_signal_2")

  @Visible
  var myInt: Int = 0

  @Register
  override def _ready(): Unit = {
    println("Hello from scala")
  }

  @Register
  def sayHello(): Unit = {
    println("hello")
  }
}


