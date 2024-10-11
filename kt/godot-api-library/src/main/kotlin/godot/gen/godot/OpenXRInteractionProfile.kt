// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OPENXRINTERACTIONPROFILE_INDEX: Int = 431

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
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRINTERACTIONPROFILE_INDEX, scriptIndex)
  }

  public final fun setInteractionProfilePath(interactionProfilePath: String): Unit {
    Internals.writeArguments(STRING to interactionProfilePath)
    Internals.callMethod(rawPtr, MethodBindings.setInteractionProfilePathPtr, NIL)
  }

  public final fun getInteractionProfilePath(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInteractionProfilePathPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Get the number of bindings in this interaction profile.
   */
  public final fun getBindingCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBindingCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve the binding at this index.
   */
  public final fun getBinding(index: Int): OpenXRIPBinding? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBindingPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OpenXRIPBinding?)
  }

  public final fun setBindings(bindings: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to bindings)
    Internals.callMethod(rawPtr, MethodBindings.setBindingsPtr, NIL)
  }

  public final fun getBindings(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBindingsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public companion object

  public object MethodBindings {
    internal val setInteractionProfilePathPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "set_interaction_profile_path", 83702148)

    internal val getInteractionProfilePathPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "get_interaction_profile_path", 201670096)

    internal val getBindingCountPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "get_binding_count", 3905245786)

    internal val getBindingPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "get_binding", 3934429652)

    internal val setBindingsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "set_bindings", 381264803)

    internal val getBindingsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfile", "get_bindings", 3995934104)
  }
}
