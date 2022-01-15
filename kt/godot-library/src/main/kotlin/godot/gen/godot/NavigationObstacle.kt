// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * 3D obstacle used in navigation for collision avoidance.
 *
 * 3D obstacle used in navigation for collision avoidance. The obstacle needs navigation data to work correctly. This can be done by having the obstacle as a child of a [godot.Navigation] node, or using [setNavigation]. [godot.NavigationObstacle] is physics safe.
 */
@GodotBaseType
public open class NavigationObstacle : Node() {
  /**
   * Enables radius estimation algorithm which uses parent's collision shapes to determine the obstacle radius.
   */
  public open var estimateRadius: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_GET_ESTIMATE_RADIUS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_SET_ESTIMATE_RADIUS, NIL)
    }

  /**
   * The radius of the agent. Used only if [estimateRadius] is set to `false`.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_SET_RADIUS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONOBSTACLE)
  }

  /**
   * Returns the [godot.Navigation] node that the obstacle is using for its navigation system.
   */
  public open fun getNavigation(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_GET_NAVIGATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Sets the [godot.Navigation] node used by the obstacle. Useful when you don't want to make the obstacle a child of a [godot.Navigation] node.
   */
  public open fun setNavigation(navigation: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE_SET_NAVIGATION,
        NIL)
  }
}
