// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * This node helps to multiply a position input vector by rotation using specific axis. Intended to
 * work with emitters.
 */
@GodotBaseType
public open class VisualShaderNodeParticleMultiplyByAxisAngle : VisualShaderNode() {
  /**
   * If `true`, the angle will be interpreted in degrees instead of radians.
   */
  public var degreesMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDegreesModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDegreesModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEMULTIPLYBYAXISANGLE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDegreesModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMultiplyByAxisAngle", "set_degrees_mode")

    public val isDegreesModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMultiplyByAxisAngle", "is_degrees_mode")
  }
}
