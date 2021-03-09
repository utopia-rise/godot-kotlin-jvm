// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Canvas drawing layer.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/2d_transforms.html](https://docs.godotengine.org/en/latest/tutorials/2d/2d_transforms.html)
 * [https://docs.godotengine.org/en/latest/tutorials/2d/canvas_layers.html](https://docs.godotengine.org/en/latest/tutorials/2d/canvas_layers.html)
 *
 * Canvas drawing layer. [godot.CanvasItem] nodes that are direct or indirect children of a [godot.CanvasLayer] will be drawn in that layer. The layer is a numeric index that defines the draw order. The default 2D scene renders with index 0, so a [godot.CanvasLayer] with index -1 will be drawn below, and one with index 1 will be drawn above. This is very useful for HUDs (in layer 1+ or above), or backgrounds (in layer -1 or below).
 */
@GodotBaseType
open class CanvasLayer : Node() {
  /**
   * The custom [godot.Viewport] node assigned to the [godot.CanvasLayer]. If `null`, uses the default viewport instead.
   */
  open var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_CUSTOM_VIEWPORT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_CUSTOM_VIEWPORT,
          NIL)
    }

  /**
   * Sets the layer to follow the viewport in order to simulate a pseudo 3D effect.
   */
  open var followViewportEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_FOLLOW_VIEWPORT_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_FOLLOW_VIEWPORT_ENABLE, NIL)
    }

  /**
   * Scales the layer when using [followViewportEnable]. Layers moving into the foreground should have increasing scales, while layers moving into the background should have decreasing scales.
   */
  open var followViewportScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_FOLLOW_VIEWPORT_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_FOLLOW_VIEWPORT_SCALE, NIL)
    }

  /**
   * Layer index for draw order. Lower values are drawn first.
   */
  open var layer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_LAYER, NIL)
    }

  /**
   * The layer's base offset.
   */
  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_OFFSET, NIL)
    }

  /**
   * The layer's rotation in radians.
   */
  open var rotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_ROTATION, NIL)
    }

  /**
   * The layer's rotation in degrees.
   */
  open var rotationDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_ROTATION_DEGREES,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_ROTATION_DEGREES,
          NIL)
    }

  /**
   * The layer's scale.
   */
  open var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_SCALE, NIL)
    }

  /**
   * The layer's transform.
   */
  open var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_SET_TRANSFORM, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CANVASLAYER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun scale(schedule: Vector2.() -> Unit): Vector2 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  /**
   * Returns the RID of the canvas used by this layer.
   */
  open fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASLAYER_GET_CANVAS, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
