// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all 3D shape resources.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/physics_introduction.html]($DOCS_URL/tutorials/physics/physics_introduction.html)
 *
 * Base class for all 3D shape resources. Nodes that inherit from this can be used as shapes for a [godot.PhysicsBody3D] or [godot.Area3D] objects.
 */
@GodotBaseType
public open class Shape3D internal constructor() : Resource() {
  /**
   * The shape's custom solver bias. Defines how much bodies react to enforce contact separation when this shape is involved.
   *
   * When set to `0`, the default value from [godot.ProjectSettings.physics/3d/solver/defaultContactBias] is used.
   */
  public var customSolverBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE3D_GET_CUSTOM_SOLVER_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE3D_SET_CUSTOM_SOLVER_BIAS,
          NIL)
    }

  /**
   * The collision margin for the shape. Used in Bullet Physics only.
   *
   * Collision margins allow collision detection to be more efficient by adding an extra shell around shapes. Collision algorithms are more expensive when objects overlap by more than their margin, so a higher value for margins is better for performance, at the cost of accuracy around edges as it makes them less sharp.
   */
  public var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE3D_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE3D_SET_MARGIN, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHAPE3D)
  }

  /**
   * Returns the [godot.ArrayMesh] used to draw the debug collision for this [godot.Shape3D].
   */
  public fun getDebugMesh(): ArrayMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE3D_GET_DEBUG_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?
  }

  public companion object
}
