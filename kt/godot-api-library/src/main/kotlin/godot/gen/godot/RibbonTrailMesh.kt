// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RIBBONTRAILMESH_INDEX: Int = 497

/**
 * [RibbonTrailMesh] represents a straight ribbon-shaped mesh with variable width. The ribbon is
 * composed of a number of flat or cross-shaped sections, each with the same [sectionLength] and number
 * of [sectionSegments]. A [curve] is sampled along the total length of the ribbon, meaning that the
 * curve determines the size of the ribbon along its length.
 * This primitive mesh is usually used for particle trails.
 */
@GodotBaseType
public open class RibbonTrailMesh : PrimitiveMesh() {
  /**
   * Determines the shape of the ribbon.
   */
  public final inline var shape: Shape
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * The baseline size of the ribbon. The size of a particular section segment is obtained by
   * multiplying this size by the value of the [curve] at the given distance.
   */
  public final inline var size: Float
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The total number of sections on the ribbon.
   */
  public final inline var sections: Int
    @JvmName("sectionsProperty")
    get() = getSections()
    @JvmName("sectionsProperty")
    set(`value`) {
      setSections(value)
    }

  /**
   * The length of a section of the ribbon.
   */
  public final inline var sectionLength: Float
    @JvmName("sectionLengthProperty")
    get() = getSectionLength()
    @JvmName("sectionLengthProperty")
    set(`value`) {
      setSectionLength(value)
    }

  /**
   * The number of segments in a section. The [curve] is sampled on each segment to determine its
   * size. Higher values result in a more detailed ribbon at the cost of performance.
   */
  public final inline var sectionSegments: Int
    @JvmName("sectionSegmentsProperty")
    get() = getSectionSegments()
    @JvmName("sectionSegmentsProperty")
    set(`value`) {
      setSectionSegments(value)
    }

  /**
   * Determines the size of the ribbon along its length. The size of a particular section segment is
   * obtained by multiplying the baseline [size] by the value of this curve at the given distance. For
   * values smaller than `0`, the faces will be inverted.
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RIBBONTRAILMESH_INDEX, scriptIndex)
  }

  public final fun setSize(size: Float): Unit {
    Internals.writeArguments(DOUBLE to size.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setSectionSegments(sectionSegments: Int): Unit {
    Internals.writeArguments(LONG to sectionSegments.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSectionSegmentsPtr, NIL)
  }

  public final fun getSectionSegments(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSectionSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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

  public final fun setShape(shape: Shape): Unit {
    Internals.writeArguments(LONG to shape.id)
    Internals.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapePtr, LONG)
    return RibbonTrailMesh.Shape.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Shape(
    id: Long,
  ) {
    /**
     * Gives the mesh a single flat face.
     */
    SHAPE_FLAT(0),
    /**
     * Gives the mesh two perpendicular flat faces, making a cross shape.
     */
    SHAPE_CROSS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Shape = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_size", 373806689)

    public val getSizePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_size", 1740695150)

    public val setSectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_sections", 1286410249)

    public val getSectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_sections", 3905245786)

    public val setSectionLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_section_length", 373806689)

    public val getSectionLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_section_length", 1740695150)

    public val setSectionSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_section_segments", 1286410249)

    public val getSectionSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_section_segments", 3905245786)

    public val setCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_curve", 270443179)

    public val getCurvePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_curve", 2460114913)

    public val setShapePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "set_shape", 1684440262)

    public val getShapePtr: VoidPtr =
        Internals.getMethodBindPtr("RibbonTrailMesh", "get_shape", 1317484155)
  }
}
