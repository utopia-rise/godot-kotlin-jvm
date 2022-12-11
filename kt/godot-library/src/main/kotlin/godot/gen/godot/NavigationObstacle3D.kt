// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * 3D Obstacle used in navigation for collision avoidance.
 *
 * 3D Obstacle used in navigation for collision avoidance. The obstacle needs navigation data to work correctly. [godot.NavigationObstacle3D] is physics safe.
 *
 * Obstacles **don't** change the resulting path from the pathfinding, they only affect the navigation agent movement in a radius. Therefore, using obstacles for the static walls in your level won't work because those walls don't exist in the pathfinding. The navigation agent will be pushed in a semi-random direction away while moving inside that radius. Obstacles are intended as a last resort option for constantly moving objects that cannot be (re)baked to a navigation mesh efficiently.
 */
@GodotBaseType
public open class NavigationObstacle3D : Node() {
  /**
   * Enables radius estimation algorithm which uses parent's collision shapes to determine the obstacle radius.
   */
  public var estimateRadius: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE3D_IS_RADIUS_ESTIMATED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE3D_SET_ESTIMATE_RADIUS, NIL)
    }

  /**
   * The radius of the agent. Used only if [estimateRadius] is set to false.
   */
  public var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE3D_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONOBSTACLE3D_SET_RADIUS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONOBSTACLE3D, scriptIndex)
    return true
  }

  public companion object
}
