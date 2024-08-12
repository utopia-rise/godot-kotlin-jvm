// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This resource provides an interface that can be expanded so code that operates on [Bone2D] nodes
 * in a [Skeleton2D] can be mixed and matched together to create complex interactions.
 * This is used to provide Godot with a flexible and powerful Inverse Kinematics solution that can
 * be adapted for many different uses.
 */
@GodotBaseType
public open class SkeletonModification2D : Resource() {
  /**
   * If `true`, the modification's [_execute] function will be called by the
   * [SkeletonModificationStack2D].
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * The execution mode for the modification. This tells the modification stack when to execute the
   * modification. Some modifications have settings that are only available in certain execution modes.
   */
  public var executionMode: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExecutionModePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setExecutionModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2D, scriptIndex)
    return true
  }

  /**
   * Executes the given modification. This is where the modification performs whatever function it
   * is designed to do.
   */
  public open fun _execute(delta: Double): Unit {
  }

  /**
   * Called when the modification is setup. This is where the modification performs initialization.
   */
  public open fun _setupModification(modificationStack: SkeletonModificationStack2D): Unit {
  }

  /**
   * Used for drawing **editor-only** modification gizmos. This function will only be called in the
   * Godot editor and can be overridden to draw custom gizmos.
   * **Note:** You will need to use the Skeleton2D from [SkeletonModificationStack2D.getSkeleton]
   * and it's draw functions, as the [SkeletonModification2D] resource cannot draw on its own.
   */
  public open fun _drawEditorGizmo(): Unit {
  }

  /**
   * Returns the [SkeletonModificationStack2D] that this modification is bound to. Through the
   * modification stack, you can access the Skeleton2D the modification is operating on.
   */
  public fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?)
  }

  /**
   * Manually allows you to set the setup state of the modification. This function should only
   * rarely be used, as the [SkeletonModificationStack2D] the modification is bound to should handle
   * setting the modification up.
   */
  public fun setIsSetup(isSetup: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isSetup)
    TransferContext.callMethod(rawPtr, MethodBindings.setIsSetupPtr, NIL)
  }

  /**
   * Returns whether this modification has been successfully setup or not.
   */
  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Takes an angle and clamps it so it is within the passed-in [min] and [max] range. [invert] will
   * inversely clamp the angle, clamping it to the range outside of the given bounds.
   */
  public fun clampAngle(
    angle: Float,
    min: Float,
    max: Float,
    invert: Boolean,
  ): Float {
    TransferContext.writeArguments(DOUBLE to angle.toDouble(), DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.clampAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public fun setEditorDrawGizmo(drawGizmo: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawGizmo)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditorDrawGizmoPtr, NIL)
  }

  /**
   * Returns whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public fun getEditorDrawGizmo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorDrawGizmoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val _executePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_execute")

    public val _setupModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_setup_modification")

    public val _drawEditorGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "_draw_editor_gizmo")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_enabled")

    public val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_enabled")

    public val getModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_modification_stack")

    public val setIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_is_setup")

    public val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_is_setup")

    public val setExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_execution_mode")

    public val getExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_execution_mode")

    public val clampAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "clamp_angle")

    public val setEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_editor_draw_gizmo")

    public val getEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_editor_draw_gizmo")
  }
}
