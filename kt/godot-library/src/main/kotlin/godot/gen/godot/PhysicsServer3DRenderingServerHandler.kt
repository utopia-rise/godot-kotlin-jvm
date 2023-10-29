// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A class used to provide [godot.PhysicsServer3DExtension.SoftBodyUpdateRenderingServer] with a rendering handler for soft bodies.
 */
@GodotBaseType
public open class PhysicsServer3DRenderingServerHandler : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER, scriptIndex)
    return true
  }

  /**
   * Called by the [godot.PhysicsServer3D] to set the position for the [godot.SoftBody3D] vertex at the index specified by [vertexId].
   *
   * **Note:** The [vertex] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public open fun _setVertex(vertexId: Int, vertex: Vector3): Unit {
  }

  /**
   * Called by the [godot.PhysicsServer3D] to set the normal for the [godot.SoftBody3D] vertex at the index specified by [vertexId].
   *
   * **Note:** The [normal] parameter used to be of type `const void*` prior to Godot 4.2.
   */
  public open fun _setNormal(vertexId: Int, normal: Vector3): Unit {
  }

  /**
   * Called by the [godot.PhysicsServer3D] to set the bounding box for the [godot.SoftBody3D].
   */
  public open fun _setAabb(aabb: AABB): Unit {
  }

  /**
   * Sets the position for the [godot.SoftBody3D] vertex at the index specified by [vertexId].
   */
  public fun setVertex(vertexId: Int, vertex: Vector3): Unit {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER_SET_VERTEX, NIL)
  }

  /**
   * Sets the normal for the [godot.SoftBody3D] vertex at the index specified by [vertexId].
   */
  public fun setNormal(vertexId: Int, normal: Vector3): Unit {
    TransferContext.writeArguments(LONG to vertexId.toLong(), VECTOR3 to normal)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER_SET_NORMAL, NIL)
  }

  /**
   * Sets the bounding box for the [godot.SoftBody3D].
   */
  public fun setAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER_SET_AABB, NIL)
  }

  public companion object
}
