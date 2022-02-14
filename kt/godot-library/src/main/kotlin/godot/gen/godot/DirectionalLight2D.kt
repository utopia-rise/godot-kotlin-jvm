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
import kotlin.jvm.JvmName

/**
 *
 */
@GodotBaseType
public open class DirectionalLight2D : Light2D() {
  /**
   * The height of the light. Used with 2D normal mapping. Ranges from 0 (parallel to the plane) to 1 (perpendicular to the plane).
   */
  public open var height: Double
    @JvmName("getHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getHeight()
    @JvmName("setHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    set(`value`) {
      super.setHeight(value)
    }

  /**
   *
   */
  public open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT2D_GET_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRECTIONALLIGHT2D_SET_MAX_DISTANCE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DIRECTIONALLIGHT2D)
  }

  public companion object
}
