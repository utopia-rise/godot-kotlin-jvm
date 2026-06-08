package godot.tests

import godot.annotation.{Export, Script, Register, Visible, Emit}
import godot.api.Object.ConnectFlags
import godot.api.{Button, Node, RenderingServer}
import godot.core.{BitField, Callable, Callable1, Dictionary, GodotNotification, LambdaCallable, LambdaCallable0, LambdaCallable1, LambdaCallable3, MethodCallable1, MethodStringName1, NotificationFunction, Signal0, Signal1, Signal2, Signal3, StringNames, VariantArray}
import org.jetbrains.annotations.NotNull

@Script
class ScalaTestClass extends Node {
  @Emit(parameters = Array("param1"))
  val testSignal1: Signal1[String] = Signal1.create(this, "testSignal1")

  @Emit
  val lambdaSignalNoParam: Signal0 = Signal0.create(this, "lambdaSignalNoParam")

  @Emit(parameters = Array("str", "long", "node"))
  val lambdaSignalWithParams: Signal3[String, Long, Node] = Signal3.create(this, "lambdaSignalWithParams")

  @Export
  @Visible
  var exportedInt: Int = 1

  @Export
  @Visible
  var exportedLong: Long = 1L

  @Export
  @Visible
  var exportedFloat: Float = 1f

  @Export
  @Visible
  var exportedDouble: Double = 1.0

  @Export
  @Visible
  var exportedBoolean: Boolean = true

  @Export
  @Visible
  var exportedString: String = "blubb"

  @Export
  @Visible
  var exportedByte: Byte = 1

  @Export
  @Visible
  var exportedButton: Button = null

  @Export
  @Visible
  var scalaEnum: ScalaEnum = ScalaEnum.SCALA_ENUM_1

  @Export
  @Visible
  var scalaFlag: BitField[ScalaEnum] = BitField.of(ScalaEnum.SCALA_ENUM_1, ScalaEnum.SCALA_ENUM_2)

  @Export
  @Visible
  var scalaEnumList: java.util.List[ScalaEnum] = new java.util.ArrayList(java.util.List.of(ScalaEnum.SCALA_ENUM_1))

  @Export
  @Visible
  var scalaGodotFlag: BitField[ScalaGodotEnum] = BitField.of(ScalaGodotEnum.A, ScalaGodotEnum.B)

  @Register
  def greeting: String = {
    return "Hello from scala"
  }

  @Visible
  var signalEmitted: Boolean = false

  @Visible
  var hasSignalNoParamBeenTriggered: Boolean = false

  @Visible
  var signalString: String = ""

  @Visible
  var signalLong: Long = 0

  @Visible
  var signalNode: Node = null

  @Visible
  var scalaCallable: Callable = LambdaCallable1.create(
    classOf[String],
    (str: String) => scalaCallableString = str
  )

  @Visible
  var scalaCallableString: String = ""

  @Visible
  var variantArray: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  @Visible
  var dictionary: Dictionary[Float, String] = new Dictionary[Float, String](classOf[Float], classOf[String])

  @Visible
  var notificationTriggered: Boolean = false


  @Register
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

  @Register
  def connectAndTriggerSignal(): Unit = {
    val callable: Callable1[Void, String] = LambdaCallable1.create(
      classOf[String],
      (_: String) => signalEmitted = true
    )
    testSignal1.connect(callable, ConnectFlags.ONE_SHOT)
    testSignal1.emit("test")
  }

  @Register
  @NotNull
  override def _notification(): GodotNotification = godotNotification((myself: ScalaTestClass, notification: Int) => myself.notificationTriggered = true)


  @Register
  def signalCallback(): Unit = {
    signalEmitted = true
  }

  @Register
  def signalCallbackWithValue(value: String): Unit = {
    signalEmitted = true
  }

  @Register
  def emitLambdaSignalNoParam(): Unit = {
    lambdaSignalNoParam.emit()
  }

  @Register
  def emitLambdaSignalWithParam(str: String, longValue: Long, node: Node): Unit = {
    lambdaSignalWithParams.emit(str, longValue, node)
  }
}


