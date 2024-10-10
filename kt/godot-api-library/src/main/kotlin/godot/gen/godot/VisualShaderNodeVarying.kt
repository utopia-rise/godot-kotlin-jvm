// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Varying values are shader variables that can be passed between shader functions, e.g. from Vertex
 * shader to Fragment shader.
 */
@GodotBaseType
public open class VisualShaderNodeVarying internal constructor() : VisualShaderNode() {
  /**
   * Name of the variable. Must be unique.
   */
  public final inline var varyingName: String
    @JvmName("varyingNameProperty")
    get() = getVaryingName()
    @JvmName("varyingNameProperty")
    set(`value`) {
      setVaryingName(value)
    }

  /**
   * Type of the variable. Determines where the variable can be accessed.
   */
  public final inline var varyingType: VisualShader.VaryingType
    @JvmName("varyingTypeProperty")
    get() = getVaryingType()
    @JvmName("varyingTypeProperty")
    set(`value`) {
      setVaryingType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_VISUALSHADERNODEVARYING_INDEX, scriptIndex)
  }

  public final fun setVaryingName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setVaryingNamePtr, NIL)
  }

  public final fun getVaryingName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVaryingNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setVaryingType(type: VisualShader.VaryingType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setVaryingTypePtr, NIL)
  }

  public final fun getVaryingType(): VisualShader.VaryingType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVaryingTypePtr, LONG)
    return VisualShader.VaryingType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setVaryingNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_name", 83702148)

    public val getVaryingNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_name", 201670096)

    public val setVaryingTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_type", 3565867981)

    public val getVaryingTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_type", 523183580)
  }
}
