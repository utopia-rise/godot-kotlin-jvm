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
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
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
  public final inline var `value`: Any?
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
  public final inline var constantId: Long
    @JvmName("constantIdProperty")
    get() = getConstantId()
    @JvmName("constantIdProperty")
    set(`value`) {
      setConstantId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(516, scriptIndex)
  }

  public final fun setValue(`value`: Any?): Unit {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setValuePtr, NIL)
  }

  public final fun getValue(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public final fun setConstantId(constantId: Long): Unit {
    TransferContext.writeArguments(LONG to constantId)
    TransferContext.callMethod(ptr, MethodBindings.setConstantIdPtr, NIL)
  }

  public final fun getConstantId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstantIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_value", 1114965689)

    internal val getValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_value", 1214101251)

    internal val setConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "set_constant_id", 1286410249)

    internal val getConstantIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineSpecializationConstant", "get_constant_id", 3905245786)
  }
}
