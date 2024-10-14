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

/**
 * This visual shader node has six input ports:
 * - Port **1** and **2** provide the two floating-point numbers `a` and `b` that will be compared.
 * - Port **3** is the tolerance, which allows similar floating-point numbers to be considered
 * equal.
 * - Ports **4**, **5**, and **6** are the possible outputs, returned if `a == b`, `a > b`, or `a <
 * b` respectively.
 */
@GodotBaseType
public open class VisualShaderNodeIf : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEIF, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
