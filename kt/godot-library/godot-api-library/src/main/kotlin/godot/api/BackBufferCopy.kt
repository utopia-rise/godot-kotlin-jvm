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
import godot.core.GodotEnum
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
 *
 * **Note:** Since this node inherits from [Node2D] (and not [Control]), anchors and margins won't
 * apply to child [Control]-derived nodes. This can be problematic when resizing the window. To avoid
 * this, add [Control]-derived nodes as *siblings* to the [BackBufferCopy] node instead of adding them
 * as children.
 */
@GodotBaseType
public open class BackBufferCopy : Node2D() {
  /**
   * Buffer mode.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(103, scriptIndex)
  }

  /**
   * This is a helper function for [rect] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = backbuffercopy.rect
   * //Your changes
   * backbuffercopy.rect = myCoreType
   * ``````
   *
   * The area covered by the [BackBufferCopy]. Only used if [copyMode] is [COPY_MODE_RECT].
   */
  @CoreTypeHelper
  public final fun rectMutate(block: Rect2.() -> Unit): Rect2 = rect.apply {
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
    TransferContext.writeArguments(LONG to copyMode.value)
    TransferContext.callMethod(ptr, MethodBindings.setCopyModePtr, NIL)
  }

  public final fun getCopyMode(): CopyMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCopyModePtr, LONG)
    return CopyMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class CopyMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Disables the buffering mode. This means the [BackBufferCopy] node will directly use the
     * portion of screen it covers.
     */
    DISABLED(0),
    /**
     * [BackBufferCopy] buffers a rectangular region.
     */
    RECT(1),
    /**
     * [BackBufferCopy] buffers the entire screen.
     */
    VIEWPORT(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): CopyMode = entries.single { it.`value` == `value` }
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
