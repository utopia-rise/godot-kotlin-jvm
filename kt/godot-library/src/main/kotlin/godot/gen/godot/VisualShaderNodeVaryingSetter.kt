// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Inputs a value to a varying defined in the shader. You need to first create a varying that can be
 * used in the given function, e.g. varying setter in Fragment shader requires a varying with mode set
 * to [constant VisualShader.VARYING_MODE_FRAG_TO_LIGHT].
 */
@GodotBaseType
public open class VisualShaderNodeVaryingSetter : VisualShaderNodeVarying() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVARYINGSETTER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
