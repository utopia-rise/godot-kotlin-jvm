// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Allows [godot.OccluderShape]s to be used for occlusion culling.
 *
 * [godot.Occluder]s that are placed within your scene will automatically cull objects that are hidden from view by the occluder. This can increase performance by decreasing the amount of objects drawn.
 *
 * [godot.Occluder]s are totally dynamic, you can move them as you wish. This means you can for example, place occluders on a moving spaceship, and have it occlude objects as it flies past.
 *
 * You can place a large number of [godot.Occluder]s within a scene. As it would be counterproductive to cull against hundreds of occluders, the system will automatically choose a selection of these for active use during any given frame, based a screen space metric. Larger occluders are favored, as well as those close to the camera. Note that a small occluder close to the camera may be a better occluder in terms of screen space than a large occluder far in the distance.
 *
 * The type of occlusion primitive is determined by the [godot.OccluderShape] that you add to the [godot.Occluder]. Some [godot.OccluderShape]s may allow more than one primitive in a single, node, for greater efficiency.
 *
 * Although [godot.Occluder]s work in general use, they also become even more powerful when used in conjunction with the portal system. Occluders are placed in rooms (based on their origin), and can block portals (and thus entire rooms) as well as objects from rendering.
 */
@GodotBaseType
public open class Occluder : Spatial() {
  /**
   *
   */
  public open var shape: OccluderShape?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDER_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as OccluderShape?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDER_SET_SHAPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDER)
  }

  /**
   *
   */
  public open fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDER_RESOURCE_CHANGED, NIL)
  }
}
