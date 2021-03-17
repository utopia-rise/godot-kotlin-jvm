// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Generate an axis-aligned cuboid [godot.PrimitiveMesh].
 *
 * Generate an axis-aligned cuboid [godot.PrimitiveMesh].
 *
 * The cube's UV layout is arranged in a 3×2 layout that allows texturing each face individually. To apply the same texture on all faces, change the material's UV property to `Vector3(3, 2, 1)`.
 */
@GodotBaseType
open class CubeMesh : PrimitiveMesh() {
  /**
   * Size of the cuboid mesh.
   */
  open var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_GET_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_SET_SIZE, NIL)
    }

  /**
   * Number of extra edge loops inserted along the Z axis.
   */
  open var subdivideDepth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_GET_SUBDIVIDE_DEPTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_SET_SUBDIVIDE_DEPTH, NIL)
    }

  /**
   * Number of extra edge loops inserted along the Y axis.
   */
  open var subdivideHeight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_GET_SUBDIVIDE_HEIGHT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_SET_SUBDIVIDE_HEIGHT,
          NIL)
    }

  /**
   * Number of extra edge loops inserted along the X axis.
   */
  open var subdivideWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_GET_SUBDIVIDE_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMESH_SET_SUBDIVIDE_WIDTH, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CUBEMESH)
  }

  open fun size(schedule: Vector3.() -> Unit): Vector3 = size.apply{
      schedule(this)
      size = this
  }

}
