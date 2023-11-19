// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class GLTFTextureSampler : Resource() {
  public var magFilter: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagFilterPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMagFilterPtr, NIL)
    }

  public var minFilter: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinFilterPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinFilterPtr, NIL)
    }

  public var wrapS: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWrapSPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWrapSPtr, NIL)
    }

  public var wrapT: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWrapTPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWrapTPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFTEXTURESAMPLER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_mag_filter")

    public val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_mag_filter")

    public val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_min_filter")

    public val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_min_filter")

    public val getWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_s")

    public val setWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_s")

    public val getWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_t")

    public val setWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_t")
  }
}
