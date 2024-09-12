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
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * InputEventShortcut is a special event that can be received in [Node.Input], [Node.ShortcutInput],
 * and [Node.UnhandledInput]. It is typically sent by the editor's Command Palette to trigger actions,
 * but can also be sent manually using [Viewport.pushInput].
 */
@GodotBaseType
public open class InputEventShortcut : InputEvent() {
  /**
   * The [Shortcut] represented by this event. Its [Shortcut.matchesEvent] method will always return
   * `true` for this event.
   */
  public final inline var shortcut: Shortcut?
    @JvmName("shortcutProperty")
    get() = getShortcut()
    @JvmName("shortcutProperty")
    set(`value`) {
      setShortcut(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTSHORTCUT, scriptIndex)
  }

  public final fun setShortcut(shortcut: Shortcut?): Unit {
    TransferContext.writeArguments(OBJECT to shortcut)
    TransferContext.callMethod(rawPtr, MethodBindings.setShortcutPtr, NIL)
  }

  public final fun getShortcut(): Shortcut? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShortcutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shortcut?)
  }

  public companion object

  internal object MethodBindings {
    public val setShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "set_shortcut", 857163497)

    public val getShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventShortcut", "get_shortcut", 3766804753)
  }
}
