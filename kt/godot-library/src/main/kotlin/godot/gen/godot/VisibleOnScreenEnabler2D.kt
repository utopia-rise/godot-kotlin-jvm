// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class VisibleOnScreenEnabler2D : VisibleOnScreenNotifier2D() {
  /**
   *
   */
  public var enableMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER2D_GET_ENABLE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER2D_SET_ENABLE_MODE, NIL)
    }

  /**
   *
   */
  public var enableNodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER2D_GET_ENABLE_NODE_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER2D_SET_ENABLE_NODE_PATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER2D)
  }

  public enum class EnableMode(
    id: Long
  ) {
    /**
     *
     */
    ENABLE_MODE_INHERIT(0),
    /**
     *
     */
    ENABLE_MODE_ALWAYS(1),
    /**
     *
     */
    ENABLE_MODE_WHEN_PAUSED(2),
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
