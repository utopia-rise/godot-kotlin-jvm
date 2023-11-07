// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Provides access to metadata stored for every available class.
 */
@GodotBaseType
public object ClassDB : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_CLASSDB)
    return false
  }

  /**
   * Returns the names of all the classes available.
   */
  public fun getClassList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClassListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from [param class].
   */
  public fun getInheritersFromClass(_class: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.getInheritersFromClassPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the parent class of [param class].
   */
  public fun getParentClass(_class: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.getParentClassPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns whether the specified [param class] is available or not.
   */
  public fun classExists(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.classExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether [param inherits] is an ancestor of [param class] or not.
   */
  public fun isParentClass(_class: StringName, inherits: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to inherits)
    TransferContext.callMethod(rawPtr, MethodBindings.isParentClassPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if objects can be instantiated from the specified [param class], otherwise
   * returns `false`.
   */
  public fun canInstantiate(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates an instance of [param class].
   */
  public fun instantiate(_class: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.instantiatePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns whether [param class] or its ancestry has a signal called [param signal] or not.
   */
  public fun classHasSignal(_class: StringName, signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [param signal] data of [param class] or its ancestry. The returned value is a
   * [Dictionary] with the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return:
   * (class_name, hint, hint_string, name, type, usage)`.
   */
  public fun classGetSignal(_class: StringName, signal: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetSignalPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an array with all the signals of [param class] or its ancestry if [param
   * no_inheritance] is `false`. Every element of the array is a [Dictionary] as described in
   * [classGetSignal].
   */
  @JvmOverloads
  public fun classGetSignalList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with all the properties of [param class] or its ancestry if [param
   * no_inheritance] is `false`.
   */
  @JvmOverloads
  public fun classGetPropertyList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the value of [param property] of [param object] or its ancestry.
   */
  public fun classGetProperty(_object: Object, `property`: StringName): Any? {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetPropertyPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets [param property] value of [param object] to [param value].
   */
  public fun classSetProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any?,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.classSetPropertyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether [param class] (or its ancestry if [param no_inheritance] is `false`) has a
   * method called [param method] or not.
   */
  @JvmOverloads
  public fun classHasMethod(
    _class: StringName,
    method: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to method, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with all the methods of [param class] or its ancestry if [param
   * no_inheritance] is `false`. Every element of the array is a [Dictionary] with the following keys:
   * `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name,
   * type, usage)`.
   * **Note:** In exported release builds the debug info is not available, so the returned
   * dictionaries will contain only method names.
   */
  @JvmOverloads
  public fun classGetMethodList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with the names all the integer constants of [param class] or its ancestry.
   */
  @JvmOverloads
  public fun classGetIntegerConstantList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantListPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns whether [param class] or its ancestry has an integer constant called [param name] or
   * not.
   */
  public fun classHasIntegerConstant(_class: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasIntegerConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the value of the integer constant [param name] of [param class] or its ancestry. Always
   * returns 0 when the constant could not be found.
   */
  public fun classGetIntegerConstant(_class: StringName, name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns whether [param class] or its ancestry has an enum called [param name] or not.
   */
  @JvmOverloads
  public fun classHasEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasEnumPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with all the enums of [param class] or its ancestry.
   */
  @JvmOverloads
  public fun classGetEnumList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetEnumListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns an array with all the keys in [param enum] of [param class] or its ancestry.
   */
  @JvmOverloads
  public fun classGetEnumConstants(
    _class: StringName,
    _enum: StringName,
    noInheritance: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to _enum, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetEnumConstantsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns which enum the integer constant [param name] of [param class] or its ancestry belongs
   * to.
   */
  @JvmOverloads
  public fun classGetIntegerConstantEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantEnumPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns whether this [param class] is enabled or not.
   */
  public fun isClassEnabled(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  internal object MethodBindings {
    public val getClassListPtr: VoidPtr = TypeManager.getMethodBindPtr("ClassDB", "get_class_list")

    public val getInheritersFromClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_inheriters_from_class")

    public val getParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_parent_class")

    public val classExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("ClassDB", "class_exists")

    public val isParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_parent_class")

    public val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "can_instantiate")

    public val instantiatePtr: VoidPtr = TypeManager.getMethodBindPtr("ClassDB", "instantiate")

    public val classHasSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_signal")

    public val classGetSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal")

    public val classGetSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal_list")

    public val classGetPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_list")

    public val classGetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property")

    public val classSetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_set_property")

    public val classHasMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_method")

    public val classGetMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_method_list")

    public val classGetIntegerConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_list")

    public val classHasIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_integer_constant")

    public val classGetIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant")

    public val classHasEnumPtr: VoidPtr = TypeManager.getMethodBindPtr("ClassDB", "class_has_enum")

    public val classGetEnumListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_list")

    public val classGetEnumConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_constants")

    public val classGetIntegerConstantEnumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_enum")

    public val isClassEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_class_enabled")
  }
}
