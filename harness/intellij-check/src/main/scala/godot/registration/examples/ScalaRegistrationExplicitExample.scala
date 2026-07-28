package godot.registration.examples

import godot.annotation.*
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

// Set the IDE registration mode to Explicit. The class and its five Godot-facing
// declarations should be highlighted in green.
@Script
class ScalaRegistrationExplicitExample extends Node {
  @Export
  @Visible
  @IntRange(min = 0, max = 100)
  var health: Int = 100

  @Emit
  val damaged: Signal1[Integer] =
    Signal1.create(this, "damaged")

  @Register
  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
  }

  @Register
  override def _ready(): Unit = {
    GD.print("Player is ready")
  }

  @Rpc(rpcMode = RpcMode.ANY)
  @Register
  def synchronizeHealth(value: Int): Unit = {
    health = value
  }
}
