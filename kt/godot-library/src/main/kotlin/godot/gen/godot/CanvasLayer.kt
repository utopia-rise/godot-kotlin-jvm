// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [CanvasItem]-derived nodes that are direct or indirect children of a [CanvasLayer] will be drawn
 * in that layer. The layer is a numeric index that defines the draw order. The default 2D scene
 * renders with index `0`, so a [CanvasLayer] with index `-1` will be drawn below, and a [CanvasLayer]
 * with index `1` will be drawn above. This order will hold regardless of the [CanvasItem.zIndex] of
 * the nodes within each layer.
 * [CanvasLayer]s can be hidden and they can also optionally follow the viewport. This makes them
 * useful for HUDs like health bar overlays (on layers `1` and higher) or backgrounds (on layers `-1`
 * and lower).
 * **Note:** Embedded [Window]s are placed on layer `1024`. [CanvasItem]s on layers `1025` and
 * higher appear in front of embedded windows.
 * **Note:** Each [CanvasLayer] is drawn on one specific [Viewport] and cannot be shared between
 * multiple [Viewport]s, see [customViewport]. When using multiple [Viewport]s, for example in a
 * split-screen game, you need create an individual [CanvasLayer] for each [Viewport] you want it to be
 * drawn on.
 */
@GodotBaseType
public open class CanvasLayer : Node() {
  /**
   * Emitted when visibility of the layer is changed. See [visible].
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Layer index for draw order. Lower values are drawn behind higher values.
   * **Note:** If multiple CanvasLayers have the same layer index, [CanvasItem] children of one
   * CanvasLayer are drawn behind the [CanvasItem] children of the other CanvasLayer. Which CanvasLayer
   * is drawn in front is non-deterministic.
   */
  public var layer: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerPtr, NIL)
    }

  /**
   * If `false`, any [CanvasItem] under this [CanvasLayer] will be hidden.
   * Unlike [CanvasItem.visible], visibility of a [CanvasLayer] isn't propagated to underlying
   * layers.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  /**
   * The layer's base offset.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * The layer's rotation in radians.
   */
  public var rotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  /**
   * The layer's scale.
   */
  @CoreTypeLocalCopy
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  /**
   * The layer's transform.
   */
  @CoreTypeLocalCopy
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * The custom [Viewport] node assigned to the [CanvasLayer]. If `null`, uses the default viewport
   * instead.
   */
  public var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomViewportPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomViewportPtr, NIL)
    }

  /**
   * If enabled, the [CanvasLayer] will use the viewport's transform, so it will move when camera
   * moves instead of being anchored in a fixed position on the screen.
   * Together with [followViewportScale] it can be used for a pseudo 3D effect.
   */
  public var followViewportEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFollowingViewportPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowViewportPtr, NIL)
    }

  /**
   * Scales the layer when using [followViewportEnabled]. Layers moving into the foreground should
   * have increasing scales, while layers moving into the background should have decreasing scales.
   */
  public var followViewportScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFollowViewportScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowViewportScalePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASLAYER, scriptIndex)
    return true
  }

  /**
   * The layer's base offset.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.offset
   * //Your changes
   * canvaslayer.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * The layer's scale.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.scale
   * //Your changes
   * canvaslayer.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * The layer's transform.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.transform
   * //Your changes
   * canvaslayer.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * Shows any [CanvasItem] under this [CanvasLayer]. This is equivalent to setting [visible] to
   * `true`.
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  /**
   * Hides any [CanvasItem] under this [CanvasLayer]. This is equivalent to setting [visible] to
   * `false`.
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Returns the transform from the [CanvasLayer]s coordinate system to the [Viewport]s coordinate
   * system.
   */
  public fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFinalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the RID of the canvas used by this layer.
   */
  public fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCanvasPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "set_layer")

    public val getLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "get_layer")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "is_visible")

    public val showPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "show")

    public val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "hide")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_transform")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_transform")

    public val getFinalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_final_transform")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "get_offset")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "set_rotation")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "get_rotation")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "set_scale")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "get_scale")

    public val setFollowViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_follow_viewport")

    public val isFollowingViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "is_following_viewport")

    public val setFollowViewportScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_follow_viewport_scale")

    public val getFollowViewportScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_follow_viewport_scale")

    public val setCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_custom_viewport")

    public val getCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_custom_viewport")

    public val getCanvasPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasLayer", "get_canvas")
  }
}
