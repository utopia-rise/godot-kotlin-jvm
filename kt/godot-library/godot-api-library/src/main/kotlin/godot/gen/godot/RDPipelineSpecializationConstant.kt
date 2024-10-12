// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDPIPELINESPECIALIZATIONCONSTANT_INDEX: Int = 516

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
    Internals.callConstructor(this, ENGINE_CLASS_RDPIPELINESPECIALIZATIONCONSTANT_INDEX,
        scriptIndex)
  }

  public final fun setValue(`value`: Any?): Unit {
    Internals.writeArguments(ANY to value)
    Internals.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
  }

  public final fun getValue(): Any? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getValuePtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  public final fun setConstantId(constantId: Long): Unit {
    Internals.writeArguments(LONG to constantId)
    Internals.callMethod(rawPtr, MethodBindings.setConstantIdPtr, NIL)
  }

  public final fun getConstantId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstantIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setValuePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineSpecializationConstant", "set_value", 1114965689)

    internal val getValuePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineSpecializationConstant", "get_value", 1214101251)

    internal val setConstantIdPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineSpecializationConstant", "set_constant_id", 1286410249)

    internal val getConstantIdPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineSpecializationConstant", "get_constant_id", 3905245786)
  }
}
