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
 * The BMFont format is a format created by the
 * [url=https://www.angelcode.com/products/bmfont/]BMFont[/url] program. Many BMFont-compatible
 * programs also exist, like [url=https://www.bmglyph.com/]BMGlyph[/url].
 * Compared to [ResourceImporterImageFont], [ResourceImporterBMFont] supports bitmap fonts with
 * varying glyph widths/heights.
 * See also [ResourceImporterDynamicFont].
 */
@GodotBaseType
public open class ResourceImporterBMFont internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERBMFONT, scriptIndex)
    return true
  }

  public companion object
}
