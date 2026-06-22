package godot.tests

import godot.core.GodotEnum

enum ScalaGodotEnum(val v: Long) extends java.lang.Enum[ScalaGodotEnum], GodotEnum {
  case A extends ScalaGodotEnum(2)
  case B extends ScalaGodotEnum(8)

  override def getValue(): Long = v
}
