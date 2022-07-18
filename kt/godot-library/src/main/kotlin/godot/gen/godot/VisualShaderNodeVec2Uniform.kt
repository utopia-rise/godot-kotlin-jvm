// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Vector2] uniform to be used within the visual shader graph.
 *
 * Translated to `uniform vec2` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVec2Uniform : VisualShaderNodeUniform() {
  /**
   * Enables usage of the [defaultValue].
   */
  public var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC2UNIFORM_IS_DEFAULT_VALUE_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC2UNIFORM_SET_DEFAULT_VALUE_ENABLED,
          NIL.ordinal)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public var defaultValue: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC2UNIFORM_GET_DEFAULT_VALUE, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC2UNIFORM_SET_DEFAULT_VALUE, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVEC2UNIFORM)
  }

  public companion object
}
