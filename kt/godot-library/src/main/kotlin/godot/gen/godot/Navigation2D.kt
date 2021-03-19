// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * 2D navigation and pathfinding node.
 * 
 * Navigation2D provides navigation and pathfinding within a 2D area, specified as a collection of [godot.NavigationPolygon] resources. By default, these are automatically collected from child [godot.NavigationPolygonInstance] nodes, but they can also be added on the fly with [navpolyAdd].
 */
@GodotBaseType
open class Navigation2D : Node2D() {
  override fun __new() {
    callConstructor(ENGINECLASS_NAVIGATION2D)
  }

  /**
   * Returns the navigation point closest to the point given. Points are in local coordinate space.
   */
  open fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_CLOSEST_POINT,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the owner of the [godot.NavigationPolygon] which contains the navigation point closest to the point given. This is usually a [godot.NavigationPolygonInstance]. For polygons added via [navpolyAdd], returns the owner that was given (or `null` if the `owner` parameter was omitted).
   */
  open fun getClosestPointOwner(toPoint: Vector2): Object? {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_CLOSEST_POINT_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the path between two given points. Points are in local coordinate space. If `optimize` is `true` (the default), the path is smoothed by merging path segments where possible.
   */
  open fun getSimplePath(
    start: Vector2,
    end: Vector2,
    optimize: Boolean = true
  ): PoolVector2Array {
    TransferContext.writeArguments(VECTOR2 to start, VECTOR2 to end, BOOL to optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_GET_SIMPLE_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Adds a [godot.NavigationPolygon]. Returns an ID for use with [navpolyRemove] or [navpolySetTransform]. If given, a [godot.core.Transform2D] is applied to the polygon. The optional `owner` is used as return value for [getClosestPointOwner].
   */
  open fun navpolyAdd(
    mesh: NavigationPolygon,
    xform: Transform2D,
    owner: Object? = null
  ): Long {
    TransferContext.writeArguments(OBJECT to mesh, TRANSFORM2D to xform, OBJECT to owner)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_NAVPOLY_ADD, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the [godot.NavigationPolygon] with the given ID.
   */
  open fun navpolyRemove(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_NAVPOLY_REMOVE, NIL)
  }

  /**
   * Sets the transform applied to the [godot.NavigationPolygon] with the given ID.
   */
  open fun navpolySetTransform(id: Long, xform: Transform2D) {
    TransferContext.writeArguments(LONG to id, TRANSFORM2D to xform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2D_NAVPOLY_SET_TRANSFORM,
        NIL)
  }
}
