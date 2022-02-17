// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A tab used to edit properties of the selected node.
 *
 * The editor inspector is by default located on the right-hand side of the editor. It's used to edit the properties of the selected node. For example, you can select a node such as the Sprite2D then edit its transform through the inspector tool. The editor inspector is an essential tool in the game development workflow.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getInspector].
 */
@GodotBaseType
public open abstract class EditorInspector : ScrollContainer() {
  /**
   * Emitted when a property is edited in the inspector.
   */
  public val propertyEdited: Signal1<String> by signal("property")

  /**
   * Emitted when the Edit button of an [godot.Object] has been pressed in the inspector. This is mainly used in the remote scene tree inspector.
   */
  public val objectIdSelected: Signal1<Long> by signal("id")

  /**
   * Emitted when a property is removed from the inspector.
   */
  public val propertyDeleted: Signal1<String> by signal("property")

  /**
   * Emitted when a property is selected in the inspector.
   */
  public val propertySelected: Signal1<String> by signal("property")

  /**
   * Emitted when a property that requires a restart to be applied is edited in the inspector. This is only used in the Project Settings and Editor Settings.
   */
  public val restartRequested: Signal0 by signal()

  /**
   * Emitted when the object being edited by the inspector has changed.
   */
  public val editedObjectChanged: Signal0 by signal()

  /**
   * Emitted when a property is keyed in the inspector. Properties can be keyed by clicking the "key" icon next to a property when the Animation panel is toggled.
   */
  public val propertyKeyed: Signal3<String, Any, Boolean> by signal("property", "value", "advance")

  /**
   * Emitted when a resource is selected in the inspector.
   */
  public val resourceSelected: Signal2<Resource, String> by signal("resource", "path")

  /**
   * Emitted when a boolean property is toggled in the inspector.
   *
   * **Note:** This signal is never emitted if the internal `autoclear` property enabled. Since this property is always enabled in the editor inspector, this signal is never emitted by the editor itself.
   */
  public val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORINSPECTOR)
  }

  public companion object
}
