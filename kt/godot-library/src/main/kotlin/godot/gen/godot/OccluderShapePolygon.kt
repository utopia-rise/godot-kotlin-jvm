// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Polygon occlusion primitive for use with the [godot.Occluder] node.
 *
 * [godot.OccluderShape]s are resources used by [godot.Occluder] nodes, allowing geometric occlusion culling.
 *
 * The polygon must be a convex polygon. The polygon points can be created and deleted either in the Editor inspector or by calling `set_polygon_points`. The points of the edges can be set by dragging the handles in the Editor viewport.
 *
 * Additionally each polygon occluder can optionally support a single hole. If you add at least three points in the Editor inspector to the hole, you can drag the edge points of the hole in the Editor viewport.
 *
 * In general, the lower the number of edges in polygons and holes, the faster the system will operate at runtime, so in most cases you will want to use 4 points for each.
 */
@GodotBaseType
public open class OccluderShapePolygon : OccluderShape() {
  /**
   * Allows changing the hole geometry from code.
   */
  public open var holePoints: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_GET_HOLE_POINTS, POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_SET_HOLE_POINTS, NIL)
    }

  /**
   * Allows changing the polygon geometry from code.
   */
  public open var polygonPoints: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_GET_POLYGON_POINTS, POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_SET_POLYGON_POINTS, NIL)
    }

  /**
   * Specifies whether the occluder should operate from both sides. If `false`, the occluder will operate one way only.
   */
  public open var twoWay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_GET_TWO_WAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_SET_TWO_WAY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDERSHAPEPOLYGON)
  }

  /**
   * Sets an individual hole point position.
   */
  public open fun setHolePoint(index: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to index, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_SET_HOLE_POINT,
        NIL)
  }

  /**
   * Sets an individual polygon point position.
   */
  public open fun setPolygonPoint(index: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to index, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OCCLUDERSHAPEPOLYGON_SET_POLYGON_POINT, NIL)
  }
}
