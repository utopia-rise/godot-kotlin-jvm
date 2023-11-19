// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * The origin point in AR/VR.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/xr/index.html]($DOCS_URL/tutorials/xr/index.html)
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
  public var worldScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWorldScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWorldScalePtr, NIL)
    }

  /**
   * Is this XROrigin3D node the current origin used by the [godot.XRServer]?
   */
  public var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRORIGIN3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XROrigin3D", "set_world_scale")

    public val getWorldScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XROrigin3D", "get_world_scale")

    public val setCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("XROrigin3D", "set_current")

    public val isCurrentPtr: VoidPtr = TypeManager.getMethodBindPtr("XROrigin3D", "is_current")
  }
}
