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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

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
   * The number of sides on the tube. For example, a value of `5` means the tube will be pentagonal.
   * Higher values result in a more detailed tube at the cost of performance.
   */
  public var radialSteps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadialStepsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadialStepsPtr, NIL)
    }

  /**
   * The total number of sections on the tube.
   */
  public var sections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionsPtr, NIL)
    }

  /**
   * The length of a section of the tube.
   */
  public var sectionLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionLengthPtr, NIL)
    }

  /**
   * The number of rings in a section. The [curve] is sampled on each ring to determine its radius.
   * Higher values result in a more detailed tube at the cost of performance.
   */
  public var sectionRings: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionRingsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionRingsPtr, NIL)
    }

  /**
   * If `true`, generates a cap at the top of the tube. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera.
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
   * If `true`, generates a cap at the bottom of the tube. This can be set to `false` to speed up
   * generation and rendering when the cap is never seen by the camera.
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

  /**
   * Determines the radius of the tube along its length. The radius of a particular section ring is
   * obtained by multiplying the baseline [radius] by the value of this curve at the given distance.
   * For values smaller than `0`, the faces will be inverted.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TUBETRAILMESH, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radius")

    public val setRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_radial_steps")

    public val getRadialStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_radial_steps")

    public val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_sections")

    public val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_sections")

    public val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_length")

    public val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_length")

    public val setSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_section_rings")

    public val getSectionRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "get_section_rings")

    public val setCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_top")

    public val isCapTopPtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_top")

    public val setCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "set_cap_bottom")

    public val isCapBottomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TubeTrailMesh", "is_cap_bottom")

    public val setCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "set_curve")

    public val getCurvePtr: VoidPtr = TypeManager.getMethodBindPtr("TubeTrailMesh", "get_curve")
  }
}
