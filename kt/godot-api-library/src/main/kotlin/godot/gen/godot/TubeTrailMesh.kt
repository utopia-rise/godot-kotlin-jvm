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
import godot.core.VariantParser.OBJECT
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

private const val ENGINE_CLASS_TUBETRAILMESH_INDEX: Int = 678

/**
 * [TubeTrailMesh] represents a straight tube-shaped mesh with variable width. The tube is composed
 * of a number of cylindrical sections, each with the same [sectionLength] and number of
 * [sectionRings]. A [curve] is sampled along the total length of the tube, meaning that the curve
 * determines the radius of the tube along its length.
 * This primitive mesh is usually used for particle trails.
 */
@GodotBaseType
public open class TubeTrailMesh : PrimitiveMesh() {
  /**
   * The baseline radius of the tube. The radius of a particular section ring is obtained by
   * multiplying this radius by the value of the [curve] at the given distance.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The number of sides on the tube. For example, a value of `5` means the tube will be pentagonal.
   * Higher values result in a more detailed tube at the cost of performance.
   */
  public final inline var radialSteps: Int
    @JvmName("radialStepsProperty")
    get() = getRadialSteps()
    @JvmName("radialStepsProperty")
    set(`value`) {
      setRadialSteps(value)
    }

  /**
   * The total number of sections on the tube.
   */
  public final inline var sections: Int
    @JvmName("sectionsProperty")
    get() = getSections()
    @JvmName("sectionsProperty")
    set(`value`) {
      setSections(value)
    }

  /**
   * The length of a section of the tube.
   */
  public final inline var sectionLength: Float
    @JvmName("sectionLengthProperty")
    get() = getSectionLength()
    @JvmName("sectionLengthProperty")
    set(`value`) {
      setSectionLength(value)
    }

  /**
   * The number of rings in a section. The [curve] is sampled on each ring to determine its radius.
   * Higher values result in a more detailed tube at the cost of performance.
   */
  public final inline var sectionRings: Int
    @JvmName("sectionRingsProperty")
    get() = getSectionRings()
    @JvmName("sectionRingsProperty")
    set(`value`) {
      setSectionRings(value)
    }

  /**
   * If `true`, generates a cap at the top of the tube. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera.
   */
  public final inline var capTop: Boolean
    @JvmName("capTopProperty")
    get() = isCapTop()
    @JvmName("capTopProperty")
    set(`value`) {
      setCapTop(value)
    }

  /**
   * If `true`, generates a cap at the bottom of the tube. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera.
   */
  public final inline var capBottom: Boolean
    @JvmName("capBottomProperty")
    get() = isCapBottom()
    @JvmName("capBottomProperty")
    set(`value`) {
      setCapBottom(value)
    }

  /**
   * Determines the radius of the tube along its length. The radius of a particular section ring is
   * obtained by multiplying the baseline [radius] by the value of this curve at the given distance.
   * For values smaller than `0`, the faces will be inverted.
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TUBETRAILMESH_INDEX, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSteps(radialSteps: Int): Unit {
    Internals.writeArguments(LONG to radialSteps.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRadialStepsPtr, NIL)
  }

  public final fun getRadialSteps(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialStepsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSections(sections: Int): Unit {
    Internals.writeArguments(LONG to sections.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSectionsPtr, NIL)
  }

  public final fun getSections(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSectionsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSectionLength(sectionLength: Float): Unit {
    Internals.writeArguments(DOUBLE to sectionLength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSectionLengthPtr, NIL)
  }

  public final fun getSectionLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSectionLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSectionRings(sectionRings: Int): Unit {
    Internals.writeArguments(LONG to sectionRings.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSectionRingsPtr, NIL)
  }

  public final fun getSectionRings(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSectionRingsPtr, LONG)
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

  public final fun setCurve(curve: Curve?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_radius", 1740695150)

    public val setRadialStepsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_radial_steps", 1286410249)

    public val getRadialStepsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_radial_steps", 3905245786)

    public val setSectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_sections", 1286410249)

    public val getSectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_sections", 3905245786)

    public val setSectionLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_section_length", 373806689)

    public val getSectionLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_section_length", 1740695150)

    public val setSectionRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_section_rings", 1286410249)

    public val getSectionRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_section_rings", 3905245786)

    public val setCapTopPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_cap_top", 2586408642)

    public val isCapTopPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "is_cap_top", 36873697)

    public val setCapBottomPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_cap_bottom", 2586408642)

    public val isCapBottomPtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "is_cap_bottom", 36873697)

    public val setCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "set_curve", 270443179)

    public val getCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("TubeTrailMesh", "get_curve", 2460114913)
  }
}
