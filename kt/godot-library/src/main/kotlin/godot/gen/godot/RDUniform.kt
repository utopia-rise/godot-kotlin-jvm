// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Shader uniform (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDUniform : RefCounted() {
  /**
   * The uniform's data type.
   */
  public var uniformType: RenderingDevice.UniformType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUniformTypePtr, LONG)
      return RenderingDevice.UniformType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUniformTypePtr, NIL)
    }

  /**
   * The uniform's binding.
   */
  public var binding: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBindingPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBindingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDUNIFORM, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun addId(id: RID): Unit {
    TransferContext.writeArguments(_RID to id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIdPtr, NIL)
  }

  /**
   *
   */
  public fun clearIds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearIdsPtr, NIL)
  }

  /**
   *
   */
  public fun getIds(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  public companion object

  internal object MethodBindings {
    public val setUniformTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDUniform", "set_uniform_type")

    public val getUniformTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDUniform", "get_uniform_type")

    public val setBindingPtr: VoidPtr = TypeManager.getMethodBindPtr("RDUniform", "set_binding")

    public val getBindingPtr: VoidPtr = TypeManager.getMethodBindPtr("RDUniform", "get_binding")

    public val addIdPtr: VoidPtr = TypeManager.getMethodBindPtr("RDUniform", "add_id")

    public val clearIdsPtr: VoidPtr = TypeManager.getMethodBindPtr("RDUniform", "clear_ids")

    public val getIdsPtr: VoidPtr = TypeManager.getMethodBindPtr("RDUniform", "get_ids")
  }
}
