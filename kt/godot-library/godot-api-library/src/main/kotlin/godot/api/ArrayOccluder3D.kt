// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [ArrayOccluder3D] stores an arbitrary 3D polygon shape that can be used by the engine's occlusion
 * culling system. This is analogous to [ArrayMesh], but for occluders.
 *
 * See [OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class ArrayOccluder3D : Occluder3D() {
  /**
   * The occluder's vertex positions in local 3D coordinates.
   *
   * **Note:** The occluder is always updated after setting this value. If creating occluders
   * procedurally, consider using [setArrays] instead to avoid updating the occluder twice when it's
   * created.
   */
  public final inline var vertices: PackedVector3Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  /**
   * The occluder's index position. Indices determine which points from the [vertices] array should
   * be drawn, and in which order.
   *
   * **Note:** The occluder is always updated after setting this value. If creating occluders
   * procedurally, consider using [setArrays] instead to avoid updating the occluder twice when it's
   * created.
   */
  public final inline var indices: PackedInt32Array
    @JvmName("indicesProperty")
    get() = getIndices()
    @JvmName("indicesProperty")
    set(`value`) {
      setIndices(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(41, scriptIndex)
  }

  /**
   * Sets [indices] and [vertices], while updating the final occluder only once after both values
   * are set.
   */
  public final fun setArrays(vertices: PackedVector3Array, indices: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(ptr, MethodBindings.setArraysPtr, NIL)
  }

  public final fun setVertices(vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(ptr, MethodBindings.setVerticesPtr, NIL)
  }

  public final fun setIndices(indices: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to indices)
    TransferContext.callMethod(ptr, MethodBindings.setIndicesPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_arrays", 3233972621)

    internal val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_vertices", 334873810)

    internal val setIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ArrayOccluder3D", "set_indices", 3614634198)
  }
}
