// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
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
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A class stored as a resource.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/scripting/index.html]($DOCS_URL/tutorials/scripting/index.html)
 *
 * A class stored as a resource. A script extends the functionality of all objects that instantiate it.
 *
 * This is the base class for all scripts and should not be used directly. Trying to create a new script with this class will result in an error.
 *
 * The `new` method of a script subclass creates a new instance. [godot.Object.setScript] extends an existing object, if that object's class matches one of the script's base classes.
 */
@GodotBaseType
public open class Script internal constructor() : Resource() {
  /**
   * The script source code or an empty string if source code is not available. When set, does not reload the class implementation automatically.
   */
  public var sourceCode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SOURCE_CODE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_SET_SOURCE_CODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPT, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the script can be instantiated.
   */
  public fun canInstantiate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_CAN_INSTANTIATE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [baseObject] is an instance of this script.
   */
  public fun instanceHas(baseObject: Object): Boolean {
    TransferContext.writeArguments(OBJECT to baseObject)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_INSTANCE_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the script contains non-empty source code.
   */
  public fun hasSourceCode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_HAS_SOURCE_CODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Reloads the script's class implementation. Returns an error code.
   */
  public fun reload(keepState: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_RELOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the script directly inherited by this script.
   */
  public fun getBaseScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_BASE_SCRIPT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Script?
  }

  /**
   * Returns the script's base type.
   */
  public fun getInstanceBaseType(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_INSTANCE_BASE_TYPE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns `true` if the script, or a base class, defines a signal with the given name.
   */
  public fun hasScriptSignal(signalName: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signalName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_HAS_SCRIPT_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the list of properties in this [godot.Script].
   */
  public fun getScriptPropertyList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_PROPERTY_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of methods in this [godot.Script].
   */
  public fun getScriptMethodList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_METHOD_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of user signals defined in this [godot.Script].
   */
  public fun getScriptSignalList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_SIGNAL_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a dictionary containing constant names and their values.
   */
  public fun getScriptConstantMap(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_SCRIPT_CONSTANT_MAP,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the default value of the specified property.
   */
  public fun getPropertyDefaultValue(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_GET_PROPERTY_DEFAULT_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the script is a tool script. A tool script can run in the editor.
   */
  public fun isTool(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPT_IS_TOOL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
