// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [SubViewport] Isolates a rectangular region of a scene to be displayed independently. This can be
 * used, for example, to display UI in 3D space.
 * **Note:** [SubViewport] is a [Viewport] that isn't a [Window], i.e. it doesn't draw anything by
 * itself. To display anything, [SubViewport] must have a non-zero size and be either put inside a
 * [SubViewportContainer] or assigned to a [ViewportTexture].
 */
@GodotBaseType
public open class SubViewport : Viewport() {
  /**
   * The width and height of the sub-viewport. Must be set to a value greater than or equal to 2
   * pixels on both dimensions. Otherwise, nothing will be displayed.
   * **Note:** If the parent node is a [SubViewportContainer] and its [SubViewportContainer.stretch]
   * is `true`, the viewport size cannot be changed manually.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector2i
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The 2D size override of the sub-viewport. If either the width or height is `0`, the override is
   * disabled.
   */
  @CoreTypeLocalCopy
  public final inline var size2dOverride: Vector2i
    @JvmName("size2dOverrideProperty")
    get() = getSize2dOverride()
    @JvmName("size2dOverrideProperty")
    set(`value`) {
      setSize2dOverride(value)
    }

  /**
   * If `true`, the 2D size override affects stretch as well.
   */
  public final inline var size2dOverrideStretch: Boolean
    @JvmName("size2dOverrideStretchProperty")
    get() = isSize2dOverrideStretchEnabled()
    @JvmName("size2dOverrideStretchProperty")
    set(`value`) {
      setSize2dOverrideStretch(value)
    }

  /**
   * The clear mode when the sub-viewport is used as a render target.
   * **Note:** This property is intended for 2D usage.
   */
  public final inline var renderTargetClearMode: ClearMode
    @JvmName("renderTargetClearModeProperty")
    get() = getClearMode()
    @JvmName("renderTargetClearModeProperty")
    set(`value`) {
      setClearMode(value)
    }

  /**
   * The update mode when the sub-viewport is used as a render target.
   */
  public final inline var renderTargetUpdateMode: UpdateMode
    @JvmName("renderTargetUpdateModeProperty")
    get() = getUpdateMode()
    @JvmName("renderTargetUpdateModeProperty")
    set(`value`) {
      setUpdateMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SUBVIEWPORT, scriptIndex)
  }

  /**
   * The width and height of the sub-viewport. Must be set to a value greater than or equal to 2
   * pixels on both dimensions. Otherwise, nothing will be displayed.
   * **Note:** If the parent node is a [SubViewportContainer] and its [SubViewportContainer.stretch]
   * is `true`, the viewport size cannot be changed manually.
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
  public final fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  /**
   * The 2D size override of the sub-viewport. If either the width or height is `0`, the override is
   * disabled.
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
  public final fun size2dOverrideMutate(block: Vector2i.() -> Unit): Vector2i =
      size2dOverride.apply{
      block(this)
      size2dOverride = this
  }


  public final fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setSize2dOverride(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSize2dOverridePtr, NIL)
  }

  public final fun getSize2dOverride(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSize2dOverridePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setSize2dOverrideStretch(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSize2dOverrideStretchPtr, NIL)
  }

  public final fun isSize2dOverrideStretchEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSize2dOverrideStretchEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateMode(mode: UpdateMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setUpdateModePtr, NIL)
  }

  public final fun getUpdateMode(): UpdateMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdateModePtr, LONG)
    return SubViewport.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setClearMode(mode: ClearMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setClearModePtr, NIL)
  }

  public final fun getClearMode(): ClearMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClearModePtr, LONG)
    return SubViewport.ClearMode.from(TransferContext.readReturnValue(LONG) as Long)
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
      public fun from(`value`: Long): ClearMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): UpdateMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size", 1130785943)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_size", 3690982128)

    public val setSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override", 1130785943)

    public val getSize2dOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_size_2d_override", 3690982128)

    public val setSize2dOverrideStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_size_2d_override_stretch", 2586408642)

    public val isSize2dOverrideStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "is_size_2d_override_stretch_enabled", 36873697)

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_update_mode", 1295690030)

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_update_mode", 2980171553)

    public val setClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "set_clear_mode", 2834454712)

    public val getClearModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewport", "get_clear_mode", 331324495)
  }
}
