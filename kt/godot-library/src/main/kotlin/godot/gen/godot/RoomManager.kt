// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * The RoomManager node is used to control the portal culling system.
 *
 * In order to utilize the portal occlusion culling system, you must build your level using [godot.Room]s and [godot.Portal]s. Before these can be used at runtime, they must undergo a short conversion process to build the `room graph`, runtime data needed for portal culling. The `room graph` is controlled by the [godot.RoomManager] node, and the [godot.RoomManager] also contains settings that are common throughout the portal system.
 */
@GodotBaseType
public open class RoomManager : Spatial() {
  /**
   * Switches the portal culling system on and off.
   *
   * It is important to note that when portal culling is active, it is responsible for **all** the 3d culling. Some editor functionality may be more difficult to use, so switching the active flag is intended to be used to make sure your [godot.Room] / [godot.Portal] layout works within the editor.
   *
   * Switching to `active` will have no effect when the `room graph` is unloaded (the rooms have not yet been converted).
   */
  public open var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_ACTIVE, NIL)
    }

  /**
   * Large objects can 'sprawl' over (be present in) more than one room. It can be useful to visualize which objects are sprawling outside the current room.
   *
   * Toggling this setting turns this debug view on and off.
   */
  public open var debugSprawl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_DEBUG_SPRAWL,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_DEBUG_SPRAWL, NIL)
    }

  /**
   * Usually we don't want objects that only **just** cross a boundary into an adjacent [godot.Room] to sprawl into that room. To prevent this, each [godot.Portal] has an extra margin, or tolerance zone where objects can enter without sprawling to a neighbouring room.
   *
   * In most cases you can set this here for all portals. It is possible to override the margin for each portal.
   */
  public open var defaultPortalMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_DEFAULT_PORTAL_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_DEFAULT_PORTAL_MARGIN, NIL)
    }

  /**
   * When using a partial or full PVS, the gameplay monitor allows you to receive callbacks when roaming objects or rooms enter or exit the **gameplay area**. The gameplay area is defined as either the primary, or secondary PVS.
   *
   * These callbacks allow you to, for example, reduce processing for objects that are far from the player, or turn on and off AI.
   *
   * You can either choose to receive callbacks as notifications through the `_notification` function, or as signals.
   *
   * `NOTIFICATION_ENTER_GAMEPLAY`
   *
   * `NOTIFICATION_EXIT_GAMEPLAY`
   *
   * Signals: `"gameplay_entered"`, `"gameplay_exited"`
   */
  public open var gameplayMonitor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_GAMEPLAY_MONITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_GAMEPLAY_MONITOR,
          NIL)
    }

  /**
   * If enabled, the system will attempt to merge similar meshes (particularly in terms of materials) within [godot.Room]s during conversion. This can significantly reduce the number of drawcalls and state changes required during rendering, albeit at a cost of reduced culling granularity.
   *
   * **Note:** This operates at runtime during the conversion process, and will only operate on exported or running projects, in order to prevent accidental alteration to the scene and loss of data.
   */
  public open var mergeMeshes: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_MERGE_MESHES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_MERGE_MESHES, NIL)
    }

  /**
   * When converting rooms, the editor will warn you if overlap is detected between rooms. Overlap can interfere with determining the room that cameras and objects are within. A small amount can be acceptable, depending on your level. Here you can alter the threshold at which the editor warning appears. There are no other side effects.
   */
  public open var overlapWarningThreshold: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_OVERLAP_WARNING_THRESHOLD, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_OVERLAP_WARNING_THRESHOLD, NIL)
    }

  /**
   * Portal rendering is recursive - each time a portal is seen through an earlier portal there is some cost. For this reason, and to prevent the possibility of infinite loops, this setting provides a hard limit on the recursion depth.
   *
   * **Note:** This value is unused when using `Full` PVS mode.
   */
  public open var portalDepthLimit: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_PORTAL_DEPTH_LIMIT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_PORTAL_DEPTH_LIMIT, NIL)
    }

  /**
   * Portal culling normally operates using the current [godot.Camera] / [godot.Camera]s, however for debugging purposes within the editor, you can use this setting to override this behaviour and force it to use a particular camera to get a better idea of what the occlusion culling is doing.
   */
  public open var previewCamera: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_PREVIEW_CAMERA,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_PREVIEW_CAMERA,
          NIL)
    }

  /**
   * Optionally during conversion the potentially visible set (PVS) of rooms that are potentially visible from each room can be calculated. This can be used either to aid in dynamic portal culling, or to totally replace portal culling.
   *
   * In `Full` PVS Mode, all objects within the potentially visible rooms will be frustum culled, and rendered if they are within the view frustum.
   */
  public open var pvsMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_PVS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_PVS_MODE, NIL)
    }

  /**
   * In order to reduce processing for roaming objects, an expansion is applied to their AABB as they move. This expanded volume is used to calculate which rooms the roaming object is within. If the object's exact AABB is still within this expanded volume on the next move, there is no need to reprocess the object, which can save considerable CPU.
   *
   * The downside is that if the expansion is too much, the object may end up unexpectedly sprawling into neighbouring rooms and showing up where it might otherwise be culled.
   *
   * In order to balance roaming performance against culling accuracy, this expansion margin can be customized by the user. It will typically depend on your room and object sizes, and movement speeds. The default value should work reasonably in most circumstances.
   */
  public open var roamingExpansionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_ROAMING_EXPANSION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_ROAMING_EXPANSION_MARGIN, NIL)
    }

  /**
   * During the conversion process, the geometry of objects within [godot.Room]s, or a custom specified manual bound, are used to generate a **convex hull bound**.
   *
   * This convex hull is **required** in the visibility system, and is used for many purposes. Most importantly, it is used to decide whether the [godot.Camera] (or an object) is within a [godot.Room]. The convex hull generating algorithm is good, but occasionally it can create too many (or too few) planes to give a good representation of the room volume.
   *
   * The `room_simplify` value can be used to gain fine control over this process. It determines how similar planes can be for them to be considered the same (and duplicates removed). The value can be set between 0 (no simplification) and 1 (maximum simplification).
   *
   * The value set here is the default for all rooms, but individual rooms can override this value if desired.
   *
   * The room convex hulls are shown as a wireframe in the editor.
   */
  public open var roomSimplify: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_ROOM_SIMPLIFY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_ROOM_SIMPLIFY,
          NIL)
    }

  /**
   * For the [godot.Room] conversion process to succeed, you must point the [godot.RoomManager] to the parent [godot.Node] of your [godot.Room]s and [godot.RoomGroup]s, which we refer to as the `roomlist` (the roomlist is not a special node type, it is normally just a [godot.Spatial]).
   */
  public open var roomlist: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_ROOMLIST,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_ROOMLIST, NIL)
    }

  /**
   * Shows the [godot.Portal] margins when the portal gizmo is used in the editor.
   */
  public open var showMargins: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_SHOW_MARGINS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_SHOW_MARGINS, NIL)
    }

  /**
   * When receiving gameplay callbacks when objects enter and exit gameplay, the **gameplay area** can be defined by either the primary PVS (potentially visible set) of [godot.Room]s, or the secondary PVS (the primary PVS and their neighbouring [godot.Room]s).
   *
   * Sometimes using the larger gameplay area of the secondary PVS may be preferable.
   */
  public open var useSecondaryPvs: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_GET_USE_SECONDARY_PVS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_SET_USE_SECONDARY_PVS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ROOMMANAGER)
  }

  /**
   * This function clears all converted data from the **room graph**. Use this before unloading a level, when transitioning from level to level, or returning to a main menu.
   */
  public open fun roomsClear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_ROOMS_CLEAR, NIL)
  }

  /**
   * This is the most important function in the whole portal culling system. Without it, the system cannot function.
   *
   * First it goes through every [godot.Room] that is a child of the `room list` node (and [godot.RoomGroup]s within) and converts and adds it to the `room graph`.
   *
   * This works for both [godot.Room] nodes, and [godot.Spatial] nodes that follow a special naming convention. They should begin with the prefix *'Room_'*, followed by the name you wish to give the room, e.g. *'Room_lounge'*. This will automatically convert such [godot.Spatial]s to [godot.Room] nodes for you. This is useful if you want to build you entire room system in e.g. Blender, and reimport multiple times as you work on the level.
   *
   * The conversion will try to assign [godot.VisualInstance]s that are children and grandchildren of the [godot.Room] to the room. These should be given a suitable `portal mode` (see the [godot.CullInstance] documentation). The default `portal mode` is `STATIC` - objects which are not expected to move while the level is played, which will typically be most objects.
   *
   * The conversion will usually use the geometry of these [godot.VisualInstance]s (and the [godot.Portal]s) to calculate a convex hull bound for the room. These bounds will be shown in the editor with a wireframe. Alternatively you can specify a manual custom bound for any room, see the [godot.Room] documentation.
   *
   * By definition, [godot.Camera]s within a room can see everything else within the room (that is one advantage to using convex hulls). However, in order to see from one room into adjacent rooms, you must place [godot.Portal]s, which represent openings that the camera can see through, like windows and doors.
   *
   * [godot.Portal]s are really just specialized [godot.MeshInstance]s. In fact you will usually first create a portal by creating a [godot.MeshInstance], especially a `plane` mesh instance. You would move the plane in the editor to cover a window or doorway, with the front face pointing outward from the room. To let the conversion process know you want this mesh to be a portal, again we use a special naming convention. [godot.MeshInstance]s to be converted to a [godot.Portal] should start with the prefix *'Portal_'*.
   *
   * You now have a choice - you can leave the name as *'Portal_'* and allow the system to automatically detect the nearest [godot.Room] to link. In most cases this will work fine.
   *
   * An alternative method is to specify the [godot.Room] to link to manually, appending a suffix to the portal name, which should be the name of the room you intend to link to. For example *'Portal_lounge'* will attempt to link to the room named *'Room_lounge'*.
   *
   * There is a special case here - Godot does not allow two nodes to share the same name. What if you want to manually have more than one portal leading into the same room? Surely they will need to both be called, e.g. *'Portal_lounge'*?
   *
   * The solution is a wildcard character. After the room name, if you use the character *'*'*, this character and anything following it will be ignored. So you can use for example *'Portal_lounge*0'*, *'Portal_lounge*1'* etc.
   *
   * Note that [godot.Portal]s that have already been converted to [godot.Portal] nodes (rather than [godot.MeshInstance]s) still need to follow the same naming convention, as they will be relinked each time during conversion.
   *
   * It is recommended that you only place objects in rooms that are desired to stay within those rooms - i.e. `portal mode`s `STATIC` or `DYNAMIC` (not crossing portals). `GLOBAL` and `ROAMING` objects are best placed in another part of the scene tree, to avoid confusion. See [godot.CullInstance] for a full description of portal modes.
   */
  public open fun roomsConvert(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMMANAGER_ROOMS_CONVERT, NIL)
  }

  public enum class PVSMode(
    id: Long
  ) {
    /**
     * Use only [godot.Portal]s at runtime to determine visibility. PVS will not be generated at [godot.Room]s conversion, and gameplay notifications cannot be used.
     */
    PVS_MODE_DISABLED(0),
    /**
     * Use a combination of PVS and [godot.Portal]s to determine visibility (this is usually fastest and most accurate).
     */
    PVS_MODE_PARTIAL(1),
    /**
     * Use only the PVS (potentially visible set) of [godot.Room]s to determine visibility.
     */
    PVS_MODE_FULL(2),
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
     * Use only [godot.Portal]s at runtime to determine visibility. PVS will not be generated at [godot.Room]s conversion, and gameplay notifications cannot be used.
     */
    public final const val PVS_MODE_DISABLED: Long = 0

    /**
     * Use only the PVS (potentially visible set) of [godot.Room]s to determine visibility.
     */
    public final const val PVS_MODE_FULL: Long = 2

    /**
     * Use a combination of PVS and [godot.Portal]s to determine visibility (this is usually fastest and most accurate).
     */
    public final const val PVS_MODE_PARTIAL: Long = 1
  }
}
