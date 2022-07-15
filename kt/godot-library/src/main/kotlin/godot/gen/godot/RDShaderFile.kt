// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDShaderFile : Resource() {
  /**
   *
   */
  public var baseError: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_BASE_ERROR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_SET_BASE_ERROR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDSHADERFILE)
  }

  /**
   *
   */
  public fun setBytecode(bytecode: RDShaderSPIRV, version: StringName = StringName("")): Unit {
    TransferContext.writeArguments(OBJECT to bytecode, STRING_NAME to version)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_SET_BYTECODE, NIL)
  }

  /**
   *
   */
  public fun getSpirv(version: StringName = StringName("")): RDShaderSPIRV? {
    TransferContext.writeArguments(STRING_NAME to version)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_SPIRV, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as RDShaderSPIRV?
  }

  /**
   *
   */
  public fun getVersionList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSHADERFILE_GET_VERSION_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  public companion object
}
