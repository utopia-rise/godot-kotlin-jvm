// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SHADERINCLUDE_INDEX: Int = 576

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
    Internals.callConstructor(this, ENGINE_CLASS_SHADERINCLUDE_INDEX, scriptIndex)
  }

  public final fun setCode(code: String): Unit {
    Internals.writeArguments(STRING to code)
    Internals.callMethod(rawPtr, MethodBindings.setCodePtr, NIL)
  }

  public final fun getCode(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCodePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setCodePtr: VoidPtr =
        Internals.getMethodBindPtr("ShaderInclude", "set_code", 83702148)

    internal val getCodePtr: VoidPtr =
        Internals.getMethodBindPtr("ShaderInclude", "get_code", 201670096)
  }
}
