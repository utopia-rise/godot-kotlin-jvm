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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object ClassDB : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS__CLASSDB)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun canInstance(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CAN_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun classExists(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun classGetCategory(_class: String): String {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_CATEGORY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun classGetIntegerConstant(_class: String, name: String): Long {
    TransferContext.writeArguments(STRING to _class, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_INTEGER_CONSTANT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun classGetIntegerConstantList(_class: String, noInheritance: Boolean = false): PoolStringArray {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_INTEGER_CONSTANT_LIST, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun classGetMethodList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_METHOD_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun classGetProperty(_object: Object, property: String): Any? {
    TransferContext.writeArguments(OBJECT to _object, STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_PROPERTY, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun classGetPropertyList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_PROPERTY_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun classGetSignal(_class: String, signal: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to _class, STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_SIGNAL,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun classGetSignalList(_class: String, noInheritance: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_GET_SIGNAL_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun classHasIntegerConstant(_class: String, name: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_INTEGER_CONSTANT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun classHasMethod(
    _class: String,
    method: String,
    noInheritance: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to method, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun classHasSignal(_class: String, signal: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun classSetProperty(
    _object: Object,
    property: String,
    value: Any
  ): GodotError {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_CLASS_SET_PROPERTY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun getClassList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_CLASS_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getInheritersFromClass(_class: String): PoolStringArray {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_INHERITERS_FROM_CLASS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getParentClass(_class: String): String {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_GET_PARENT_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun instance(_class: String): Any? {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_INSTANCE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun isClassEnabled(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_IS_CLASS_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isParentClass(_class: String, inherits: String): Boolean {
    TransferContext.writeArguments(STRING to _class, STRING to inherits)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__CLASSDB_IS_PARENT_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
