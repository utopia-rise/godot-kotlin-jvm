package godot.inspection

import godot.annotation.Export
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.ArgumentName
import godot.annotation.Tool
import godot.api.Node
import godot.core.Signal0
import godot.core.StringNames

// Class-level registration checks.
// NOT ALLOWED: `@Tool` requires the class itself to be `@GodotScript`.
@Tool
class ScalaNotRegisteredButToolFixture extends Node

// NOT ALLOWED on the class: it is not `@GodotScript`, but it contains
// members that would be registered.
class ScalaNotRegisteredButMembersFixture extends Node {
  // NOT ALLOWED via the containing class: `@Export` implies a registered
  // property, so the class itself must be `@GodotScript`.
  @Export
  var propertyShouldStayRed = 1

  // NOT ALLOWED via the containing class: direct signal declarations are
  // auto-registered, so the class itself must be `@GodotScript`.
  val signalShouldStayRed = new Signal0(this, StringNames.asStringName("signalShouldStayRed"))

  // NOT ALLOWED via the containing class: explicitly registered function
  // inside a non-registered class.
  @Register
  def functionShouldStayRed(): Int = propertyShouldStayRed
}

// NOT ALLOWED: `@GodotScript` is present, but the class does not inherit a
// Godot object type.
@GodotScript
class ScalaRegisterClassWithoutGodotBaseFixture

// NOT ALLOWED: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@GodotScript
class ScalaRegisterClassWithoutDefaultConstructorFixture(number: Int) extends Node

// NOT ALLOWED on both declarations: they register the same custom
// Godot class name.
@GodotScript(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureOne extends Node

@GodotScript(className = "DuplicateScalaInspectionName")
class ScalaDuplicateRegisteredNameFixtureTwo extends Node

// NOT ALLOWED: generic classes cannot be registered.
@GodotScript
class ScalaGenericRegisteredClassFixture[T] extends Node

// Method registration checks.
@GodotScript
class IdeScalaInspectionRedFixture extends Node {
  // ALLOWED: overrides coming from Godot base types are registered
  // automatically.
  override def _ready(): Unit = {
  }

  // NOT ALLOWED: generic functions cannot be registered.
  @Register
  def genericRegisteredFunction[T](value: T): Unit = {
  }

  // NOT ALLOWED: registered functions may not exceed the max supported
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

