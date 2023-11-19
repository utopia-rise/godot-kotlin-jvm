// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class OpenXRInteractionProfile : Resource() {
  public var interactionProfilePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfilePathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInteractionProfilePathPtr, NIL)
    }

  public var bindings: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBindingsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBindingsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILE, scriptIndex)
    return true
  }

  public fun getBindingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBindingCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBinding(index: Int): OpenXRIPBinding? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBindingPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRIPBinding?)
  }

  public companion object

  internal object MethodBindings {
    public val setInteractionProfilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "set_interaction_profile_path")

    public val getInteractionProfilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_interaction_profile_path")

    public val getBindingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_binding_count")

    public val getBindingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_binding")

    public val setBindingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "set_bindings")

    public val getBindingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_bindings")
  }
}
