package godot.tests.events

import godot.annotation.{RegisterClass, RegisterFunction, RegisterProperty}
import godot.api.Node
import godot.core.{Callable0, Callable1, Callable2, MethodCallable3, MethodStringName3, VariantArray}

@RegisterClass
class CallableMethodBindScalaTest extends Node {
  @RegisterProperty
  var methodBinds: VariantArray[Integer] = new VariantArray[Integer](classOf[Integer])

  methodBinds.add(-1)
  methodBinds.add(-1)
  methodBinds.add(-1)

  @RegisterFunction
  def callWithMethodWithAllBinds(): Unit = {
    val unboundCallable = MethodCallable3.create(
      this,
      new MethodStringName3[CallableMethodBindScalaTest, Void, Integer, Integer, Integer]("recordMethodBind")
    )
    val boundCallable: Callable0[Void] = unboundCallable.bind(1, 2, 3)
    boundCallable.call()
  }

  @RegisterFunction
  def callWithMethodWithTwoBinds(): Unit = {
    val unboundCallable = MethodCallable3.create(
      this,
      new MethodStringName3[CallableMethodBindScalaTest, Void, Integer, Integer, Integer]("recordMethodBind")
    )
    val boundCallable: Callable1[Void, Integer] = unboundCallable.bind(5, 6)
    boundCallable.call(4)
  }

  @RegisterFunction
  def callWithMethodWithOneBind(): Unit = {
    val unboundCallable = MethodCallable3.create(
      this,
      new MethodStringName3[CallableMethodBindScalaTest, Void, Integer, Integer, Integer]("recordMethodBind")
    )
    val boundCallable: Callable2[Void, Integer, Integer] = unboundCallable.bind(9)
    boundCallable.call(7, 8)
  }

  @RegisterFunction
  def callWithMethodWithNoBind(): Unit = {
    val unboundCallable = MethodCallable3.create(
      this,
      new MethodStringName3[CallableMethodBindScalaTest, Void, Integer, Integer, Integer]("recordMethodBind")
    )
    unboundCallable.call(10, 11, 12)
  }

  @RegisterFunction
  def recordMethodBind(first: Integer, second: Integer, third: Integer): Unit = {
    methodBinds.set(0, first - 10)
    methodBinds.set(1, second - 10)
    methodBinds.set(2, third - 10)
  }
}
