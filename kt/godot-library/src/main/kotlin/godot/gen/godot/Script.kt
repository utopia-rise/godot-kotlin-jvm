// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A class stored as a resource.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/step_by_step/scripting.html](https://docs.godotengine.org/en/latest/getting_started/step_by_step/scripting.html)
 *
 * A class stored as a resource. A script extends the functionality of all objects that instance it.
 *
 * The `new` method of a script subclass creates a new instance. [godot.Object.setScript] extends an existing object, if that object's class matches one of the script's base classes.
 */
@GodotBaseType
open class Script : Resource() {
  /**
   * The script source code or an empty string if source code is not available. When set, does not reload the class implementation automatically.
   */
  open var sourceCode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SOURCE_CODE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_SET_SOURCE_CODE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SCRIPT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns `true` if the script can be instanced.
   */
  open fun canInstance(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_CAN_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the script directly inherited by this script.
   */
  open fun getBaseScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_BASE_SCRIPT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Script?
  }

  /**
   * Returns the script's base type.
   */
  open fun getInstanceBaseType(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_INSTANCE_BASE_TYPE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the default value of the specified property.
   */
  open fun getPropertyDefaultValue(property: String): Any? {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_PROPERTY_DEFAULT_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns a dictionary containing constant names and their values.
   */
  open fun getScriptConstantMap(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_CONSTANT_MAP,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the list of methods in this [godot.Script].
   */
  open fun getScriptMethodList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_METHOD_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of properties in this [godot.Script].
   */
  open fun getScriptPropertyList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_PROPERTY_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of user signals defined in this [godot.Script].
   */
  open fun getScriptSignalList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_SIGNAL_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if the script, or a base class, defines a signal with the given name.
   */
  open fun hasScriptSignal(signalName: String): Boolean {
    TransferContext.writeArguments(STRING to signalName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_HAS_SCRIPT_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the script contains non-empty source code.
   */
  open fun hasSourceCode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_HAS_SOURCE_CODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if `base_object` is an instance of this script.
   */
  open fun instanceHas(baseObject: Object): Boolean {
    TransferContext.writeArguments(OBJECT to baseObject)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_INSTANCE_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the script is a tool script. A tool script can run in the editor.
   */
  open fun isTool(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_IS_TOOL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Reloads the script's class implementation. Returns an error code.
   */
  open fun reload(keepState: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_RELOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
