// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getPerspectivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPerspectivePtr, NIL)
    }

  public var fov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFovPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFovPtr, NIL)
    }

  public var sizeMag: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizeMagPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSizeMagPtr, NIL)
    }

  public var depthFar: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthFarPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthFarPtr, NIL)
    }

  public var depthNear: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthNearPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthNearPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFCAMERA, scriptIndex)
    return true
  }

  public fun toNode(): Camera3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Camera3D?)
  }

  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    public fun fromNode(cameraNode: Camera3D): GLTFCamera? {
      TransferContext.writeArguments(OBJECT to cameraNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFCamera?)
    }

    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFCamera? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFCamera?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "from_node")

    public val toNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "to_node")

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "from_dictionary")

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "to_dictionary")

    public val getPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_perspective")

    public val setPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_perspective")

    public val getFovPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "get_fov")

    public val setFovPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "set_fov")

    public val getSizeMagPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "get_size_mag")

    public val setSizeMagPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "set_size_mag")

    public val getDepthFarPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "get_depth_far")

    public val setDepthFarPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFCamera", "set_depth_far")

    public val getDepthNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "get_depth_near")

    public val setDepthNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFCamera", "set_depth_near")
  }
}
