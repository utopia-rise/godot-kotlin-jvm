// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Represents a straight ribbon-shaped [godot.PrimitiveMesh] with variable width.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/particles/index.html]($DOCS_URL/tutorials/3d/particles/index.html)
 *
 * [godot.RibbonTrailMesh] represents a straight ribbon-shaped mesh with variable width. The ribbon is composed of a number of flat or cross-shaped sections, each with the same [sectionLength] and number of [sectionSegments]. A [curve] is sampled along the total length of the ribbon, meaning that the curve determines the size of the ribbon along its length.
 *
 * This primitive mesh is usually used for particle trails.
 */
@GodotBaseType
public open class RibbonTrailMesh : PrimitiveMesh() {
  /**
   * Determines the shape of the ribbon.
   */
  public var shape: Shape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_SHAPE, LONG)
      return RibbonTrailMesh.Shape.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_SHAPE, NIL)
    }

  /**
   * The baseline size of the ribbon. The size of a particular section segment is obtained by multiplying this size by the value of the [curve] at the given distance.
   */
  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_SIZE, NIL)
    }

  /**
   * The total number of sections on the ribbon.
   */
  public var sections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_SECTIONS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_SECTIONS, NIL)
    }

  /**
   * The length of a section of the ribbon.
   */
  public var sectionLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_SECTION_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_SECTION_LENGTH, NIL)
    }

  /**
   * The number of segments in a section. The [curve] is sampled on each segment to determine its size. Higher values result in a more detailed ribbon at the cost of performance.
   */
  public var sectionSegments: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_SECTION_SEGMENTS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_SECTION_SEGMENTS, NIL)
    }

  /**
   * Determines the size of the ribbon along its length. The size of a particular section segment is obtained by multiplying the baseline [size] by the value of this curve at the given distance. For values smaller than `0`, the faces will be inverted.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_GET_CURVE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RIBBONTRAILMESH_SET_CURVE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RIBBONTRAILMESH, scriptIndex)
    return true
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
