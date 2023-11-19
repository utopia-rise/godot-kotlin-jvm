// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
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
   * The occluder's vertex positions in local 3D coordinates.
   *
   * **Note:** The occluder is always updated after setting this value. If creating occluders procedurally, consider using [setArrays] instead to avoid updating the occluder twice when it's created.
   */
  public var vertices: PackedVector3Array
    @JvmName("getVertices_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getVertices()
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  /**
   * The occluder's index position. Indices determine which points from the [vertices] array should be drawn, and in which order.
   *
   * **Note:** The occluder is always updated after setting this value. If creating occluders procedurally, consider using [setArrays] instead to avoid updating the occluder twice when it's created.
   */
  public var indices: PackedInt32Array
    @JvmName("getIndices_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getIndices()
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ARRAYOCCLUDER3D, scriptIndex)
    return true
  }

  /**
   * Sets [indices] and [vertices], while updating the final occluder only once after both values are set.
   */
  public fun setArrays(vertices: PackedVector3Array, indices: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(rawPtr, MethodBindings.setArraysPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setArraysPtr: VoidPtr = TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_arrays")

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_vertices")

    public val setIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_indices")
  }
}
