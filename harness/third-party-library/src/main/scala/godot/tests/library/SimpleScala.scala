package godot.tests.library

import godot.annotation.{Export, RegisterClass, RegisterFunction, RegisterProperty}
import godot.api.Node

@RegisterClass
class SimpleScala extends Node:

  @Export
  @RegisterProperty
  var testProperty: String = "Hello from third-party-library!"

  @RegisterFunction
  def provideGreeting(): String = testProperty
