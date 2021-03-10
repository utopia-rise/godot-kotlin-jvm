// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class representing a prism-shaped [godot.PrimitiveMesh].
 *
 * Class representing a prism-shaped [godot.PrimitiveMesh].
 */
@GodotBaseType
open class PrismMesh : PrimitiveMesh() {
  /**
   * Displacement of the upper edge along the X axis. 0.0 positions edge straight above the bottom-left edge.
   */
  open var leftToRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_LEFT_TO_RIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_LEFT_TO_RIGHT, NIL)
    }

  /**
   * Size of the prism.
   */
  open var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SIZE, NIL)
    }

  /**
   * Number of added edge loops along the Z axis.
   */
  open var subdivideDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_DEPTH,
          NIL)
    }

  /**
   * Number of added edge loops along the Y axis.
   */
  open var subdivideHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_HEIGHT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_HEIGHT,
          NIL)
    }

  /**
   * Number of added edge loops along the X axis.
   */
  open var subdivideWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_GET_SUBDIVIDE_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRISMMESH_SET_SUBDIVIDE_WIDTH,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PRISMMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun size(schedule: Vector3.() -> Unit): Vector3 = size.apply{
      schedule(this)
      size = this
  }

}
