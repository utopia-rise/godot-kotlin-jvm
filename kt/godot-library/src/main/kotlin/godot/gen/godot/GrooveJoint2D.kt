// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var length: Float
    @JvmName("lengthProperty")
    get() = getLength()
    @JvmName("lengthProperty")
    set(`value`) {
      setLength(value)
    }

  /**
   * The body B's initial anchor position defined by the joint's origin and a local offset
   * [initialOffset] along the joint's Y axis (along the groove).
   */
  public final inline var initialOffset: Float
    @JvmName("initialOffsetProperty")
    get() = getInitialOffset()
    @JvmName("initialOffsetProperty")
    set(`value`) {
      setInitialOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GROOVEJOINT2D, scriptIndex)
  }

  public final fun setLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  public final fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInitialOffset(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setInitialOffsetPtr, NIL)
  }

  public final fun getInitialOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInitialOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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
