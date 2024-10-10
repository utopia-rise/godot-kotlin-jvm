// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CYLINDERMESH_INDEX: Int = 207

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
  public final inline var topRadius: Float
    @JvmName("topRadiusProperty")
    get() = getTopRadius()
    @JvmName("topRadiusProperty")
    set(`value`) {
      setTopRadius(value)
    }

  /**
   * Bottom radius of the cylinder. If set to `0.0`, the bottom faces will not be generated,
   * resulting in a conic shape. See also [capBottom].
   */
  public final inline var bottomRadius: Float
    @JvmName("bottomRadiusProperty")
    get() = getBottomRadius()
    @JvmName("bottomRadiusProperty")
    set(`value`) {
      setBottomRadius(value)
    }

  /**
   * Full height of the cylinder.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * Number of radial segments on the cylinder. Higher values result in a more detailed
   * cylinder/cone at the cost of performance.
   */
  public final inline var radialSegments: Int
    @JvmName("radialSegmentsProperty")
    get() = getRadialSegments()
    @JvmName("radialSegmentsProperty")
    set(`value`) {
      setRadialSegments(value)
    }

  /**
   * Number of edge rings along the height of the cylinder. Changing [rings] does not have any
   * visual impact unless a shader or procedural mesh tool is used to alter the vertex data. Higher
   * values result in more subdivisions, which can be used to create smoother-looking effects with
   * shaders or procedural mesh tools (at the cost of performance). When not altering the vertex data
   * using a shader or procedural mesh tool, [rings] should be kept to its default value.
   */
  public final inline var rings: Int
    @JvmName("ringsProperty")
    get() = getRings()
    @JvmName("ringsProperty")
    set(`value`) {
      setRings(value)
    }

  /**
   * If `true`, generates a cap at the top of the cylinder. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera. See also [topRadius].
   * **Note:** If [topRadius] is `0.0`, cap generation is always skipped even if [capTop] is `true`.
   */
  public final inline var capTop: Boolean
    @JvmName("capTopProperty")
    get() = isCapTop()
    @JvmName("capTopProperty")
    set(`value`) {
      setCapTop(value)
    }

  /**
   * If `true`, generates a cap at the bottom of the cylinder. This can be set to `false` to speed
   * up generation and rendering when the cap is never seen by the camera. See also [bottomRadius].
   * **Note:** If [bottomRadius] is `0.0`, cap generation is always skipped even if [capBottom] is
   * `true`.
   */
  public final inline var capBottom: Boolean
    @JvmName("capBottomProperty")
    get() = isCapBottom()
    @JvmName("capBottomProperty")
    set(`value`) {
      setCapBottom(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_CYLINDERMESH_INDEX, scriptIndex)
  }

  public final fun setTopRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTopRadiusPtr, NIL)
  }

  public final fun getTopRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTopRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBottomRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBottomRadiusPtr, NIL)
  }

  public final fun getBottomRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBottomRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(segments: Int): Unit {
    TransferContext.writeArguments(LONG to segments.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCapTop(capTop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to capTop)
    TransferContext.callMethod(rawPtr, MethodBindings.setCapTopPtr, NIL)
  }

  public final fun isCapTop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCapTopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCapBottom(capBottom: Boolean): Unit {
    TransferContext.writeArguments(BOOL to capBottom)
    TransferContext.callMethod(rawPtr, MethodBindings.setCapBottomPtr, NIL)
  }

  public final fun isCapBottom(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCapBottomPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTopRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_top_radius", 373806689)

    public val getTopRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_top_radius", 1740695150)

    public val setBottomRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_bottom_radius", 373806689)

    public val getBottomRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_bottom_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_height", 1740695150)

    public val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_radial_segments", 1286410249)

    public val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_radial_segments", 3905245786)

    public val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_rings", 1286410249)

    public val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "get_rings", 3905245786)

    public val setCapTopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_cap_top", 2586408642)

    public val isCapTopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "is_cap_top", 36873697)

    public val setCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "set_cap_bottom", 2586408642)

    public val isCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CylinderMesh", "is_cap_bottom", 36873697)
  }
}
