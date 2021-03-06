// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * Optimized translation.
 *
 * Optimized translation. Uses real-time compressed translations, which results in very small dictionaries.
 */
@GodotBaseType
open class PHashTranslation : Translation() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PHASHTRANSLATION)

  /**
   * Generates and sets an optimized translation from the given [godot.Translation] resource.
   */
  open fun generate(from: Translation) {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHASHTRANSLATION_GENERATE, NIL)
  }
}
