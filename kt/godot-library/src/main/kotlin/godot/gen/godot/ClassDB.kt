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
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides access to metadata stored for every available class.
 */
@GodotBaseType
public object ClassDB : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_CLASSDB)
  }

  /**
   * Returns the names of all the classes available.
   */
  public final fun getClassList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClassListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from [class].
   */
  public final fun getInheritersFromClass(_class: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.getInheritersFromClassPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the parent class of [class].
   */
  public final fun getParentClass(_class: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.getParentClassPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns whether the specified [class] is available or not.
   */
  public final fun classExists(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.classExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether [inherits] is an ancestor of [class] or not.
   */
  public final fun isParentClass(_class: StringName, inherits: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to inherits)
    TransferContext.callMethod(rawPtr, MethodBindings.isParentClassPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if objects can be instantiated from the specified [class], otherwise returns
   * `false`.
   */
  public final fun canInstantiate(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates an instance of [class].
   */
  public final fun instantiate(_class: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.instantiatePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns whether [class] or its ancestry has a signal called [signal] or not.
   */
  public final fun classHasSignal(_class: StringName, signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [signal] data of [class] or its ancestry. The returned value is a [Dictionary] with
   * the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint,
   * hint_string, name, type, usage)`.
   */
  public final fun classGetSignal(_class: StringName, signal: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetSignalPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an array with all the signals of [class] or its ancestry if [noInheritance] is `false`.
   * Every element of the array is a [Dictionary] as described in [classGetSignal].
   */
  @JvmOverloads
  public final fun classGetSignalList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with all the properties of [class] or its ancestry if [noInheritance] is
   * `false`.
   */
  @JvmOverloads
  public final fun classGetPropertyList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the value of [property] of [object] or its ancestry.
   */
  public final fun classGetProperty(_object: Object?, `property`: StringName): Any? {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetPropertyPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets [property] value of [object] to [value].
   */
  public final fun classSetProperty(
    _object: Object?,
    `property`: StringName,
    `value`: Any?,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.classSetPropertyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the default value of [property] of [class] or its ancestor classes.
   */
  public final fun classGetPropertyDefaultValue(_class: StringName, `property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetPropertyDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns whether [class] (or its ancestry if [noInheritance] is `false`) has a method called
   * [method] or not.
   */
  @JvmOverloads
  public final fun classHasMethod(
    _class: StringName,
    method: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to method, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of arguments of the method [method] of [class] or its ancestry if
   * [noInheritance] is `false`.
   */
  @JvmOverloads
  public final fun classGetMethodArgumentCount(
    _class: StringName,
    method: StringName,
    noInheritance: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to method, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetMethodArgumentCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array with all the methods of [class] or its ancestry if [noInheritance] is `false`.
   * Every element of the array is a [Dictionary] with the following keys: `args`, `default_args`,
   * `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   * **Note:** In exported release builds the debug info is not available, so the returned
   * dictionaries will contain only method names.
   */
  @JvmOverloads
  public final fun classGetMethodList(_class: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with the names all the integer constants of [class] or its ancestry.
   */
  @JvmOverloads
  public final fun classGetIntegerConstantList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantListPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns whether [class] or its ancestry has an integer constant called [name] or not.
   */
  public final fun classHasIntegerConstant(_class: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasIntegerConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the value of the integer constant [name] of [class] or its ancestry. Always returns 0
   * when the constant could not be found.
   */
  public final fun classGetIntegerConstant(_class: StringName, name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether [class] or its ancestry has an enum called [name] or not.
   */
  @JvmOverloads
  public final fun classHasEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classHasEnumPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array with all the enums of [class] or its ancestry.
   */
  @JvmOverloads
  public final fun classGetEnumList(_class: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetEnumListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns an array with all the keys in [enum] of [class] or its ancestry.
   */
  @JvmOverloads
  public final fun classGetEnumConstants(
    _class: StringName,
    _enum: StringName,
    noInheritance: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to _enum, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetEnumConstantsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns which enum the integer constant [name] of [class] or its ancestry belongs to.
   */
  @JvmOverloads
  public final fun classGetIntegerConstantEnum(
    _class: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.classGetIntegerConstantEnumPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns whether [class] (or its ancestor classes if [noInheritance] is `false`) has an enum
   * called [enum] that is a bitfield.
   */
  @JvmOverloads
  public final fun isClassEnumBitfield(
    _class: StringName,
    _enum: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class, STRING_NAME to _enum, BOOL to noInheritance)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassEnumBitfieldPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether this [class] is enabled or not.
   */
  public final fun isClassEnabled(_class: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to _class)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  internal object MethodBindings {
    public val getClassListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_class_list", 1139954409)

    public val getInheritersFromClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_inheriters_from_class", 1761182771)

    public val getParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_parent_class", 1965194235)

    public val classExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_exists", 2619796661)

    public val isParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_parent_class", 471820014)

    public val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "can_instantiate", 2619796661)

    public val instantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "instantiate", 2760726917)

    public val classHasSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_signal", 471820014)

    public val classGetSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal", 3061114238)

    public val classGetSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal_list", 3504980660)

    public val classGetPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_list", 3504980660)

    public val classGetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property", 2498641674)

    public val classSetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_set_property", 1690314931)

    public val classGetPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_default_value", 2718203076)

    public val classHasMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_method", 3860701026)

    public val classGetMethodArgumentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_method_argument_count", 3885694822)

    public val classGetMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_method_list", 3504980660)

    public val classGetIntegerConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_list", 3031669221)

    public val classHasIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_integer_constant", 471820014)

    public val classGetIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant", 2419549490)

    public val classHasEnumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_enum", 3860701026)

    public val classGetEnumListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_list", 3031669221)

    public val classGetEnumConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_constants", 661528303)

    public val classGetIntegerConstantEnumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_enum", 2457504236)

    public val isClassEnumBitfieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_class_enum_bitfield", 3860701026)

    public val isClassEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_class_enabled", 2619796661)
  }
}
