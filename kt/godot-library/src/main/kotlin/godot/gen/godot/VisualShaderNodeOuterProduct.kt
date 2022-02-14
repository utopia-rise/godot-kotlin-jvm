// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Calculates an outer product of two vectors within the visual shader graph.
 *
 * `OuterProduct` treats the first parameter `c` as a column vector (matrix with one column) and the second parameter `r` as a row vector (matrix with one row) and does a linear algebraic matrix multiply `c * r`, yielding a matrix whose number of rows is the number of components in `c` and whose number of columns is the number of components in `r`.
 */
@GodotBaseType
public open class VisualShaderNodeOuterProduct : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEOUTERPRODUCT)
  }

  public companion object
}
