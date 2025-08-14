// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

/**
 * [TubeTrailMesh] represents a straight tube-shaped mesh with variable width. The tube is composed
 * of a number of cylindrical sections, each with the same [sectionLength] and number of
 * [sectionRings]. A [curve] is sampled along the total length of the tube, meaning that the curve
 * determines the radius of the tube along its length.
 *
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
   * For values smaller than `0`, the faces will be inverted. Should be a unit [Curve].
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(699, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSteps(radialSteps: Int): Unit {
    TransferContext.writeArguments(LONG to radialSteps.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRadialStepsPtr, NIL)
  }

  public final fun getRadialSteps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadialStepsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSections(sections: Int): Unit {
    TransferContext.writeArguments(LONG to sections.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSectionsPtr, NIL)
  }

  public final fun getSections(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSectionLength(sectionLength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sectionLength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSectionLengthPtr, NIL)
  }

  public final fun getSectionLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSectionRings(sectionRings: Int): Unit {
    TransferContext.writeArguments(LONG to sectionRings.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSectionRingsPtr, NIL)
  }

  public final fun getSectionRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCapTop(capTop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to capTop)
    TransferContext.callMethod(ptr, MethodBindings.setCapTopPtr, NIL)
  }

  public final fun isCapTop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCapTopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCapBottom(capBottom: Boolean): Unit {
    TransferContext.writeArguments(BOOL to capBottom)
    TransferContext.callMethod(ptr, MethodBindings.setCapBottomPtr, NIL)
  }

  public final fun isCapBottom(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCapBottomPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCurve(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public companion object {
    @JvmField
    public val setRadiusName: MethodStringName1<TubeTrailMesh, Unit, Float> =
        MethodStringName1<TubeTrailMesh, Unit, Float>("set_radius")

    @JvmField
    public val getRadiusName: MethodStringName0<TubeTrailMesh, Float> =
        MethodStringName0<TubeTrailMesh, Float>("get_radius")

    @JvmField
    public val setRadialStepsName: MethodStringName1<TubeTrailMesh, Unit, Int> =
        MethodStringName1<TubeTrailMesh, Unit, Int>("set_radial_steps")

    @JvmField
    public val getRadialStepsName: MethodStringName0<TubeTrailMesh, Int> =
        MethodStringName0<TubeTrailMesh, Int>("get_radial_steps")

    @JvmField
    public val setSectionsName: MethodStringName1<TubeTrailMesh, Unit, Int> =
        MethodStringName1<TubeTrailMesh, Unit, Int>("set_sections")

    @JvmField
    public val getSectionsName: MethodStringName0<TubeTrailMesh, Int> =
        MethodStringName0<TubeTrailMesh, Int>("get_sections")

    @JvmField
    public val setSectionLengthName: MethodStringName1<TubeTrailMesh, Unit, Float> =
        MethodStringName1<TubeTrailMesh, Unit, Float>("set_section_length")

    @JvmField
    public val getSectionLengthName: MethodStringName0<TubeTrailMesh, Float> =
        MethodStringName0<TubeTrailMesh, Float>("get_section_length")

    @JvmField
    public val setSectionRingsName: MethodStringName1<TubeTrailMesh, Unit, Int> =
        MethodStringName1<TubeTrailMesh, Unit, Int>("set_section_rings")

    @JvmField
    public val getSectionRingsName: MethodStringName0<TubeTrailMesh, Int> =
        MethodStringName0<TubeTrailMesh, Int>("get_section_rings")

    @JvmField
    public val setCapTopName: MethodStringName1<TubeTrailMesh, Unit, Boolean> =
        MethodStringName1<TubeTrailMesh, Unit, Boolean>("set_cap_top")

    @JvmField
    public val isCapTopName: MethodStringName0<TubeTrailMesh, Boolean> =
        MethodStringName0<TubeTrailMesh, Boolean>("is_cap_top")

    @JvmField
    public val setCapBottomName: MethodStringName1<TubeTrailMesh, Unit, Boolean> =
        MethodStringName1<TubeTrailMesh, Unit, Boolean>("set_cap_bottom")

    @JvmField
    public val isCapBottomName: MethodStringName0<TubeTrailMesh, Boolean> =
        MethodStringName0<TubeTrailMesh, Boolean>("is_cap_bottom")

    @JvmField
    public val setCurveName: MethodStringName1<TubeTrailMesh, Unit, Curve?> =
        MethodStringName1<TubeTrailMesh, Unit, Curve?>("set_curve")

    @JvmField
    public val getCurveName: MethodStringName0<TubeTrailMesh, Curve?> =
        MethodStringName0<TubeTrailMesh, Curve?>("get_curve")
  }

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radius", 1740695150)

    internal val setRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radial_steps", 1286410249)

    internal val getRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radial_steps", 3905245786)

    internal val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_sections", 1286410249)

    internal val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_sections", 3905245786)

    internal val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_length", 373806689)

    internal val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_length", 1740695150)

    internal val setSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_rings", 1286410249)

    internal val getSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_rings", 3905245786)

    internal val setCapTopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_top", 2586408642)

    internal val isCapTopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_top", 36873697)

    internal val setCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_bottom", 2586408642)

    internal val isCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_bottom", 36873697)

    internal val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_curve", 270443179)

    internal val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_curve", 2460114913)
  }
}
