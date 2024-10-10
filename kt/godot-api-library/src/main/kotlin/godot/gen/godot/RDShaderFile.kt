// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_RDSHADERFILE_INDEX: Int = 518

/**
 * Compiled shader file in SPIR-V form.
 * See also [RDShaderSource]. [RDShaderFile] is only meant to be used with the [RenderingDevice]
 * API. It should not be confused with Godot's own [Shader] resource, which is what Godot's various
 * nodes use for high-level shader programming.
 */
@GodotBaseType
public open class RDShaderFile : Resource() {
  /**
   * The base compilation error message, which indicates errors not related to a specific shader
   * stage if non-empty. If empty, shader compilation is not necessarily successful (check
   * [RDShaderSPIRV]'s error message members).
   */
  public final inline var baseError: String
    @JvmName("baseErrorProperty")
    get() = getBaseError()
    @JvmName("baseErrorProperty")
    set(`value`) {
      setBaseError(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDSHADERFILE_INDEX, scriptIndex)
  }

  /**
   * Sets the SPIR-V [bytecode] that will be compiled for the specified [version].
   */
  @JvmOverloads
  public final fun setBytecode(bytecode: RDShaderSPIRV?, version: StringName = StringName("")):
      Unit {
    Internals.writeArguments(OBJECT to bytecode, STRING_NAME to version)
    Internals.callMethod(rawPtr, MethodBindings.setBytecodePtr, NIL)
  }

  /**
   * Returns the SPIR-V intermediate representation for the specified shader [version].
   */
  @JvmOverloads
  public final fun getSpirv(version: StringName = StringName("")): RDShaderSPIRV? {
    Internals.writeArguments(STRING_NAME to version)
    Internals.callMethod(rawPtr, MethodBindings.getSpirvPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as RDShaderSPIRV?)
  }

  /**
   * Returns the list of compiled versions for this shader.
   */
  public final fun getVersionList(): VariantArray<StringName> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVersionListPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public final fun setBaseError(error: String): Unit {
    Internals.writeArguments(STRING to error)
    Internals.callMethod(rawPtr, MethodBindings.setBaseErrorPtr, NIL)
  }

  public final fun getBaseError(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBaseErrorPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setBytecodePtr: VoidPtr =
        Internals.getMethodBindPtr("RDShaderFile", "set_bytecode", 1558064255)

    public val getSpirvPtr: VoidPtr =
        Internals.getMethodBindPtr("RDShaderFile", "get_spirv", 3340165340)

    public val getVersionListPtr: VoidPtr =
        Internals.getMethodBindPtr("RDShaderFile", "get_version_list", 3995934104)

    public val setBaseErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDShaderFile", "set_base_error", 83702148)

    public val getBaseErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDShaderFile", "get_base_error", 201670096)
  }
}
