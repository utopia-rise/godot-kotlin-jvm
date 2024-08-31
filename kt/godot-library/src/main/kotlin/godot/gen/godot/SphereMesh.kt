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
import kotlin.Unit

/**
 * Class representing a spherical [PrimitiveMesh].
 */
@GodotBaseType
public open class SphereMesh : PrimitiveMesh() {
  /**
   * Radius of sphere.
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
   * Full height of the sphere.
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
   * Number of radial segments on the sphere.
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
   * Number of segments along the height of the sphere.
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
   * If `true`, a hemisphere is created rather than a full sphere.
   * **Note:** To get a regular hemisphere, the height and radius of the sphere must be equal.
   */
  public var isHemisphere: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIsHemispherePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIsHemispherePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPHEREMESH, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "get_radius")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "set_height")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "get_height")

    public val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_radial_segments")

    public val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_radial_segments")

    public val setRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "set_rings")

    public val getRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("SphereMesh", "get_rings")

    public val setIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "set_is_hemisphere")

    public val getIsHemispherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SphereMesh", "get_is_hemisphere")
  }
}
