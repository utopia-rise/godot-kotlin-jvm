// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in a 3D world.
 *
 * A node that displays a 2D texture in a 3D environment. The texture displayed can be a region from a larger atlas texture, or a frame from a sprite sheet animation. See also [godot.SpriteBase3D] where properties such as the billboard mode are defined.
 */
@GodotBaseType
public open class Sprite3D : SpriteBase3D() {
  /**
   * Emitted when the [frame] changes.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the [texture] changes.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * [godot.Texture2D] object to draw. If [godot.GeometryInstance3D.materialOverride] is used, this will be overridden. The size information is still used.
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

  /**
   * The number of columns in the sprite sheet. When this property is changed, [frame] is adjusted so that the same visual frame is maintained (same row and column). If that's impossible, [frame] is reset to `0`.
   */
  public var hframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHframesPtr, NIL)
    }

  /**
   * The number of rows in the sprite sheet. When this property is changed, [frame] is adjusted so that the same visual frame is maintained (same row and column). If that's impossible, [frame] is reset to `0`.
   */
  public var vframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVframesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVframesPtr, NIL)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1. This property is automatically adjusted when [hframes] or [vframes] are changed to keep pointing to the same visual frame (same column and row). If that's impossible, this value is reset to `0`.
   */
  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame] property. [hframes] or [vframes] must be greater than 1.
   */
  @CoreTypeLocalCopy
  public var frameCoords: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrameCoordsPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrameCoordsPtr, NIL)
    }

  /**
   * If `true`, the sprite will use [regionRect] and display only the specified part of its texture.
   */
  public var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRegionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionEnabledPtr, NIL)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  @CoreTypeLocalCopy
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionRectPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRITE3D, scriptIndex)
    return true
  }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame] property. [hframes] or [vframes] must be greater than 1.
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
   * val myCoreType = sprite3d.frameCoords
   * //Your changes
   * sprite3d.frameCoords = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun frameCoordsMutate(block: Vector2i.() -> Unit): Vector2i = frameCoords.apply{
      block(this)
      frameCoords = this
  }


  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
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
   * val myCoreType = sprite3d.regionRect
   * //Your changes
   * sprite3d.regionRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun regionRectMutate(block: Rect2.() -> Unit): Rect2 = regionRect.apply{
      block(this)
      regionRect = this
  }


  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "get_texture")

    public val setRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "set_region_enabled")

    public val isRegionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "is_region_enabled")

    public val setRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "set_region_rect")

    public val getRegionRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "get_region_rect")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "set_frame")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "get_frame")

    public val setFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "set_frame_coords")

    public val getFrameCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sprite3D", "get_frame_coords")

    public val setVframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "set_vframes")

    public val getVframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "get_vframes")

    public val setHframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "set_hframes")

    public val getHframesPtr: VoidPtr = TypeManager.getMethodBindPtr("Sprite3D", "get_hframes")
  }
}
