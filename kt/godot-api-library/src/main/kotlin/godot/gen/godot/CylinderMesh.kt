// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
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
    Internals.callConstructor(this, ENGINE_CLASS_CYLINDERMESH_INDEX, scriptIndex)
  }

  public final fun setTopRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTopRadiusPtr, NIL)
  }

  public final fun getTopRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTopRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBottomRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBottomRadiusPtr, NIL)
  }

  public final fun getBottomRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBottomRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    Internals.writeArguments(DOUBLE to height.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(segments: Int): Unit {
    Internals.writeArguments(LONG to segments.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    Internals.writeArguments(LONG to rings.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCapTop(capTop: Boolean): Unit {
    Internals.writeArguments(BOOL to capTop)
    Internals.callMethod(rawPtr, MethodBindings.setCapTopPtr, NIL)
  }

  public final fun isCapTop(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCapTopPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCapBottom(capBottom: Boolean): Unit {
    Internals.writeArguments(BOOL to capBottom)
    Internals.callMethod(rawPtr, MethodBindings.setCapBottomPtr, NIL)
  }

  public final fun isCapBottom(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCapBottomPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTopRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_top_radius", 373806689)

    public val getTopRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "get_top_radius", 1740695150)

    public val setBottomRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_bottom_radius", 373806689)

    public val getBottomRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "get_bottom_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "get_height", 1740695150)

    public val setRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_radial_segments", 1286410249)

    public val getRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "get_radial_segments", 3905245786)

    public val setRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_rings", 1286410249)

    public val getRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "get_rings", 3905245786)

    public val setCapTopPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_cap_top", 2586408642)

    public val isCapTopPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "is_cap_top", 36873697)

    public val setCapBottomPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "set_cap_bottom", 2586408642)

    public val isCapBottomPtr: VoidPtr =
        Internals.getMethodBindPtr("CylinderMesh", "is_cap_bottom", 36873697)
  }
}
