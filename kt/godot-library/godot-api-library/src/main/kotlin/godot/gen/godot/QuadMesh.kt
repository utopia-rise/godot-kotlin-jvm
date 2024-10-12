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

private const val ENGINE_CLASS_QUADMESH_INDEX: Int = 507

/**
 * Class representing a square [PrimitiveMesh]. This flat mesh does not have a thickness. By
 * default, this mesh is aligned on the X and Y axes; this rotation is more suited for use with
 * billboarded materials. A [QuadMesh] is equivalent to a [PlaneMesh] except its default
 * [PlaneMesh.orientation] is [PlaneMesh.FACE_Z].
 */
@GodotBaseType
public open class QuadMesh : PlaneMesh() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_QUADMESH_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
