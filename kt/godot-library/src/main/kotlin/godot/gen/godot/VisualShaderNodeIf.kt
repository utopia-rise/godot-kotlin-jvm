// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Compares two floating-point numbers in order to return a required vector within the visual shader graph.
 *
 * First two ports are scalar floating-point numbers to compare, third is tolerance comparison amount and last three ports represents a vectors returned if `a == b`, `a > b` and `a < b` respectively.
 */
@GodotBaseType
public open class VisualShaderNodeIf : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEIF)
  }

  public companion object
}
