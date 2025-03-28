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
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This object contains shader fragments from Godot's internal shaders. These can be used when
 * access to internal uniform buffers and/or internal functions is required for instance when composing
 * compositor effects or compute shaders. Only fragments for the current rendering device are loaded.
 */
@GodotBaseType
public open class ShaderIncludeDB : Object() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(592, scriptIndex)
  }

  public companion object {
    /**
     * Returns a list of built-in include files that are currently registered.
     */
    public final fun listBuiltInIncludeFiles(): PackedStringArray {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.listBuiltInIncludeFilesPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
    }

    /**
     * Returns `true` if an include file with this name exists.
     */
    public final fun hasBuiltInIncludeFile(filename: String): Boolean {
      TransferContext.writeArguments(STRING to filename)
      TransferContext.callMethod(0, MethodBindings.hasBuiltInIncludeFilePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }

    /**
     * Returns the code for the built-in shader fragment. You can also access this in your shader
     * code through `#include "filename"`.
     */
    public final fun getBuiltInIncludeFile(filename: String): String {
      TransferContext.writeArguments(STRING to filename)
      TransferContext.callMethod(0, MethodBindings.getBuiltInIncludeFilePtr, STRING)
      return (TransferContext.readReturnValue(STRING) as String)
    }
  }

  public object MethodBindings {
    internal val listBuiltInIncludeFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderIncludeDB", "list_built_in_include_files", 2981934095)

    internal val hasBuiltInIncludeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderIncludeDB", "has_built_in_include_file", 2323990056)

    internal val getBuiltInIncludeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderIncludeDB", "get_built_in_include_file", 1703090593)
  }
}
