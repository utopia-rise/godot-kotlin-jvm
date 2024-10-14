// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var code: String
    @JvmName("codeProperty")
    get() = getCode()
    @JvmName("codeProperty")
    set(`value`) {
      setCode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SHADERINCLUDE, scriptIndex)
  }

  public final fun setCode(code: String): Unit {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(ptr, MethodBindings.setCodePtr, NIL)
  }

  public final fun getCode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderInclude", "set_code", 83702148)

    public val getCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderInclude", "get_code", 201670096)
  }
}
