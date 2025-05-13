// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

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
    createNativeObject(268, scriptIndex)
  }

  public final fun setLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLengthPtr, NIL)
  }

  public final fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInitialOffset(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setInitialOffsetPtr, NIL)
  }

  public final fun getInitialOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInitialOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object {
    @JvmStatic
    public val setLengthName: MethodStringName1<GrooveJoint2D, Unit, Float> =
        MethodStringName1<GrooveJoint2D, Unit, Float>("set_length")

    @JvmStatic
    public val getLengthName: MethodStringName0<GrooveJoint2D, Float> =
        MethodStringName0<GrooveJoint2D, Float>("get_length")

    @JvmStatic
    public val setInitialOffsetName: MethodStringName1<GrooveJoint2D, Unit, Float> =
        MethodStringName1<GrooveJoint2D, Unit, Float>("set_initial_offset")

    @JvmStatic
    public val getInitialOffsetName: MethodStringName0<GrooveJoint2D, Float> =
        MethodStringName0<GrooveJoint2D, Float>("get_initial_offset")
  }

  public object MethodBindings {
    internal val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "set_length", 373806689)

    internal val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "get_length", 1740695150)

    internal val setInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "set_initial_offset", 373806689)

    internal val getInitialOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GrooveJoint2D", "get_initial_offset", 1740695150)
  }
}
