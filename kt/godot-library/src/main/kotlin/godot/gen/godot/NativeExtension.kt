// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.NativeExtension
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
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
public open class NativeExtension : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NATIVEEXTENSION)
  }

  /**
   *
   */
  public fun openLibrary(path: String, entrySymbol: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to entrySymbol)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSION_OPEN_LIBRARY,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun closeLibrary(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSION_CLOSE_LIBRARY,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun isLibraryOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSION_IS_LIBRARY_OPEN,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getMinimumLibraryInitializationLevel(): NativeExtension.InitializationLevel {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSION_GET_MINIMUM_LIBRARY_INITIALIZATION_LEVEL,
        LONG.ordinal)
    return NativeExtension.InitializationLevel.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun initializeLibrary(level: NativeExtension.InitializationLevel): Unit {
    TransferContext.writeArguments(LONG to level.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSION_INITIALIZE_LIBRARY,
        NIL.ordinal)
  }

  public enum class InitializationLevel(
    id: Long
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
    INITIALIZATION_LEVEL_DRIVER(3),
    /**
     *
     */
    INITIALIZATION_LEVEL_EDITOR(4),
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
