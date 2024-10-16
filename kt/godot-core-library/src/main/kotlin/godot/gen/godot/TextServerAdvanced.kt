// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An implementation of [TextServer] that uses HarfBuzz, ICU and SIL Graphite to support BiDi,
 * complex text layouts and contextual OpenType features. This is Godot's default primary [TextServer]
 * interface.
 */
@GodotBaseType
public open class TextServerAdvanced : TextServerExtension() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_TEXTSERVERADVANCED, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
