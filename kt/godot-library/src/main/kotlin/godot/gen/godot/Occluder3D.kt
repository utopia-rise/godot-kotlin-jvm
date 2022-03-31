// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import kotlin.Suppress
import kotlin.Unit

/**
 * Occluder shape resource for use with occlusion culling in [godot.OccluderInstance3D].
 *
 * [godot.Occluder3D] stores an occluder shape that can be used by the engine's occlusion culling system.
 *
 * See [godot.OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open abstract class Occluder3D : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDER3D)
  }

  /**
   * Returns the occluder shape's vertex positions.
   */
  public open fun getVertices(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDER3D_GET_VERTICES,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the occluder shape's vertex indices.
   */
  public open fun getIndices(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDER3D_GET_INDICES,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  public companion object
}
