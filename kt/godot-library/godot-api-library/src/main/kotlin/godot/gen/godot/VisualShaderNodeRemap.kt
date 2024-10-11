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

private const val ENGINE_CLASS_VISUALSHADERNODEREMAP_INDEX: Int = 764

/**
 * Remap will transform the input range into output range, e.g. you can change a `0..1` value to
 * `-2..2` etc. See [@GlobalScope.remap] for more details.
 */
@GodotBaseType
public open class VisualShaderNodeRemap : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEREMAP_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
