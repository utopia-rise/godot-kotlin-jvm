// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Rect2
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * An empty [StyleBox] that can be used to display nothing instead of the default style (e.g. it can
 * "disable" `focus` styles).
 */
@GodotBaseType
public open class StyleBoxEmpty : StyleBox() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(658, scriptPtr)
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
