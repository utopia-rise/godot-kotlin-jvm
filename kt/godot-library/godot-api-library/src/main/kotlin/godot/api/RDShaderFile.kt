// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Compiled shader file in SPIR-V form.
 *
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
    createNativeObject(532, scriptIndex)
  }

  /**
   * Sets the SPIR-V [bytecode] that will be compiled for the specified [version].
   */
  public final fun setBytecode(bytecode: RDShaderSPIRV?, version: StringName = StringName("")):
      Unit {
    TransferContext.writeArguments(OBJECT to bytecode, STRING_NAME to version)
    TransferContext.callMethod(ptr, MethodBindings.setBytecodePtr, NIL)
  }

  /**
   * Returns the SPIR-V intermediate representation for the specified shader [version].
   */
  public final fun getSpirv(version: StringName = StringName("")): RDShaderSPIRV? {
    TransferContext.writeArguments(STRING_NAME to version)
    TransferContext.callMethod(ptr, MethodBindings.getSpirvPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as RDShaderSPIRV?)
  }

  /**
   * Returns the list of compiled versions for this shader.
   */
  public final fun getVersionList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVersionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public final fun setBaseError(error: String): Unit {
    TransferContext.writeArguments(STRING to error)
    TransferContext.callMethod(ptr, MethodBindings.setBaseErrorPtr, NIL)
  }

  public final fun getBaseError(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseErrorPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the SPIR-V [bytecode] that will be compiled for the specified [version].
   */
  public final fun setBytecode(bytecode: RDShaderSPIRV?, version: String) =
      setBytecode(bytecode, version.asCachedStringName())

  /**
   * Returns the SPIR-V intermediate representation for the specified shader [version].
   */
  public final fun getSpirv(version: String): RDShaderSPIRV? =
      getSpirv(version.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setBytecodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderFile", "set_bytecode", 1526857008)

    internal val getSpirvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderFile", "get_spirv", 2689310080)

    internal val getVersionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderFile", "get_version_list", 3995934104)

    internal val setBaseErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderFile", "set_base_error", 83702148)

    internal val getBaseErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDShaderFile", "get_base_error", 201670096)
  }
}
