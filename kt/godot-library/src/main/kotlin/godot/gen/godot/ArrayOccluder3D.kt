// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * 3D polygon shape for use with occlusion culling in [godot.OccluderInstance3D].
 *
 * [godot.ArrayOccluder3D] stores an arbitrary 3D polygon shape that can be used by the engine's occlusion culling system. This is analogous to [godot.ArrayMesh], but for occluders.
 *
 * See [godot.OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class ArrayOccluder3D : Occluder3D() {
  /**
   *
   */
  public var vertices: PackedVector3Array
    @JvmName("getVertices_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getVertices()
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYOCCLUDER3D_SET_VERTICES, NIL)
    }

  /**
   *
   */
  public var indices: PackedInt32Array
    @JvmName("getIndices_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getIndices()
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYOCCLUDER3D_SET_INDICES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ARRAYOCCLUDER3D)
  }

  /**
   *
   */
  public fun setArrays(vertices: PackedVector3Array, indices: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYOCCLUDER3D_SET_ARRAYS, NIL)
  }

  public companion object
}
