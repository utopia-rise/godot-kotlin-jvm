// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(739, scriptIndex)
  }

  public final fun setDescription(description: String): Unit {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(ptr, MethodBindings.setDescriptionPtr, NIL)
  }

  public final fun getDescription(): String {
    TransferContext.callMethod(ptr, MethodBindings.getDescriptionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "set_description", 83702148)

    internal val getDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeComment", "get_description", 201670096)
  }
}
