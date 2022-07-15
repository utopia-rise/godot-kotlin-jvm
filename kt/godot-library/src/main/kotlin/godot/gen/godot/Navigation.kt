// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Mesh-based navigation and pathfinding node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/124](https://godotengine.org/asset-library/asset/124)
 *
 * *Deprecated.* [godot.Navigation] node and [getSimplePath] are deprecated and will be removed in a future version. Use [godot.NavigationServer.mapGetPath] instead.
 *
 * Provides navigation and pathfinding within a collection of [godot.NavigationMesh]es. By default, these will be automatically collected from child [godot.NavigationMeshInstance] nodes. In addition to basic pathfinding, this class also assists with aligning navigation agents with the meshes they are navigating on.
 */
@GodotBaseType
public open class Navigation : Spatial() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  public val mapChanged: Signal1<RID> by signal("map")

  /**
   * The cell height to use for fields.
   */
  public open var cellHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CELL_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_SET_CELL_HEIGHT, NIL)
    }

  /**
   * The XZ plane cell size to use for fields.
   */
  public open var cellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CELL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_SET_CELL_SIZE, NIL)
    }

  /**
   * This value is used to detect the near edges to connect compatible regions.
   */
  public open var edgeConnectionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION_SET_EDGE_CONNECTION_MARGIN, NIL)
    }

  /**
   * A bitfield determining all navigation map layers the navigation can use on a [godot.Navigation.getSimplePath] path query.
   */
  public open var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_NAVIGATION_LAYERS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_SET_NAVIGATION_LAYERS,
          NIL)
    }

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
   * Returns the owner of the [godot.NavigationMesh] which contains the navigation point closest to the point given. This is usually a [godot.NavigationMeshInstance].
   */
  public open fun getClosestPointOwner(toPoint: Vector3): RID {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_CLOSEST_POINT_OWNER,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
   * Returns the [RID] of the navigation map on the [godot.NavigationServer].
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * *Deprecated.* [godot.Navigation] node and [getSimplePath] are deprecated and will be removed in a future version. Use [godot.NavigationServer.mapGetPath] instead.
   *
   * Returns the path between two given points. Points are in local coordinate space. If `optimize` is `true` (the default), the agent properties associated with each [godot.NavigationMesh] (radius, height, etc.) are considered in the path calculation, otherwise they are ignored.
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
}
