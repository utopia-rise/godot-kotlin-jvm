// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * An anchor point in AR space.
 *
 * The [godot.ARVRAnchor] point is a spatial node that maps a real world location identified by the AR platform to a position within the game world. For example, as long as plane detection in ARKit is on, ARKit will identify and update the position of planes (tables, floors, etc) and create anchors for them.
 *
 * This node is mapped to one of the anchors through its unique ID. When you receive a signal that a new anchor is available, you should add this node to your scene for that anchor. You can predefine nodes and set the ID; the nodes will simply remain on 0,0,0 until a plane is recognized.
 *
 * Keep in mind that, as long as plane detection is enabled, the size, placing and orientation of an anchor will be updated as the detection logic learns more about the real world out there especially if only part of the surface is in view.
 */
@GodotBaseType
open class ARVRAnchor : Spatial() {
  /**
   * Emitted when the mesh associated with the anchor changes or when one becomes available. This is especially important for topology that is constantly being `mesh_updated`.
   */
  val meshUpdated: Signal1<Mesh> by signal("mesh")

  /**
   * The anchor's ID. You can set this before the anchor itself exists. The first anchor gets an ID of `1`, the second an ID of `2`, etc. When anchors get removed, the engine can then assign the corresponding ID to new anchors. The most common situation where anchors "disappear" is when the AR server identifies that two anchors represent different parts of the same plane and merges them.
   */
  open var anchorId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_ANCHOR_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_SET_ANCHOR_ID, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ARVRANCHOR)
  }

  /**
   * Returns the name given to this anchor.
   */
  open fun getAnchorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_ANCHOR_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the anchor is being tracked and `false` if no anchor with this ID is currently known.
   */
  open fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If provided by the [godot.ARVRInterface], this returns a mesh object for the anchor. For an anchor, this can be a shape related to the object being tracked or it can be a mesh that provides topology related to the anchor and can be used to create shadows/reflections on surfaces or for generating collision shapes.
   */
  open fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns a plane aligned with our anchor; handy for intersection testing.
   */
  open fun getPlane(): Plane {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_PLANE, PLANE)
    return TransferContext.readReturnValue(PLANE, false) as Plane
  }

  /**
   * Returns the estimated size of the plane that was detected. Say when the anchor relates to a table in the real world, this is the estimated size of the surface of that table.
   */
  open fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRANCHOR_GET_SIZE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }
}
