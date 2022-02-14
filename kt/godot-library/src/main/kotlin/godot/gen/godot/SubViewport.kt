// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates a sub-view into the screen.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 */
@GodotBaseType
public open class SubViewport : Viewport() {
  /**
   * The width and height of the sub-viewport.
   */
  public open var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_GET_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_SET_SIZE, NIL)
    }

  /**
   * The 2D size override of the sub-viewport. If either the width or height is `0`, the override is disabled.
   */
  public open var size2dOverride: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_GET_SIZE_2D_OVERRIDE,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_SET_SIZE_2D_OVERRIDE,
          NIL)
    }

  /**
   * If `true`, the 2D size override affects stretch as well.
   */
  public open var size2dOverrideStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_GET_SIZE_2D_OVERRIDE_STRETCH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_SET_SIZE_2D_OVERRIDE_STRETCH, NIL)
    }

  /**
   * The clear mode when the sub-viewport is used as a render target.
   *
   * **Note:** This property is intended for 2D usage.
   */
  public open var renderTargetClearMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_GET_RENDER_TARGET_CLEAR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_SET_RENDER_TARGET_CLEAR_MODE, NIL)
    }

  /**
   * The update mode when the sub-viewport is used as a render target.
   */
  public open var renderTargetUpdateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_GET_RENDER_TARGET_UPDATE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORT_SET_RENDER_TARGET_UPDATE_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SUBVIEWPORT)
  }

  public enum class ClearMode(
    id: Long
  ) {
    /**
     * Always clear the render target before drawing.
     */
    CLEAR_MODE_ALWAYS(0),
    /**
     * Never clear the render target.
     */
    CLEAR_MODE_NEVER(1),
    /**
     * Clear the render target on the next frame, then switch to [CLEAR_MODE_NEVER].
     */
    CLEAR_MODE_ONCE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class UpdateMode(
    id: Long
  ) {
    /**
     * Do not update the render target.
     */
    UPDATE_DISABLED(0),
    /**
     * Update the render target once, then switch to [UPDATE_DISABLED].
     */
    UPDATE_ONCE(1),
    /**
     * Update the render target only when it is visible. This is the default value.
     */
    UPDATE_WHEN_VISIBLE(2),
    /**
     * Update the render target only when its parent is visible.
     */
    UPDATE_WHEN_PARENT_VISIBLE(3),
    /**
     * Always update the render target.
     */
    UPDATE_ALWAYS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
