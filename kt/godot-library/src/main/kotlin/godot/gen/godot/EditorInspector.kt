// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * A control used to edit properties of an object.
 *
 * This is the control that implements property editing in the editor's Settings dialogs, the Inspector dock, etc. To get the [godot.EditorInspector] used in the editor's Inspector dock, use [godot.EditorInterface.getInspector].
 *
 * [godot.EditorInspector] will show properties in the same order as the array returned by [godot.Object.getPropertyList].
 *
 * If a property's name is path-like (i.e. if it contains forward slashes), [godot.EditorInspector] will create nested sections for "directories" along the path. For example, if a property is named `highlighting/gdscript/node_path_color`, it will be shown as "Node Path Color" inside the "GDScript" section nested inside the "Highlighting" section.
 *
 * If a property has [@GlobalScope.PROPERTY_USAGE_GROUP] usage, it will group subsequent properties whose name starts with the property's hint string. The group ends when a property does not start with that hint string or when a new group starts. An empty group name effectively ends the current group. [godot.EditorInspector] will create a top-level section for each group. For example, if a property with group usage is named `Collide With` and its hint string is `collide_with_`, a subsequent `collide_with_area` property will be shown as "Area" inside the "Collide With" section.
 *
 * If a property has [@GlobalScope.PROPERTY_USAGE_SUBGROUP] usage, a subgroup will be created in the same way as a group, and a second-level section will be created for each subgroup.
 *
 * **Note:** Unlike sections created from path-like property names, [godot.EditorInspector] won't capitalize the name for sections created from groups. So properties with group usage usually use capitalized names instead of snake_cased names.
 */
@GodotBaseType
public open class EditorInspector internal constructor() : ScrollContainer() {
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
