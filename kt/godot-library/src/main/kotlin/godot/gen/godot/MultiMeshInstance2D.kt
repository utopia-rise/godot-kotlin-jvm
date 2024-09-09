// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * [MultiMeshInstance2D] is a specialized node to instance a [MultiMesh] resource in 2D.
 * Usage is the same as [MultiMeshInstance3D].
 */
@GodotBaseType
public open class MultiMeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * The [MultiMesh] that will be drawn by the [MultiMeshInstance2D].
   */
  public var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMultimeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MultiMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultimeshPtr, NIL)
    }

  /**
   * The [Texture2D] that will be used if using the default [CanvasItemMaterial]. Can be accessed as
   * `TEXTURE` in CanvasItem shader.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MULTIMESHINSTANCE2D, scriptIndex)
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
