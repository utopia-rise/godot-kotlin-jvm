// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Class representing a torus [godot.PrimitiveMesh].
 *
 * Class representing a torus [godot.PrimitiveMesh].
 */
@GodotBaseType
public open class TorusMesh : PrimitiveMesh() {
  /**
   * The inner radius of the torus.
   */
  public var innerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInnerRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInnerRadiusPtr, NIL)
    }

  /**
   * The outer radius of the torus.
   */
  public var outerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOuterRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOuterRadiusPtr, NIL)
    }

  /**
   * The number of slices the torus is constructed of.
   */
  public var rings: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
    }

  /**
   * The number of edges each ring of the torus is constructed of.
   */
  public var ringSegments: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRingSegmentsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRingSegmentsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TORUSMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_inner_radius")

    public val getInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_inner_radius")

    public val setOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_outer_radius")

    public val getOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_outer_radius")

    public val setRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("TorusMesh", "set_rings")

    public val getRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("TorusMesh", "get_rings")

    public val setRingSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_ring_segments")

    public val getRingSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_ring_segments")
  }
}
