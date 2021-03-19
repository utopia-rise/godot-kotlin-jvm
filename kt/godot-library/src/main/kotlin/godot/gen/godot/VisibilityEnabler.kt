// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Enables certain nodes only when approximately visible.
 * 
 * The VisibilityEnabler will disable [godot.RigidBody] and [godot.AnimationPlayer] nodes when they are not visible. It will only affect other nodes within the same scene as the VisibilityEnabler itself.
 *
 * If you just want to receive notifications, use [godot.VisibilityNotifier] instead.
 *
 * **Note:** VisibilityEnabler uses an approximate heuristic for performance reasons. It doesn't take walls and other occlusion into account. The heuristic is an implementation detail and may change in future versions. If you need precise visibility checking, use another method such as adding an [godot.Area] node as a child of a [godot.Camera] node and/or [godot.Vector3.dot].
 *
 * **Note:** VisibilityEnabler will not affect nodes added after scene initialization.
 */
@GodotBaseType
open class VisibilityEnabler : VisibilityNotifier() {
  /**
   * If `true`, [godot.RigidBody] nodes will be paused.
   */
  open var freezeBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER_GET_FREEZE_BODIES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER_SET_FREEZE_BODIES, NIL)
    }

  /**
   * If `true`, [godot.AnimationPlayer] nodes will be paused.
   */
  open var pauseAnimations: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER_GET_PAUSE_ANIMATIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER_SET_PAUSE_ANIMATIONS, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISIBILITYENABLER)
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  enum class Enabler(
    id: Long
  ) {
    /**
     * This enabler will pause [godot.AnimationPlayer] nodes.
     */
    ENABLER_PAUSE_ANIMATIONS(0),

    /**
     * This enabler will freeze [godot.RigidBody] nodes.
     */
    ENABLER_FREEZE_BODIES(1),

    /**
     * Represents the size of the [enum Enabler] enum.
     */
    ENABLER_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * This enabler will freeze [godot.RigidBody] nodes.
     */
    final const val ENABLER_FREEZE_BODIES: Long = 1

    /**
     * Represents the size of the [enum Enabler] enum.
     */
    final const val ENABLER_MAX: Long = 2

    /**
     * This enabler will pause [godot.AnimationPlayer] nodes.
     */
    final const val ENABLER_PAUSE_ANIMATIONS: Long = 0
  }
}
