// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class PhysicsServer3DRenderingServerHandler : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER, scriptIndex)
  }

  /**
   * Called by the [PhysicsServer3D] to set the position for the [SoftBody3D] vertex at the index
   * specified by [vertexId].
   * **Note:** The [vertex] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public open fun _setVertex(vertexId: Int, vertex: Vector3): Unit {
  }

  /**
   * Called by the [PhysicsServer3D] to set the normal for the [SoftBody3D] vertex at the index
   * specified by [vertexId].
   * **Note:** The [normal] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public open fun _setNormal(vertexId: Int, normal: Vector3): Unit {
  }

  /**
   * Called by the [PhysicsServer3D] to set the bounding box for the [SoftBody3D].
   */
  public open fun _setAabb(aabb: AABB): Unit {
  }

  /**
   * Sets the position for the [SoftBody3D] vertex at the index specified by [vertexId].
   */
  public fun setVertex(vertexId: Int, vertex: Vector3): Unit {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Sets the normal for the [SoftBody3D] vertex at the index specified by [vertexId].
   */
  public fun setNormal(vertexId: Int, normal: Vector3): Unit {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.setNormalPtr, NIL)
  }

  /**
   * Sets the bounding box for the [SoftBody3D].
   */
  public fun setAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, MethodBindings.setAabbPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _setVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_vertex")

    public val _setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_normal")

    public val _setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "_set_aabb")

    public val setVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_vertex")

    public val setNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_normal")

    public val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_aabb")
  }
}
