// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates a 4×4 transform matrix using four vectors of type `vec3`. Each vector is one row in the
 * matrix and the last column is a `vec4(0, 0, 0, 1)`.
 */
@GodotBaseType
public open class VisualShaderNodeTransformCompose : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(812, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
