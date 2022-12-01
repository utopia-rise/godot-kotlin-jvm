// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class EditorResourceConversionPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _convertsTo(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }

  /**
   *
   */
  public open fun _handles(resource: Resource): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourceConversionPlugin")
  }

  /**
   *
   */
  public open fun _convert(resource: Resource): Resource? {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  public companion object
}
