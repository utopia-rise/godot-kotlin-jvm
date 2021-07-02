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
 * Concave polygon 2D shape resource for physics.
 *
 * Concave polygon 2D shape resource for physics. It is made out of segments and is optimal for complex polygonal concave collisions. However, it is not advised to use for [godot.RigidBody2D] nodes. A CollisionPolygon2D in convex decomposition mode (solids) or several convex objects are advised for that instead. Otherwise, a concave polygon 2D shape is better for static collisions.
 *
 * The main difference between a [godot.ConvexPolygonShape2D] and a [godot.ConcavePolygonShape2D] is that a concave polygon assumes it is concave and uses a more complex method of collision detection, and a convex one forces itself to be convex in order to speed up collision detection.
 */
@GodotBaseType
public open class ConcavePolygonShape2D : Shape2D() {
  /**
   * The array of points that make up the [godot.ConcavePolygonShape2D]'s line segments.
   */
  public open var segments: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_GET_SEGMENTS, POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE2D_SET_SEGMENTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE2D)
  }
}
