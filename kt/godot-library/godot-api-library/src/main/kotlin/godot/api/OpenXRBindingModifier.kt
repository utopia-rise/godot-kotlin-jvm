// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Binding modifier base class. Subclasses implement various modifiers that alter how an OpenXR
 * runtime processes inputs.
 */
@GodotBaseType
public open class OpenXRBindingModifier internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(416, scriptIndex)
  }

  /**
   * Return the description of this class that is used for the title bar of the binding modifier
   * editor.
   */
  public open fun _getDescription(): String {
    throw NotImplementedError("_getDescription is not implemented for OpenXRBindingModifier")
  }

  /**
   * Returns the data that is sent to OpenXR when submitting the suggested interacting bindings this
   * modifier is a part of.
   * **Note:** This must be data compatible with a `XrBindingModificationBaseHeaderKHR` structure.
   */
  public open fun _getIpModification(): PackedByteArray {
    throw NotImplementedError("_getIpModification is not implemented for OpenXRBindingModifier")
  }

  public companion object

  public object MethodBindings
}
