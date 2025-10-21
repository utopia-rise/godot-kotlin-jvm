package godot.tests

import godot.annotation.{Export, RegisterClass, RegisterFunction, RegisterProperty, RegisterSignal}
import godot.api.Object.ConnectFlags
import godot.api.{Button, Node, RenderingServer}
import godot.core.{Callable, Dictionary, GodotNotification, LambdaCallable, LambdaCallable0, Signal0, Signal2, StringNames, VariantArray}
import org.jetbrains.annotations.NotNull

@RegisterClass
class ScalaTestClass extends Node {
  //@RegisterSignal
  //val testSignal: Signal0 = Signal0.create(this, "test_signal")
//
  //@RegisterSignal
  //val testSignal2: Signal2[String, String] = Signal2.create(this, "test_signal_2")

  @Export
  @RegisterProperty
  var exportedInt: Int = 1

  @Export
  @RegisterProperty
  var exportedLong: Long = 1L

  @Export
  @RegisterProperty
  var exportedFloat: Float = 1f

  @Export
  @RegisterProperty
  var exportedDouble: Double = 1.0

  @Export
  @RegisterProperty
  var exportedBoolean: Boolean = true

  @Export
  @RegisterProperty
  var exportedString: String = "blubb"

  @Export
  @RegisterProperty
  var exportedByte: Byte = 1

  @Export
  @RegisterProperty
  var exportedButton: Button = null

  @RegisterFunction
  def greeting: String = {
    return "Hello from scala"
  }

  @RegisterProperty
  var signalEmitted: Boolean = false

  @RegisterProperty
  var variantArray: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  @RegisterProperty
  var dictionary: Dictionary[Float, String] = new Dictionary[Float, String](classOf[Float], classOf[String])

  //var lambdaCallable: LambdaCallable[Void] = LambdaCallable0.create(classOf[Void], () => {
  //  System.out.println("Hello from Callable")
  //  null
//
  //})
//
  //var methodCallable: NativeCallable = Callable.create(this, StringNames.asStringName("DummyName"))

  @RegisterFunction
  override def _ready(): Unit = {
    // Check if Singletons have the correct syntax, without Single.INSTANCE
    val constant = RenderingServer.NO_INDEX_ARRAY
    val signal = RenderingServer.getFramePreDraw
    RenderingServer.getDefaultClearColor
  }

  //@RegisterFunction
  //def connectAndTriggerSignal(): Unit = {
  //  connect(StringNames.asStringName("test_signal"), new NativeCallable(this, StringNames.asStringName("signal_callback")), ConnectFlags.ONE_SHOT.getId.toInt)
  //  emitSignal(StringNames.asStringName("test_signal"))
  //}

  //@NotNull
  //override def _notification: GodotNotification = {
  //  godotNotification(this, (myself: ScalaTestClass, notification: Integer) => {
  //    System.out.println(notification)
  //    null
  //  })
  //}

  @RegisterFunction
  def signalCallback(): Unit = {
    signalEmitted = true
  }
}
