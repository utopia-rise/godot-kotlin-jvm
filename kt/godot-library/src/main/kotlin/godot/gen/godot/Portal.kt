// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Portal nodes are used to enable visibility between [godot.Room]s.
 *
 * [godot.Portal]s are a special type of [godot.MeshInstance] that allow the portal culling system to 'see' from one room to the next. They often correspond to doors and windows in level geometry. By only allowing [godot.Camera]s to see through portals, this allows the system to cull out all the objects in rooms that cannot be seen through portals. This is a form of **occlusion culling**, and can greatly increase performance.
 *
 * There are some limitations to the form of portals:
 *
 * They must be single sided convex polygons, and usually you would orientate their front faces **outward** from the [godot.Room] they are placed in. The vertices should be positioned on a single plane (although their positioning does not have to be perfect).
 *
 * There is no need to place an opposite portal in an adjacent room, links are made two-way automatically.
 */
@GodotBaseType
public open class Portal : Spatial() {
  /**
   * This is a shortcut for setting the linked [godot.Room] in the name of the [godot.Portal] (the name is used during conversion).
   */
  public open var linkedRoom: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_LINKED_ROOM, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_LINKED_ROOM, NIL)
    }

  /**
   * The points defining the shape of the [godot.Portal] polygon (which should be convex).
   *
   * These are defined in 2D, with `0,0` being the origin of the [godot.Portal] node's [godot.Spatial.globalTransform].
   *
   * **Note:** These raw points are sanitized for winding order internally.
   */
  public open var points: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_POINTS,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_POINTS, NIL)
    }

  /**
   * Visibility through [godot.Portal]s can be turned on and off at runtime - this is useful for having closable doors.
   */
  public open var portalActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_PORTAL_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_PORTAL_ACTIVE, NIL)
    }

  /**
   * Some objects are so big that they may be present in more than one [godot.Room] ('sprawling'). As we often don't want objects that *just* breach the edges to be assigned to neighbouring rooms, you can assign an extra margin through the [godot.Portal] to allow objects to breach without sprawling.
   */
  public open var portalMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_PORTAL_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_PORTAL_MARGIN, NIL)
    }

  /**
   * Portals default to being two way - see through in both directions, however you can make them one way, visible from the source room only.
   */
  public open var twoWay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_TWO_WAY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_TWO_WAY, NIL)
    }

  /**
   * In most cases you will want to use the default [godot.Portal] margin in your portals (this is set in the [godot.RoomManager]).
   *
   * If you want to override this default, set this value to `false`, and the local [portalMargin] will take effect.
   */
  public open var useDefaultMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_GET_USE_DEFAULT_MARGIN,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_USE_DEFAULT_MARGIN,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PORTAL)
  }

  /**
   * Sets individual points. Primarily for use by the editor.
   */
  public open fun setPoint(index: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to index, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PORTAL_SET_POINT, NIL)
  }
}
