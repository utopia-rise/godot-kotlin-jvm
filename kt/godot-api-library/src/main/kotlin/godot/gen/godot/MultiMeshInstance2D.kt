// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_MULTIMESHINSTANCE2D_INDEX: Int = 344

/**
 * [MultiMeshInstance2D] is a specialized node to instance a [MultiMesh] resource in 2D.
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
   * The [Texture2D] that will be used if using the default [CanvasItemMaterial]. Can be accessed as
   * `TEXTURE` in CanvasItem shader.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_MULTIMESHINSTANCE2D_INDEX, scriptIndex)
  }

  public final fun setMultimesh(multimesh: MultiMesh?): Unit {
    TransferContext.writeArguments(OBJECT to multimesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultimeshPtr, NIL)
  }

  public final fun getMultimesh(): MultiMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMultimeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MultiMesh?)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "set_multimesh", 2246127404)

    public val getMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "get_multimesh", 1385450523)

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiMeshInstance2D", "get_texture", 3635182373)
  }
}
