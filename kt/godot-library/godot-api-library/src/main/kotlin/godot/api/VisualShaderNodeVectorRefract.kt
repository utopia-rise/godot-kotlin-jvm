// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * Translated to `refract(I, N, eta)` in the shader language, where `I` is the incident vector, `N`
 * is the normal vector and `eta` is the ratio of the indices of the refraction.
 */
@GodotBaseType
public open class VisualShaderNodeVectorRefract : VisualShaderNodeVectorBase() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(853, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
