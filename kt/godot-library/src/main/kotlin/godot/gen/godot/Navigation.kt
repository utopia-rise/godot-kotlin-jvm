// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Mesh-based navigation and pathfinding node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/124](https://godotengine.org/asset-library/asset/124)
 *
 * Provides navigation and pathfinding within a collection of [godot.NavigationMesh]es. By default, these will be automatically collected from child [godot.NavigationMeshInstance] nodes, but they can also be added on the fly with [navmeshAdd]. In addition to basic pathfinding, this class also assists with aligning navigation agents with the meshes they are navigating on.
 *
 * **Note:** The current navigation system has many known issues and will not always return optimal paths as expected. These issues will be fixed in Godot 4.0.
 */
@GodotBaseType
public open class Navigation : Spatial() {
  /**
   * Defines which direction is up. By default, this is `(0, 1, 0)`, which is the world's "up" direction.
   */
  public open var upVector: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_UP_VECTOR, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_SET_UP_VECTOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATION)
  }

  @CoreTypeHelper
  public open fun upVector(schedule: Vector3.() -> Unit): Vector3 = upVector.apply{
      schedule(this)
      upVector = this
  }


  /**
   * Returns the navigation point closest to the point given. Points are in local coordinate space.
   */
  public open fun getClosestPoint(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CLOSEST_POINT,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the surface normal at the navigation point closest to the point given. Useful for rotating a navigation agent according to the navigation mesh it moves on.
   */
  public open fun getClosestPointNormal(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CLOSEST_POINT_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the owner of the [godot.NavigationMesh] which contains the navigation point closest to the point given. This is usually a [godot.NavigationMeshInstance]. For meshes added via [navmeshAdd], returns the owner that was given (or `null` if the `owner` parameter was omitted).
   */
  public open fun getClosestPointOwner(toPoint: Vector3): Object? {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CLOSEST_POINT_OWNER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the navigation point closest to the given line segment. When enabling `use_collision`, only considers intersection points between segment and navigation meshes. If multiple intersection points are found, the one closest to the segment start point is returned.
   */
  public open fun getClosestPointToSegment(
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the path between two given points. Points are in local coordinate space. If `optimize` is `true` (the default), the agent properties associated with each [godot.NavigationMesh] (radius, height, etc.) are considered in the path calculation, otherwise they are ignored.
   *
   * **Note:** This method has known issues and will often return non-optimal paths. These issues will be fixed in Godot 4.0.
   */
  public open fun getSimplePath(
    start: Vector3,
    end: Vector3,
    optimize: Boolean = true
  ): PoolVector3Array {
    TransferContext.writeArguments(VECTOR3 to start, VECTOR3 to end, BOOL to optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_SIMPLE_PATH,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Adds a [godot.NavigationMesh]. Returns an ID for use with [navmeshRemove] or [navmeshSetTransform]. If given, a [godot.core.Transform2D] is applied to the polygon. The optional `owner` is used as return value for [getClosestPointOwner].
   */
  public open fun navmeshAdd(
    mesh: NavigationMesh,
    xform: Transform,
    owner: Object? = null
  ): Long {
    TransferContext.writeArguments(OBJECT to mesh, TRANSFORM to xform, OBJECT to owner)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_NAVMESH_ADD, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the [godot.NavigationMesh] with the given ID.
   */
  public open fun navmeshRemove(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_NAVMESH_REMOVE, NIL)
  }

  /**
   * Sets the transform applied to the [godot.NavigationMesh] with the given ID.
   */
  public open fun navmeshSetTransform(id: Long, xform: Transform): Unit {
    TransferContext.writeArguments(LONG to id, TRANSFORM to xform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_NAVMESH_SET_TRANSFORM,
        NIL)
  }
}
