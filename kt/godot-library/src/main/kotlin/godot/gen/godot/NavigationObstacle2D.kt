// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D Obstacle used in navigation for collision avoidance.
 *
 * 2D Obstacle used in navigation for collision avoidance. The obstacle needs navigation data to work correctly. [godot.NavigationObstacle2D] is physics safe.
 */
@GodotBaseType
public open class NavigationObstacle2D : Node() {
  /**
   * Enables radius estimation algorithm which uses parent's collision shapes to determine the obstacle radius.
   */
  public open var estimateRadius: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE2D_GET_ESTIMATE_RADIUS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE2D_SET_ESTIMATE_RADIUS, NIL)
    }

  /**
   * The radius of the agent. Used only if [estimateRadius] is set to false.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE2D_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE2D_SET_RADIUS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONOBSTACLE2D)
  }

  public companion object
}
