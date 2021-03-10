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
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Class representing a cylindrical [godot.PrimitiveMesh].
 *
 * Class representing a cylindrical [godot.PrimitiveMesh]. This class can be used to create cones by setting either the [topRadius] or [bottomRadius] properties to 0.0.
 */
@GodotBaseType
open class CylinderMesh : PrimitiveMesh() {
  /**
   * Bottom radius of the cylinder.
   */
  open var bottomRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_BOTTOM_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_BOTTOM_RADIUS,
          NIL)
    }

  /**
   * Full height of the cylinder.
   */
  open var height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_HEIGHT, NIL)
    }

  /**
   * Number of radial segments on the cylinder.
   */
  open var radialSegments: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_RADIAL_SEGMENTS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_RADIAL_SEGMENTS,
          NIL)
    }

  /**
   * Number of edge rings along the height of the cylinder.
   */
  open var rings: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_RINGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_RINGS, NIL)
    }

  /**
   * Top radius of the cylinder.
   */
  open var topRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_TOP_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_TOP_RADIUS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CYLINDERMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
