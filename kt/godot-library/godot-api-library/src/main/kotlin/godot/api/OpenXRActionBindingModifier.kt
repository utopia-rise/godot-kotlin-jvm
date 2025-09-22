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
 * Binding modifier that applies on individual actions related to an interaction profile.
 */
@GodotBaseType
public open class OpenXRActionBindingModifier : OpenXRBindingModifier() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(422, scriptIndex)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getDescription(): String {
    throw NotImplementedError("OpenXRActionBindingModifier::_getDescription can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getIpModification(): PackedByteArray {
    throw NotImplementedError("OpenXRActionBindingModifier::_getIpModification can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings
}
