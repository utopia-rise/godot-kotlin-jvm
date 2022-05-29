// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import kotlin.Suppress
import kotlin.Unit

/**
 * Convex polygon shape for 2D physics.
 *
 * Convex polygon shape for 2D physics. A convex polygon, whatever its shape, is internally decomposed into as many convex polygons as needed to ensure all collision checks against it are always done on convex polygons (which are faster to check).
 *
 * The main difference between a [godot.ConvexPolygonShape2D] and a [godot.ConcavePolygonShape2D] is that a concave polygon assumes it is concave and uses a more complex method of collision detection, and a convex one forces itself to be convex in order to speed up collision detection.
 */
@GodotBaseType
public open class ConvexPolygonShape2D : Shape2D() {
  /**
   * The polygon's list of vertices. Can be in either clockwise or counterclockwise order. Only set this property with convex hull points, use [setPointCloud] to generate a convex hull shape from concave shape points.
   */
  public open var points: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_GET_POINTS,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINTS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE2D)
  }

  /**
   * Based on the set of points provided, this creates and assigns the [points] property using the convex hull algorithm. Removing all unneeded points. See [godot.Geometry.convexHull2d] for details.
   */
  public open fun setPointCloud(pointCloud: PoolVector2Array): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to pointCloud)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE2D_SET_POINT_CLOUD, NIL)
  }
}
