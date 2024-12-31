// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_BOXMESH: Int = 144

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
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * Number of extra edge loops inserted along the X axis.
   */
  public final inline var subdivideWidth: Int
    @JvmName("subdivideWidthProperty")
    get() = getSubdivideWidth()
    @JvmName("subdivideWidthProperty")
    set(`value`) {
      setSubdivideWidth(value)
    }

  /**
   * Number of extra edge loops inserted along the Y axis.
   */
  public final inline var subdivideHeight: Int
    @JvmName("subdivideHeightProperty")
    get() = getSubdivideHeight()
    @JvmName("subdivideHeightProperty")
    set(`value`) {
      setSubdivideHeight(value)
    }

  /**
   * Number of extra edge loops inserted along the Z axis.
   */
  public final inline var subdivideDepth: Int
    @JvmName("subdivideDepthProperty")
    get() = getSubdivideDepth()
    @JvmName("subdivideDepthProperty")
    set(`value`) {
      setSubdivideDepth(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_BOXMESH, scriptIndex)
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
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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

  public final fun setSubdivideHeight(divisions: Int): Unit {
    TransferContext.writeArguments(LONG to divisions.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideHeightPtr, NIL)
  }

  public final fun getSubdivideHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubdivideDepth(divisions: Int): Unit {
    TransferContext.writeArguments(LONG to divisions.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideDepthPtr, NIL)
  }

  public final fun getSubdivideDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_size", 3360562783)

    internal val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_width", 1286410249)

    internal val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_width", 3905245786)

    internal val setSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_height", 1286410249)

    internal val getSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_height", 3905245786)

    internal val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "set_subdivide_depth", 1286410249)

    internal val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxMesh", "get_subdivide_depth", 3905245786)
  }
}
