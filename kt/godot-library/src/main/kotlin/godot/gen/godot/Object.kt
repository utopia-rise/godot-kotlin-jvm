// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.KtObject
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.asStringName
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal10
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.Signal5
import godot.signals.Signal6
import godot.signals.Signal7
import godot.signals.Signal8
import godot.signals.Signal9
import godot.signals.signal
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable

/**
 * Base class for all non-built-in types.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/best_practices/godot_notifications.html]($DOCS_URL/tutorials/best_practices/godot_notifications.html)
 *
 * Every class which is not a built-in type inherits from this class.
 *
 * You can construct Objects from scripting languages, using `Object.new()` in GDScript, or `new Object` in C#.
 *
 * Objects do not manage memory. If a class inherits from Object, you will have to delete instances of it manually. To do so, call the [free] method from your script or delete the instance from C++.
 *
 * Some classes that extend Object add memory management. This is the case of [godot.RefCounted], which counts references and deletes itself automatically when no longer referenced. [godot.Node], another fundamental type, deletes all its children when freed from memory.
 *
 * Objects export properties, which are mainly useful for storage and editing, but not really so much in programming. Properties are exported in [_getPropertyList] and handled in [_get] and [_set]. However, scripting languages and C++ have simpler means to export them.
 *
 * Property membership can be tested directly in GDScript using `in`:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var n = Node2D.new()
 *
 * print("position" in n) # Prints "true".
 *
 * print("other_property" in n) # Prints "false".
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var node = new Node2D();
 *
 * // C# has no direct equivalent to GDScript's `in` operator here, but we
 *
 * // can achieve the same behavior by performing `Get` with a null check.
 *
 * GD.Print(node.Get("position") != null); // Prints "true".
 *
 * GD.Print(node.Get("other_property") != null); // Prints "false".
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The `in` operator will evaluate to `true` as long as the key exists, even if the value is `null`.
 *
 * Objects also receive notifications. Notifications are a simple way to notify the object about different events, so they can all be handled together. See [_notification].
 *
 * **Note:** Unlike references to a [godot.RefCounted], references to an Object stored in a variable can become invalid without warning. Therefore, it's recommended to use [godot.RefCounted] for data classes instead of [godot.Object].
 *
 * **Note:** The `script` property is not exposed like most properties, but it does have a setter and getter (`set_script()` and `get_script()`).
 */
@GodotBaseType
public open class Object : KtObject() {
  /**
   * Emitted whenever the object's script is changed.
   */
  public val scriptChanged: Signal0 by signal()

  /**
   *
   */
  public val propertyListChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OBJECT, scriptIndex)
    return true
  }

  public fun Signal0.emit(): Unit {
    emit(this@Object)
  }

  public inline fun <reified K : () -> Unit> Signal0.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0> Signal1<A0>.emit(a0: A0): Unit {
    emit(this@Object, a0)
  }

  public inline fun <A0, reified K : (A0) -> Unit> Signal1<A0>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1): Unit {
    emit(this@Object, a0, a1)
  }

  public inline fun <A0, A1, reified K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
    a0: A0,
    a1: A1,
    a2: A2
  ): Unit {
    emit(this@Object, a0, a1, a2)
  }

  public inline fun <A0, A1, A2, reified K : (
    A0,
    A1,
    A2
  ) -> Unit> Signal3<A0, A1, A2>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ): Unit {
    emit(this@Object, a0, a1, a2, a3)
  }

  public inline fun <A0, A1, A2, A3, reified K : (
    A0,
    A1,
    A2,
    A3
  ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4)
  }

  public inline fun <A0, A1, A2, A3, A4, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4
  ) -> Unit> Signal5<A0, A1, A2, A3, A4>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5
  ) -> Unit> Signal6<A0, A1, A2, A3, A4, A5>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6
  ) -> Unit> Signal7<A0, A1, A2, A3, A4, A5, A6>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7
  ) -> Unit> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8
  ) -> Unit> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>
      Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8,
    a9: A9
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9
  ) -> Unit> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), binds, flags)
  }

  /**
   * Returns the object's class as a [godot.String]. See also [isClass].
   *
   * **Note:** [getClass] does not take `class_name` declarations into account. If the object has a `class_name` defined, the base class name will be returned instead.
   */
  public fun getClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the object inherits from the given [class]. See also [getClass].
   *
   * **Note:** [isClass] does not take `class_name` declarations into account. If the object has a `class_name` defined, [isClass] will return `false` for that name.
   */
  public fun isClass(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Assigns a new value to the given property. If the [property] does not exist or the given value's type doesn't match, nothing will happen.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  public fun `set`(`property`: String, `value`: Any): Unit {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET, NIL)
  }

  /**
   * Returns the [Variant] value of the given [property]. If the [property] doesn't exist, this will return `null`.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  public fun `get`(`property`: String): Any? {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Assigns a new value to the property identified by the [propertyPath]. The path should be a [godot.core.NodePath] relative to the current object and can use the colon character (`:`) to access nested properties.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * node.set_indexed("position", Vector2(42, 0))
   *
   * node.set_indexed("position:y", -10)
   *
   * print(node.position) # (42, -10)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.SetIndexed("position", new Vector2(42, 0));
   *
   * node.SetIndexed("position:y", -10);
   *
   * GD.Print(node.Position); // (42, -10)
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun setIndexed(`property`: NodePath, `value`: Any): Unit {
    TransferContext.writeArguments(NODE_PATH to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_INDEXED, NIL)
  }

  /**
   * Gets the object's property indexed by the given [propertyPath]. The path should be a [godot.core.NodePath] relative to the current object and can use the colon character (`:`) to access nested properties.
   *
   * **Examples:** `"position:x"` or `"material:next_pass:blend_mode"`.
   *
   * **Note:** Even though the method takes [godot.core.NodePath] argument, it doesn't support actual paths to [godot.Node]s in the scene tree, only colon-separated sub-property paths. For the purpose of nodes, use [godot.Node.getNodeAndResource] instead.
   */
  public fun getIndexed(`property`: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INDEXED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the object's property list as an [godot.Array] of dictionaries.
   *
   * Each property's [godot.core.Dictionary] contain at least `name: String` and `type: int` (see [enum Variant.Type]) entries. Optionally, it can also include `hint: int` (see [enum PropertyHint]), `hint_string: String`, and `usage: int` (see [enum PropertyUsageFlags]).
   */
  public fun getPropertyList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_PROPERTY_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the object's methods and their signatures as an [godot.Array].
   */
  public fun getMethodList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_METHOD_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Send a given notification to the object, which will also trigger a call to the [_notification] method of all classes that the object inherits from.
   *
   * If [reversed] is `true`, [_notification] is called first on the object's own class, and then up to its successive parent classes. If [reversed] is `false`, [_notification] is called first on the highest ancestor ([godot.Object] itself), and then down to its successive inheriting classes.
   */
  public fun notification(what: Long, reversed: Boolean = false): Unit {
    TransferContext.writeArguments(LONG to what, BOOL to reversed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFICATION, NIL)
  }

  /**
   * Returns a [godot.String] representing the object. If not overridden, defaults to `"[godot.ClassName:RID]"`.
   *
   * Override the method [_toString] to customize the [godot.String] representation.
   */
  public override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TO_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the object's unique instance ID.
   *
   * This ID can be saved in [godot.EncodedObjectAsID], and can be used to retrieve the object instance with [@GlobalScope.instanceFromId].
   */
  public fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Assigns a script to the object. Each object can have a single script assigned to it, which are used to extend its functionality.
   *
   * If the object already had a script, the previous script instance will be freed and its variables and state will be lost. The new script's [_init] method will be called.
   */
  public fun setScript(script: Any): Unit {
    TransferContext.writeArguments(ANY to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_SCRIPT, NIL)
  }

  /**
   * Returns the object's [godot.Script] instance, or `null` if none is assigned.
   */
  public fun getScript(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SCRIPT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Adds, changes or removes a given entry in the object's metadata. Metadata are serialized and can take any [Variant] value.
   *
   * To remove a given entry from the object's metadata, use [removeMeta]. Metadata is also removed if its value is set to `null`. This means you can also use `set_meta("name", null)` to remove metadata for `"name"`. See also [hasMeta] and [getMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited.
   */
  public fun setMeta(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_META, NIL)
  }

  /**
   * Removes a given entry from the object's metadata. See also [hasMeta], [getMeta] and [setMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited.
   */
  public fun removeMeta(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_REMOVE_META, NIL)
  }

  /**
   * Returns the object's metadata entry for the given [name].
   *
   * Throws error if the entry does not exist, unless [default] is not `null` (in which case the default value will be returned). See also [hasMeta], [setMeta] and [removeMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited.
   */
  public fun getMeta(name: StringName, default: Any? = null): Any? {
    TransferContext.writeArguments(STRING_NAME to name, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if a metadata entry is found with the given [name]. See also [getMeta], [setMeta] and [removeMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited.
   */
  public fun hasMeta(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_META, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the object's metadata as a [godot.PackedStringArray].
   */
  public fun getMetaList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Adds a user-defined [signal]. Arguments are optional, but can be added as an [godot.Array] of dictionaries, each containing `name: String` and `type: int` (see [enum Variant.Type]) entries.
   */
  public fun addUserSignal(signal: String, arguments: VariantArray<Any?> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_ADD_USER_SIGNAL, NIL)
  }

  /**
   * Returns `true` if the given user-defined [signal] exists. Only signals added using [addUserSignal] are taken into account.
   */
  public fun hasUserSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_USER_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Emits the given [signal]. The signal must exist, so it should be a built-in signal of this class or one of its parent classes, or a user-defined signal. This method supports a variable number of arguments, so parameters are passed as a comma separated list.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * emit_signal("hit", "sword", 100)
   *
   * emit_signal("game_over")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * EmitSignal("hit", "sword", 100);
   *
   * EmitSignal("game_over");
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun emitSignal(signal: StringName, vararg __var_args: Any?): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_EMIT_SIGNAL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Calls the [method] on the object and returns the result. This method supports a variable number of arguments, so parameters are passed as a comma separated list.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.call("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.Call("rotate", new Vector3(1f, 0f, 0f), 1.571f);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, the method name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined methods where you should use the same convention as in the C# source (typically PascalCase).
   */
  public fun call(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Calls the [method] on the object during idle time. This method supports a variable number of arguments, so parameters are passed as a comma separated list.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.call_deferred("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.CallDeferred("rotate", new Vector3(1f, 0f, 0f), 1.571f);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, the method name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined methods where you should use the same convention as in the C# source (typically PascalCase).
   */
  public fun callDeferred(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL_DEFERRED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Assigns a new value to the given property, after the current frame's physics step. This is equivalent to calling [set] via [callDeferred], i.e. `call_deferred("set", property, value)`.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  public fun setDeferred(`property`: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_DEFERRED, NIL)
  }

  /**
   * Calls the [method] on the object and returns the result. Contrarily to [call], this method does not support a variable number of arguments but expects all parameters to be via a single [godot.Array].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.callv("rotate", [godot.Vector3(1.0, 0.0, 0.0), 1.571])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.Callv("rotate", new Godot.Collections.Array { new Vector3(1f, 0f, 0f), 1.571f });
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun callv(method: StringName, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALLV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the object contains the given [method].
   */
  public fun hasMethod(method: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given [signal] exists.
   */
  public fun hasSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the list of signals as an [godot.Array] of dictionaries.
   */
  public fun getSignalList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an [godot.Array] of connections for the given [signal].
   */
  public fun getSignalConnectionList(signal: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an [godot.Array] of dictionaries with information about signals that are connected to the object.
   *
   * Each [godot.core.Dictionary] contains three String entries:
   *
   * - `source` is a reference to the signal emitter.
   *
   * - `signal_name` is the name of the connected signal.
   *
   * - `method_name` is the name of the method to which the signal is connected.
   */
  public fun getIncomingConnections(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INCOMING_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Connects a [signal] to a [callable]. Use [flags] to set deferred or one-shot connections. See [enum ConnectFlags] constants.
   *
   * A signal can only be connected once to a [godot.Callable]. It will print an error if already connected, unless the signal was connected with [CONNECT_REFERENCE_COUNTED]. To avoid this, first, use [isConnected] to check for existing connections.
   *
   * If the callable's target is destroyed in the game's lifecycle, the connection will be lost.
   *
   * **Examples with recommended syntax:**
   *
   * Connecting signals is one of the most common operations in Godot and the API gives many options to do so, which are described further down. The code block below shows the recommended approach for both GDScript and C#.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var button = Button.new()
   *
   *     # `button_down` here is a Signal object, and we thus call the Signal.connect() method,
   *
   *     # not Object.connect(). See discussion below for a more in-depth overview of the API.
   *
   *     button.button_down.connect(_on_button_down)
   *
   *
   *
   *     # This assumes that a `Player` class exists which defines a `hit` signal.
   *
   *     var player = Player.new()
   *
   *     # We use Signal.connect() again, and we also use the Callable.bind() method which
   *
   *     # returns a new Callable with the parameter binds.
   *
   *     player.hit.connect(_on_player_hit.bind("sword", 100))
   *
   *
   *
   * func _on_button_down():
   *
   *     print("Button down!")
   *
   *
   *
   * func _on_player_hit(weapon_type, damage):
   *
   *     print("Hit with weapon %s for %d damage." % [weapon_type, damage])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var button = new Button();
   *
   *     // C# supports passing signals as events, so we can use this idiomatic construct:
   *
   *     button.ButtonDown += OnButtonDown;
   *
   *
   *
   *     // This assumes that a `Player` class exists which defines a `Hit` signal.
   *
   *     var player = new Player();
   *
   *     // Signals as events (`player.Hit += OnPlayerHit;`) do not support argument binding. You have to use:
   *
   *     player.Hit.Connect(OnPlayerHit, new Godot.Collections.Array {"sword", 100 });
   *
   * }
   *
   *
   *
   * private void OnButtonDown()
   *
   * {
   *
   *     GD.Print("Button down!");
   *
   * }
   *
   *
   *
   * private void OnPlayerHit(string weaponType, int damage)
   *
   * {
   *
   *     GD.Print(String.Format("Hit with weapon {0} for {1} damage.", weaponType, damage));
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **`Object.connect()` or `Signal.connect()`?**
   *
   * As seen above, the recommended method to connect signals is not [godot.Object.connect]. The code block below shows the four options for connecting signals, using either this legacy method or the recommended [godot.Signal.connect], and using either an implicit [godot.Callable] or a manually defined one.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var button = Button.new()
   *
   *     # Option 1: Object.connect() with an implicit Callable for the defined function.
   *
   *     button.connect("button_down", _on_button_down)
   *
   *     # Option 2: Object.connect() with a constructed Callable using a target object and method name.
   *
   *     button.connect("button_down", Callable(self, "_on_button_down"))
   *
   *     # Option 3: Signal.connect() with an implicit Callable for the defined function.
   *
   *     button.button_down.connect(_on_button_down)
   *
   *     # Option 4: Signal.connect() with a constructed Callable using a target object and method name.
   *
   *     button.button_down.connect(Callable(self, "_on_button_down"))
   *
   *
   *
   * func _on_button_down():
   *
   *     print("Button down!")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var button = new Button();
   *
   *     // Option 1: Object.Connect() with an implicit Callable for the defined function.
   *
   *     button.Connect("button_down", OnButtonDown);
   *
   *     // Option 2: Object.connect() with a constructed Callable using a target object and method name.
   *
   *     button.Connect("button_down", new Callable(self, nameof(OnButtonDown)));
   *
   *     // Option 3: Signal.connect() with an implicit Callable for the defined function.
   *
   *     button.ButtonDown.Connect(OnButtonDown);
   *
   *     // Option 3b: In C#, we can use signals as events and connect with this more idiomatic syntax:
   *
   *     button.ButtonDown += OnButtonDown;
   *
   *     // Option 4: Signal.connect() with a constructed Callable using a target object and method name.
   *
   *     button.ButtonDown.Connect(new Callable(self, nameof(OnButtonDown)));
   *
   * }
   *
   *
   *
   * private void OnButtonDown()
   *
   * {
   *
   *     GD.Print("Button down!");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * While all options have the same outcome (`button`'s [godot.BaseButton.buttonDown] signal will be connected to `_on_button_down`), option 3 offers the best validation: it will print a compile-time error if either the `button_down` signal or the `_on_button_down` callable are undefined. On the other hand, option 2 only relies on string names and will only be able to validate either names at runtime: it will print a runtime error if `"button_down"` doesn't correspond to a signal, or if `"_on_button_down"` is not a registered method in the object `self`. The main reason for using options 1, 2, or 4 would be if you actually need to use strings (e.g. to connect signals programmatically based on strings read from a configuration file). Otherwise, option 3 is the recommended (and fastest) method.
   *
   * **Parameter bindings and passing:**
   *
   * For legacy or language-specific reasons, there are also several ways to bind parameters to signals. One can pass a `binds` [godot.Array] to [godot.Object.connect] or [godot.Signal.connect], or use the recommended [godot.Callable.bind] method to create a new callable from an existing one, with the given parameter binds.
   *
   * One can also pass additional parameters when emitting the signal with [emitSignal]. The examples below show the relationship between those two types of parameters.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     # This assumes that a `Player` class exists which defines a `hit` signal.
   *
   *     var player = Player.new()
   *
   *     # Option 1: Using Callable.bind().
   *
   *     player.hit.connect(_on_player_hit.bind("sword", 100))
   *
   *     # Option 2: Using a `binds` Array in Signal.connect() (same syntax for Object.connect()).
   *
   *     player.hit.connect(_on_player_hit, ["sword", 100])
   *
   *
   *
   *     # Parameters added when emitting the signal are passed first.
   *
   *     player.emit_signal("hit", "Dark lord", 5)
   *
   *
   *
   * # Four arguments, since we pass two when emitting (hit_by, level)
   *
   * # and two when connecting (weapon_type, damage).
   *
   * func _on_player_hit(hit_by, level, weapon_type, damage):
   *
   *     print("Hit by %s (level %d) with weapon %s for %d damage." % [hit_by, level, weapon_type, damage])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     // This assumes that a `Player` class exists which defines a `Hit` signal.
   *
   *     var player = new Player();
   *
   *     // Option 1: Using Callable.Bind(). This way we can still use signals as events.
   *
   *     player.Hit += OnPlayerHit.Bind("sword", 100);
   *
   *     // Option 2: Using a `binds` Array in Signal.Connect() (same syntax for Object.Connect()).
   *
   *     player.Hit.Connect(OnPlayerHit, new Godot.Collections.Array{ "sword", 100 });
   *
   *
   *
   *     // Parameters added when emitting the signal are passed first.
   *
   *     player.EmitSignal("hit", "Dark lord", 5);
   *
   * }
   *
   *
   *
   * // Four arguments, since we pass two when emitting (hitBy, level)
   *
   * // and two when connecting (weaponType, damage).
   *
   * private void OnPlayerHit(string hitBy, int level, string weaponType, int damage)
   *
   * {
   *
   *     GD.Print(String.Format("Hit by {0} (level {1}) with weapon {2} for {3} damage.", hitBy, level, weaponType, damage));
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun connect(
    signal: StringName,
    callable: Callable,
    binds: VariantArray<Any?> = godot.core.variantArrayOf(),
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable, ARRAY to binds, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CONNECT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects a [signal] from a given [callable].
   *
   * If you try to disconnect a connection that does not exist, the method will print an error. Use [isConnected] to ensure that the connection exists.
   */
  public fun disconnect(signal: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_DISCONNECT, NIL)
  }

  /**
   * Returns `true` if a connection exists for a given [signal] and [callable].
   */
  public fun isConnected(signal: StringName, callable: Callable): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If set to `true`, signal emission is blocked.
   */
  public fun setBlockSignals(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_BLOCK_SIGNALS, NIL)
  }

  /**
   * Returns `true` if signal emission blocking is enabled.
   */
  public fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_BLOCKING_SIGNALS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Notify the editor that the property list has changed by emitting the [propertyListChanged] signal, so that editor plugins can take the new values into account.
   */
  public fun notifyPropertyListChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFY_PROPERTY_LIST_CHANGED,
        NIL)
  }

  /**
   * Defines whether the object can translate strings (with calls to [tr]). Enabled by default.
   */
  public fun setMessageTranslation(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_MESSAGE_TRANSLATION, NIL)
  }

  /**
   * Returns `true` if the object can translate strings. See [setMessageTranslation] and [tr].
   */
  public fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CAN_TRANSLATE_MESSAGES, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Translates a message using translation catalogs configured in the Project Settings. An additional context could be used to specify the translation context.
   *
   * Only works if message translation is enabled (which it is by default), otherwise it returns the [message] unchanged. See [setMessageTranslation].
   *
   * See [godot.Internationalizing games]($DOCS_URL/tutorials/i18n/internationalizing_games.html) for examples of the usage of this method.
   */
  public fun tr(message: StringName, context: StringName = StringName("")): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Translates a message involving plurals using translation catalogs configured in the Project Settings. An additional context could be used to specify the translation context.
   *
   * Only works if message translation is enabled (which it is by default), otherwise it returns the [message] or [pluralMessage] unchanged. See [setMessageTranslation].
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   *
   * **Note:** Negative and floating-point values usually represent physical entities for which singular and plural don't clearly apply. In such cases, use [tr].
   *
   * See [godot.Localization using gettext]($DOCS_URL/tutorials/i18n/localization_using_gettext.html) for examples of the usage of this method.
   */
  public fun trN(
    message: StringName,
    pluralMessage: StringName,
    n: Long,
    context: StringName = StringName("")
  ): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR_N, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the [godot.Node.queueFree] method was called for the object.
   */
  public fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_QUEUED_FOR_DELETION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class ConnectFlags(
    id: Long
  ) {
    /**
     * Connects a signal in deferred mode. This way, signal emissions are stored in a queue, then set on idle time.
     */
    CONNECT_DEFERRED(1),
    /**
     * Persisting connections are saved when the object is serialized to file.
     */
    CONNECT_PERSIST(2),
    CONNECT_ONESHOT(4),
    /**
     * Connect a signal as reference-counted. This means that a given signal can be connected several times to the same target, and will only be fully disconnected once no references are left.
     */
    CONNECT_REFERENCE_COUNTED(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Called right when the object is initialized. Not available in script.
     */
    public final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    /**
     * Called before the object is about to be deleted.
     */
    public final const val NOTIFICATION_PREDELETE: Long = 1
  }
}
