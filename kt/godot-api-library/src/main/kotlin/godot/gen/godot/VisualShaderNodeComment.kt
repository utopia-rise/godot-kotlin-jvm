// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODECOMMENT_INDEX: Int = 715

/**
 * This node was replaced by [VisualShaderNodeFrame] and only exists to preserve compatibility. In
 * the [VisualShader] editor it behaves exactly like [VisualShaderNodeFrame].
 */
@GodotBaseType
public open class VisualShaderNodeComment : VisualShaderNodeFrame() {
  /**
   * This property only exists to preserve data authored in earlier versions of Godot. It has
   * currently no function.
   */
  public final inline var description: String
    @JvmName("descriptionProperty")
    get() = getDescription()
    @JvmName("descriptionProperty")
    set(`value`) {
      setDescription(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODECOMMENT_INDEX, scriptIndex)
  }

  public final fun setDescription(description: String): Unit {
    Internals.writeArguments(STRING to description)
    Internals.callMethod(rawPtr, MethodBindings.setDescriptionPtr, NIL)
  }

  public final fun getDescription(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDescriptionPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setDescriptionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeComment", "set_description", 83702148)

    public val getDescriptionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeComment", "get_description", 201670096)
  }
}
