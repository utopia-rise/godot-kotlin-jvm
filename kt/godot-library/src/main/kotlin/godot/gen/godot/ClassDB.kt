// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Class information repository.
 *
 * Provides access to metadata stored for every available class.
 */
@GodotBaseType
object ClassDB : Object() {
  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_CLASSDB)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns `true` if you can instance objects from the specified `class`, `false` in other case.
   */
  fun canInstance(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CAN_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the specified `class` is available or not.
   */
  fun classExists(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a category associated with the class for use in documentation and the Asset Library. Debug mode required.
   */
  fun classGetCategory(_class: String): String {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_CATEGORY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the value of the integer constant `name` of `class` or its ancestry. Always returns 0 when the constant could not be found.
   */
  fun classGetIntegerConstant(_class: String, name: String): Long {
    TransferContext.writeArguments(STRING to _class, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_INTEGER_CONSTANT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array with the names all the integer constants of `class` or its ancestry.
   */
  fun classGetIntegerConstantList(_class: String, noInheritance: Boolean = false): PoolStringArray {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_INTEGER_CONSTANT_LIST, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns an array with all the methods of `class` or its ancestry if `no_inheritance` is `false`. Every element of the array is a [godot.core.Dictionary] with the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   */
  fun classGetMethodList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_METHOD_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the value of `property` of `class` or its ancestry.
   */
  fun classGetProperty(_object: Object, property: String): Any? {
    TransferContext.writeArguments(OBJECT to _object, STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_PROPERTY, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns an array with all the properties of `class` or its ancestry if `no_inheritance` is `false`.
   */
  fun classGetPropertyList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_PROPERTY_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the `signal` data of `class` or its ancestry. The returned value is a [godot.core.Dictionary] with the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   */
  fun classGetSignal(_class: String, signal: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to _class, STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_SIGNAL,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns an array with all the signals of `class` or its ancestry if `no_inheritance` is `false`. Every element of the array is a [godot.core.Dictionary] as described in [classGetSignal].
   */
  fun classGetSignalList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_SIGNAL_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns whether `class` or its ancestry has an integer constant called `name` or not.
   */
  fun classHasIntegerConstant(_class: String, name: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_INTEGER_CONSTANT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether `class` (or its ancestry if `no_inheritance` is `false`) has a method called `method` or not.
   */
  fun classHasMethod(
    _class: String,
    method: String,
    noInheritance: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to method, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether `class` or its ancestry has a signal called `signal` or not.
   */
  fun classHasSignal(_class: String, signal: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets `property` value of `class` to `value`.
   */
  fun classSetProperty(
    _object: Object,
    property: String,
    value: Any?
  ): GodotError {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_SET_PROPERTY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the names of all the classes available.
   */
  fun getClassList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_CLASS_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from `class`.
   */
  fun getInheritersFromClass(_class: String): PoolStringArray {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_INHERITERS_FROM_CLASS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the parent class of `class`.
   */
  fun getParentClass(_class: String): String {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_PARENT_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Creates an instance of `class`.
   */
  fun instance(_class: String): Any? {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_INSTANCE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns whether this `class` is enabled or not.
   */
  fun isClassEnabled(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_IS_CLASS_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether `inherits` is an ancestor of `class` or not.
   */
  fun isParentClass(_class: String, inherits: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to inherits)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_IS_PARENT_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
