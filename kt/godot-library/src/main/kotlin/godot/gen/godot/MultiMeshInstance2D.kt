// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that instances a [godot.MultiMesh] in 2D.
 *
 * [godot.MultiMeshInstance2D] is a specialized node to instance a [godot.MultiMesh] resource in 2D.
 *
 * Usage is the same as [godot.MultiMeshInstance3D].
 */
@GodotBaseType
public open class MultiMeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * The [godot.MultiMesh] that will be drawn by the [godot.MultiMeshInstance2D].
   */
  public open var multimesh: MultiMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_GET_MULTIMESH,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_SET_MULTIMESH,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * The [godot.Texture2D] that will be used if using the default [godot.CanvasItemMaterial]. Can be accessed as `TEXTURE` in CanvasItem shader.
   */
  public open var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_SET_TEXTURE,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * The normal map that will be used if using the default [godot.CanvasItemMaterial].
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  public open var normalMap: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_GET_NORMAL_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESHINSTANCE2D_SET_NORMAL_MAP, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIMESHINSTANCE2D)
  }

  public companion object
}
