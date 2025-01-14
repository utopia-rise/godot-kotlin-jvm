// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [CenterContainer] is a container that keeps all of its child controls in its center at their
 * minimum size.
 */
@GodotBaseType
public open class CenterContainer : Container() {
  /**
   * If `true`, centers children relative to the [CenterContainer]'s top left corner.
   */
  public final inline var useTopLeft: Boolean
    @JvmName("useTopLeftProperty")
    get() = isUsingTopLeft()
    @JvmName("useTopLeftProperty")
    set(`value`) {
      setUseTopLeft(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CENTERCONTAINER, scriptIndex)
  }

  public final fun setUseTopLeft(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseTopLeftPtr, NIL)
  }

  public final fun isUsingTopLeft(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingTopLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setUseTopLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CenterContainer", "set_use_top_left", 2586408642)

    public val isUsingTopLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CenterContainer", "is_using_top_left", 36873697)
  }
}
