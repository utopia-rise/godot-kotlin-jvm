// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The Editor's popup dialog for creating new [godot.Script] files.
 *
 * The [godot.ScriptCreateDialog] creates script files according to a given template for a given scripting language. The standard use is to configure its fields prior to calling one of the [godot.Popup.popup] methods.
 *
 * ```
 * 		func _ready():
 * 		    dialog.config("Node", "res://new_node.gd") # For in-engine types
 * 		    dialog.config("\"res://base_node.gd\"", "res://derived_node.gd") # For script types
 * 		    dialog.popup_centered()
 * 		```
 */
@GodotBaseType
public open class ScriptCreateDialog : ConfirmationDialog() {
  /**
   * Emitted when the user clicks the OK button.
   */
  public val scriptCreated: Signal1<Script> by signal("script")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCRIPTCREATEDIALOG)
  }

  public open fun _browseClassInTree(): Unit {
  }

  public open fun _browsePath(arg0: Boolean, arg1: Boolean): Unit {
  }

  public open fun _builtInPressed(): Unit {
  }

  public open fun _classNameChanged(arg0: String): Unit {
  }

  public open fun _create(): Unit {
  }

  public open fun _fileSelected(arg0: String): Unit {
  }

  public open fun _langChanged(arg0: Long): Unit {
  }

  public open fun _parentNameChanged(arg0: String): Unit {
  }

  public open fun _pathChanged(arg0: String): Unit {
  }

  public open fun _pathEntered(arg0: String): Unit {
  }

  public open fun _pathHboxSorted(): Unit {
  }

  public open fun _templateChanged(arg0: Long): Unit {
  }

  /**
   * Prefills required fields to configure the ScriptCreateDialog for use.
   */
  public open fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true
  ): Unit {
    TransferContext.writeArguments(STRING to inherits, STRING to path, BOOL to builtInEnabled, BOOL
        to loadEnabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTCREATEDIALOG_CONFIG, NIL)
  }
}
