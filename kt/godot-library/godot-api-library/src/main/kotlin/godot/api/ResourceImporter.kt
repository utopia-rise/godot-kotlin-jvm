// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This is the base class for Godot's resource importers. To implement your own resource importers
 * using editor plugins, see [EditorImportPlugin].
 */
@GodotBaseType
public open class ResourceImporter internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(564, scriptIndex)
  }

  public enum class ImportOrder(
    id: Long,
  ) {
    /**
     * The default import order.
     */
    DEFAULT(0),
    /**
     * The import order for scenes, which ensures scenes are imported *after* all other core
     * resources such as textures. Custom importers should generally have an import order lower than
     * `100` to avoid issues when importing scenes that rely on custom resources.
     */
    SCENE(100),
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

  public object MethodBindings
}
