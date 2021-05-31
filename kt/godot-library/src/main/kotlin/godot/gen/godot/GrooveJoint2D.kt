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
 * Groove constraint for 2D physics.
 *
 * Groove constraint for 2D physics. This is useful for making a body "slide" through a segment placed in another.
 */
@GodotBaseType
public open class GrooveJoint2D : Joint2D() {
  /**
   * The body B's initial anchor position defined by the joint's origin and a local offset [initialOffset] along the joint's Y axis (along the groove).
   */
  public open var initialOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GROOVEJOINT2D_GET_INITIAL_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GROOVEJOINT2D_SET_INITIAL_OFFSET,
          NIL)
    }

  /**
   * The groove's length. The groove is from the joint's origin towards [length] along the joint's local Y axis.
   */
  public open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GROOVEJOINT2D_GET_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GROOVEJOINT2D_SET_LENGTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GROOVEJOINT2D)
  }
}
