// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for the implementation of core resource importers.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/import_plugins.html]($DOCS_URL/tutorials/plugins/editor/import_plugins.html)
 *
 * This is the base class for the resource importers implemented in core. To implement your own resource importers using editor plugins, see [godot.EditorImportPlugin].
 */
@GodotBaseType
public open class ResourceImporter internal constructor() : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RESOURCEIMPORTER)
  }

  public enum class ImportOrder(
    id: Long
  ) {
    /**
     * The default import order.
     */
    IMPORT_ORDER_DEFAULT(0),
    /**
     * The import order for scenes, which ensures scenes are imported *after* all other core resources such as textures. Custom importers should generally have an import order lower than `100` to avoid issues when importing scenes that rely on custom resources.
     */
    IMPORT_ORDER_SCENE(100),
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
