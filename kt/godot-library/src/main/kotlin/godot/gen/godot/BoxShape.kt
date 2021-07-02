// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Suppress
import kotlin.Unit

/**
 * Box shape resource.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/125](https://godotengine.org/asset-library/asset/125)
 *
 * 3D box shape that can be a child of a [godot.PhysicsBody] or [godot.Area].
 */
@GodotBaseType
public open class BoxShape : Shape() {
  /**
   * The box's half extents. The width, height and depth of this shape is twice the half extents.
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXSHAPE_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXSHAPE_SET_EXTENTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BOXSHAPE)
  }

  @CoreTypeHelper
  public open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }

}
