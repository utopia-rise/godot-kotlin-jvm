// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A tab used to edit properties of the selected node.
 *
 * The editor inspector is by default located on the right-hand side of the editor. It's used to edit the properties of the selected node. For example, you can select a node such as [godot.Sprite] then edit its transform through the inspector tool. The editor inspector is an essential tool in the game development workflow.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getInspector].
 */
@GodotBaseType
public open class EditorInspector : ScrollContainer() {
  /**
   * Emitted when the Edit button of an [godot.Object] has been pressed in the inspector. This is mainly used in the remote scene tree inspector.
   */
  public val objectIdSelected: Signal1<Long> by signal("id")

  /**
   * Emitted when a property is edited in the inspector.
   */
  public val propertyEdited: Signal1<String> by signal("property")

  /**
   * Emitted when a property is keyed in the inspector. Properties can be keyed by clicking the "key" icon next to a property when the Animation panel is toggled.
   */
  public val propertyKeyed: Signal1<String> by signal("property")

  /**
   * Emitted when a property is selected in the inspector.
   */
  public val propertySelected: Signal1<String> by signal("property")

  /**
   * Emitted when a boolean property is toggled in the inspector.
   *
   * **Note:** This signal is never emitted if the internal `autoclear` property enabled. Since this property is always enabled in the editor inspector, this signal is never emitted by the editor itself.
   */
  public val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  /**
   * Emitted when a resource is selected in the inspector.
   */
  public val resourceSelected: Signal2<Object, String> by signal("res", "prop")

  /**
   * Emitted when a property that requires a restart to be applied is edited in the inspector. This is only used in the Project Settings and Editor Settings.
   */
  public val restartRequested: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORINSPECTOR)
  }

  public open fun _editRequestChange(arg0: Object, arg1: String): Unit {
  }

  public open fun _featureProfileChanged(): Unit {
  }

  public open fun _filterChanged(arg0: String): Unit {
  }

  public open fun _multiplePropertiesChanged(arg0: PoolStringArray, arg1: VariantArray<Any?>):
      Unit {
  }

  public open fun _nodeRemoved(arg0: Node): Unit {
  }

  public open fun _objectIdSelected(arg0: String, arg1: Long): Unit {
  }

  public open fun _propertyChanged(
    arg0: String,
    arg1: Any?,
    arg2: String = "",
    arg3: Boolean = false
  ): Unit {
  }

  public open fun _propertyChangedUpdateAll(
    arg0: String,
    arg1: Any?,
    arg2: String,
    arg3: Boolean
  ): Unit {
  }

  public open fun _propertyChecked(arg0: String, arg1: Boolean): Unit {
  }

  public open fun _propertyKeyed(arg0: String, arg1: Boolean): Unit {
  }

  public open fun _propertyKeyedWithValue(
    arg0: String,
    arg1: Any?,
    arg2: Boolean
  ): Unit {
  }

  public open fun _propertyPinned(path: String, pinned: Boolean): Unit {
  }

  public open fun _propertySelected(arg0: String, arg1: Long): Unit {
  }

  public open fun _resourceSelected(arg0: String, arg1: Resource): Unit {
  }

  public open fun _vscrollChanged(arg0: Double): Unit {
  }

  /**
   * Refreshes the inspector.
   *
   * **Note:** To save on CPU resources, calling this method will do nothing if the time specified in `docks/property_editor/auto_refresh_interval` editor setting hasn't passed yet since this method was last called. (By default, this interval is set to 0.3 seconds.)
   */
  public open fun refresh(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINSPECTOR_REFRESH, NIL)
  }
}
