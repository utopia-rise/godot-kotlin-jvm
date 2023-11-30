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
 * Imports a bitmap font in the BMFont (`.fnt`) format.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_using_fonts.html#bitmap-fonts]($DOCS_URL/tutorials/ui/gui_using_fonts.html#bitmap-fonts)
 *
 * The BMFont format is a format created by the [godot.BMFont](https://www.angelcode.com/products/bmfont/) program. Many BMFont-compatible programs also exist, like [godot.BMGlyph](https://www.bmglyph.com/).
 *
 * Compared to [godot.ResourceImporterImageFont], [godot.ResourceImporterBMFont] supports bitmap fonts with varying glyph widths/heights.
 *
 * See also [godot.ResourceImporterDynamicFont].
 */
@GodotBaseType
public open class ResourceImporterBMFont : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERBMFONT, scriptIndex)
    return true
  }

  public companion object
}
