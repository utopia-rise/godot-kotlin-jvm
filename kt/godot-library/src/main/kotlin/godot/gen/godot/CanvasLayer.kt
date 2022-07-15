// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Canvas drawing layer.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * Canvas drawing layer. [godot.CanvasItem] nodes that are direct or indirect children of a [godot.CanvasLayer] will be drawn in that layer. The layer is a numeric index that defines the draw order. The default 2D scene renders with index 0, so a [godot.CanvasLayer] with index -1 will be drawn below, and one with index 1 will be drawn above. This is very useful for HUDs (in layer 1+ or above), or backgrounds (in layer -1 or below).
 */
@GodotBaseType
public open class CanvasLayer : Node() {
  /**
   * Emitted when visibility of the layer is changed. See [visible].
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Layer index for draw order. Lower values are drawn first.
   */
  public var layer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_LAYER, NIL)
    }

  /**
   * If `false`, any [godot.CanvasItem] under this [godot.CanvasLayer] will be hidden.
   *
   * Unlike [godot.CanvasItem.visible], visibility of a [godot.CanvasLayer] isn't propagated to underlying layers.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_IS_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_VISIBLE, NIL)
    }

  /**
   * The layer's base offset.
   */
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_OFFSET, NIL)
    }

  /**
   * The layer's rotation in radians.
   */
  public var rotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_ROTATION, NIL)
    }

  /**
   * The layer's scale.
   */
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_SCALE, NIL)
    }

  /**
   * The layer's transform.
   */
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_TRANSFORM, NIL)
    }

  /**
   * The custom [godot.Viewport] node assigned to the [godot.CanvasLayer]. If `null`, uses the default viewport instead.
   */
  public var customViewport: Viewport?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_CUSTOM_VIEWPORT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Viewport?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_CUSTOM_VIEWPORT,
          NIL)
    }

  /**
   * Sets the layer to follow the viewport in order to simulate a pseudo 3D effect.
   */
  public var followViewportEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_IS_FOLLOWING_VIEWPORT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_FOLLOW_VIEWPORT,
          NIL)
    }

  /**
   * Scales the layer when using [followViewportEnable]. Layers moving into the foreground should have increasing scales, while layers moving into the background should have decreasing scales.
   */
  public var followViewportScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_FOLLOW_VIEWPORT_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_FOLLOW_VIEWPORT_SCALE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CANVASLAYER)
  }

  /**
   * Shows any [godot.CanvasItem] under this [godot.CanvasLayer]. This is equivalent to setting [visible] to `true`.
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SHOW, NIL)
  }

  /**
   * Hides any [godot.CanvasItem] under this [godot.CanvasLayer]. This is equivalent to setting [visible] to `false`.
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_HIDE, NIL)
  }

  /**
   * Returns the RID of the canvas used by this layer.
   */
  public fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_CANVAS, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public companion object
}
