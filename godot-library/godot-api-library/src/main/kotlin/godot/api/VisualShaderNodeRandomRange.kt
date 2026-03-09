// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * Random range node will output a pseudo-random scalar value in the specified range, based on the
 * seed. The value is always the same for the given seed and range, so you should provide a changing
 * input, e.g. by using time.
 */
@GodotBaseType
public open class VisualShaderNodeRandomRange : VisualShaderNode() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(801, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
