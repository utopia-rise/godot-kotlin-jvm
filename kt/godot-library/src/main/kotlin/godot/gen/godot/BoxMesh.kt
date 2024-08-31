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
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Generate an axis-aligned box [PrimitiveMesh].
 * The box's UV layout is arranged in a 3×2 layout that allows texturing each face individually. To
 * apply the same texture on all faces, change the material's UV property to `Vector3(3, 2, 1)`. This
 * is equivalent to adding `UV *= vec2(3.0, 2.0)` in a vertex shader.
 * **Note:** When using a large textured [BoxMesh] (e.g. as a floor), you may stumble upon UV
 * jittering issues depending on the camera angle. To solve this, increase [subdivideDepth],
 * [subdivideHeight] and [subdivideWidth] until you no longer notice UV jittering.
 */
@GodotBaseType
public open class BoxMesh : PrimitiveMesh() {
  /**
   * The box's width, height and depth.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * Number of extra edge loops inserted along the X axis.
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
   * Number of extra edge loops inserted along the Y axis.
   */
  public var subdivideHeight: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubdivideHeightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubdivideHeightPtr, NIL)
    }

  /**
   * Number of extra edge loops inserted along the Z axis.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BOXMESH, scriptIndex)
  }

  /**
   * The box's width, height and depth.
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
   * val myCoreType = boxmesh.size
   * //Your changes
   * boxmesh.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BoxMesh", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("BoxMesh", "get_size")

    public val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_width")

    public val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_width")

    public val setSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_height")

    public val getSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_height")

    public val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_depth")

    public val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_depth")
  }
}
