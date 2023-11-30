// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Imports native GLSL shaders (not Godot shaders) as a [godot.RDShaderFile].
 *
 * This imports native GLSL shaders as [godot.RDShaderFile] resources, for use with low-level [godot.RenderingDevice] operations. This importer does *not* handle `.gdshader` files.
 */
@GodotBaseType
public open class ResourceImporterShaderFile : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERSHADERFILE, scriptIndex)
    return true
  }

  public companion object
}
