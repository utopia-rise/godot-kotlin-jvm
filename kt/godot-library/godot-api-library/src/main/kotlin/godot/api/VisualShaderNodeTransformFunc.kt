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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * Computes an inverse or transpose function on the provided [Transform3D].
 */
@GodotBaseType
public open class VisualShaderNodeTransformFunc : VisualShaderNode() {
  /**
   * The function to be computed. See [Function] for options.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(810, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Perform the inverse operation on the [Transform3D] matrix.
     */
    INVERSE(0),
    /**
     * Perform the transpose operation on the [Transform3D] matrix.
     */
    TRANSPOSE(1),
    /**
     * Represents the size of the [Function] enum.
     */
    MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmStatic
    public val setFunctionName: MethodStringName1<VisualShaderNodeTransformFunc, Unit, Function> =
        MethodStringName1<VisualShaderNodeTransformFunc, Unit, Function>("set_function")

    @JvmStatic
    public val getFunctionName: MethodStringName0<VisualShaderNodeTransformFunc, Function> =
        MethodStringName0<VisualShaderNodeTransformFunc, Function>("get_function")
  }

  public object MethodBindings {
    internal val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformFunc", "set_function", 2900990409)

    internal val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTransformFunc", "get_function", 2839926569)
  }
}
