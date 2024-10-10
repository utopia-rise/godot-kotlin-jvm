// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SKELETONMODIFICATION2D_INDEX: Int = 523

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
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATION2D_INDEX, scriptIndex)
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
  public open fun _setupModification(modificationStack: SkeletonModificationStack2D?): Unit {
  }

  /**
   * Used for drawing **editor-only** modification gizmos. This function will only be called in the
   * Godot editor and can be overridden to draw custom gizmos.
   * **Note:** You will need to use the Skeleton2D from [SkeletonModificationStack2D.getSkeleton]
   * and it's draw functions, as the [SkeletonModification2D] resource cannot draw on its own.
   */
  public open fun _drawEditorGizmo(): Unit {
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [SkeletonModificationStack2D] that this modification is bound to. Through the
   * modification stack, you can access the Skeleton2D the modification is operating on.
   */
  public final fun getModificationStack(): SkeletonModificationStack2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModificationStackPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SkeletonModificationStack2D?)
  }

  /**
   * Manually allows you to set the setup state of the modification. This function should only
   * rarely be used, as the [SkeletonModificationStack2D] the modification is bound to should handle
   * setting the modification up.
   */
  public final fun setIsSetup(isSetup: Boolean): Unit {
    Internals.writeArguments(BOOL to isSetup)
    Internals.callMethod(rawPtr, MethodBindings.setIsSetupPtr, NIL)
  }

  /**
   * Returns whether this modification has been successfully setup or not.
   */
  public final fun getIsSetup(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExecutionMode(executionMode: Int): Unit {
    Internals.writeArguments(LONG to executionMode.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setExecutionModePtr, NIL)
  }

  public final fun getExecutionMode(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExecutionModePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(DOUBLE to angle.toDouble(), DOUBLE to min.toDouble(), DOUBLE to max.toDouble(), BOOL to invert)
    Internals.callMethod(rawPtr, MethodBindings.clampAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public final fun setEditorDrawGizmo(drawGizmo: Boolean): Unit {
    Internals.writeArguments(BOOL to drawGizmo)
    Internals.callMethod(rawPtr, MethodBindings.setEditorDrawGizmoPtr, NIL)
  }

  /**
   * Returns whether this modification will call [_drawEditorGizmo] in the Godot editor to draw
   * modification-specific gizmos.
   */
  public final fun getEditorDrawGizmo(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEditorDrawGizmoPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "set_enabled", 2586408642)

    public val getEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "get_enabled", 2240911060)

    public val getModificationStackPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "get_modification_stack", 2137761694)

    public val setIsSetupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "set_is_setup", 2586408642)

    public val getIsSetupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "get_is_setup", 36873697)

    public val setExecutionModePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "set_execution_mode", 1286410249)

    public val getExecutionModePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "get_execution_mode", 3905245786)

    public val clampAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "clamp_angle", 1229502682)

    public val setEditorDrawGizmoPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "set_editor_draw_gizmo", 2586408642)

    public val getEditorDrawGizmoPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2D", "get_editor_draw_gizmo", 36873697)
  }
}
