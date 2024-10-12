// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_OCCLUDER3D_INDEX: Int = 413

/**
 * [Occluder3D] stores an occluder shape that can be used by the engine's occlusion culling system.
 * See [OccluderInstance3D]'s documentation for instructions on setting up occlusion culling.
 */
@GodotBaseType
public open class Occluder3D internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OCCLUDER3D_INDEX, scriptIndex)
  }

  /**
   * Returns the occluder shape's vertex positions.
   */
  public final fun getVertices(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the occluder shape's vertex indices.
   */
  public final fun getIndices(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIndicesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public companion object

  public object MethodBindings {
    internal val getVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("Occluder3D", "get_vertices", 497664490)

    internal val getIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("Occluder3D", "get_indices", 1930428628)
  }
}
