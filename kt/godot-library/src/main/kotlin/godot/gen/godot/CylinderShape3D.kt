// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Cylinder shape for collisions.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * Cylinder shape for collisions.
 */
@GodotBaseType
public open class CylinderShape3D : Shape3D() {
  /**
   * The cylinder's radius.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE3D_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE3D_SET_RADIUS, NIL)
    }

  /**
   * The cylinder's height.
   */
  public open var height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE3D_GET_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE3D_SET_HEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CYLINDERSHAPE3D)
  }

  public companion object
}
