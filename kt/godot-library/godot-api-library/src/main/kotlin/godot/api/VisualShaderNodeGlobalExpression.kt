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

private const val ENGINECLASS_VISUALSHADERNODEGLOBALEXPRESSION: Int = 735

/**
 * Custom Godot Shader Language expression, which is placed on top of the generated shader. You can
 * place various function definitions inside to call later in [VisualShaderNodeExpression]s (which are
 * injected in the main shader functions). You can also declare varyings, uniforms and global
 * constants.
 */
@GodotBaseType
public open class VisualShaderNodeGlobalExpression : VisualShaderNodeExpression() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEGLOBALEXPRESSION, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
