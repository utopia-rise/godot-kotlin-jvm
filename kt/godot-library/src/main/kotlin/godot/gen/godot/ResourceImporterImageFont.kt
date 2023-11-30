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
 * Imports a fixed-width bitmap font where all glyphs have the same width and height.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_using_fonts.html#bitmap-fonts]($DOCS_URL/tutorials/ui/gui_using_fonts.html#bitmap-fonts)
 *
 * This image-based workflow can be easier to use than [godot.ResourceImporterBMFont], but it requires all glyphs to have the same width and height. This makes [godot.ResourceImporterImageFont] most suited to fixed-width fonts.
 *
 * See also [godot.ResourceImporterDynamicFont].
 */
@GodotBaseType
public open class ResourceImporterImageFont : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERIMAGEFONT, scriptIndex)
    return true
  }

  public companion object
}
