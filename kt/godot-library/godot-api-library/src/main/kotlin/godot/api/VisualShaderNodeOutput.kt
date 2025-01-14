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

private const val ENGINECLASS_VISUALSHADERNODEOUTPUT: Int = 748

/**
 * This visual shader node is present in all shader graphs in form of "Output" block with multiple
 * output value ports.
 */
@GodotBaseType
public open class VisualShaderNodeOutput internal constructor() : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEOUTPUT, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
