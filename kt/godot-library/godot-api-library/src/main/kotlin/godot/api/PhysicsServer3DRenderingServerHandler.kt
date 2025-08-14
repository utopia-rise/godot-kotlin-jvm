// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Int
import kotlin.Suppress
import godot.core.AABB as CoreAABB
import godot.core.VariantParser.AABB as VariantParserAABB

@GodotBaseType
public abstract class PhysicsServer3DRenderingServerHandler : Object() {
  override fun new(scriptIndex: Int) {
    createNativeObject(478, scriptIndex)
  }

  /**
   * Called by the [PhysicsServer3D] to set the position for the [SoftBody3D] vertex at the index specified by [vertexId].
   *
   * **Note:** The [vertex] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public abstract fun _setVertex(vertexId: Int, vertex: Vector3)

  /**
   * Called by the [PhysicsServer3D] to set the normal for the [SoftBody3D] vertex at the index specified by [vertexId].
   *
   * **Note:** The [normal] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public abstract fun _setNormal(vertexId: Int, normal: Vector3)

  /**
   * Called by the [PhysicsServer3D] to set the bounding box for the [SoftBody3D].
   */
  public abstract fun _setAabb(aabb: CoreAABB)

  /**
   * Sets the position for the [SoftBody3D] vertex at the index specified by [vertexId].
   */
  public final fun setVertex(vertexId: Int, vertex: Vector3) {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Sets the normal for the [SoftBody3D] vertex at the index specified by [vertexId].
   */
  public final fun setNormal(vertexId: Int, normal: Vector3) {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(ptr, MethodBindings.setNormalPtr, NIL)
  }

  /**
   * Sets the bounding box for the [SoftBody3D].
   */
  public final fun setAabb(aabb: CoreAABB) {
    TransferContext.writeArguments(VariantParserAABB to aabb)
    TransferContext.callMethod(ptr, MethodBindings.setAabbPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_vertex", 1_530_502_735)

    internal val setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_normal", 1_530_502_735)

    internal val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_aabb", 259_215_842)
  }
}
