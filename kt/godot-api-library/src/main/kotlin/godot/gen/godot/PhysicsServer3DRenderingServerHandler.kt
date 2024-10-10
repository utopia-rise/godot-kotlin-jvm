// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER_INDEX: Int = 426

@GodotBaseType
public open class PhysicsServer3DRenderingServerHandler : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER_INDEX,
        scriptIndex)
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
  public final fun setVertex(vertexId: Int, vertex: Vector3): Unit {
    Internals.writeArguments(LONG to vertexId.toLong(), VECTOR3 to vertex)
    Internals.callMethod(rawPtr, MethodBindings.setVertexPtr, NIL)
  }

  /**
   * Sets the normal for the [SoftBody3D] vertex at the index specified by [vertexId].
   */
  public final fun setNormal(vertexId: Int, normal: Vector3): Unit {
    Internals.writeArguments(LONG to vertexId.toLong(), VECTOR3 to normal)
    Internals.callMethod(rawPtr, MethodBindings.setNormalPtr, NIL)
  }

  /**
   * Sets the bounding box for the [SoftBody3D].
   */
  public final fun setAabb(aabb: AABB): Unit {
    Internals.writeArguments(godot.core.VariantParser.AABB to aabb)
    Internals.callMethod(rawPtr, MethodBindings.setAabbPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setVertexPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_vertex", 1530502735)

    public val setNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_normal", 1530502735)

    public val setAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsServer3DRenderingServerHandler", "set_aabb", 259215842)
  }
}
