// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An optimized translation, used by default for CSV Translations. Uses real-time compressed
 * translations, which results in very small dictionaries.
 */
@GodotBaseType
public open class OptimizedTranslation : Translation() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPTIMIZEDTRANSLATION, scriptIndex)
  }

  /**
   * Generates and sets an optimized translation from the given [Translation] resource.
   */
  public final fun generate(from: Translation?): Unit {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(ptr, MethodBindings.generatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val generatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OptimizedTranslation", "generate", 1466479800)
  }
}
