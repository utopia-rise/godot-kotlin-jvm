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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_TEXTURE, NIL)
    }

  /**
   * The number of columns in the sprite sheet.
   */
  public var hframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_HFRAMES, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_HFRAMES, NIL)
    }

  /**
   * The number of rows in the sprite sheet.
   */
  public var vframes: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_VFRAMES, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_VFRAMES, NIL)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1.
   */
  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_FRAME, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_FRAME, NIL)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame] property. [hframes] or [vframes] must be greater than 1.
   */
  @CoreTypeLocalCopy
  public var frameCoords: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_FRAME_COORDS,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_FRAME_COORDS, NIL)
    }

  /**
   * If `true`, the sprite will use [regionRect] and display only the specified part of its texture.
   */
  public var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_IS_REGION_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_REGION_ENABLED, NIL)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  @CoreTypeLocalCopy
  public var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_REGION_RECT, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_REGION_RECT, NIL)
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
}
