package godot.registration.examples

import godot.annotation.*
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

// Set the IDE registration mode to Inferred. The class and its five Godot-facing
// declarations should be highlighted in green.
@Script
class ScalaRegistrationInferredExample extends Node {
  @IntRange(min = 0, max = 100)
  var health: Int = 100

  val damaged: Signal1[Integer] =
    Signal1.create(this, "damaged")

  @Register
  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
  }

  override def _ready(): Unit = {
    GD.print("Player is ready")
  }

  @Rpc(rpcMode = RpcMode.ANY)
  def synchronizeHealth(value: Int): Unit = {
    health = value
  }
}
