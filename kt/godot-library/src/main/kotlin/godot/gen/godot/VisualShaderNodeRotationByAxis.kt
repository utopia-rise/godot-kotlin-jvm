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
 * A visual shader node that modifies the rotation of the object using a rotation matrix.
 *
 * RotationByAxis node will transform the vertices of a mesh with specified axis and angle in radians. It can be used to rotate an object in an arbitrary axis.
 */
@GodotBaseType
public open class VisualShaderNodeRotationByAxis : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEROTATIONBYAXIS, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
