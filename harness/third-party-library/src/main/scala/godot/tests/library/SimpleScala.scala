package godot.tests.library

import godot.annotation.{Export, Script, Register, Visible}
import godot.api.Node

@Script
class SimpleScala extends Node:

  @Export
  @Visible
  var testProperty: String = "Hello from third-party-library!"

  @Register
  def provideGreeting(): String = testProperty


