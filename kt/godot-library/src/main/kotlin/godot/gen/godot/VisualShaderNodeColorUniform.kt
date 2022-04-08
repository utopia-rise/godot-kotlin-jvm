// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Color] uniform to be used within the visual shader graph.
 *
 * Translated to `uniform vec4` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeColorUniform : VisualShaderNodeUniform() {
  /**
   * Enables usage of the [defaultValue].
   */
  public var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORUNIFORM_IS_DEFAULT_VALUE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORUNIFORM_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public var defaultValue: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORUNIFORM_GET_DEFAULT_VALUE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORUNIFORM_SET_DEFAULT_VALUE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLORUNIFORM)
  }

  public companion object
}
