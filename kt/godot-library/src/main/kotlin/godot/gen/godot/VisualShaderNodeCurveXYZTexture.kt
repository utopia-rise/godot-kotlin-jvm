// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Performs a [godot.CurveXYZTexture] lookup within the visual shader graph.
 *
 * Comes with a built-in editor for texture's curves.
 */
@GodotBaseType
public open class VisualShaderNodeCurveXYZTexture : VisualShaderNodeResizableBase() {
  /**
   * The source texture.
   */
  public var texture: CurveXYZTexture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECURVEXYZTEXTURE_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as CurveXYZTexture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECURVEXYZTEXTURE_SET_TEXTURE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECURVEXYZTEXTURE)
  }

  public companion object
}
