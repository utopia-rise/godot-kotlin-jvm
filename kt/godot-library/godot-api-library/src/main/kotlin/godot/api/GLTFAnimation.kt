// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class GLTFAnimation : Resource() {
  /**
   * The original name of the animation.
   */
  public final inline var originalName: String
    @JvmName("originalNameProperty")
    get() = getOriginalName()
    @JvmName("originalNameProperty")
    set(`value`) {
      setOriginalName(value)
    }

  public final inline var loop: Boolean
    @JvmName("loopProperty")
    get() = getLoop()
    @JvmName("loopProperty")
    set(`value`) {
      setLoop(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(225, scriptIndex)
  }

  public final fun getOriginalName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginalNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setOriginalName(originalName: String): Unit {
    TransferContext.writeArguments(STRING to originalName)
    TransferContext.callMethod(ptr, MethodBindings.setOriginalNamePtr, NIL)
  }

  public final fun getLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setLoopPtr, NIL)
  }

  /**
   * Gets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the glTF file), and the return value can be anything you set. If nothing was set, the
   * return value is `null`.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(ptr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the glTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(ptr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "get_original_name", 2841200299)

    internal val setOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "set_original_name", 83702148)

    internal val getLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "get_loop", 36873697)

    internal val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "set_loop", 2586408642)

    internal val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "get_additional_data", 2138907829)

    internal val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAnimation", "set_additional_data", 3776071444)
  }
}
