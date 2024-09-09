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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class representing a prism-shaped [PrimitiveMesh].
 */
@GodotBaseType
public open class PrismMesh : PrimitiveMesh() {
  /**
   * Displacement of the upper edge along the X axis. 0.0 positions edge straight above the
   * bottom-left edge.
   */
  public var leftToRight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLeftToRightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLeftToRightPtr, NIL)
    }

  /**
   * Size of the prism.
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
   * Number of added edge loops along the X axis.
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
   * Number of added edge loops along the Y axis.
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
   * Number of added edge loops along the Z axis.
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
    callConstructor(ENGINECLASS_PRISMMESH, scriptIndex)
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
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object

  internal object MethodBindings {
    public val setLeftToRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_left_to_right", 373806689)

    public val getLeftToRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_left_to_right", 1740695150)

    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_size", 3460891852)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_size", 3360562783)

    public val setSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_width", 1286410249)

    public val getSubdivideWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_width", 3905245786)

    public val setSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_height", 1286410249)

    public val getSubdivideHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_height", 3905245786)

    public val setSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "set_subdivide_depth", 1286410249)

    public val getSubdivideDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrismMesh", "get_subdivide_depth", 3905245786)
  }
}
