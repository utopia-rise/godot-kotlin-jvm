// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_GDEXTENSION_INDEX: Int = 230

/**
 * The [GDExtension] resource type represents a
 * [url=https://en.wikipedia.org/wiki/Shared_library]shared library[/url] which can expand the
 * functionality of the engine. The [GDExtensionManager] singleton is responsible for loading,
 * reloading, and unloading [GDExtension] resources.
 * **Note:** GDExtension itself is not a scripting language and has no relation to [GDScript]
 * resources.
 */
@GodotBaseType
public open class GDExtension : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GDEXTENSION_INDEX, scriptIndex)
  }

  /**
   * Returns `true` if this extension's library has been opened.
   */
  public final fun isLibraryOpen(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isLibraryOpenPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the lowest level required for this extension to be properly initialized (see the
   * [InitializationLevel] enum).
   */
  public final fun getMinimumLibraryInitializationLevel(): InitializationLevel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinimumLibraryInitializationLevelPtr, LONG)
    return GDExtension.InitializationLevel.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class InitializationLevel(
    id: Long,
  ) {
    /**
     * The library is initialized at the same time as the core features of the engine.
     */
    INITIALIZATION_LEVEL_CORE(0),
    /**
     * The library is initialized at the same time as the engine's servers (such as
     * [RenderingServer] or [PhysicsServer3D]).
     */
    INITIALIZATION_LEVEL_SERVERS(1),
    /**
     * The library is initialized at the same time as the engine's scene-related classes.
     */
    INITIALIZATION_LEVEL_SCENE(2),
    /**
     * The library is initialized at the same time as the engine's editor classes. Only happens when
     * loading the GDExtension in the editor.
     */
    INITIALIZATION_LEVEL_EDITOR(3),
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

  internal object MethodBindings {
    public val isLibraryOpenPtr: VoidPtr =
        Internals.getMethodBindPtr("GDExtension", "is_library_open", 36873697)

    public val getMinimumLibraryInitializationLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("GDExtension", "get_minimum_library_initialization_level", 964858755)
  }
}
