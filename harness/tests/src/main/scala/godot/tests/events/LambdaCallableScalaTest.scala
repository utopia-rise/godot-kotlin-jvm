package godot.tests.events

import godot.annotation.{RegisterClass, RegisterFunction, RegisterProperty}
import godot.api.Node
import godot.core.{Callable, LambdaCallable0, LambdaCallable1}

@RegisterClass
class LambdaCallableScalaTest extends Node {
  @RegisterProperty
  var callableNoParamTriggered: Boolean = false

  @RegisterProperty
  var callableWithParamTriggered: Boolean = false

  @RegisterProperty
  var callableString: String = ""

  @RegisterProperty
  var callableProperty: Callable = LambdaCallable1.create(
    classOf[String],
    (value: String) => callableString = value
  )

  @RegisterFunction
  def markCallableNoParamTriggered(): Unit = {
    callableNoParamTriggered = true
  }

  @RegisterFunction
  def callCallableNoParam(): Unit = {
    LambdaCallable0.create(() => markCallableNoParamTriggered()).call()
  }

  @RegisterFunction
  def callCallableNoParamDeferred(): Unit = {
    LambdaCallable0.create(() => markCallableNoParamTriggered()).callDeferred()
  }

  @RegisterFunction
  def markCallableWithParamTriggered(flag: Boolean): Unit = {
    callableWithParamTriggered = flag
  }

  @RegisterFunction
  def callCallableWithParam(): Unit = {
    LambdaCallable1.create(classOf[Boolean], (flag: Boolean) => markCallableWithParamTriggered(flag)).call(true)
  }

  @RegisterFunction
  def callCallableWithParamDeferred(): Unit = {
    LambdaCallable1.create(classOf[Boolean], (flag: Boolean) => markCallableWithParamTriggered(flag)).callDeferred(true)
  }
}
