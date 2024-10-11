// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_VISUALSHADERNODESCREENUVTOSDF_INDEX: Int = 772

/**
 * Translates to `screen_uv_to_sdf(uv)` in the shader language. If the UV port isn't connected,
 * `SCREEN_UV` is used instead.
 */
@GodotBaseType
public open class VisualShaderNodeScreenUVToSDF : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODESCREENUVTOSDF_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
