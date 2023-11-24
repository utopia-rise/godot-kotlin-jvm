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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely rotate.
 *
 * A physics joint that attaches two 2D physics bodies at a single point, allowing them to freely rotate. For example, a [godot.RigidBody2D] can be attached to a [godot.StaticBody2D] to create a pendulum or a seesaw.
 */
@GodotBaseType
public open class PinJoint2D : Joint2D() {
  /**
   * The higher this value, the more the bond to the pinned partner can flex.
   */
  public var softness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSoftnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSoftnessPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PINJOINT2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setSoftnessPtr: VoidPtr = TypeManager.getMethodBindPtr("PinJoint2D", "set_softness")

    public val getSoftnessPtr: VoidPtr = TypeManager.getMethodBindPtr("PinJoint2D", "get_softness")
  }
}
