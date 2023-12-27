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

/**
 * Class representing a cylindrical [PrimitiveMesh]. This class can be used to create cones by
 * setting either the [topRadius] or [bottomRadius] properties to `0.0`.
 */
@GodotBaseType
public open class CylinderMesh : PrimitiveMesh() {
  /**
   * Top radius of the cylinder. If set to `0.0`, the top faces will not be generated, resulting in
   * a conic shape. See also [capTop].
   */
  public var topRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTopRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTopRadiusPtr, NIL)
    }

  /**
   * Bottom radius of the cylinder. If set to `0.0`, the bottom faces will not be generated,
   * resulting in a conic shape. See also [capBottom].
   */
  public var bottomRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBottomRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBottomRadiusPtr, NIL)
    }

  /**
   * Full height of the cylinder.
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
   * Number of radial segments on the cylinder. Higher values result in a more detailed
   * cylinder/cone at the cost of performance.
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
   * Number of edge rings along the height of the cylinder. Changing [rings] does not have any
   * visual impact unless a shader or procedural mesh tool is used to alter the vertex data. Higher
   * values result in more subdivisions, which can be used to create smoother-looking effects with
   * shaders or procedural mesh tools (at the cost of performance). When not altering the vertex data
   * using a shader or procedural mesh tool, [rings] should be kept to its default value.
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
   * If `true`, generates a cap at the top of the cylinder. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera. See also [topRadius].
   * **Note:** If [topRadius] is `0.0`, cap generation is always skipped even if [capTop] is `true`.
   */
  public var capTop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCapTopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCapTopPtr, NIL)
    }

  /**
   * If `true`, generates a cap at the bottom of the cylinder. This can be set to `false` to speed
   * up generation and rendering when the cap is never seen by the camera. See also [bottomRadius].
   * **Note:** If [bottomRadius] is `0.0`, cap generation is always skipped even if [capBottom] is
   * `true`.
   */
  public var capBottom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCapBottomPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCapBottomPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CYLINDERMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTopRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_top_radius")

    public val getTopRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_top_radius")

    public val setBottomRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_bottom_radius")

    public val getBottomRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_bottom_radius")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "set_height")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "get_height")

    public val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_radial_segments")

    public val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_radial_segments")

    public val setRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "set_rings")

    public val getRingsPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "get_rings")

    public val setCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "set_cap_top")

    public val isCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("CylinderMesh", "is_cap_top")

    public val setCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_cap_bottom")

    public val isCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "is_cap_bottom")
  }
}
