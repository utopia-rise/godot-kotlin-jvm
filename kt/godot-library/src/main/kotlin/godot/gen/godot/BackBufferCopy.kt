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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Node for back-buffering the currently-displayed screen. The region defined in the
 * [BackBufferCopy] node is buffered with the content of the screen it covers, or the entire screen
 * according to the [copyMode]. It can be accessed in shader scripts using the screen texture (i.e. a
 * uniform sampler with `hint_screen_texture`).
 * **Note:** Since this node inherits from [Node2D] (and not [Control]), anchors and margins won't
 * apply to child [Control]-derived nodes. This can be problematic when resizing the window. To avoid
 * this, add [Control]-derived nodes as *siblings* to the [BackBufferCopy] node instead of adding them
 * as children.
 */
@GodotBaseType
public open class BackBufferCopy : Node2D() {
  /**
   * Buffer mode. See [CopyMode] constants.
   */
  public var copyMode: CopyMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCopyModePtr, LONG)
      return BackBufferCopy.CopyMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCopyModePtr, NIL)
    }

  /**
   * The area covered by the [BackBufferCopy]. Only used if [copyMode] is [COPY_MODE_RECT].
   */
  @CoreTypeLocalCopy
  public var rect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRectPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BACKBUFFERCOPY, scriptIndex)
  }

  /**
   * The area covered by the [BackBufferCopy]. Only used if [copyMode] is [COPY_MODE_RECT].
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
   * val myCoreType = backbuffercopy.rect
   * //Your changes
   * backbuffercopy.rect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rectMutate(block: Rect2.() -> Unit): Rect2 = rect.apply{
      block(this)
      rect = this
  }


  public enum class CopyMode(
    id: Long,
  ) {
    /**
     * Disables the buffering mode. This means the [BackBufferCopy] node will directly use the
     * portion of screen it covers.
     */
    COPY_MODE_DISABLED(0),
    /**
     * [BackBufferCopy] buffers a rectangular region.
     */
    COPY_MODE_RECT(1),
    /**
     * [BackBufferCopy] buffers the entire screen.
     */
    COPY_MODE_VIEWPORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CopyMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRectPtr: VoidPtr = TypeManager.getMethodBindPtr("BackBufferCopy", "set_rect")

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("BackBufferCopy", "get_rect")

    public val setCopyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "set_copy_mode")

    public val getCopyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "get_copy_mode")
  }
}
