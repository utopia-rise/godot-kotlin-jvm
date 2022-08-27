// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Groups [godot.Room]s together to allow common functionality.
 *
 * Although [godot.Room] behavior can be specified individually, sometimes it is faster and more convenient to write functionality for a group of rooms.
 *
 * [godot.RoomGroup]s should be placed as children of the **room list** (the parent [godot.Node] of your [godot.Room]s), and [godot.Room]s should be placed in turn as children of a [godot.RoomGroup] in order to assign them to the RoomGroup.
 *
 * A [godot.RoomGroup] can for example be used to specify [godot.Room]s that are **outside**, and switch on or off a directional light, sky, or rain effect as the player enters / exits the area.
 *
 * [godot.RoomGroup]s receive **gameplay callbacks** when the `gameplay_monitor` is switched on, as `signal`s or `notification`s as they enter and exit the **gameplay area** (see [godot.RoomManager] for details).
 */
@GodotBaseType
public open class RoomGroup : Spatial() {
  /**
   * This priority will be applied to [godot.Room]s within the group. The [godot.Room] priority allows the use of **internal rooms**, rooms *within* another room or rooms.
   *
   * When the [godot.Camera] is within more than one room (regular and internal), the higher priority room will take precedence. So with for example, a house inside a terrain 'room', you would make the house higher priority, so that when the camera is within the house, the house is used as the source room, but outside the house, the terrain room would be used instead.
   */
  public open var roomgroupPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMGROUP_GET_ROOMGROUP_PRIORITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ROOMGROUP_SET_ROOMGROUP_PRIORITY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ROOMGROUP)
  }
}
