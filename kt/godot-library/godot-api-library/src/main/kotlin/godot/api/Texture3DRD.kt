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
import godot.core.RID
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This texture class allows you to use a 3D texture created directly on the [RenderingDevice] as a
 * texture for materials, meshes, etc.
 */
@GodotBaseType
public open class Texture3DRD : Texture3D() {
  /**
   * The RID of the texture object created on the [RenderingDevice].
   */
  public final inline var textureRdRid: RID
    @JvmName("textureRdRidProperty")
    get() = getTextureRdRid()
    @JvmName("textureRdRidProperty")
    set(`value`) {
      setTextureRdRid(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(678, scriptIndex)
  }

  public final fun setTextureRdRid(textureRdRid: RID): Unit {
    TransferContext.writeArguments(_RID to textureRdRid)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRdRidPtr, NIL)
  }

  public final fun getTextureRdRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRdRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val setTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture3DRD", "set_texture_rd_rid", 2722037293)

    internal val getTextureRdRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture3DRD", "get_texture_rd_rid", 2944877500)
  }
}
