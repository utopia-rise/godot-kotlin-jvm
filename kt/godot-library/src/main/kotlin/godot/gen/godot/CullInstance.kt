// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Parent of all nodes that can be culled by the Portal system.
 *
 * Provides common functionality to nodes that can be culled by the [godot.Portal] system.
 *
 * `Static` and `Dynamic` objects are the most efficiently managed objects in the system, but there are some caveats. They are expected to be present initially when [godot.Room]s are converted using the [godot.RoomManager] `rooms_convert` function, and their lifetime should be the same as the game level (i.e. present until you call `rooms_clear` on the [godot.RoomManager]. Although you shouldn't create / delete these objects during gameplay, you can manage their visibility with the standard `hide` and `show` commands.
 *
 * `Roaming` objects on the other hand, require extra processing to keep track of which [godot.Room] they are within. This enables them to be culled effectively, wherever they are.
 *
 * `Global` objects are not culled by the portal system, and use view frustum culling only.
 *
 * Objects that are not `Static` or `Dynamic` can be freely created and deleted during the lifetime of the game level.
 */
@GodotBaseType
public open class CullInstance : Spatial() {
  /**
   * When set to `0`, [godot.CullInstance]s will be autoplaced in the [godot.Room] with the highest priority.
   *
   * When set to a value other than `0`, the system will attempt to autoplace in a [godot.Room] with the `autoplace_priority`, if it is present.
   *
   * This can be used to control autoplacement of building exteriors in an outer [godot.RoomGroup].
   */
  public open var autoplacePriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_GET_AUTOPLACE_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_SET_AUTOPLACE_PRIORITY, NIL)
    }

  /**
   * When a manual bound has not been explicitly specified for a [godot.Room], the convex hull bound will be estimated from the geometry of the objects within the room. This setting determines whether the geometry of an object is included in this estimate of the room bound.
   *
   * **Note:** This setting is only relevant when the object is set to `PORTAL_MODE_STATIC` or `PORTAL_MODE_DYNAMIC`, and for [godot.Portal]s.
   */
  public open var includeInBound: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_GET_INCLUDE_IN_BOUND,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_SET_INCLUDE_IN_BOUND,
          NIL)
    }

  /**
   * When using [godot.Room]s and [godot.Portal]s, this specifies how the [godot.CullInstance] is processed in the system.
   */
  public open var portalMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_GET_PORTAL_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CULLINSTANCE_SET_PORTAL_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CULLINSTANCE)
  }

  public enum class PortalMode(
    id: Long
  ) {
    /**
     * Use for instances within [godot.Room]s that will **not move** - e.g. walls, floors.
     *
     * **Note:** If you attempt to delete a `PORTAL_MODE_STATIC` instance while the room graph is loaded (converted), it will unload the room graph and deactivate portal culling. This is because the **room graph** data has been invalidated. You will need to reconvert the rooms using the [godot.RoomManager] to activate the system again.
     */
    PORTAL_MODE_STATIC(0),
    /**
     * Use for instances within rooms that will move but **not change room** - e.g. moving platforms.
     *
     * **Note:** If you attempt to delete a `PORTAL_MODE_DYNAMIC` instance while the room graph is loaded (converted), it will unload the room graph and deactivate portal culling. This is because the **room graph** data has been invalidated. You will need to reconvert the rooms using the [godot.RoomManager] to activate the system again.
     */
    PORTAL_MODE_DYNAMIC(1),
    /**
     * Use for instances that will move **between** [godot.Room]s - e.g. players.
     */
    PORTAL_MODE_ROAMING(2),
    /**
     * Use for instances that will be frustum culled only - e.g. first person weapon, debug.
     */
    PORTAL_MODE_GLOBAL(3),
    /**
     * Use for instances that will not be shown at all - e.g. **manual room bounds** (specified by prefix *'Bound_'*).
     */
    PORTAL_MODE_IGNORE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Use for instances within rooms that will move but **not change room** - e.g. moving platforms.
     *
     * **Note:** If you attempt to delete a `PORTAL_MODE_DYNAMIC` instance while the room graph is loaded (converted), it will unload the room graph and deactivate portal culling. This is because the **room graph** data has been invalidated. You will need to reconvert the rooms using the [godot.RoomManager] to activate the system again.
     */
    public final const val PORTAL_MODE_DYNAMIC: Long = 1

    /**
     * Use for instances that will be frustum culled only - e.g. first person weapon, debug.
     */
    public final const val PORTAL_MODE_GLOBAL: Long = 3

    /**
     * Use for instances that will not be shown at all - e.g. **manual room bounds** (specified by prefix *'Bound_'*).
     */
    public final const val PORTAL_MODE_IGNORE: Long = 4

    /**
     * Use for instances that will move **between** [godot.Room]s - e.g. players.
     */
    public final const val PORTAL_MODE_ROAMING: Long = 2

    /**
     * Use for instances within [godot.Room]s that will **not move** - e.g. walls, floors.
     *
     * **Note:** If you attempt to delete a `PORTAL_MODE_STATIC` instance while the room graph is loaded (converted), it will unload the room graph and deactivate portal culling. This is because the **room graph** data has been invalidated. You will need to reconvert the rooms using the [godot.RoomManager] to activate the system again.
     */
    public final const val PORTAL_MODE_STATIC: Long = 0
  }
}
