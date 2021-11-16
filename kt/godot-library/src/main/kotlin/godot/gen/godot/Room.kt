// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Room node, used to group objects together locally for [godot.Portal] culling.
 *
 * The [godot.Portal] culling system requires levels to be built using objects grouped together by location in areas called [godot.Room]s. In many cases these will correspond to actual rooms in buildings, but not necessarily (a canyon area may be treated as a room).
 *
 * Any [godot.VisualInstance] that is a child or grandchild of a [godot.Room] will be assigned to that room, if the `portal_mode` of that [godot.VisualInstance] is set to `STATIC` (does not move) or `DYNAMIC` (moves only within the room).
 *
 * Internally the room boundary must form a **convex hull**, and by default this is determined automatically by the geometry of the objects you place within the room.
 *
 * You can alternatively precisely specify a **manual bound**. If you place a [godot.MeshInstance] with a name prefixed by `Bound_`, it will turn off the bound generation from geometry, and instead use the vertices of this MeshInstance to directly calculate a convex hull during the conversion stage (see [godot.RoomManager]).
 *
 * In order to see from one room into an adjacent room, [godot.Portal]s must be placed over non-occluded openings between rooms. These will often be placed over doors and windows.
 */
@GodotBaseType
public open class Room : Spatial() {
  /**
   * If `points` are set, the [godot.Room] bounding convex hull will be built from these points. If no points are set, the room bound will either be derived from a manual bound ([godot.MeshInstance] with name prefix `Bound_`), or from the geometry within the room.
   *
   * Note that you can use the `Generate Points` editor button to get started. This will use either the geometry or manual bound to generate the room hull, and save the resulting points, allowing you to edit them to further refine the bound.
   */
  public open var points: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_GET_POINTS,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_SET_POINTS, NIL)
    }

  /**
   * The `simplify` value determines to what degree room hulls (bounds) are simplified, by removing similar planes. A value of 0 gives no simplification, 1 gives maximum simplification.
   */
  public open var roomSimplify: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_GET_ROOM_SIMPLIFY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_SET_ROOM_SIMPLIFY, NIL)
    }

  /**
   * The room hull simplification can either use the default value set in the [godot.RoomManager], or override this and use the per room setting.
   */
  public open var useDefaultSimplify: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_GET_USE_DEFAULT_SIMPLIFY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_SET_USE_DEFAULT_SIMPLIFY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ROOM)
  }

  /**
   * Sets individual points. Primarily for use by the editor.
   */
  public open fun setPoint(index: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to index, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOM_SET_POINT, NIL)
  }
}
