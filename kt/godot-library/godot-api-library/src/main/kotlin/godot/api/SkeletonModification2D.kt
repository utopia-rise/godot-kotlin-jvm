// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This resource provides an interface that can be expanded so code that operates on [Bone2D] nodes
 * in a [Skeleton2D] can be mixed and matched together to create complex interactions.
 *
 * This is used to provide Godot with a flexible and powerful Inverse Kinematics solution that can
 * be adapted for many different uses.
 */
@GodotBaseType
public open class SkeletonModification2D : Resource() {
  /**
   * If `true`, the modification's [_execute] function will be called by the
   * [SkeletonModificationStack2D].
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = getEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The execution mode for the modification. This tells the modification stack when to execute the
   * modification. Some modifications have settings that are only available in certain execution modes.
   */
  public final inline var executionMode: Int
    @JvmName("executionModeProperty")
    get() = getExecutionMode()
    @JvmName("executionModeProperty")
    set(`value`) {
      setExecutionMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(612, scriptIndex)
  }

  /**
   * Executes the given modification. This is where the modification performs whatever function it
   * is designed to do.
   */
  public open fun _execute(delta: Double): Unit {
    throw NotImplementedError("SkeletonModification2D::_execute is not implemented.")
  }

  /**
   * Called when the modification is setup. This is where the modification performs initialization.
   */
  public open fun _setupModification(modificationStack: SkeletonModificationStack2D?): Unit {
    throw NotImplementedError("SkeletonModification2D::_setupModification is not implemented.")
  }

  /**
   * Used for drawing **editor-only** modification gizmos. This function will only be called in the
   * Godot editor and can be overridden to draw custom gizmos.
   *
   * **Note:** You will need to use the Skeleton2D from [SkeletonModificationStack2D.getSkeleton]
   * and it's draw functions, as the [SkeletonModification2D] resource cannot draw on its own.
   */
  public open fun _drawEditorGizmo(): Unit {
    throw NotImplementedError("SkeletonModification2D::_drawEditorGizmo is not implemented.")
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [SkeletonModificationStack2D] that this modification is bound to. Through the
   * modification stack, you can access the Skeleton2D the modification is operating on.
   */
  public final fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonModificationStack2D?)
  }

  /**
   * Manually allows you to set the setup state of the modification. This function should only
   * rarely be used, as the [SkeletonModificationStack2D] the modification is bound to should handle
   * setting the modification up.
   */
  public final fun setIsSetup(isSetup: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isSetup)
    TransferContext.callMethod(ptr, MethodBindings.setIsSetupPtr, NIL)
  }

  /**
   * Returns whether this modification has been successfully setup or not.
   */
  public final fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExecutionMode(executionMode: Int): Unit {
    TransferContext.writeArguments(LONG to executionMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setExecutionModePtr, NIL)
  }

  public final fun getExecutionMode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExecutionModePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Takes an angle and clamps it so it is within the passed-in [min] and [max] range. [invert] will
   * inversely clamp the angle, clamping it to the range outside of the given bounds.
   */
  public final fun clampAngle(
    angle: Float,
    min: Float,
    max: Float,
    invert: Boolean,
  ): Float {
    TransferContext.writeArguments(DOUBLE to angle.toDouble(), DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), BOOL to invert)
    TransferContext.callMethod(ptr, MethodBindings.clampAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public final fun setEditorDrawGizmo(drawGizmo: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawGizmo)
    TransferContext.callMethod(ptr, MethodBindings.setEditorDrawGizmoPtr, NIL)
  }

  /**
   * Returns whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public final fun getEditorDrawGizmo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEditorDrawGizmoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_enabled", 2586408642)

    internal val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_enabled", 2240911060)

    internal val getModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_modification_stack", 2137761694)

    internal val setIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_is_setup", 2586408642)

    internal val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_is_setup", 36873697)

    internal val setExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_execution_mode", 1286410249)

    internal val getExecutionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_execution_mode", 3905245786)

    internal val clampAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "clamp_angle", 1229502682)

    internal val setEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "set_editor_draw_gizmo", 2586408642)

    internal val getEditorDrawGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2D", "get_editor_draw_gizmo", 36873697)
  }
}
