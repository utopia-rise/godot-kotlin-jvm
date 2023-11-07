// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GDExtension : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GDEXTENSION, scriptIndex)
    return true
  }

  public fun openLibrary(path: String, entrySymbol: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to entrySymbol)
    TransferContext.callMethod(rawPtr, MethodBindings.openLibraryPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun closeLibrary(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closeLibraryPtr, NIL)
  }

  public fun isLibraryOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLibraryOpenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getMinimumLibraryInitializationLevel(): InitializationLevel {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumLibraryInitializationLevelPtr, LONG)
    return GDExtension.InitializationLevel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun initializeLibrary(level: InitializationLevel): Unit {
    TransferContext.writeArguments(LONG to level.id)
    TransferContext.callMethod(rawPtr, MethodBindings.initializeLibraryPtr, NIL)
  }

  public enum class InitializationLevel(
    id: Long,
  ) {
    INITIALIZATION_LEVEL_CORE(0),
    INITIALIZATION_LEVEL_SERVERS(1),
    INITIALIZATION_LEVEL_SCENE(2),
    INITIALIZATION_LEVEL_EDITOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val openLibraryPtr: VoidPtr = TypeManager.getMethodBindPtr("GDExtension", "open_library")

    public val closeLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "close_library")

    public val isLibraryOpenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "is_library_open")

    public val getMinimumLibraryInitializationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "get_minimum_library_initialization_level")

    public val initializeLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "initialize_library")
  }
}
