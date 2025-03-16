// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Provides access to metadata stored for every available class.
 */
@GodotBaseType
public object ClassDB : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(2)
  }

  /**
   * Returns the names of all the classes available.
   */
  @JvmStatic
  public final fun getClassList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClassListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from [class].
   */
  @JvmStatic
  public final fun getInheritersFromClass(`class`: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.getInheritersFromClassPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the parent class of [class].
   */
  @JvmStatic
  public final fun getParentClass(`class`: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.getParentClassPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns whether the specified [class] is available or not.
   */
  @JvmStatic
  public final fun classExists(`class`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.classExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether [inherits] is an ancestor of [class] or not.
   */
  @JvmStatic
  public final fun isParentClass(`class`: StringName, inherits: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to inherits)
    TransferContext.callMethod(ptr, MethodBindings.isParentClassPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if objects can be instantiated from the specified [class], otherwise returns
   * `false`.
   */
  @JvmStatic
  public final fun canInstantiate(`class`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates an instance of [class].
   */
  @JvmStatic
  public final fun instantiate(`class`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.instantiatePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the API type of [class]. See [APIType].
   */
  @JvmStatic
  public final fun classGetApiType(`class`: StringName): APIType {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.classGetApiTypePtr, LONG)
    return ClassDB.APIType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether [class] or its ancestry has a signal called [signal] or not.
   */
  @JvmStatic
  public final fun classHasSignal(`class`: StringName, signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.classHasSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [signal] data of [class] or its ancestry. The returned value is a [Dictionary] with
   * the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint,
   * hint_string, name, type, usage)`.
   */
  @JvmStatic
  public final fun classGetSignal(`class`: StringName, signal: StringName): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.classGetSignalPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an array with all the signals of [class] or its ancestry if [noInheritance] is `false`.
   * Every element of the array is a [Dictionary] as described in [classGetSignal].
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetSignalList(`class`: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to `class`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with all the properties of [class] or its ancestry if [noInheritance] is
   * `false`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetPropertyList(`class`: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to `class`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the getter method name of [property] of [class].
   */
  @JvmStatic
  public final fun classGetPropertyGetter(`class`: StringName, `property`: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.classGetPropertyGetterPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the setter method name of [property] of [class].
   */
  @JvmStatic
  public final fun classGetPropertySetter(`class`: StringName, `property`: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.classGetPropertySetterPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the value of [property] of [object] or its ancestry.
   */
  @JvmStatic
  public final fun classGetProperty(`object`: Object?, `property`: StringName): Any? {
    TransferContext.writeArguments(OBJECT to `object`, STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.classGetPropertyPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets [property] value of [object] to [value].
   */
  @JvmStatic
  public final fun classSetProperty(
    `object`: Object?,
    `property`: StringName,
    `value`: Any?,
  ): Error {
    TransferContext.writeArguments(OBJECT to `object`, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.classSetPropertyPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the default value of [property] of [class] or its ancestor classes.
   */
  @JvmStatic
  public final fun classGetPropertyDefaultValue(`class`: StringName, `property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.classGetPropertyDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns whether [class] (or its ancestry if [noInheritance] is `false`) has a method called
   * [method] or not.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classHasMethod(
    `class`: StringName,
    method: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to method, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classHasMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of arguments of the method [method] of [class] or its ancestry if
   * [noInheritance] is `false`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetMethodArgumentCount(
    `class`: StringName,
    method: StringName,
    noInheritance: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to method, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetMethodArgumentCountPtr, LONG)
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
  @JvmStatic
  public final fun classGetMethodList(`class`: StringName, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to `class`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Calls a static method on a class.
   */
  @JvmStatic
  public final fun classCallStatic(
    `class`: StringName,
    method: StringName,
    vararg args: Any?,
  ): Any? {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to method,  *args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.classCallStaticPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns an array with the names all the integer constants of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetIntegerConstantList(`class`: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to `class`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetIntegerConstantListPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns whether [class] or its ancestry has an integer constant called [name] or not.
   */
  @JvmStatic
  public final fun classHasIntegerConstant(`class`: StringName, name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.classHasIntegerConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the value of the integer constant [name] of [class] or its ancestry. Always returns 0
   * when the constant could not be found.
   */
  @JvmStatic
  public final fun classGetIntegerConstant(`class`: StringName, name: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.classGetIntegerConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether [class] or its ancestry has an enum called [name] or not.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classHasEnum(
    `class`: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classHasEnumPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array with all the enums of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetEnumList(`class`: StringName, noInheritance: Boolean = false):
      PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to `class`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetEnumListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns an array with all the keys in [enum] of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetEnumConstants(
    `class`: StringName,
    `enum`: StringName,
    noInheritance: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to `enum`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetEnumConstantsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns which enum the integer constant [name] of [class] or its ancestry belongs to.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetIntegerConstantEnum(
    `class`: StringName,
    name: StringName,
    noInheritance: Boolean = false,
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to name, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.classGetIntegerConstantEnumPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns whether [class] (or its ancestor classes if [noInheritance] is `false`) has an enum
   * called [enum] that is a bitfield.
   */
  @JvmOverloads
  @JvmStatic
  public final fun isClassEnumBitfield(
    `class`: StringName,
    `enum`: StringName,
    noInheritance: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`, STRING_NAME to `enum`, BOOL to noInheritance)
    TransferContext.callMethod(ptr, MethodBindings.isClassEnumBitfieldPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether this [class] is enabled or not.
   */
  @JvmStatic
  public final fun isClassEnabled(`class`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to `class`)
    TransferContext.callMethod(ptr, MethodBindings.isClassEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the names of all the classes that directly or indirectly inherit from [class].
   */
  @JvmStatic
  public final fun getInheritersFromClass(`class`: String): PackedStringArray =
      getInheritersFromClass(`class`.asCachedStringName())

  /**
   * Returns the parent class of [class].
   */
  @JvmStatic
  public final fun getParentClass(`class`: String): StringName =
      getParentClass(`class`.asCachedStringName())

  /**
   * Returns whether the specified [class] is available or not.
   */
  @JvmStatic
  public final fun classExists(`class`: String): Boolean = classExists(`class`.asCachedStringName())

  /**
   * Returns whether [inherits] is an ancestor of [class] or not.
   */
  @JvmStatic
  public final fun isParentClass(`class`: String, inherits: String): Boolean =
      isParentClass(`class`.asCachedStringName(), inherits.asCachedStringName())

  /**
   * Returns `true` if objects can be instantiated from the specified [class], otherwise returns
   * `false`.
   */
  @JvmStatic
  public final fun canInstantiate(`class`: String): Boolean =
      canInstantiate(`class`.asCachedStringName())

  /**
   * Creates an instance of [class].
   */
  @JvmStatic
  public final fun instantiate(`class`: String): Any? = instantiate(`class`.asCachedStringName())

  /**
   * Returns the API type of [class]. See [APIType].
   */
  @JvmStatic
  public final fun classGetApiType(`class`: String): APIType =
      classGetApiType(`class`.asCachedStringName())

  /**
   * Returns whether [class] or its ancestry has a signal called [signal] or not.
   */
  @JvmStatic
  public final fun classHasSignal(`class`: String, signal: String): Boolean =
      classHasSignal(`class`.asCachedStringName(), signal.asCachedStringName())

  /**
   * Returns the [signal] data of [class] or its ancestry. The returned value is a [Dictionary] with
   * the following keys: `args`, `default_args`, `flags`, `id`, `name`, `return: (class_name, hint,
   * hint_string, name, type, usage)`.
   */
  @JvmStatic
  public final fun classGetSignal(`class`: String, signal: String): Dictionary<Any?, Any?> =
      classGetSignal(`class`.asCachedStringName(), signal.asCachedStringName())

  /**
   * Returns an array with all the signals of [class] or its ancestry if [noInheritance] is `false`.
   * Every element of the array is a [Dictionary] as described in [classGetSignal].
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetSignalList(`class`: String, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> =
      classGetSignalList(`class`.asCachedStringName(), noInheritance)

  /**
   * Returns an array with all the properties of [class] or its ancestry if [noInheritance] is
   * `false`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetPropertyList(`class`: String, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> =
      classGetPropertyList(`class`.asCachedStringName(), noInheritance)

  /**
   * Returns the getter method name of [property] of [class].
   */
  @JvmStatic
  public final fun classGetPropertyGetter(`class`: String, `property`: String): StringName =
      classGetPropertyGetter(`class`.asCachedStringName(), property.asCachedStringName())

  /**
   * Returns the setter method name of [property] of [class].
   */
  @JvmStatic
  public final fun classGetPropertySetter(`class`: String, `property`: String): StringName =
      classGetPropertySetter(`class`.asCachedStringName(), property.asCachedStringName())

  /**
   * Returns the value of [property] of [object] or its ancestry.
   */
  @JvmStatic
  public final fun classGetProperty(`object`: Object?, `property`: String): Any? =
      classGetProperty(`object`, property.asCachedStringName())

  /**
   * Sets [property] value of [object] to [value].
   */
  @JvmStatic
  public final fun classSetProperty(
    `object`: Object?,
    `property`: String,
    `value`: Any?,
  ): Error = classSetProperty(`object`, property.asCachedStringName(), value)

  /**
   * Returns the default value of [property] of [class] or its ancestor classes.
   */
  @JvmStatic
  public final fun classGetPropertyDefaultValue(`class`: String, `property`: String): Any? =
      classGetPropertyDefaultValue(`class`.asCachedStringName(), property.asCachedStringName())

  /**
   * Returns whether [class] (or its ancestry if [noInheritance] is `false`) has a method called
   * [method] or not.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classHasMethod(
    `class`: String,
    method: String,
    noInheritance: Boolean = false,
  ): Boolean =
      classHasMethod(`class`.asCachedStringName(), method.asCachedStringName(), noInheritance)

  /**
   * Returns the number of arguments of the method [method] of [class] or its ancestry if
   * [noInheritance] is `false`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetMethodArgumentCount(
    `class`: String,
    method: String,
    noInheritance: Boolean = false,
  ): Int =
      classGetMethodArgumentCount(`class`.asCachedStringName(), method.asCachedStringName(), noInheritance)

  /**
   * Returns an array with all the methods of [class] or its ancestry if [noInheritance] is `false`.
   * Every element of the array is a [Dictionary] with the following keys: `args`, `default_args`,
   * `flags`, `id`, `name`, `return: (class_name, hint, hint_string, name, type, usage)`.
   * **Note:** In exported release builds the debug info is not available, so the returned
   * dictionaries will contain only method names.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetMethodList(`class`: String, noInheritance: Boolean = false):
      VariantArray<Dictionary<Any?, Any?>> =
      classGetMethodList(`class`.asCachedStringName(), noInheritance)

  /**
   * Calls a static method on a class.
   */
  @JvmStatic
  public final fun classCallStatic(
    `class`: String,
    method: String,
    vararg args: Any?,
  ): Any? = classCallStatic(`class`.asCachedStringName(), method.asCachedStringName(), )

  /**
   * Returns an array with the names all the integer constants of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetIntegerConstantList(`class`: String, noInheritance: Boolean = false):
      PackedStringArray = classGetIntegerConstantList(`class`.asCachedStringName(), noInheritance)

  /**
   * Returns whether [class] or its ancestry has an integer constant called [name] or not.
   */
  @JvmStatic
  public final fun classHasIntegerConstant(`class`: String, name: String): Boolean =
      classHasIntegerConstant(`class`.asCachedStringName(), name.asCachedStringName())

  /**
   * Returns the value of the integer constant [name] of [class] or its ancestry. Always returns 0
   * when the constant could not be found.
   */
  @JvmStatic
  public final fun classGetIntegerConstant(`class`: String, name: String): Long =
      classGetIntegerConstant(`class`.asCachedStringName(), name.asCachedStringName())

  /**
   * Returns whether [class] or its ancestry has an enum called [name] or not.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classHasEnum(
    `class`: String,
    name: String,
    noInheritance: Boolean = false,
  ): Boolean = classHasEnum(`class`.asCachedStringName(), name.asCachedStringName(), noInheritance)

  /**
   * Returns an array with all the enums of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetEnumList(`class`: String, noInheritance: Boolean = false):
      PackedStringArray = classGetEnumList(`class`.asCachedStringName(), noInheritance)

  /**
   * Returns an array with all the keys in [enum] of [class] or its ancestry.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetEnumConstants(
    `class`: String,
    `enum`: String,
    noInheritance: Boolean = false,
  ): PackedStringArray =
      classGetEnumConstants(`class`.asCachedStringName(), `enum`.asCachedStringName(), noInheritance)

  /**
   * Returns which enum the integer constant [name] of [class] or its ancestry belongs to.
   */
  @JvmOverloads
  @JvmStatic
  public final fun classGetIntegerConstantEnum(
    `class`: String,
    name: String,
    noInheritance: Boolean = false,
  ): StringName =
      classGetIntegerConstantEnum(`class`.asCachedStringName(), name.asCachedStringName(), noInheritance)

  /**
   * Returns whether [class] (or its ancestor classes if [noInheritance] is `false`) has an enum
   * called [enum] that is a bitfield.
   */
  @JvmOverloads
  @JvmStatic
  public final fun isClassEnumBitfield(
    `class`: String,
    `enum`: String,
    noInheritance: Boolean = false,
  ): Boolean =
      isClassEnumBitfield(`class`.asCachedStringName(), `enum`.asCachedStringName(), noInheritance)

  /**
   * Returns whether this [class] is enabled or not.
   */
  @JvmStatic
  public final fun isClassEnabled(`class`: String): Boolean =
      isClassEnabled(`class`.asCachedStringName())

  public enum class APIType(
    id: Long,
  ) {
    /**
     * Native Core class type.
     */
    API_CORE(0),
    /**
     * Native Editor class type.
     */
    API_EDITOR(1),
    /**
     * GDExtension class type.
     */
    API_EXTENSION(2),
    /**
     * GDExtension Editor class type.
     */
    API_EDITOR_EXTENSION(3),
    /**
     * Unknown class type.
     */
    API_NONE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): APIType = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val getClassListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_class_list", 1139954409)

    internal val getInheritersFromClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_inheriters_from_class", 1761182771)

    internal val getParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "get_parent_class", 1965194235)

    internal val classExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_exists", 2619796661)

    internal val isParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_parent_class", 471820014)

    internal val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "can_instantiate", 2619796661)

    internal val instantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "instantiate", 2760726917)

    internal val classGetApiTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_api_type", 2475317043)

    internal val classHasSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_signal", 471820014)

    internal val classGetSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal", 3061114238)

    internal val classGetSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_signal_list", 3504980660)

    internal val classGetPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_list", 3504980660)

    internal val classGetPropertyGetterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_getter", 3770832642)

    internal val classGetPropertySetterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_setter", 3770832642)

    internal val classGetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property", 2498641674)

    internal val classSetPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_set_property", 1690314931)

    internal val classGetPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_property_default_value", 2718203076)

    internal val classHasMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_method", 3860701026)

    internal val classGetMethodArgumentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_method_argument_count", 3885694822)

    internal val classGetMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_method_list", 3504980660)

    internal val classCallStaticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_call_static", 3344196419)

    internal val classGetIntegerConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_list", 3031669221)

    internal val classHasIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_integer_constant", 471820014)

    internal val classGetIntegerConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant", 2419549490)

    internal val classHasEnumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_has_enum", 3860701026)

    internal val classGetEnumListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_list", 3031669221)

    internal val classGetEnumConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_enum_constants", 661528303)

    internal val classGetIntegerConstantEnumPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "class_get_integer_constant_enum", 2457504236)

    internal val isClassEnumBitfieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_class_enum_bitfield", 3860701026)

    internal val isClassEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ClassDB", "is_class_enabled", 2619796661)
  }
}
