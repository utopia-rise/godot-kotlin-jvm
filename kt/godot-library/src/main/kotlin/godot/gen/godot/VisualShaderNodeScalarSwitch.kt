// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * A boolean/scalar function for use within the visual shader graph.
 *
 * Returns an associated scalar if the provided boolean value is `true` or `false`.
 */
@GodotBaseType
open class VisualShaderNodeScalarSwitch : VisualShaderNodeSwitch() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODESCALARSWITCH)
}
