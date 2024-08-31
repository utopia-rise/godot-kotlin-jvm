// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class representing a planar [PrimitiveMesh]. This flat mesh does not have a thickness. By
 * default, this mesh is aligned on the X and Z axes; this default rotation isn't suited for use with
 * billboarded materials. For billboarded materials, change [orientation] to [FACE_Z].
 * **Note:** When using a large textured [PlaneMesh] (e.g. as a floor), you may stumble upon UV
 * jittering issues depending on the camera angle. To solve this, increase [subdivideDepth] and
 * [subdivideWidth] until you no longer notice UV jittering.
 */
@GodotBaseType
public open class PlaneMesh : PrimitiveMesh() {
  /**
   * Size of the generated plane.
   */
  @CoreTypeLocalCopy
  public var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * Number of subdivision along the X axis.
   */
  public var subdivideWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubdivideWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubdivideWidthPtr, NIL)
    }

  /**
   * Number of subdivision along the Z axis.
   */
  public var subdivideDepth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubdivideDepthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubdivideDepthPtr, NIL)
    }

  /**
   * Offset of the generated plane. Useful for particles.
   */
  @CoreTypeLocalCopy
  public var centerOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOffsetPtr, NIL)
    }

  /**
   * Direction that the [PlaneMesh] is facing. See [Orientation] for options.
   */
  public var orientation: Orientation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOrientationPtr, LONG)
      return PlaneMesh.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOrientationPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PLANEMESH, scriptIndex)
  }

  /**
   * Size of the generated plane.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = planemesh.size
   * //Your changes
   * planemesh.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2.() -> Unit): Vector2 = size.apply{
      block(this)
      size = this
  }


  /**
   * Offset of the generated plane. Useful for particles.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = planemesh.centerOffset
   * //Your changes
   * planemesh.centerOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun centerOffsetMutate(block: Vector3.() -> Unit): Vector3 = centerOffset.apply{
      block(this)
      centerOffset = this
  }


  public enum class Orientation(
    id: Long,
  ) {
    /**
     * [PlaneMesh] will face the positive X-axis.
     */
    FACE_X(0),
    /**
     * [PlaneMesh] will face the positive Y-axis. This matches the behavior of the [PlaneMesh] in
     * Godot 3.x.
     */
    FACE_Y(1),
    /**
     * [PlaneMesh] will face the positive Z-axis. This matches the behavior of the QuadMesh in Godot
     * 3.x.
     */
    FACE_Z(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Orientation = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("PlaneMesh", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("PlaneMesh", "get_size")

    public val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_subdivide_width")

    public val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_subdivide_width")

    public val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_subdivide_depth")

    public val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_subdivide_depth")

    public val setCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_center_offset")

    public val getCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_center_offset")

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_orientation")

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_orientation")
  }
}
