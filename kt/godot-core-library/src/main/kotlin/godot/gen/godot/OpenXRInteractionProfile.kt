// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.internal.memory.TransferContext
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This object stores suggested bindings for an interaction profile. Interaction profiles define the
 * metadata for a tracked XR device such as an XR controller.
 * For more information see the
 * [url=https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-interaction-profiles]interaction
 * profiles info in the OpenXR specification[/url].
 */
@GodotBaseType
public open class OpenXRInteractionProfile : Resource() {
  /**
   * The interaction profile path identifying the XR device.
   */
  public final inline var interactionProfilePath: String
    @JvmName("interactionProfilePathProperty")
    get() = getInteractionProfilePath()
    @JvmName("interactionProfilePathProperty")
    set(`value`) {
      setInteractionProfilePath(value)
    }

  /**
   * Action bindings for this interaction profile.
   */
  public final inline var bindings: VariantArray<Any?>
    @JvmName("bindingsProperty")
    get() = getBindings()
    @JvmName("bindingsProperty")
    set(`value`) {
      setBindings(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILE, scriptIndex)
  }

  public final fun setInteractionProfilePath(interactionProfilePath: String): Unit {
    TransferContext.writeArguments(STRING to interactionProfilePath)
    TransferContext.callMethod(ptr, MethodBindings.setInteractionProfilePathPtr, NIL)
  }

  public final fun getInteractionProfilePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInteractionProfilePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Get the number of bindings in this interaction profile.
   */
  public final fun getBindingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve the binding at this index.
   */
  public final fun getBinding(index: Int): OpenXRIPBinding? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindingPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRIPBinding?)
  }

  public final fun setBindings(bindings: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to bindings)
    TransferContext.callMethod(ptr, MethodBindings.setBindingsPtr, NIL)
  }

  public final fun getBindings(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val setInteractionProfilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "set_interaction_profile_path", 83702148)

    public val getInteractionProfilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_interaction_profile_path", 201670096)

    public val getBindingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_binding_count", 3905245786)

    public val getBindingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_binding", 3934429652)

    public val setBindingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "set_bindings", 381264803)

    public val getBindingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfile", "get_bindings", 3995934104)
  }
}
