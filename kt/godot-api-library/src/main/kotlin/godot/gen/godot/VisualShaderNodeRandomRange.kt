// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_VISUALSHADERNODERANDOMRANGE_INDEX: Int = 683

/**
 * Random range node will output a pseudo-random scalar value in the specified range, based on the
 * seed. The value is always the same for the given seed and range, so you should provide a changing
 * input, e.g. by using time.
 */
@GodotBaseType
public open class VisualShaderNodeRandomRange : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_VISUALSHADERNODERANDOMRANGE_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
