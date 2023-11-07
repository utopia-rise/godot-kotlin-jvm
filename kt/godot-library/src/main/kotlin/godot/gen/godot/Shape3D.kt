// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Abstract base class for all 3D shapes, intended for use in physics.
 * **Performance:** Primitive shapes, especially [SphereShape3D], are fast to check collisions
 * against. [ConvexPolygonShape3D] and [HeightMapShape3D] are slower, and [ConcavePolygonShape3D] is
 * the slowest.
 */
@GodotBaseType
public open class Shape3D internal constructor() : Resource() {
  /**
   * The shape's custom solver bias. Defines how much bodies react to enforce contact separation
   * when this shape is involved.
   * When set to `0`, the default value from [ProjectSettings.physics/3d/solver/defaultContactBias]
   * is used.
   */
  public var customSolverBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomSolverBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomSolverBiasPtr, NIL)
    }

  /**
   * The collision margin for the shape. This is not used in Godot Physics.
   * Collision margins allow collision detection to be more efficient by adding an extra shell
   * around shapes. Collision algorithms are more expensive when objects overlap by more than their
   * margin, so a higher value for margins is better for performance, at the cost of accuracy around
   * edges as it makes them less sharp.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHAPE3D, scriptIndex)
    return true
  }

  /**
   * Returns the [ArrayMesh] used to draw the debug collision for this [Shape3D].
   */
  public fun getDebugMesh(): ArrayMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDebugMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ArrayMesh?)
  }

  public companion object

  internal object MethodBindings {
    public val setCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape3D", "set_custom_solver_bias")

    public val getCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape3D", "get_custom_solver_bias")

    public val setMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape3D", "set_margin")

    public val getMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape3D", "get_margin")

    public val getDebugMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape3D", "get_debug_mesh")
  }
}
