// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEVARYING_INDEX, scriptIndex)
  }

  public final fun setVaryingName(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setVaryingNamePtr, NIL)
  }

  public final fun getVaryingName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVaryingNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setVaryingType(type: VisualShader.VaryingType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setVaryingTypePtr, NIL)
  }

  public final fun getVaryingType(): VisualShader.VaryingType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVaryingTypePtr, LONG)
    return VisualShader.VaryingType.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setVaryingNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_name", 83702148)

    public val getVaryingNamePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_name", 201670096)

    public val setVaryingTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVarying", "set_varying_type", 3565867981)

    public val getVaryingTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeVarying", "get_varying_type", 523183580)
  }
}
