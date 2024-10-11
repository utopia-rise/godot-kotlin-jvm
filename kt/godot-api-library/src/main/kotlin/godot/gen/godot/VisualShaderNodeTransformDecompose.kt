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

private const val ENGINE_CLASS_VISUALSHADERNODETRANSFORMDECOMPOSE_INDEX: Int = 788

/**
 * Takes a 4×4 transform matrix and decomposes it into four `vec3` values, one from each row of the
 * matrix.
 */
@GodotBaseType
public open class VisualShaderNodeTransformDecompose : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETRANSFORMDECOMPOSE_INDEX,
        scriptIndex)
  }

  public companion object

  public object MethodBindings
}
