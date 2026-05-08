package godot.inspection

import godot.annotation.Export
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.annotation.Tool
import godot.api.Node
import godot.core.Signal0
import godot.core.StringNames

// Class-level registration checks.

// Expected red: `@Tool` requires the class itself to be registered.
@Tool
class ScalaNotRegisteredButToolFixture extends Node

// Expected red on the class: it is not `@GodotScript`, but it contains
// registered properties, signals, and functions.
class ScalaNotRegisteredButMembersFixture extends Node {
  // Expected red via the containing class: registered property inside a
  // non-registered class.
  @Export
  var propertyShouldStayRed = 1

  // Expected red via the containing class: registered signal inside a
  // non-registered class.
  @RegisterSignal
  val signalShouldStayRed = new Signal0(this, StringNames.asStringName("signalShouldStayRed"))

  // Expected red via the containing class: registered function inside a
  // non-registered class.
  @Register
  def functionShouldStayRed(): Int = propertyShouldStayRed
}

// Expected red: `@GodotScript` is present, but the class does not inherit a
// Godot object type.
@GodotScript
class ScalaRegisterClassWithoutGodotBaseFixture

// Expected red: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@GodotScript
class ScalaRegisterClassWithoutDefaultConstructorFixture(number: Int) extends Node

// Expected red on both duplicate declarations: they register the same custom
// Godot class name.
@GodotScript(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureOne extends Node

@GodotScript(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureTwo extends Node

// Expected red: generic classes cannot be registered.
@GodotScript
class ScalaGenericRegisteredClassFixture[T] extends Node

// Method registration checks.
@GodotScript
class IdeScalaInspectionRedFixture extends Node {
  // Expected red: notification callbacks like `_ready` must also carry
  // `@Register` inside a registered class.
  override def _ready(): Unit = {
  }

  // Expected red: generic functions cannot be registered.
  @Register
  def genericRegisteredFunction[T](value: T): Unit = {
  }

  // Expected red: registered functions may not exceed the max supported
  // parameter count.
  @Register
  def tooManyParameters(
    p01: Int,
    p02: Int,
    p03: Int,
    p04: Int,
    p05: Int,
    p06: Int,
    p07: Int,
    p08: Int,
    p09: Int,
    p10: Int,
    p11: Int,
    p12: Int,
    p13: Int,
    p14: Int,
    p15: Int,
    p16: Int,
    p17: Int
  ): Unit = {
  }
}
