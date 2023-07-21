// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class GLTFCamera : Resource() {
  public var perspective: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_GET_PERSPECTIVE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_SET_PERSPECTIVE, NIL)
    }

  public var fov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_GET_FOV, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_SET_FOV, NIL)
    }

  public var sizeMag: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_GET_SIZE_MAG, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_SET_SIZE_MAG, NIL)
    }

  public var depthFar: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_GET_DEPTH_FAR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_SET_DEPTH_FAR, NIL)
    }

  public var depthNear: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_GET_DEPTH_NEAR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_SET_DEPTH_NEAR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFCAMERA, scriptIndex)
    return true
  }

  public fun toNode(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_TO_NODE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera3D?)
  }

  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_TO_DICTIONARY,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    public fun fromNode(cameraNode: Camera3D): GLTFCamera? {
      TransferContext.writeArguments(OBJECT to cameraNode)
      TransferContext.callMethod(null, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_FROM_NODE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFCamera?)
    }

    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFCamera? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(null, ENGINEMETHOD_ENGINECLASS_GLTFCAMERA_FROM_DICTIONARY, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFCamera?)
    }
  }
}
