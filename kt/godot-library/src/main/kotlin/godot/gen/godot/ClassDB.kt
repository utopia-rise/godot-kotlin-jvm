// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class information repository.
 *
 * Provides access to metadata stored for every available class.
 */
@GodotBaseType
public object ClassDB : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_CLASSDB)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns the names of all the classes available.
   */
  public open fun getClassList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_GET_CLASS_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from `class`.
   */
  public open fun getInheritersFromClass(_class: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_GET_INHERITERS_FROM_CLASS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns the parent class of `class`.
   */
  public open fun getParentClass(_class: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_GET_PARENT_CLASS,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns whether the specified `class` is available or not.
   */
  public open fun classExists(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether `inherits` is an ancestor of `class` or not.
   */
  public open fun isParentClass(_class: StringName, inherits: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to inherits)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_IS_PARENT_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if you can instance objects from the specified `class`, `false` in other case.
   */
  public open fun canInstantiate(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CAN_INSTANTIATE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Creates an instance of `class`.
   */
  public open fun instantiate(_class: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_INSTANTIATE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns whether `class` or its ancestry has a signal called `signal` or not.
   */
  public open fun classHasSignal(_class: StringName, signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the `signal` data of `class` or its ancestry. The returned value is a [godot.core.Dictionary] with the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   */
  public open fun classGetSignal(_class: StringName, signal: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_SIGNAL,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns an array with all the signals of `class` or its ancestry if `no_inheritance` is `false`. Every element of the array is a [godot.core.Dictionary] as described in [classGetSignal].
   */
  public open fun classGetSignalList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_SIGNAL_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array with all the properties of `class` or its ancestry if `no_inheritance` is `false`.
   */
  public open fun classGetPropertyList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_PROPERTY_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the value of `property` of `class` or its ancestry.
   */
  public open fun classGetProperty(_object: Object, `property`: StringName): Any? {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_PROPERTY, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets `property` value of `class` to `value`.
   */
  public open fun classSetProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any
  ): GodotError {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_SET_PROPERTY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns whether `class` (or its ancestry if `no_inheritance` is `false`) has a method called `method` or not.
   */
  public open fun classHasMethod(
    _class: StringName,
    method: StringName,
    noInheritance: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to method, BOOL to
        noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array with all the methods of `class` or its ancestry if `no_inheritance` is `false`. Every element of the array is a [godot.core.Dictionary] with the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   *
   * **Note:** In exported release builds the debug info is not available, so the returned dictionaries will contain only method names.
   */
  public open fun classGetMethodList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_METHOD_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array with the names all the integer constants of `class` or its ancestry.
   */
  public open fun classGetIntegerConstantList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_INTEGER_CONSTANT_LIST, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns whether `class` or its ancestry has an integer constant called `name` or not.
   */
  public open fun classHasIntegerConstant(_class: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_HAS_INTEGER_CONSTANT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the value of the integer constant `name` of `class` or its ancestry. Always returns 0 when the constant could not be found.
   */
  public open fun classGetIntegerConstant(_class: StringName, name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_INTEGER_CONSTANT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns whether `class` or its ancestry has an enum called `name` or not.
   */
  public open fun classHasEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to
        noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_HAS_ENUM, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array with all the enums of `class` or its ancestry.
   */
  public open fun classGetEnumList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_ENUM_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns an array with all the keys in `enum` of `class` or its ancestry.
   */
  public open fun classGetEnumConstants(
    _class: StringName,
    _enum: StringName,
    noInheritance: Boolean = false
  ): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to _enum, BOOL to
        noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_ENUM_CONSTANTS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns which enum the integer constant `name` of `class` or its ancestry belongs to.
   */
  public open fun classGetIntegerConstantEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to
        noInheritance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_INTEGER_CONSTANT_ENUM, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns a category associated with the class for use in documentation and the Asset Library. Debug mode required.
   */
  public open fun classGetCategory(_class: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_CLASS_GET_CATEGORY,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns whether this `class` is enabled or not.
   */
  public open fun isClassEnabled(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLASSDB_IS_CLASS_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
