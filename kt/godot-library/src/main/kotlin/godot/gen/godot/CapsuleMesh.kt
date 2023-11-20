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
 * Class representing a capsule-shaped [godot.PrimitiveMesh].
 *
 * Class representing a capsule-shaped [godot.PrimitiveMesh].
 */
@GodotBaseType
public open class CapsuleMesh : PrimitiveMesh() {
  /**
   * Radius of the capsule mesh.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  /**
   * Total height of the capsule mesh (including the hemispherical ends).
   */
  public var height: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * Number of radial segments on the capsule mesh.
   */
  public var radialSegments: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
    }

  /**
   * Number of rings along the height of the capsule.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAPSULEMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "get_radius")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "set_height")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "get_height")

    public val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "set_radial_segments")

    public val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "get_radial_segments")

    public val setRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "set_rings")

    public val getRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("CapsuleMesh", "get_rings")
  }
}
