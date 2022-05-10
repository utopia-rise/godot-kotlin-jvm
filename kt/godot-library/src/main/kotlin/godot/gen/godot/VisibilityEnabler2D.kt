// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Enables certain nodes only when approximately visible.
 *
 * The VisibilityEnabler2D will disable [godot.RigidBody2D], [godot.AnimationPlayer], and other nodes when they are not visible. It will only affect nodes with the same root node as the VisibilityEnabler2D, and the root node itself.
 *
 * If you just want to receive notifications, use [godot.VisibilityNotifier2D] instead.
 *
 * **Note:** For performance reasons, VisibilityEnabler2D uses an approximate heuristic with precision determined by [godot.ProjectSettings.world/2d/cellSize]. If you need precise visibility checking, use another method such as adding an [godot.Area2D] node as a child of a [godot.Camera2D] node.
 *
 * **Note:** VisibilityEnabler2D will not affect nodes added after scene initialization.
 */
@GodotBaseType
public open class VisibilityEnabler2D : VisibilityNotifier2D() {
  /**
   * If `true`, [godot.RigidBody2D] nodes will be paused.
   */
  public open var freezeBodies: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_FREEZE_BODIES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_FREEZE_BODIES, NIL)
    }

  /**
   * If `true`, [godot.AnimatedSprite] nodes will be paused.
   */
  public open var pauseAnimatedSprites: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_ANIMATED_SPRITES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_ANIMATED_SPRITES, NIL)
    }

  /**
   * If `true`, [godot.AnimationPlayer] nodes will be paused.
   */
  public open var pauseAnimations: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_ANIMATIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_ANIMATIONS, NIL)
    }

  /**
   * If `true`, [godot.Particles2D] nodes will be paused.
   */
  public open var pauseParticles: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PAUSE_PARTICLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PAUSE_PARTICLES, NIL)
    }

  /**
   * If `true`, the parent's [godot.Node.PhysicsProcess] will be stopped.
   */
  public open var physicsProcessParent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PHYSICS_PROCESS_PARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PHYSICS_PROCESS_PARENT, NIL)
    }

  /**
   * If `true`, the parent's [godot.Node.Process] will be stopped.
   */
  public open var processParent: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_GET_PROCESS_PARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBILITYENABLER2D_SET_PROCESS_PARENT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISIBILITYENABLER2D)
  }

  public open fun _nodeRemoved(arg0: Node): Unit {
  }

  public enum class Enabler(
    id: Long
  ) {
    /**
     * This enabler will pause [godot.AnimationPlayer] nodes.
     */
    ENABLER_PAUSE_ANIMATIONS(0),
    /**
     * This enabler will freeze [godot.RigidBody2D] nodes.
     */
    ENABLER_FREEZE_BODIES(1),
    /**
     * This enabler will stop [godot.Particles2D] nodes.
     */
    ENABLER_PAUSE_PARTICLES(2),
    /**
     * This enabler will stop the parent's _process function.
     */
    ENABLER_PARENT_PROCESS(3),
    /**
     * This enabler will stop the parent's _physics_process function.
     */
    ENABLER_PARENT_PHYSICS_PROCESS(4),
    /**
     * This enabler will stop [godot.AnimatedSprite] nodes animations.
     */
    ENABLER_PAUSE_ANIMATED_SPRITES(5),
    /**
     * Represents the size of the [enum Enabler] enum.
     */
    ENABLER_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * This enabler will freeze [godot.RigidBody2D] nodes.
     */
    public final const val ENABLER_FREEZE_BODIES: Long = 1

    /**
     * Represents the size of the [enum Enabler] enum.
     */
    public final const val ENABLER_MAX: Long = 6

    /**
     * This enabler will stop the parent's _physics_process function.
     */
    public final const val ENABLER_PARENT_PHYSICS_PROCESS: Long = 4

    /**
     * This enabler will stop the parent's _process function.
     */
    public final const val ENABLER_PARENT_PROCESS: Long = 3

    /**
     * This enabler will stop [godot.AnimatedSprite] nodes animations.
     */
    public final const val ENABLER_PAUSE_ANIMATED_SPRITES: Long = 5

    /**
     * This enabler will pause [godot.AnimationPlayer] nodes.
     */
    public final const val ENABLER_PAUSE_ANIMATIONS: Long = 0

    /**
     * This enabler will stop [godot.Particles2D] nodes.
     */
    public final const val ENABLER_PAUSE_PARTICLES: Long = 2
  }
}
