// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress

/**
 * An optimized translation, used by default for CSV Translations. Uses real-time compressed translations, which results in very small dictionaries.
 */
@GodotBaseType
public open class OptimizedTranslation : Translation() {
  override fun new(scriptIndex: Int) {
    createNativeObject(432, scriptIndex)
  }

  /**
   * Generates and sets an optimized translation from the given [Translation] resource.
   *
   * **Note:** This method is intended to be used in the editor. It does nothing when called from an exported project.
   */
  public final fun generate(from: Translation?) {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(ptr, MethodBindings.generatePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val generatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptimizedTranslation", "generate", 1_466_479_800)
  }
}
