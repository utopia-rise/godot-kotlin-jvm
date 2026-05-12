package godot.tests

import godot.annotation.{Export, RegisterClass, RegisterFunction, RegisterProperty, RegisterSignal}
import godot.api.Object.ConnectFlags
import godot.api.{Button, Node, RenderingServer}
import godot.core.{Callable, Callable1, Dictionary, GodotNotification, LambdaCallable, LambdaCallable0, LambdaCallable1, LambdaCallable3, MethodCallable1, MethodStringName1, NotificationFunction, Signal0, Signal1, Signal2, Signal3, StringNames, VariantArray}
import org.jetbrains.annotations.NotNull

@RegisterClass
class ScalaTestClass extends Node {
  @RegisterSignal(parameters = Array("param1"))
  val testSignal1: Signal1[String] = Signal1.create(this, "testSignal1")

  @RegisterSignal
  val lambdaSignalNoParam: Signal0 = Signal0.create(this, "lambdaSignalNoParam")

  @RegisterSignal(parameters = Array("str", "long", "node"))
  val lambdaSignalWithParams: Signal3[String, Long, Node] = Signal3.create(this, "lambdaSignalWithParams")

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
  var hasSignalNoParamBeenTriggered: Boolean = false

  @RegisterProperty
  var signalString: String = ""

  @RegisterProperty
  var signalLong: Long = 0

  @RegisterProperty
  var signalNode: Node = null

  @RegisterProperty
  var scalaCallable: Callable = LambdaCallable1.create(
    classOf[String],
    (str: String) => scalaCallableString = str
  )

  @RegisterProperty
  var scalaCallableString: String = ""

  @RegisterProperty
  var variantArray: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  @RegisterProperty
  var dictionary: Dictionary[Float, String] = new Dictionary[Float, String](classOf[Float], classOf[String])

  @RegisterProperty
  var notificationTriggered: Boolean = false


  @RegisterFunction
  override def _ready(): Unit = {
    // Check if Singletons have the correct syntax, without Single.INSTANCE
    val constant = RenderingServer.NO_INDEX_ARRAY
    val signal = RenderingServer.getFramePreDraw
    RenderingServer.getDefaultClearColor

    lambdaSignalNoParam.connect(
      LambdaCallable0.create(() => hasSignalNoParamBeenTriggered = true)
    )

    lambdaSignalWithParams.connect(
      LambdaCallable3.create(
        classOf[String],
        classOf[Long],
        classOf[Node],
        (str: String, longValue: Long, node: Node) => {
          signalString = str
          signalLong = longValue
          signalNode = node
        }
      )
    )
  }

  @RegisterFunction
  def connectAndTriggerSignal(): Unit = {
    val callable: Callable1[Void, String] = LambdaCallable1.create(
      classOf[String],
      (_: String) => signalEmitted = true
    )
    testSignal1.connect(callable, ConnectFlags.ONE_SHOT)
    testSignal1.emit("test")
  }

  @RegisterFunction
  @NotNull
  override def _notification(): GodotNotification = godotNotification((myself: ScalaTestClass, notification: Int) => myself.notificationTriggered = true)


  @RegisterFunction
  def signalCallback(): Unit = {
    signalEmitted = true
  }

  @RegisterFunction
  def signalCallbackWithValue(value: String): Unit = {
    signalEmitted = true
  }

  @RegisterFunction
  def emitLambdaSignalNoParam(): Unit = {
    lambdaSignalNoParam.emit()
  }

  @RegisterFunction
  def emitLambdaSignalWithParam(str: String, longValue: Long, node: Node): Unit = {
    lambdaSignalWithParams.emit(str, longValue, node)
  }
}
