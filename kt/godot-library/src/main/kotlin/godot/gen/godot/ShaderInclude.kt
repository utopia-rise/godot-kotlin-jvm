// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A shader include file, saved with the `.gdshaderinc` extension. This class allows you to define a
 * custom shader snippet that can be included in a [Shader] by using the preprocessor directive
 * `#include`, followed by the file path (e.g. `#include "res://shader_lib.gdshaderinc"`). The snippet
 * doesn't have to be a valid shader on its own.
 */
@GodotBaseType
public open class ShaderInclude : Resource() {
  /**
   * Returns the code of the shader include file. The returned text is what the user has written,
   * not the full generated code used internally.
   */
  public var code: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCodePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCodePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADERINCLUDE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCodePtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderInclude", "set_code")

    public val getCodePtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderInclude", "get_code")
  }
}
