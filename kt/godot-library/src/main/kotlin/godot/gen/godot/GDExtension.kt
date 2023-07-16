// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class GDExtension : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GDEXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun openLibrary(path: String, entrySymbol: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to entrySymbol)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSION_OPEN_LIBRARY, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   *
   */
  public fun closeLibrary(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSION_CLOSE_LIBRARY, NIL)
  }

  /**
   *
   */
  public fun isLibraryOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSION_IS_LIBRARY_OPEN, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   *
   */
  public fun getMinimumLibraryInitializationLevel(): InitializationLevel {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDEXTENSION_GET_MINIMUM_LIBRARY_INITIALIZATION_LEVEL, LONG)
    return GDExtension.InitializationLevel.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   *
   */
  public fun initializeLibrary(level: InitializationLevel): Unit {
    TransferContext.writeArguments(LONG to level.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDEXTENSION_INITIALIZE_LIBRARY, NIL)
  }

  public enum class InitializationLevel(
    id: Long,
  ) {
    /**
     *
     */
    INITIALIZATION_LEVEL_CORE(0),
    /**
     *
     */
    INITIALIZATION_LEVEL_SERVERS(1),
    /**
     *
     */
    INITIALIZATION_LEVEL_SCENE(2),
    /**
     *
     */
    INITIALIZATION_LEVEL_EDITOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
