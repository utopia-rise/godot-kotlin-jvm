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
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This node helps to multiply a position input vector by rotation using specific axis. Intended to
 * work with emitters.
 */
@GodotBaseType
public open class VisualShaderNodeParticleMultiplyByAxisAngle : VisualShaderNode() {
  /**
   * If `true`, the angle will be interpreted in degrees instead of radians.
   */
  public final inline var degreesMode: Boolean
    @JvmName("degreesModeProperty")
    get() = isDegreesMode()
    @JvmName("degreesModeProperty")
    set(`value`) {
      setDegreesMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(780, scriptIndex)
  }

  public final fun setDegreesMode(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDegreesModePtr, NIL)
  }

  public final fun isDegreesMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDegreesModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setDegreesModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMultiplyByAxisAngle", "set_degrees_mode", 2586408642)

    internal val isDegreesModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMultiplyByAxisAngle", "is_degrees_mode", 36873697)
  }
}
