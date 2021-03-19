// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in 3D environment.
 * 
 * A node that displays 2D texture information in a 3D environment.
 */
@GodotBaseType
open class SpriteBase3D : GeometryInstance() {
  /**
   *
   */
  open var alphaCut: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ALPHA_CUT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_ALPHA_CUT, NIL)
    }

  /**
   * The direction in which the front of the texture faces.
   */
  open var axis: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_AXIS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_AXIS, NIL)
    }

  /**
   *
   */
  open var billboard: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_BILLBOARD, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_BILLBOARD, NIL)
    }

  /**
   * If `true`, texture will be centered.
   */
  open var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_CENTERED, NIL)
    }

  /**
   * If `true`, texture can be seen from the back as well, if `false`, it is invisible when looking at it from behind.
   */
  open var doubleSided: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_DOUBLE_SIDED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_DOUBLE_SIDED,
          NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_V, NIL)
    }

  /**
   * A color value that gets multiplied on, could be used for mood-coloring or to simulate the color of light.
   */
  open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_MODULATE, NIL)
    }

  /**
   * The texture's drawing offset.
   */
  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_OFFSET, NIL)
    }

  /**
   * The objects visibility on a scale from `0` fully invisible to `1` fully visible.
   */
  open var opacity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_OPACITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_OPACITY, NIL)
    }

  /**
   * The size of one pixel's width on the sprite to scale it in 3D.
   */
  open var pixelSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_PIXEL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_PIXEL_SIZE, NIL)
    }

  /**
   * If `true`, the [godot.Light] in the [godot.Environment] has effects on the sprite.
   */
  open var shaded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_SHADED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_SHADED, NIL)
    }

  /**
   * If `true`, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
   */
  open var transparent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_TRANSPARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_TRANSPARENT, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SPRITEBASE3D)
  }

  open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun _imUpdate() {
  }

  open fun _queueUpdate() {
  }

  /**
   *
   */
  open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GENERATE_TRIANGLE_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  /**
   * Returns the rectangle representing this sprite.
   */
  open fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ITEM_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  enum class DrawFlags(
    id: Long
  ) {
    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
     */
    FLAG_TRANSPARENT(0),

    /**
     * If set, lights in the environment affect the sprite.
     */
    FLAG_SHADED(1),

    /**
     * If set, texture can be seen from the back as well, if not, it is invisible when looking at it from behind.
     */
    FLAG_DOUBLE_SIDED(2),

    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    FLAG_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AlphaCutMode(
    id: Long
  ) {
    /**
     *
     */
    ALPHA_CUT_DISABLED(0),

    /**
     *
     */
    ALPHA_CUT_DISCARD(1),

    /**
     *
     */
    ALPHA_CUT_OPAQUE_PREPASS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     *
     */
    final const val ALPHA_CUT_DISABLED: Long = 0

    /**
     *
     */
    final const val ALPHA_CUT_DISCARD: Long = 1

    /**
     *
     */
    final const val ALPHA_CUT_OPAQUE_PREPASS: Long = 2

    /**
     * If set, texture can be seen from the back as well, if not, it is invisible when looking at it from behind.
     */
    final const val FLAG_DOUBLE_SIDED: Long = 2

    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    final const val FLAG_MAX: Long = 3

    /**
     * If set, lights in the environment affect the sprite.
     */
    final const val FLAG_SHADED: Long = 1

    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
     */
    final const val FLAG_TRANSPARENT: Long = 0
  }
}
