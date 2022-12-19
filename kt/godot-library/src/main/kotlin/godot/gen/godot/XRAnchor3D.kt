// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * An anchor point in AR space.
 *
 * The [godot.XRAnchor3D] point is a spatial node that maps a real world location identified by the AR platform to a position within the game world. For example, as long as plane detection in ARKit is on, ARKit will identify and update the position of planes (tables, floors, etc) and create anchors for them.
 *
 * This node is mapped to one of the anchors through its unique ID. When you receive a signal that a new anchor is available, you should add this node to your scene for that anchor. You can predefine nodes and set the ID; the nodes will simply remain on 0,0,0 until a plane is recognized.
 *
 * Keep in mind that, as long as plane detection is enabled, the size, placing and orientation of an anchor will be updated as the detection logic learns more about the real world out there especially if only part of the surface is in view.
 */
@GodotBaseType
public open class XRAnchor3D : XRNode3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRANCHOR3D, scriptIndex)
    return true
  }

  /**
   * Returns the estimated size of the plane that was detected. Say when the anchor relates to a table in the real world, this is the estimated size of the surface of that table.
   */
  public fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRANCHOR3D_GET_SIZE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns a plane aligned with our anchor; handy for intersection testing.
   */
  public fun getPlane(): Plane {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRANCHOR3D_GET_PLANE, PLANE)
    return TransferContext.readReturnValue(PLANE, false) as Plane
  }

  public companion object
}
