// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Transform3D] uniform for use within the visual shader graph.
 *
 * Translated to `uniform mat4` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeTransformUniform : VisualShaderNodeUniform() {
  /**
   * Enables usage of the [defaultValue].
   */
  public open var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMUNIFORM_GET_DEFAULT_VALUE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMUNIFORM_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public open var defaultValue: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMUNIFORM_GET_DEFAULT_VALUE, TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMUNIFORM_SET_DEFAULT_VALUE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMUNIFORM)
  }

  public companion object
}
