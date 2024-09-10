// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A *specialization constant* is a way to create additional variants of shaders without actually
 * increasing the number of shader versions that are compiled. This allows improving performance by
 * reducing the number of shader versions and reducing `if` branching, while still allowing shaders to
 * be flexible for different use cases.
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineSpecializationConstant : RefCounted() {
  /**
   * The specialization constant's value. Only [bool], [int] and [float] types are valid for
   * specialization constants.
   */
  public var `value`: Any?
    @JvmName("valueProperty")
    get() = getValue()
    @JvmName("valueProperty")
    set(`value`) {
      setValue(value)
    }

  /**
   * The identifier of the specialization constant. This is a value starting from `0` and that
   * increments for every different specialization constant for a given shader.
   */
  public var constantId: Long
    @JvmName("constantIdProperty")
    get() = getConstantId()
    @JvmName("constantIdProperty")
    set(`value`) {
      setConstantId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDPIPELINESPECIALIZATIONCONSTANT, scriptIndex)
  }

  public fun setValue(`value`: Any?): Unit {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
  }

  public fun getValue(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setConstantId(constantId: Long): Unit {
    TransferContext.writeArguments(LONG to constantId)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantIdPtr, NIL)
  }

  public fun getConstantId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_value", 1114965689)

    public val getValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_value", 1214101251)

    public val setConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_constant_id", 1286410249)

    public val getConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_constant_id", 3905245786)
  }
}
