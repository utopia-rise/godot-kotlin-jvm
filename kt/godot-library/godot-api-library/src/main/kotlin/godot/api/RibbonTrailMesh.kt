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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [RibbonTrailMesh] represents a straight ribbon-shaped mesh with variable width. The ribbon is
 * composed of a number of flat or cross-shaped sections, each with the same [sectionLength] and number
 * of [sectionSegments]. A [curve] is sampled along the total length of the ribbon, meaning that the
 * curve determines the size of the ribbon along its length.
 *
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
   * values smaller than `0`, the faces will be inverted. Should be a unit [Curve].
   */
  public final inline var curve: Curve?
    @JvmName("curveProperty")
    get() = getCurve()
    @JvmName("curveProperty")
    set(`value`) {
      setCurve(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(564, scriptIndex)
  }

  public final fun setSize(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setSectionSegments(sectionSegments: Int): Unit {
    TransferContext.writeArguments(LONG to sectionSegments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSectionSegmentsPtr, NIL)
  }

  public final fun getSectionSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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

  public final fun setShape(shape: Shape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShapePtr, LONG)
    return Shape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Shape(
    id: Long,
  ) {
    /**
     * Gives the mesh a single flat face.
     */
    FLAT(0),
    /**
     * Gives the mesh two perpendicular flat faces, making a cross shape.
     */
    CROSS(1),
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

  public object MethodBindings {
    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_size", 373806689)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_size", 1740695150)

    internal val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_sections", 1286410249)

    internal val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_sections", 3905245786)

    internal val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_length", 373806689)

    internal val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_length", 1740695150)

    internal val setSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_segments", 1286410249)

    internal val getSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_segments", 3905245786)

    internal val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_curve", 270443179)

    internal val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_curve", 2460114913)

    internal val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_shape", 1684440262)

    internal val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_shape", 1317484155)
  }
}
