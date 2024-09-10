// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A physics joint that restricts the movement of two 2D physics bodies to a fixed axis. For
 * example, a [StaticBody2D] representing a piston base can be attached to a [RigidBody2D] representing
 * the piston head, moving up and down.
 */
@GodotBaseType
public open class GrooveJoint2D : Joint2D() {
  /**
   * The groove's length. The groove is from the joint's origin towards [length] along the joint's
   * local Y axis.
   */
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  /**
   * The body B's initial anchor position defined by the joint's origin and a local offset
   * [initialOffset] along the joint's Y axis (along the groove).
   */
  public var initialOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInitialOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInitialOffsetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GROOVEJOINT2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "get_length", 1740695150)

    public val setInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "set_initial_offset", 373806689)

    public val getInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "get_initial_offset", 1740695150)
  }
}
