// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFAnimation : Resource() {
  /**
   * The original name of the animation.
   */
  public var originalName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginalNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginalNamePtr, NIL)
    }

  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFANIMATION, scriptIndex)
  }

  /**
   * Gets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "get_original_name")

    public val setOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "set_original_name")

    public val getLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAnimation", "get_loop")

    public val setLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAnimation", "set_loop")

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "get_additional_data")

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "set_additional_data")
  }
}
