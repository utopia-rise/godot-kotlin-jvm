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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_PRISMMESH: Int = 503

/**
 * Class representing a prism-shaped [PrimitiveMesh].
 */
@GodotBaseType
public open class PrismMesh : PrimitiveMesh() {
  /**
   * Displacement of the upper edge along the X axis. 0.0 positions edge straight above the
   * bottom-left edge.
   */
  public final inline var leftToRight: Float
    @JvmName("leftToRightProperty")
    get() = getLeftToRight()
    @JvmName("leftToRightProperty")
    set(`value`) {
      setLeftToRight(value)
    }

  /**
   * Size of the prism.
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
   * Number of added edge loops along the X axis.
   */
  public final inline var subdivideWidth: Int
    @JvmName("subdivideWidthProperty")
    get() = getSubdivideWidth()
    @JvmName("subdivideWidthProperty")
    set(`value`) {
      setSubdivideWidth(value)
    }

  /**
   * Number of added edge loops along the Y axis.
   */
  public final inline var subdivideHeight: Int
    @JvmName("subdivideHeightProperty")
    get() = getSubdivideHeight()
    @JvmName("subdivideHeightProperty")
    set(`value`) {
      setSubdivideHeight(value)
    }

  /**
   * Number of added edge loops along the Z axis.
   */
  public final inline var subdivideDepth: Int
    @JvmName("subdivideDepthProperty")
    get() = getSubdivideDepth()
    @JvmName("subdivideDepthProperty")
    set(`value`) {
      setSubdivideDepth(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PRISMMESH, scriptIndex)
  }

  /**
   * Size of the prism.
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
   * val myCoreType = prismmesh.size
   * //Your changes
   * prismmesh.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public final fun setLeftToRight(leftToRight: Float): Unit {
    TransferContext.writeArguments(DOUBLE to leftToRight.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLeftToRightPtr, NIL)
  }

  public final fun getLeftToRight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLeftToRightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setSubdivideWidth(segments: Int): Unit {
    TransferContext.writeArguments(LONG to segments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideWidthPtr, NIL)
  }

  public final fun getSubdivideWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubdivideHeight(segments: Int): Unit {
    TransferContext.writeArguments(LONG to segments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideHeightPtr, NIL)
  }

  public final fun getSubdivideHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSubdivideDepth(segments: Int): Unit {
    TransferContext.writeArguments(LONG to segments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSubdivideDepthPtr, NIL)
  }

  public final fun getSubdivideDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubdivideDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setLeftToRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_left_to_right", 373806689)

    internal val getLeftToRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_left_to_right", 1740695150)

    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_size", 3360562783)

    internal val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_width", 1286410249)

    internal val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_width", 3905245786)

    internal val setSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_height", 1286410249)

    internal val getSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_height", 3905245786)

    internal val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_depth", 1286410249)

    internal val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_depth", 3905245786)
  }
}
