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

private const val ENGINECLASS_SEPARATOR: Int = 573

/**
 * Abstract base class for separators, used for separating other controls. [Separator]s are purely
 * visual and normally drawn as a [StyleBoxLine].
 */
@GodotBaseType
public open class Separator internal constructor() : Control() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_SEPARATOR, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
