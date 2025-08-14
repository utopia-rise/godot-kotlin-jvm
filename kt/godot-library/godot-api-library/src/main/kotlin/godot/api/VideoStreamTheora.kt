// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress

/**
 * [VideoStream] resource handling the [url=https://www.theora.org/]Ogg Theora[/url] video format with `.ogv` extension. The Theora codec is decoded on the CPU.
 *
 * **Note:** While Ogg Theora videos can also have an `.ogg` extension, you will have to rename the extension to `.ogv` to use those videos within Godot.
 */
@GodotBaseType
public open class VideoStreamTheora : VideoStream() {
  override fun new(scriptIndex: Int) {
    createNativeObject(718, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
