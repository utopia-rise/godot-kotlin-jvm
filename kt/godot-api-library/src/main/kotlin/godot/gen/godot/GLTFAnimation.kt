// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFANIMATION_INDEX: Int = 251

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
    Internals.callConstructor(this, ENGINE_CLASS_GLTFANIMATION_INDEX, scriptIndex)
  }

  public final fun getOriginalName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOriginalNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setOriginalName(originalName: String): Unit {
    Internals.writeArguments(STRING to originalName)
    Internals.callMethod(rawPtr, MethodBindings.setOriginalNamePtr, NIL)
  }

  public final fun getLoop(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLoopPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    Internals.writeArguments(BOOL to loop)
    Internals.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
  }

  /**
   * Gets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    Internals.writeArguments(STRING_NAME to extensionName)
    Internals.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFAnimation] instance. This can be used to keep
   * per-node state data in [GLTFDocumentExtension] classes, which is important because they are
   * stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    Internals.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    Internals.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getOriginalNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "get_original_name", 2841200299)

    internal val setOriginalNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "set_original_name", 83702148)

    internal val getLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "get_loop", 36873697)

    internal val setLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "set_loop", 2586408642)

    internal val getAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "get_additional_data", 2138907829)

    internal val setAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFAnimation", "set_additional_data", 3776071444)
  }
}
