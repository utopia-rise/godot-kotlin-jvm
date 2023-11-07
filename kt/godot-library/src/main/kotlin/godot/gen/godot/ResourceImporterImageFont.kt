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
 * This image-based workflow can be easier to use than [ResourceImporterBMFont], but it requires all
 * glyphs to have the same width and height. This makes [ResourceImporterImageFont] most suited to
 * fixed-width fonts.
 * See also [ResourceImporterDynamicFont].
 */
@GodotBaseType
public open class ResourceImporterImageFont internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERIMAGEFONT, scriptIndex)
    return true
  }

  public companion object
}
