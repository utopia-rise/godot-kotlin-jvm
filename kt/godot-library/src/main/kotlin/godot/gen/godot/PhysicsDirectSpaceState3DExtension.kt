// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform3D
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PhysicsDirectSpaceState3DExtension : PhysicsDirectSpaceState3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE3DEXTENSION)
  }

  /**
   *
   */
  public open fun _intersectRay(
    from: Vector3,
    to: Vector3,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    hitFromInside: Boolean,
    hitBackFaces: Boolean,
    result: `PhysicsServer3DExtensionRayResult*`
  ): Boolean {
    throw
        NotImplementedError("_intersect_ray is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _intersectPoint(
    position: Vector3,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    results: `PhysicsServer3DExtensionShapeResult*`,
    maxResults: Long
  ): Long {
    throw
        NotImplementedError("_intersect_point is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _intersectShape(
    shapeRid: RID,
    transform: Transform3D,
    motion: Vector3,
    margin: Double,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    resultCount: `PhysicsServer3DExtensionShapeResult*`,
    maxResults: Long
  ): Long {
    throw
        NotImplementedError("_intersect_shape is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _castMotion(
    shapeRid: RID,
    transform: Transform3D,
    motion: Vector3,
    margin: Double,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    closestSafe: `float*`,
    closestUnsafe: `float*`,
    info: `PhysicsServer3DExtensionShapeRestInfo*`
  ): Boolean {
    throw
        NotImplementedError("_cast_motion is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _collideShape(
    shapeRid: RID,
    transform: Transform3D,
    motion: Vector3,
    margin: Double,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    results: `void*`,
    maxResults: Long,
    resultCount: `int32_t*`
  ): Boolean {
    throw
        NotImplementedError("_collide_shape is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _restInfo(
    shapeRid: RID,
    transform: Transform3D,
    motion: Vector3,
    margin: Double,
    collisionMask: Long,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean,
    restInfo: `PhysicsServer3DExtensionShapeRestInfo*`
  ): Boolean {
    throw
        NotImplementedError("_rest_info is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  /**
   *
   */
  public open fun _getClosestPointToObjectVolume(_object: RID, point: Vector3): Vector3 {
    throw
        NotImplementedError("_get_closest_point_to_object_volume is not implemented for PhysicsDirectSpaceState3DExtension")
  }

  public companion object
}
