package godot.inspection

import godot.annotation.Export
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.annotation.Tool
import godot.api.Node
import godot.core.Signal0
import godot.core.StringNames

// Class-level registration checks.

// Expected red: `@Tool` requires the class itself to be registered.
@Tool
class ScalaNotRegisteredButToolFixture extends Node

// Expected red on the class: it is not `@Script`, but it contains
// registered properties, signals, and functions.
class ScalaNotRegisteredButMembersFixture extends Node {
  // Expected red via the containing class: registered property inside a
  // non-registered class.
  @Export
  @Visible
  var propertyShouldStayRed = 1

  // Expected red via the containing class: registered signal inside a
  // non-registered class.
  @Emit
  val signalShouldStayRed = new Signal0(this, StringNames.asStringName("signalShouldStayRed"))

  // Expected red via the containing class: registered function inside a
  // non-registered class.
  @Register
  def functionShouldStayRed(): Int = propertyShouldStayRed
}

// Expected red: `@Script` is present, but the class does not inherit a
// Godot object type.
@Script
class ScalaGodotScriptWithoutGodotBaseFixture

// Expected red: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@Script
class ScalaGodotScriptWithoutDefaultConstructorFixture(number: Int) extends Node

// Expected red on both duplicate declarations: they register the same custom
// Godot class name.
@Script(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureOne extends Node

@Script(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureTwo extends Node

// Expected red: generic classes cannot be registered.
@Script
class ScalaGenericRegisteredClassFixture[T] extends Node

// Method registration checks.
@Script
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


