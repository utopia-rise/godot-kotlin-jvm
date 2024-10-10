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

private const val ENGINE_CLASS_VISUALSHADERNODETRANSFORMCOMPOSE_INDEX: Int = 703

/**
 * Creates a 4×4 transform matrix using four vectors of type `vec3`. Each vector is one row in the
 * matrix and the last column is a `vec4(0, 0, 0, 1)`.
 */
@GodotBaseType
public open class VisualShaderNodeTransformCompose : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETRANSFORMCOMPOSE_INDEX,
        scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
