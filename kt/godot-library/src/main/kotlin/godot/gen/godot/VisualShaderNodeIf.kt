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
 * Outputs a 3D vector based on the result of a floating point comparison within the visual shader graph.
 *
 * This visual shader node has six input ports. Port 1 and 2 provide the two floating point numbers `a` and `b` that will be compared. Port 3 is the tolerance, which allows similar floating point number to be considered equal. Ports 4 to 6 are the possible outputs, returned if `a == b`, `a > b`, or `a < b` respectively.
 */
@GodotBaseType
public open class VisualShaderNodeIf : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEIF, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
