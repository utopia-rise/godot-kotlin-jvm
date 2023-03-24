// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Copies a region of the screen (or the whole screen) to a buffer so it can be accessed in your shader scripts through the `texture(SCREEN_TEXTURE, ...)` function.
 *
 * Node for back-buffering the currently-displayed screen. The region defined in the [godot.BackBufferCopy] node is buffered with the content of the screen it covers, or the entire screen according to the copy mode set. Use the `texture(SCREEN_TEXTURE, ...)` function in your shader scripts to access the buffer.
 *
 * **Note:** Since this node inherits from [godot.Node2D] (and not [godot.Control]), anchors and margins won't apply to child [godot.Control]-derived nodes. This can be problematic when resizing the window. To avoid this, add [godot.Control]-derived nodes as *siblings* to the [godot.BackBufferCopy] node instead of adding them as children.
 */
@GodotBaseType
public open class BackBufferCopy : Node2D() {
  /**
   * Buffer mode. See [enum CopyMode] constants.
   */
  public open var copyMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BACKBUFFERCOPY_GET_COPY_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BACKBUFFERCOPY_SET_COPY_MODE, NIL)
    }

  /**
   * The area covered by the [godot.BackBufferCopy]. Only used if [copyMode] is [COPY_MODE_RECT].
   */
  public open var rect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BACKBUFFERCOPY_GET_RECT, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BACKBUFFERCOPY_SET_RECT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BACKBUFFERCOPY)
  }

  @CoreTypeHelper
  public open fun rect(schedule: Rect2.() -> Unit): Rect2 = rect.apply{
      schedule(this)
      rect = this
  }


  public enum class CopyMode(
    id: Long
  ) {
    /**
     * Disables the buffering mode. This means the [godot.BackBufferCopy] node will directly use the portion of screen it covers.
     */
    COPY_MODE_DISABLED(0),
    /**
     * [godot.BackBufferCopy] buffers a rectangular region.
     */
    COPY_MODE_RECT(1),
    /**
     * [godot.BackBufferCopy] buffers the entire screen.
     */
    COPY_MODE_VIEWPORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Disables the buffering mode. This means the [godot.BackBufferCopy] node will directly use the portion of screen it covers.
     */
    public final const val COPY_MODE_DISABLED: Long = 0

    /**
     * [godot.BackBufferCopy] buffers a rectangular region.
     */
    public final const val COPY_MODE_RECT: Long = 1

    /**
     * [godot.BackBufferCopy] buffers the entire screen.
     */
    public final const val COPY_MODE_VIEWPORT: Long = 2
  }
}
