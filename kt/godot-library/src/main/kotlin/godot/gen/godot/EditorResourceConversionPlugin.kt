// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Plugin for adding custom converters from one resource format to another in the editor resource picker context menu; for example, converting a [godot.StandardMaterial3D] to a [godot.ShaderMaterial].
 *
 * [godot.EditorResourceConversionPlugin] is invoked when the context menu is brought up for a resource in the editor inspector. Relevant conversion plugins will appear as menu options to convert the given resource to a target type.
 *
 * Below shows an example of a basic plugin that will convert an [godot.ImageTexture] to a [godot.PortableCompressedTexture2D].
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * extends EditorResourceConversionPlugin
 *
 *
 *
 * func _handles(resource : Resource):
 *
 *     return resource is ImageTexture
 *
 *
 *
 * func _converts_to():
 *
 *     return "PortableCompressedTexture2D"
 *
 *
 *
 * func _convert(itex : Resource):
 *
 *     var ptex = PortableCompressedTexture2D.new()
 *
 *     ptex.create_from_image(itex.get_image(), PortableCompressedTexture2D.COMPRESSION_MODE_LOSSLESS)
 *
 *     return ptex
 *
 * [/gdscript]
 *
 * [/codeblocks]
 *
 * To use an [godot.EditorResourceConversionPlugin], register it using the [godot.EditorPlugin.addResourceConversionPlugin] method first.
 */
@GodotBaseType
public open class EditorResourceConversionPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCECONVERSIONPLUGIN, scriptIndex)
    return true
  }

  /**
   * Returns the class name of the target type of [godot.Resource] that this plugin converts source resources to.
   */
  public open fun _convertsTo(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }

  /**
   * Called to determine whether a particular [godot.Resource] can be converted to the target resource type by this plugin.
   */
  public open fun _handles(resource: Resource): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourceConversionPlugin")
  }

  /**
   * Takes an input [godot.Resource] and converts it to the type given in [_convertsTo]. The returned [godot.Resource] is the result of the conversion, and the input [godot.Resource] remains unchanged.
   */
  public open fun _convert(resource: Resource): Resource? {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  public companion object
}
