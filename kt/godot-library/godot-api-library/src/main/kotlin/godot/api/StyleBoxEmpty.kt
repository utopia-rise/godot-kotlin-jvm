// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_STYLEBOXEMPTY: Int = 626

/**
 * An empty [StyleBox] that can be used to display nothing instead of the default style (e.g. it can
 * "disable" `focus` styles).
 */
@GodotBaseType
public open class StyleBoxEmpty : StyleBox() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_STYLEBOXEMPTY, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
