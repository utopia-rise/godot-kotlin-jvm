// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Optimized translation.
 *
 * Optimized translation. Uses real-time compressed translations, which results in very small dictionaries.
 */
@GodotBaseType
public open class PHashTranslation : Translation() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHASHTRANSLATION)
  }

  /**
   * Generates and sets an optimized translation from the given [godot.Translation] resource.
   */
  public open fun generate(from: Translation): Unit {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHASHTRANSLATION_GENERATE, NIL)
  }
}
