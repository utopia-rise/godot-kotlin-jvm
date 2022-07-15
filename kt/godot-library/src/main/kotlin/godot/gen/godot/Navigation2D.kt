// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D navigation and pathfinding node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/117](https://godotengine.org/asset-library/asset/117)
 *
 * *Deprecated.* [godot.Navigation2D] node and [getSimplePath] are deprecated and will be removed in a future version. Use [godot.Navigation2DServer.mapGetPath] instead.
 *
 * Navigation2D provides navigation and pathfinding within a 2D area, specified as a collection of [godot.NavigationPolygon] resources. By default, these are automatically collected from child [godot.NavigationPolygonInstance] nodes.
 */
@GodotBaseType
public open class Navigation2D : Node2D() {
  /**
   * The XY plane cell size to use for fields.
   */
  public open var cellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_CELL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_SET_CELL_SIZE, NIL)
    }

  /**
   * This value is used to detect the near edges to connect compatible regions.
   */
  public open var edgeConnectionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_SET_EDGE_CONNECTION_MARGIN, NIL)
    }

  /**
   * A bitfield determining all navigation map layers the navigation can use on a [godot.Navigation2D.getSimplePath] path query.
   */
  public open var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_SET_NAVIGATION_LAYERS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATION2D)
  }

  /**
   * Returns the navigation point closest to the point given. Points are in local coordinate space.
   */
  public open fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_CLOSEST_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the owner of the [godot.NavigationPolygon] which contains the navigation point closest to the point given. This is usually a [godot.NavigationPolygonInstance].
   */
  public open fun getClosestPointOwner(toPoint: Vector2): RID {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_CLOSEST_POINT_OWNER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the object's [RID].
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * *Deprecated.* [godot.Navigation2D] node and [getSimplePath] are deprecated and will be removed in a future version. Use [godot.Navigation2DServer.mapGetPath] instead.
   *
   * Returns the path between two given points. Points are in local coordinate space. If `optimize` is `true` (the default), the path is smoothed by merging path segments where possible.
   */
  public open fun getSimplePath(
    start: Vector2,
    end: Vector2,
    optimize: Boolean = true
  ): PoolVector2Array {
    TransferContext.writeArguments(VECTOR2 to start, VECTOR2 to end, BOOL to optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_SIMPLE_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }
}
