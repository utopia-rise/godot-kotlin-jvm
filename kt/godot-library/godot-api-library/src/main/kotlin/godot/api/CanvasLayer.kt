// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [CanvasItem]-derived nodes that are direct or indirect children of a [CanvasLayer] will be drawn in that layer. The layer is a numeric index that defines the draw order. The default 2D scene renders with index `0`, so a [CanvasLayer] with index `-1` will be drawn below, and a [CanvasLayer] with index `1` will be drawn above. This order will hold regardless of the [CanvasItem.zIndex] of the nodes within each layer.
 *
 * [CanvasLayer]s can be hidden and they can also optionally follow the viewport. This makes them useful for HUDs like health bar overlays (on layers `1` and higher) or backgrounds (on layers `-1` and lower).
 *
 * **Note:** Embedded [Window]s are placed on layer `1024`. [CanvasItem]s on layers `1025` and higher appear in front of embedded windows.
 *
 * **Note:** Each [CanvasLayer] is drawn on one specific [Viewport] and cannot be shared between multiple [Viewport]s, see [customViewport]. When using multiple [Viewport]s, for example in a split-screen game, you need create an individual [CanvasLayer] for each [Viewport] you want it to be drawn on.
 */
@GodotBaseType
public open class CanvasLayer : Node() {
  /**
   * Emitted when visibility of the layer is changed. See [visible].
   */
  public val visibilityChanged: Signal0 by Signal0

  /**
   * Layer index for draw order. Lower values are drawn behind higher values.
   *
   * **Note:** If multiple CanvasLayers have the same layer index, [CanvasItem] children of one CanvasLayer are drawn behind the [CanvasItem] children of the other CanvasLayer. Which CanvasLayer is drawn in front is non-deterministic.
   */
  public final inline var layer: Int
    @JvmName("layerProperty")
    get() = getLayer()
    @JvmName("layerProperty")
    set(`value`) {
      setLayer(value)
    }

  /**
   * If `false`, any [CanvasItem] under this [CanvasLayer] will be hidden.
   *
   * Unlike [CanvasItem.visible], visibility of a [CanvasLayer] isn't propagated to underlying layers.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  /**
   * The layer's base offset.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The layer's rotation in radians.
   */
  public final inline var rotation: Float
    @JvmName("rotationProperty")
    get() = getRotation()
    @JvmName("rotationProperty")
    set(`value`) {
      setRotation(value)
    }

  /**
   * The layer's scale.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var scale: Vector2
    @JvmName("scaleProperty")
    get() = getScale()
    @JvmName("scaleProperty")
    set(`value`) {
      setScale(value)
    }

  /**
   * The layer's transform.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform2D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * The custom [Viewport] node assigned to the [CanvasLayer]. If `null`, uses the default viewport instead.
   */
  public final inline var customViewport: Node?
    @JvmName("customViewportProperty")
    get() = getCustomViewport()
    @JvmName("customViewportProperty")
    set(`value`) {
      setCustomViewport(value)
    }

  /**
   * If enabled, the [CanvasLayer] stays in a fixed position on the screen. If disabled, the [CanvasLayer] maintains its position in world space.
   *
   * Together with [followViewportScale], this can be used for a pseudo-3D effect.
   */
  public final inline var followViewportEnabled: Boolean
    @JvmName("followViewportEnabledProperty")
    get() = isFollowingViewport()
    @JvmName("followViewportEnabledProperty")
    set(`value`) {
      setFollowViewport(value)
    }

  /**
   * Scales the layer when using [followViewportEnabled]. Layers moving into the foreground should have increasing scales, while layers moving into the background should have decreasing scales.
   */
  public final inline var followViewportScale: Float
    @JvmName("followViewportScaleProperty")
    get() = getFollowViewportScale()
    @JvmName("followViewportScaleProperty")
    set(`value`) {
      setFollowViewportScale(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(138, scriptIndex)
  }

  /**
   * This is a helper function for [offset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.offset
   * //Your changes
   * canvaslayer.offset = myCoreType
   * ``````
   *
   * The layer's base offset.
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply {
     block(this)
     offset = this
  }

  /**
   * This is a helper function for [scale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.scale
   * //Your changes
   * canvaslayer.scale = myCoreType
   * ``````
   *
   * The layer's scale.
   */
  @CoreTypeHelper
  public final fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply {
     block(this)
     scale = this
  }

  /**
   * This is a helper function for [transform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvaslayer.transform
   * //Your changes
   * canvaslayer.transform = myCoreType
   * ``````
   *
   * The layer's transform.
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply {
     block(this)
     transform = this
  }

  public final fun setLayer(layer: Int) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLayerPtr, NIL)
  }

  public final fun getLayer(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVisible(visible: Boolean) {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Shows any [CanvasItem] under this [CanvasLayer]. This is equivalent to setting [visible] to `true`.
   */
  public final fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.showPtr, NIL)
  }

  /**
   * Hides any [CanvasItem] under this [CanvasLayer]. This is equivalent to setting [visible] to `false`.
   */
  public final fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hidePtr, NIL)
  }

  public final fun setTransform(transform: Transform2D) {
    TransferContext.writeArguments(TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the transform from the [CanvasLayer]s coordinate system to the [Viewport]s coordinate system.
   */
  public final fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFinalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRotation(radians: Float) {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRotationPtr, NIL)
  }

  public final fun getRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setScale(scale: Vector2) {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setScalePtr, NIL)
  }

  public final fun getScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFollowViewport(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFollowViewportPtr, NIL)
  }

  public final fun isFollowingViewport(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFollowingViewportPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFollowViewportScale(scale: Float) {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFollowViewportScalePtr, NIL)
  }

  public final fun getFollowViewportScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFollowViewportScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCustomViewport(viewport: Node?) {
    TransferContext.writeArguments(OBJECT to viewport)
    TransferContext.callMethod(ptr, MethodBindings.setCustomViewportPtr, NIL)
  }

  public final fun getCustomViewport(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomViewportPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns the RID of the canvas used by this layer.
   */
  public final fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val setLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_layer", 1_286_410_249)

    internal val getLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_layer", 3_905_245_786)

    internal val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_visible", 2_586_408_642)

    internal val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "is_visible", 36_873_697)

    internal val showPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "show", 3_218_959_716)

    internal val hidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "hide", 3_218_959_716)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_transform", 2_761_652_528)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_transform", 3_814_499_831)

    internal val getFinalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_final_transform", 3_814_499_831)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_offset", 743_155_724)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_offset", 3_341_600_327)

    internal val setRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_rotation", 373_806_689)

    internal val getRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_rotation", 1_740_695_150)

    internal val setScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_scale", 743_155_724)

    internal val getScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_scale", 3_341_600_327)

    internal val setFollowViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_follow_viewport", 2_586_408_642)

    internal val isFollowingViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "is_following_viewport", 36_873_697)

    internal val setFollowViewportScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_follow_viewport_scale", 373_806_689)

    internal val getFollowViewportScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_follow_viewport_scale", 1_740_695_150)

    internal val setCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "set_custom_viewport", 1_078_189_570)

    internal val getCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_custom_viewport", 3_160_264_692)

    internal val getCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasLayer", "get_canvas", 2_944_877_500)
  }
}
