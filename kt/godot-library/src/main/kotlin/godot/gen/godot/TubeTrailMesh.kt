// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Represents a straight tube-shaped [godot.PrimitiveMesh] with variable width.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/particles/index.html]($DOCS_URL/tutorials/3d/particles/index.html)
 *
 * [godot.TubeTrailMesh] represents a straight tube-shaped mesh with variable width. The tube is composed of a number of cylindrical sections, each with the same [sectionLength] and number of [sectionRings]. A [curve] is sampled along the total length of the tube, meaning that the curve determines the radius of the tube along its length.
 *
 * This primitive mesh is usually used for particle trails.
 */
@GodotBaseType
public open class TubeTrailMesh : PrimitiveMesh() {
  /**
   * The baseline radius of the tube. The radius of a particular section ring is obtained by multiplying this radius by the value of the [curve] at the given distance.
   */
  public var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_RADIUS, NIL)
    }

  /**
   * The number of sides on the tube. For example, a value of `5` means the tube will be pentagonal. Higher values result in a more detailed tube at the cost of performance.
   */
  public var radialSteps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_RADIAL_STEPS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_RADIAL_STEPS,
          NIL)
    }

  /**
   * The total number of sections on the tube.
   */
  public var sections: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_SECTIONS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_SECTIONS, NIL)
    }

  /**
   * The length of a section of the tube.
   */
  public var sectionLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_SECTION_LENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_SECTION_LENGTH,
          NIL)
    }

  /**
   * The number of rings in a section. The [curve] is sampled on each ring to determine its radius. Higher values result in a more detailed tube at the cost of performance.
   */
  public var sectionRings: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_SECTION_RINGS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_SECTION_RINGS,
          NIL)
    }

  /**
   * If `true`, generates a cap at the top of the tube. This can be set to `false` to speed up generation and rendering when the cap is never seen by the camera.
   */
  public var capTop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_IS_CAP_TOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_CAP_TOP, NIL)
    }

  /**
   * If `true`, generates a cap at the bottom of the tube. This can be set to `false` to speed up generation and rendering when the cap is never seen by the camera.
   */
  public var capBottom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_IS_CAP_BOTTOM, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_CAP_BOTTOM, NIL)
    }

  /**
   * Determines the radius of the tube along its length. The radius of a particular section ring is obtained by multiplying the baseline [radius] by the value of this curve at the given distance. For values smaller than `0`, the faces will be inverted.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TUBETRAILMESH_SET_CURVE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TUBETRAILMESH, scriptIndex)
    return true
  }

  public companion object
}
