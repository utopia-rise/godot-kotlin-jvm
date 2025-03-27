package godot.tests.syntax

import godot.annotation.{Export, RegisterClass, RegisterFunction, RegisterProperty}
import godot.api.Node
import godot.core.GodotNotification

@RegisterClass
class ScalaTestClass extends Node {
  @Export
  @RegisterProperty
  var exportedInt: Int = 1

  @RegisterProperty
  var enteredTree: Boolean = false

  @RegisterProperty
  var notificationTriggered: Boolean = false

  @RegisterFunction
  def greeting: String = "Hello from scala"

  @RegisterFunction
  override def _enterTree(): Unit = {
    enteredTree = true
  }

  @RegisterFunction
  override def _notification(): GodotNotification =
    godotNotification((myself: ScalaTestClass, notification: Int) => myself.notificationTriggered = true)
}
