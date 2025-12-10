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
 * Translates to `screen_uv_to_sdf(uv)` in the shader language. If the UV port isn't connected,
 * `SCREEN_UV` is used instead.
 */
@GodotBaseType
public open class VisualShaderNodeScreenUVToSDF : VisualShaderNode() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(810, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
