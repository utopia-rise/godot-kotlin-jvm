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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.Signal0
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * Node used for displaying a [Mesh] in 2D. A [MeshInstance2D] can be automatically created from an
 * existing [Sprite2D] via a tool in the editor toolbar. Select the [Sprite2D] node, then choose
 * **Sprite2D > Convert to MeshInstance2D** at the top of the 2D editor viewport.
 */
@GodotBaseType
public open class MeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  public val textureChanged: Signal0 by Signal0

  /**
   * The [Mesh] that will be drawn by the [MeshInstance2D].
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
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
    createNativeObject(354, scriptIndex)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public companion object {
    @JvmStatic
    public val setMeshName: MethodStringName1<MeshInstance2D, Unit, Mesh?> =
        MethodStringName1<MeshInstance2D, Unit, Mesh?>("set_mesh")

    @JvmStatic
    public val getMeshName: MethodStringName0<MeshInstance2D, Mesh?> =
        MethodStringName0<MeshInstance2D, Mesh?>("get_mesh")

    @JvmStatic
    public val setTextureName: MethodStringName1<MeshInstance2D, Unit, Texture2D?> =
        MethodStringName1<MeshInstance2D, Unit, Texture2D?>("set_texture")

    @JvmStatic
    public val getTextureName: MethodStringName0<MeshInstance2D, Texture2D?> =
        MethodStringName0<MeshInstance2D, Texture2D?>("get_texture")
  }

  public object MethodBindings {
    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance2D", "set_mesh", 194775623)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance2D", "get_mesh", 1808005922)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance2D", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance2D", "get_texture", 3635182373)
  }
}
