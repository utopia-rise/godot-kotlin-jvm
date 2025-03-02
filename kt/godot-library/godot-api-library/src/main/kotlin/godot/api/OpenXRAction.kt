// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedStringArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This resource defines an OpenXR action. Actions can be used both for inputs (buttons, joysticks,
 * triggers, etc.) and outputs (haptics).
 * OpenXR performs automatic conversion between action type and input type whenever possible. An
 * analog trigger bound to a boolean action will thus return `false` if the trigger is depressed and
 * `true` if pressed fully.
 * Actions are not directly bound to specific devices, instead OpenXR recognizes a limited number of
 * top level paths that identify devices by usage. We can restrict which devices an action can be bound
 * to by these top level paths. For instance an action that should only be used for hand held
 * controllers can have the top level paths "/user/hand/left" and "/user/hand/right" associated with
 * them. See the
 * [url=https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#semantic-path-reserved]reserved
 * path section in the OpenXR specification[/url] for more info on the top level paths.
 * Note that the name of the resource is used to register the action with.
 */
@GodotBaseType
public open class OpenXRAction : Resource() {
  /**
   * The localized description of this action.
   */
  public final inline var localizedName: String
    @JvmName("localizedNameProperty")
    get() = getLocalizedName()
    @JvmName("localizedNameProperty")
    set(`value`) {
      setLocalizedName(value)
    }

  /**
   * The type of action.
   */
  public final inline var actionType: ActionType
    @JvmName("actionTypeProperty")
    get() = getActionType()
    @JvmName("actionTypeProperty")
    set(`value`) {
      setActionType(value)
    }

  /**
   * A collections of toplevel paths to which this action can be bound.
   */
  public final inline var toplevelPaths: PackedStringArray
    @JvmName("toplevelPathsProperty")
    get() = getToplevelPaths()
    @JvmName("toplevelPathsProperty")
    set(`value`) {
      setToplevelPaths(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(427, scriptIndex)
  }

  public final fun setLocalizedName(localizedName: String): Unit {
    TransferContext.writeArguments(STRING to localizedName)
    TransferContext.callMethod(ptr, MethodBindings.setLocalizedNamePtr, NIL)
  }

  public final fun getLocalizedName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalizedNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setActionType(actionType: ActionType): Unit {
    TransferContext.writeArguments(LONG to actionType.id)
    TransferContext.callMethod(ptr, MethodBindings.setActionTypePtr, NIL)
  }

  public final fun getActionType(): ActionType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionTypePtr, LONG)
    return OpenXRAction.ActionType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setToplevelPaths(toplevelPaths: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to toplevelPaths)
    TransferContext.callMethod(ptr, MethodBindings.setToplevelPathsPtr, NIL)
  }

  public final fun getToplevelPaths(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getToplevelPathsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public enum class ActionType(
    id: Long,
  ) {
    /**
     * This action provides a boolean value.
     */
    OPENXR_ACTION_BOOL(0),
    /**
     * This action provides a float value between `0.0` and `1.0` for any analog input such as
     * triggers.
     */
    OPENXR_ACTION_FLOAT(1),
    /**
     * This action provides a [Vector2] value and can be bound to embedded trackpads and joysticks.
     */
    OPENXR_ACTION_VECTOR2(2),
    OPENXR_ACTION_POSE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ActionType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_localized_name", 83702148)

    internal val getLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_localized_name", 201670096)

    internal val setActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_action_type", 1675238366)

    internal val getActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_action_type", 3536542431)

    internal val setToplevelPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_toplevel_paths", 4015028928)

    internal val getToplevelPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_toplevel_paths", 1139954409)
  }
}
