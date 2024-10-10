// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_OPTIMIZEDTRANSLATION_INDEX: Int = 434

/**
 * An optimized translation, used by default for CSV Translations. Uses real-time compressed
 * translations, which results in very small dictionaries.
 */
@GodotBaseType
public open class OptimizedTranslation : Translation() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OPTIMIZEDTRANSLATION_INDEX, scriptIndex)
  }

  /**
   * Generates and sets an optimized translation from the given [Translation] resource.
   */
  public final fun generate(from: Translation?): Unit {
    Internals.writeArguments(OBJECT to from)
    Internals.callMethod(rawPtr, MethodBindings.generatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val generatePtr: VoidPtr =
        Internals.getMethodBindPtr("OptimizedTranslation", "generate", 1466479800)
  }
}
