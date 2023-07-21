// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class GLTFLight : Resource() {
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_COLOR, NIL)
    }

  public var intensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_INTENSITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_INTENSITY, NIL)
    }

  public var lightType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_LIGHT_TYPE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_LIGHT_TYPE, NIL)
    }

  public var range: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_RANGE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_RANGE, NIL)
    }

  public var innerConeAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_INNER_CONE_ANGLE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_INNER_CONE_ANGLE,
          NIL)
    }

  public var outerConeAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_GET_OUTER_CONE_ANGLE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_SET_OUTER_CONE_ANGLE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFLIGHT, scriptIndex)
    return true
  }

  public fun toNode(): Light3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_TO_NODE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Light3D?)
  }

  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_TO_DICTIONARY, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    public fun fromNode(lightNode: Light3D): GLTFLight? {
      TransferContext.writeArguments(OBJECT to lightNode)
      TransferContext.callMethod(null, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_FROM_NODE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFLight?)
    }

    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFLight? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(null, ENGINEMETHOD_ENGINECLASS_GLTFLIGHT_FROM_DICTIONARY, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFLight?)
    }
  }
}
