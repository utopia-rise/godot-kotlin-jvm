// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CENTERCONTAINER_INDEX: Int = 177

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
    Internals.callConstructor(this, ENGINE_CLASS_CENTERCONTAINER_INDEX, scriptIndex)
  }

  public final fun setUseTopLeft(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseTopLeftPtr, NIL)
  }

  public final fun isUsingTopLeft(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingTopLeftPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setUseTopLeftPtr: VoidPtr =
        Internals.getMethodBindPtr("CenterContainer", "set_use_top_left", 2586408642)

    internal val isUsingTopLeftPtr: VoidPtr =
        Internals.getMethodBindPtr("CenterContainer", "is_using_top_left", 36873697)
  }
}
