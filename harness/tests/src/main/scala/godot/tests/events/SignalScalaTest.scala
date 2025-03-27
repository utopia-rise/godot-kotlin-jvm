package godot.tests.events

import godot.annotation.{RegisterClass, RegisterFunction, RegisterProperty, RegisterSignal}
import godot.api.Node
import godot.core.{MethodCallable1, MethodCallable2, MethodStringName1, MethodStringName2, Signal1, Signal2}

@RegisterClass
class SignalScalaTest extends Node {
  @RegisterSignal
  val readySignal: Signal1[Boolean] = Signal1.create(this, "readySignal")

  @RegisterSignal
  val payloadSignal: Signal2[String, Integer] = Signal2.create(this, "payloadSignal")

  @RegisterProperty
  var methodSignalTriggered: Boolean = false

  @RegisterProperty
  var lambdaSignalTriggered: Boolean = false

  @RegisterProperty
  var payloadString: String = ""

  @RegisterProperty
  var payloadInt: Int = Int.MinValue

  @RegisterFunction
  override def _ready(): Unit = {
    readySignal.connect(MethodCallable1.create(
      this,
      new MethodStringName1[SignalScalaTest, Void, Boolean]("onReadySignal")
    ))
    payloadSignal.connect(MethodCallable2.create(
      this,
      new MethodStringName2[SignalScalaTest, Void, String, Integer]("onPayloadSignal")
    ))

    readySignal.emit(true)
    payloadSignal.emit("scala-events", 23)
  }

  @RegisterFunction
  def onReadySignal(value: Boolean): Unit = {
    methodSignalTriggered = value
  }

  @RegisterFunction
  def onPayloadSignal(text: String, value: Integer): Unit = {
    lambdaSignalTriggered = true
    payloadString = text
    payloadInt = value
  }
}
