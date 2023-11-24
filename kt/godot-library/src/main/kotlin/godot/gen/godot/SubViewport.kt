// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An interface to a game world that doesn't create a window or draw to the screen directly.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * [godot.SubViewport] Isolates a rectangular region of a scene to be displayed independently. This can be used, for example, to display UI in 3D space.
 *
 * **Note:** [godot.SubViewport] is a [godot.Viewport] that isn't a [godot.Window], i.e. it doesn't draw anything by itself. To display anything, [godot.SubViewport] must have a non-zero size and be either put inside a [godot.SubViewportContainer] or assigned to a [godot.ViewportTexture].
 */
@GodotBaseType
public open class SubViewport : Viewport() {
  /**
   * The width and height of the sub-viewport. Must be set to a value greater than or equal to 2 pixels on both dimensions. Otherwise, nothing will be displayed.
   *
   * **Note:** If the parent node is a [godot.SubViewportContainer] and its [godot.SubViewportContainer.stretch] is `true`, the viewport size cannot be changed manually.
   */
  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The 2D size override of the sub-viewport. If either the width or height is `0`, the override is disabled.
   */
  @CoreTypeLocalCopy
  public var size2dOverride: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSize2dOverridePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSize2dOverridePtr, NIL)
    }

  /**
   * If `true`, the 2D size override affects stretch as well.
   */
  public var size2dOverrideStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSize2dOverrideStretchEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSize2dOverrideStretchPtr, NIL)
    }

  /**
   * The clear mode when the sub-viewport is used as a render target.
   *
   * **Note:** This property is intended for 2D usage.
   */
  public var renderTargetClearMode: ClearMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClearModePtr, LONG)
      return SubViewport.ClearMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setClearModePtr, NIL)
    }

  /**
   * The update mode when the sub-viewport is used as a render target.
   */
  public var renderTargetUpdateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return SubViewport.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SUBVIEWPORT, scriptIndex)
    return true
  }

  /**
   * The width and height of the sub-viewport. Must be set to a value greater than or equal to 2 pixels on both dimensions. Otherwise, nothing will be displayed.
   *
   * **Note:** If the parent node is a [godot.SubViewportContainer] and its [godot.SubViewportContainer.stretch] is `true`, the viewport size cannot be changed manually.
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
   * val myCoreType = subviewport.size
   * //Your changes
   * subviewport.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  /**
   * The 2D size override of the sub-viewport. If either the width or height is `0`, the override is disabled.
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
   * val myCoreType = subviewport.size2dOverride
   * //Your changes
   * subviewport.size2dOverride = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun size2dOverrideMutate(block: Vector2i.() -> Unit): Vector2i = size2dOverride.apply{
      block(this)
      size2dOverride = this
  }


  public enum class ClearMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class UpdateMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SubViewport", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("SubViewport", "get_size")

    public val setSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override")

    public val getSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_size_2d_override")

    public val setSize2dOverrideStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override_stretch")

    public val isSize2dOverrideStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "is_size_2d_override_stretch_enabled")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_update_mode")

    public val setClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_clear_mode")

    public val getClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_clear_mode")
  }
}
