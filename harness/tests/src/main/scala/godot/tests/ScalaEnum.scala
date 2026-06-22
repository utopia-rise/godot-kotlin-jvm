package godot.tests

// Godot registration models enums as java.lang.Enum, so Scala enums must extend it explicitly.
enum ScalaEnum extends java.lang.Enum[ScalaEnum] {
  case SCALA_ENUM_1, SCALA_ENUM_2
}
