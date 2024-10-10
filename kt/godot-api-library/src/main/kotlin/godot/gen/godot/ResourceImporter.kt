// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_RESOURCEIMPORTER_INDEX: Int = 550

/**
 * This is the base class for Godot's resource importers. To implement your own resource importers
 * using editor plugins, see [EditorImportPlugin].
 */
@GodotBaseType
public open class ResourceImporter internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RESOURCEIMPORTER_INDEX, scriptIndex)
  }

  public enum class ImportOrder(
    id: Long,
  ) {
    /**
     * The default import order.
     */
    IMPORT_ORDER_DEFAULT(0),
    /**
     * The import order for scenes, which ensures scenes are imported *after* all other core
     * resources such as textures. Custom importers should generally have an import order lower than
     * `100` to avoid issues when importing scenes that rely on custom resources.
     */
    IMPORT_ORDER_SCENE(100),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ImportOrder = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings
}
