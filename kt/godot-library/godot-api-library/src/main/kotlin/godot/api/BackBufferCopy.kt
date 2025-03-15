// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Rect2
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.RECT2
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var copyMode: CopyMode
    @JvmName("copyModeProperty")
    get() = getCopyMode()
    @JvmName("copyModeProperty")
    set(`value`) {
      setCopyMode(value)
    }

  /**
   * The area covered by the [BackBufferCopy]. Only used if [copyMode] is [COPY_MODE_RECT].
   */
  @CoreTypeLocalCopy
  public final inline var rect: Rect2
    @JvmName("rectProperty")
    get() = getRect()
    @JvmName("rectProperty")
    set(`value`) {
      setRect(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(102, scriptIndex)
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
  public final fun rectMutate(block: Rect2.() -> Unit): Rect2 = rect.apply{
      block(this)
      rect = this
  }


  public final fun setRect(rect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.setRectPtr, NIL)
  }

  public final fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setCopyMode(copyMode: CopyMode): Unit {
    TransferContext.writeArguments(LONG to copyMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCopyModePtr, NIL)
  }

  public final fun getCopyMode(): CopyMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCopyModePtr, LONG)
    return BackBufferCopy.CopyMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val setRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "set_rect", 2046264180)

    internal val getRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "get_rect", 1639390495)

    internal val setCopyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "set_copy_mode", 1713538590)

    internal val getCopyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BackBufferCopy", "get_copy_mode", 3271169440)
  }
}
