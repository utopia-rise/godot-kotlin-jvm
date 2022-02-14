// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * The origin point in AR/VR.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/vr/index.html]($DOCS_URL/tutorials/vr/index.html)
 *
 * This is a special node within the AR/VR system that maps the physical location of the center of our tracking space to the virtual location within our game world.
 *
 * There should be only one of these nodes in your scene and you must have one. All the XRCamera3D, XRController3D and XRAnchor3D nodes should be direct children of this node for spatial tracking to work correctly.
 *
 * It is the position of this node that you update when your character needs to move through your game world while we're not moving in the real world. Movement in the real world is always in relation to this origin point.
 *
 * For example, if your character is driving a car, the XROrigin3D node should be a child node of this car. Or, if you're implementing a teleport system to move your character, you should change the position of this node.
 */
@GodotBaseType
public open class XROrigin3D : Node3D() {
  /**
   * Allows you to adjust the scale to your game's units. Most AR/VR platforms assume a scale of 1 game world unit = 1 real world meter.
   *
   * **Note:** This method is a passthrough to the [godot.XRServer] itself.
   */
  public open var worldScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRORIGIN3D_GET_WORLD_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRORIGIN3D_SET_WORLD_SCALE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_XRORIGIN3D)
  }

  public companion object
}
