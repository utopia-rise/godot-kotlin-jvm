// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Vector3] uniform to be used within the visual shader graph.
 *
 * Translated to `uniform vec3` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVec3Uniform : VisualShaderNodeUniform() {
  /**
   * A default value to be assigned within the shader.
   */
  public open var defaultValue: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3UNIFORM_GET_DEFAULT_VALUE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3UNIFORM_SET_DEFAULT_VALUE, NIL)
    }

  /**
   * Enables usage of the [defaultValue].
   */
  public open var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3UNIFORM_GET_DEFAULT_VALUE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVEC3UNIFORM_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVEC3UNIFORM)
  }

  @CoreTypeHelper
  public open fun defaultValue(schedule: Vector3.() -> Unit): Vector3 = defaultValue.apply{
      schedule(this)
      defaultValue = this
  }

}
