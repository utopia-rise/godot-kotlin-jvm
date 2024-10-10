// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_TEXTSERVERDUMMY_INDEX: Int = 645

/**
 * A dummy [TextServer] interface that doesn't do anything. Useful for freeing up memory when
 * rendering text is not needed, as text servers are resource-intensive. It can also be used for
 * performance comparisons in complex GUIs to check the impact of text rendering.
 * A dummy text server is always available at the start of a project. Here's how to access it:
 * [codeblock]
 * var dummy_text_server = TextServerManager.find_interface("Dummy")
 * if dummy_text_server != null:
 *     TextServerManager.set_primary_interface(dummy_text_server)
 *     # If the other text servers are unneeded, they can be removed:
 *     for i in TextServerManager.get_interface_count():
 *         var text_server = TextServerManager.get_interface(i)
 *         if text_server != dummy_text_server:
 *             TextServerManager.remove_interface(text_server)
 * [/codeblock]
 * The command line argument `--text-driver Dummy` (case-sensitive) can be used to force the "Dummy"
 * [TextServer] on any project.
 */
@GodotBaseType
public open class TextServerDummy : TextServerExtension() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TEXTSERVERDUMMY_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
