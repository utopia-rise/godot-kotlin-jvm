// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 *
 * **Note:** When using GodotPhysics instead of the default Bullet physics engine, there are several known bugs with cylinder collision shapes. Using [godot.CapsuleShape] or [godot.BoxShape] instead is recommended.
 */
@GodotBaseType
public open class CylinderShape : Shape() {
  /**
   * The cylinder's height.
   */
  public open var height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE_GET_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE_SET_HEIGHT, NIL)
    }

  /**
   * The cylinder's radius.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERSHAPE_SET_RADIUS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CYLINDERSHAPE)
  }
}
