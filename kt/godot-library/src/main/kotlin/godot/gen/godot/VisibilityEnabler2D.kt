// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisibilityEnabler2D : VisibilityNotifier2D() {
  open var freezeBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_FREEZE_BODIES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_FREEZE_BODIES, NIL)
    }

  open var pauseAnimatedSprites: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_ANIMATED_SPRITES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_ANIMATED_SPRITES, NIL)
    }

  open var pauseAnimations: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_ANIMATIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_ANIMATIONS, NIL)
    }

  open var pauseParticles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_PARTICLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_PARTICLES, NIL)
    }

  open var physicsProcessParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PHYSICS_PROCESS_PARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PHYSICS_PROCESS_PARENT, NIL)
    }

  open var processParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PROCESS_PARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PROCESS_PARENT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VISIBILITYENABLER2D)

  open fun _node_removed(arg0: Node) {
  }

  enum class Enabler(
    id: Long
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_PAUSE_PARTICLES(2),

    ENABLER_PARENT_PROCESS(3),

    ENABLER_PARENT_PHYSICS_PROCESS(4),

    ENABLER_PAUSE_ANIMATED_SPRITES(5),

    ENABLER_MAX(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ENABLER_FREEZE_BODIES: Long = 1

    final const val ENABLER_MAX: Long = 6

    final const val ENABLER_PARENT_PHYSICS_PROCESS: Long = 4

    final const val ENABLER_PARENT_PROCESS: Long = 3

    final const val ENABLER_PAUSE_ANIMATED_SPRITES: Long = 5

    final const val ENABLER_PAUSE_ANIMATIONS: Long = 0

    final const val ENABLER_PAUSE_PARTICLES: Long = 2
  }
}
