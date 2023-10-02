// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class representing a prism-shaped [godot.PrimitiveMesh].
 *
 * Class representing a prism-shaped [godot.PrimitiveMesh].
 */
@GodotBaseType
public open class PrismMesh : PrimitiveMesh() {
  /**
   * Displacement of the upper edge along the X axis. 0.0 positions edge straight above the bottom-left edge.
   */
  public var leftToRight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_LEFT_TO_RIGHT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_LEFT_TO_RIGHT, NIL)
    }

  /**
   * Size of the prism.
   */
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SIZE, NIL)
    }

  /**
   * Number of added edge loops along the X axis.
   */
  public var subdivideWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_WIDTH,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_WIDTH,
          NIL)
    }

  /**
   * Number of added edge loops along the Y axis.
   */
  public var subdivideHeight: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_HEIGHT,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_HEIGHT,
          NIL)
    }

  /**
   * Number of added edge loops along the Z axis.
   */
  public var subdivideDepth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_DEPTH,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_DEPTH,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PRISMMESH, scriptIndex)
    return true
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
  public open fun size(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object
}
