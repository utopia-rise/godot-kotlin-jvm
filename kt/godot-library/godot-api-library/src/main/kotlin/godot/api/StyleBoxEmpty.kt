// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * An empty [StyleBox] that can be used to display nothing instead of the default style (e.g. it can "disable" `focus` styles).
 */
@GodotBaseType
public open class StyleBoxEmpty : StyleBox() {
  override fun new(scriptIndex: Int) {
    createNativeObject(641, scriptIndex)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _draw(toCanvasItem: RID, rect: Rect2): Unit {
    throw NotImplementedError("StyleBoxEmpty::_draw can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings
}
