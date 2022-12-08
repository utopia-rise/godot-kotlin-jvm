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
 * A custom global visual shader graph expression written in Godot Shading Language.
 *
 * Custom Godot Shader Language expression, which is placed on top of the generated shader. You can place various function definitions inside to call later in [godot.VisualShaderNodeExpression]s (which are injected in the main shader functions). You can also declare varyings, uniforms and global constants.
 */
@GodotBaseType
public open class VisualShaderNodeGlobalExpression : VisualShaderNodeExpression() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEGLOBALEXPRESSION, scriptIndex)
    return true
  }

  public companion object
}
