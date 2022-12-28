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
 * Class representing a square mesh facing the camera.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/129](https://godotengine.org/asset-library/asset/129)
 *
 * Class representing a square [godot.PrimitiveMesh]. This flat mesh does not have a thickness. By default, this mesh is aligned on the X and Y axes; this rotation is more suited for use with billboarded materials. A [godot.QuadMesh] is equivalent to a [godot.PlaneMesh] except its default [godot.PlaneMesh.orientation] is [godot.PlaneMesh.FACE_Z].
 */
@GodotBaseType
public open class QuadMesh : PlaneMesh() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_QUADMESH, scriptIndex)
    return true
  }

  public companion object
}
