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
 * [VideoStream] resource handling the [url=https://www.theora.org/]Ogg Theora[/url] video format
 * with `.ogv` extension. The Theora codec is decoded on the CPU.
 * **Note:** While Ogg Theora videos can also have an `.ogg` extension, you will have to rename the
 * extension to `.ogv` to use those videos within Godot.
 */
@GodotBaseType
public open class VideoStreamTheora : VideoStream() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VIDEOSTREAMTHEORA, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
