// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * [MultiMeshInstance2D] is a specialized node to instance a [MultiMesh] resource in 2D.
 *
 * Usage is the same as [MultiMeshInstance3D].
 */
@GodotBaseType
public open class MultiMeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  public val textureChanged: Signal0 by Signal0

  /**
   * The [MultiMesh] that will be drawn by the [MultiMeshInstance2D].
   */
  public final inline var multimesh: MultiMesh?
    @JvmName("multimeshProperty")
    get() = getMultimesh()
    @JvmName("multimeshProperty")
    set(`value`) {
      setMultimesh(value)
    }

  /**
   * The [Texture2D] that will be used if using the default [CanvasItemMaterial]. Can be accessed as `TEXTURE` in CanvasItem shader.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(364, scriptIndex)
  }

  public final fun setMultimesh(multimesh: MultiMesh?) {
    TransferContext.writeArguments(OBJECT to multimesh)
    TransferContext.callMethod(ptr, MethodBindings.setMultimeshPtr, NIL)
  }

  public final fun getMultimesh(): MultiMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMultimeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MultiMesh?)
  }

  public final fun setTexture(texture: Texture2D?) {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "set_multimesh", 2_246_127_404)

    internal val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "get_multimesh", 1_385_450_523)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "set_texture", 4_051_416_890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "get_texture", 3_635_182_373)
  }
}
