// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ARRAYOCCLUDER3D_INDEX: Int = 76

/**
 * [ArrayOccluder3D] stores an arbitrary 3D polygon shape that can be used by the engine's occlusion
 * culling system. This is analogous to [ArrayMesh], but for occluders.
 * See [OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class ArrayOccluder3D : Occluder3D() {
  /**
   * The occluder's vertex positions in local 3D coordinates.
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
    Internals.callConstructor(this, ENGINE_CLASS_ARRAYOCCLUDER3D_INDEX, scriptIndex)
  }

  /**
   * Sets [indices] and [vertices], while updating the final occluder only once after both values
   * are set.
   */
  public final fun setArrays(vertices: PackedVector3Array, indices: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to vertices, PACKED_INT_32_ARRAY to indices)
    Internals.callMethod(rawPtr, MethodBindings.setArraysPtr, NIL)
  }

  public final fun setVertices(vertices: PackedVector3Array): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to vertices)
    Internals.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  public final fun setIndices(indices: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to indices)
    Internals.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setArraysPtr: VoidPtr =
        Internals.getMethodBindPtr("ArrayOccluder3D", "set_arrays", 3233972621)

    internal val setVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("ArrayOccluder3D", "set_vertices", 334873810)

    internal val setIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("ArrayOccluder3D", "set_indices", 3614634198)
  }
}
