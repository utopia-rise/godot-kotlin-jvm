// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * InputEventShortcut is a special event that can be received in [Node.UnhandledKeyInput]. It is
 * typically sent by the editor's Command Palette to trigger actions, but can also be sent manually
 * using [Viewport.pushInput].
 */
@GodotBaseType
public open class InputEventShortcut : InputEvent() {
  /**
   * The [Shortcut] represented by this event. Its [Shortcut.matchesEvent] method will always return
   * `true` for this event.
   */
  public var shortcut: Shortcut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShortcutPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTSHORTCUT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "set_shortcut")

    public val getShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "get_shortcut")
  }
}
