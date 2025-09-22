// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Binding modifier base class. Subclasses implement various modifiers that alter how an OpenXR
 * runtime processes inputs.
 */
@GodotBaseType
public abstract class OpenXRBindingModifier internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(425, scriptIndex)
  }

  /**
   * Return the description of this class that is used for the title bar of the binding modifier
   * editor.
   */
  public abstract fun _getDescription(): String

  /**
   * Returns the data that is sent to OpenXR when submitting the suggested interacting bindings this
   * modifier is a part of.
   *
   * **Note:** This must be data compatible with an `XrBindingModificationBaseHeaderKHR` structure.
   */
  public abstract fun _getIpModification(): PackedByteArray

  public companion object

  public object MethodBindings
}
