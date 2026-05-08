package godot.tests

import godot.annotation.{Export, script, Register, RegisterSignal, Visible}
import godot.api.Object.ConnectFlags
import godot.api.{Button, Node, RenderingServer}
import godot.core.{Callable, Dictionary, GodotNotification, LambdaCallable, LambdaCallable0, Signal0, Signal2, StringNames, VariantArray}
import org.jetbrains.annotations.NotNull

@script
class ScalaTestClass extends Node {
  //@RegisterSignal
  //val testSignal: Signal0 = Signal0.create(this, "test_signal")
//
  //@RegisterSignal
  //val testSignal2: Signal2[String, String] = Signal2.create(this, "test_signal_2")

  @Export
  var exportedInt: Int = 1

  @Export
  var exportedLong: Long = 1L

  @Export
  var exportedFloat: Float = 1f

  @Export
  var exportedDouble: Double = 1.0

  @Export
  var exportedBoolean: Boolean = true

  @Export
  var exportedString: String = "blubb"

  @Export
  var exportedByte: Byte = 1

  @Export
  var exportedButton: Button = null

  @Register
  def greeting: String = {
    return "Hello from scala"
  }

  @Visible
  var signalEmitted: Boolean = false

  @Visible
  var variantArray: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  @Visible
  var dictionary: Dictionary[Float, String] = new Dictionary[Float, String](classOf[Float], classOf[String])

  //var lambdaCallable: LambdaCallable[Void] = LambdaCallable0.create(classOf[Void], () => {
  //  System.out.println("Hello from Callable")
  //  null
//
  //})
//
  //var methodCallable: NativeCallable = Callable.create(this, StringNames.asStringName("DummyName"))

  @Register
  override def _ready(): Unit = {
    // Check if Singletons have the correct syntax, without Single.INSTANCE
    val constant = RenderingServer.NO_INDEX_ARRAY
    val signal = RenderingServer.getFramePreDraw
    RenderingServer.getDefaultClearColor
  }

  //@Register
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

  @Register
  def signalCallback(): Unit = {
    signalEmitted = true
  }
}
