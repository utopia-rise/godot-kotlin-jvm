// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var size: Vector2
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * Number of subdivision along the X axis.
   */
  public final inline var subdivideWidth: Int
    @JvmName("subdivideWidthProperty")
    get() = getSubdivideWidth()
    @JvmName("subdivideWidthProperty")
    set(`value`) {
      setSubdivideWidth(value)
    }

  /**
   * Number of subdivision along the Z axis.
   */
  public final inline var subdivideDepth: Int
    @JvmName("subdivideDepthProperty")
    get() = getSubdivideDepth()
    @JvmName("subdivideDepthProperty")
    set(`value`) {
      setSubdivideDepth(value)
    }

  /**
   * Offset of the generated plane. Useful for particles.
   */
  @CoreTypeLocalCopy
  public final inline var centerOffset: Vector3
    @JvmName("centerOffsetProperty")
    get() = getCenterOffset()
    @JvmName("centerOffsetProperty")
    set(`value`) {
      setCenterOffset(value)
    }

  /**
   * Direction that the [PlaneMesh] is facing. See [Orientation] for options.
   */
  public final inline var orientation: Orientation
    @JvmName("orientationProperty")
    get() = getOrientation()
    @JvmName("orientationProperty")
    set(`value`) {
      setOrientation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PLANEMESH, scriptIndex)
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
  public final fun sizeMutate(block: Vector2.() -> Unit): Vector2 = size.apply{
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
  public final fun centerOffsetMutate(block: Vector3.() -> Unit): Vector3 = centerOffset.apply{
      block(this)
      centerOffset = this
  }


  public final fun setSize(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setSubdivideWidth(subdivide: Int): Unit {
    TransferContext.writeArguments(LONG to subdivide.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideWidthPtr, NIL)
  }

  public final fun getSubdivideWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubdivideDepth(subdivide: Int): Unit {
    TransferContext.writeArguments(LONG to subdivide.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideDepthPtr, NIL)
  }

  public final fun getSubdivideDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCenterOffset(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setCenterOffsetPtr, NIL)
  }

  public final fun getCenterOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setOrientation(orientation: Orientation): Unit {
    TransferContext.writeArguments(LONG to orientation.id)
    TransferContext.callMethod(ptr, MethodBindings.setOrientationPtr, NIL)
  }

  public final fun getOrientation(): Orientation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOrientationPtr, LONG)
    return PlaneMesh.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
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
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_size", 743155724)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_size", 3341600327)

    public val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_subdivide_width", 1286410249)

    public val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_subdivide_width", 3905245786)

    public val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_subdivide_depth", 1286410249)

    public val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_subdivide_depth", 3905245786)

    public val setCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_center_offset", 3460891852)

    public val getCenterOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_center_offset", 3360562783)

    public val setOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "set_orientation", 2751399687)

    public val getOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaneMesh", "get_orientation", 3227599250)
  }
}
