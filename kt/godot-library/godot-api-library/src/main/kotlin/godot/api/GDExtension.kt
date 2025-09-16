// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * The [GDExtension] resource type represents a [url=https://en.wikipedia.org/wiki/Shared_library]shared library[/url] which can expand the functionality of the engine. The [GDExtensionManager] singleton is responsible for loading, reloading, and unloading [GDExtension] resources.
 *
 * **Note:** GDExtension itself is not a scripting language and has no relation to [GDScript] resources.
 */
@GodotBaseType
public open class GDExtension : Resource() {
  override fun new(scriptIndex: Int) {
    createNativeObject(221, scriptIndex)
  }

  /**
   * Returns `true` if this extension's library has been opened.
   */
  public final fun isLibraryOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLibraryOpenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the lowest level required for this extension to be properly initialized (see the [InitializationLevel] enum).
   */
  public final fun getMinimumLibraryInitializationLevel(): InitializationLevel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinimumLibraryInitializationLevelPtr, LONG)
    return InitializationLevel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class InitializationLevel(
    id: Long,
  ) {
    /**
     * The library is initialized at the same time as the core features of the engine.
     */
    CORE(0),
    /**
     * The library is initialized at the same time as the engine's servers (such as [RenderingServer] or [PhysicsServer3D]).
     */
    SERVERS(1),
    /**
     * The library is initialized at the same time as the engine's scene-related classes.
     */
    SCENE(2),
    /**
     * The library is initialized at the same time as the engine's editor classes. Only happens when loading the GDExtension in the editor.
     */
    EDITOR(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InitializationLevel = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val isLibraryOpenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "is_library_open", 36_873_697)

    internal val getMinimumLibraryInitializationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtension", "get_minimum_library_initialization_level", 964_858_755)
  }
}
