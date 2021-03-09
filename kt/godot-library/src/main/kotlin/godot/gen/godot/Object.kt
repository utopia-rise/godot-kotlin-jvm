// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.KtObject
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
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
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable

/**
 * Base class for all non built-in types.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/workflow/best_practices/node_alternatives.html](https://docs.godotengine.org/en/latest/getting_started/workflow/best_practices/node_alternatives.html)
 *
 * Every class which is not a built-in type inherits from this class.
 *
 * You can construct Objects from scripting languages, using `Object.new()` in GDScript, `new Object` in C#, or the "Construct Object" node in VisualScript.
 *
 * Objects do not manage memory. If a class inherits from Object, you will have to delete instances of it manually. To do so, call the [free] method from your script or delete the instance from C++.
 *
 * Some classes that extend Object add memory management. This is the case of [godot.Reference], which counts references and deletes itself automatically when no longer referenced. [godot.Node], another fundamental type, deletes all its children when freed from memory.
 *
 * Objects export properties, which are mainly useful for storage and editing, but not really so much in programming. Properties are exported in [_getPropertyList] and handled in [_get] and [_set]. However, scripting languages and C++ have simpler means to export them.
 *
 * Property membership can be tested directly in GDScript using `in`:
 *
 * ```
 * 		var n = Node2D.new()
 * 		print("position" in n) # Prints "True".
 * 		print("other_property" in n) # Prints "False".
 * 		```
 *
 * The `in` operator will evaluate to `true` as long as the key exists, even if the value is `null`.
 *
 * Objects also receive notifications. Notifications are a simple way to notify the object about different events, so they can all be handled together. See [_notification].
 *
 * **Note:** Unlike references to a [godot.Reference], references to an Object stored in a variable can become invalid without warning. Therefore, it's recommended to use [godot.Reference] for data classes instead of [godot.Object].
 */
@GodotBaseType
open class Object : KtObject() {
  /**
   * Emitted whenever the object's script is changed.
   */
  val scriptChanged: Signal0 by signal()

  fun Signal0.emit() {
    emit(this@Object)
  }

  inline fun <reified K : () -> Unit> Signal0.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0> Signal1<A0>.emit(a0: A0) {
    emit(this@Object, a0)
  }

  inline fun <A0, reified K : (A0) -> Unit> Signal1<A0>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1) {
    emit(this@Object, a0, a1)
  }

  inline fun <A0, A1, reified K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
    a0: A0,
    a1: A1,
    a2: A2
  ) {
    emit(this@Object, a0, a1, a2)
  }

  inline fun <A0, A1, A2, reified K : (
    A0,
    A1,
    A2
  ) -> Unit> Signal3<A0, A1, A2>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ) {
    emit(this@Object, a0, a1, a2, a3)
  }

  inline fun <A0, A1, A2, A3, reified K : (
    A0,
    A1,
    A2,
    A3
  ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
    target: Object,
    method: K,
    binds: VariantArray<Any?>? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ) {
    emit(this@Object, a0, a1, a2, a3, a4)
  }

  inline fun <A0, A1, A2, A3, A4, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5)
  }

  inline fun <A0, A1, A2, A3, A4, A5, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8,
      A9>.emit(
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
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
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
  ) {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase()
    connect(target, methodName, binds, flags)
  }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_OBJECT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Virtual method which can be overridden to customize the return value of [get].
   *
   * Returns the given property. Returns `null` if the `property` does not exist.
   */
  open fun _get(property: String): Any? {
    throw NotImplementedError("_get is not implemented for Object")
  }

  /**
   * Virtual method which can be overridden to customize the return value of [getPropertyList].
   *
   * Returns the object's property list as an [godot.Array] of dictionaries.
   *
   * Each property's [godot.core.Dictionary] must contain at least `name: String` and `type: int` (see [enum Variant.Type]) entries. Optionally, it can also include `hint: int` (see [enum PropertyHint]), `hint_string: String`, and `usage: int` (see [enum PropertyUsageFlags]).
   */
  open fun _getPropertyList(): VariantArray<Any?> {
    throw NotImplementedError("_get_property_list is not implemented for Object")
  }

  /**
   * Called when the object is initialized.
   */
  open fun _init() {
  }

  /**
   * Called whenever the object receives a notification, which is identified in `what` by a constant. The base [godot.Object] has two constants [NOTIFICATION_POSTINITIALIZE] and [NOTIFICATION_PREDELETE], but subclasses such as [godot.Node] define a lot more notifications which are also received by this method.
   */
  open fun _notification(what: Long) {
  }

  /**
   * Virtual method which can be overridden to customize the return value of [set].
   *
   * Sets a property. Returns `true` if the `property` exists.
   */
  open fun _set(property: String, value: Any?): Boolean {
    throw NotImplementedError("_set is not implemented for Object")
  }

  /**
   * Virtual method which can be overridden to customize the return value of [toString], and thus the object's representation where it is converted to a string, e.g. with `print(obj)`.
   *
   * Returns a [godot.String] representing the object. If not overridden, defaults to `"[godot.ClassName:RID]"`.
   */
  open fun _toString(): String {
    throw NotImplementedError("_to_string is not implemented for Object")
  }

  /**
   * Adds a user-defined `signal`. Arguments are optional, but can be added as an [godot.Array] of dictionaries, each containing `name: String` and `type: int` (see [enum Variant.Type]) entries.
   */
  open fun addUserSignal(signal: String, arguments: VariantArray<Any?> = VariantArray()) {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_ADD_USER_SIGNAL, NIL)
  }

  /**
   * Calls the `method` on the object and returns the result. This method supports a variable number of arguments, so parameters are passed as a comma separated list. Example:
   *
   * ```
   * 				call("set", "position", Vector2(42.0, 0.0))
   * 				```
   *
   * **Note:** In C#, the method name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined methods where you should use the same convention as in the C# source (typically PascalCase).
   */
  open fun call(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Calls the `method` on the object during idle time. This method supports a variable number of arguments, so parameters are passed as a comma separated list. Example:
   *
   * ```
   * 				call_deferred("set", "position", Vector2(42.0, 0.0))
   * 				```
   *
   * **Note:** In C#, the method name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined methods where you should use the same convention as in the C# source (typically PascalCase).
   */
  open fun callDeferred(method: String, vararg __var_args: Any?) {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL_DEFERRED, NIL)
  }

  /**
   * Calls the `method` on the object and returns the result. Contrarily to [call], this method does not support a variable number of arguments but expects all parameters to be via a single [godot.Array].
   *
   * ```
   * 				callv("set", [ "position", Vector2(42.0, 0.0) ])
   * 				```
   */
  open fun callv(method: String, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING to method, ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALLV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the object can translate strings. See [setMessageTranslation] and [tr].
   */
  open fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CAN_TRANSLATE_MESSAGES, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Connects a `signal` to a `method` on a `target` object. Pass optional `binds` to the call as an [godot.Array] of parameters. These parameters will be passed to the method after any parameter used in the call to [emitSignal]. Use `flags` to set deferred or one-shot connections. See [enum ConnectFlags] constants.
   *
   * A `signal` can only be connected once to a `method`. It will throw an error if already connected, unless the signal was connected with [CONNECT_REFERENCE_COUNTED]. To avoid this, first, use [isConnected] to check for existing connections.
   *
   * If the `target` is destroyed in the game's lifecycle, the connection will be lost.
   *
   * Examples:
   *
   * ```
   * 				connect("pressed", self, "_on_Button_pressed") # BaseButton signal
   * 				connect("text_entered", self, "_on_LineEdit_text_entered") # LineEdit signal
   * 				connect("hit", self, "_on_Player_hit", [ weapon_type, damage ]) # User-defined signal
   * 				```
   *
   * An example of the relationship between `binds` passed to [connect] and parameters used when calling [emitSignal]:
   *
   * ```
   * 				connect("hit", self, "_on_Player_hit", [ weapon_type, damage ]) # weapon_type and damage are passed last
   * 				emit_signal("hit", "Dark lord", 5) # "Dark lord" and 5 are passed first
   * 				func _on_Player_hit(hit_by, level, weapon_type, damage):
   * 				    print("Hit by %s (lvl %d) with weapon %s for %d damage" % [hit_by, level, weapon_type, damage])
   * 				```
   */
  open fun connect(
    signal: String,
    target: Object,
    method: String,
    binds: VariantArray<Any?> = VariantArray(),
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to signal, OBJECT to target, STRING to method, ARRAY to
        binds, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CONNECT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects a `signal` from a `method` on the given `target`.
   *
   * If you try to disconnect a connection that does not exist, the method will throw an error. Use [isConnected] to ensure that the connection exists.
   */
  open fun disconnect(
    signal: String,
    target: Object,
    method: String
  ) {
    TransferContext.writeArguments(STRING to signal, OBJECT to target, STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_DISCONNECT, NIL)
  }

  /**
   * Emits the given `signal`. The signal must exist, so it should be a built-in signal of this class or one of its parent classes, or a user-defined signal. This method supports a variable number of arguments, so parameters are passed as a comma separated list. Example:
   *
   * ```
   * 				emit_signal("hit", weapon_type, damage)
   * 				emit_signal("game_over")
   * 				```
   */
  open fun emitSignal(signal: String, vararg __var_args: Any?) {
    TransferContext.writeArguments(STRING to signal,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_EMIT_SIGNAL, NIL)
  }

  /**
   * Returns the [Variant] value of the given `property`. If the `property` doesn't exist, this will return `null`.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  open fun get(property: String): Any? {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the object's class as a [godot.String].
   */
  open fun getClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
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
  open fun getIncomingConnections(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INCOMING_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets the object's property indexed by the given [godot.core.NodePath]. The node path should be relative to the current object and can use the colon character (`:`) to access nested properties. Examples: `"position:x"` or `"material:next_pass:blend_mode"`.
   */
  open fun getIndexed(property: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INDEXED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the object's unique instance ID.
   *
   * This ID can be saved in [godot.EncodedObjectAsID], and can be used to retrieve the object instance with [@GDScript.instanceFromId].
   */
  open override fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the object's metadata entry for the given `name`.
   */
  open fun getMeta(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the object's metadata as a [godot.core.PoolStringArray].
   */
  open fun getMetaList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the object's methods and their signatures as an [godot.Array].
   */
  open fun getMethodList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_METHOD_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the object's property list as an [godot.Array] of dictionaries.
   *
   * Each property's [godot.core.Dictionary] contain at least `name: String` and `type: int` (see [enum Variant.Type]) entries. Optionally, it can also include `hint: int` (see [enum PropertyHint]), `hint_string: String`, and `usage: int` (see [enum PropertyUsageFlags]).
   */
  open fun getPropertyList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_PROPERTY_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the object's [godot.Script] instance, or `null` if none is assigned.
   */
  open fun getScript(): Reference? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SCRIPT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Reference?
  }

  /**
   * Returns an [godot.Array] of connections for the given `signal`.
   */
  open fun getSignalConnectionList(signal: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of signals as an [godot.Array] of dictionaries.
   */
  open fun getSignalList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if a metadata entry is found with the given `name`.
   */
  open fun hasMeta(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_META, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the object contains the given `method`.
   */
  open fun hasMethod(method: String): Boolean {
    TransferContext.writeArguments(STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given `signal` exists.
   */
  open fun hasSignal(signal: String): Boolean {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given user-defined `signal` exists. Only signals added using [addUserSignal] are taken into account.
   */
  open fun hasUserSignal(signal: String): Boolean {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_USER_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if signal emission blocking is enabled.
   */
  open fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_BLOCKING_SIGNALS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the object inherits from the given `class`.
   */
  open fun isClass(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a connection exists for a given `signal`, `target`, and `method`.
   */
  open fun isConnected(
    signal: String,
    target: Object,
    method: String
  ): Boolean {
    TransferContext.writeArguments(STRING to signal, OBJECT to target, STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the [godot.Node.queueFree] method was called for the object.
   */
  open fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_QUEUED_FOR_DELETION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Send a given notification to the object, which will also trigger a call to the [_notification] method of all classes that the object inherits from.
   *
   * If `reversed` is `true`, [_notification] is called first on the object's own class, and then up to its successive parent classes. If `reversed` is `false`, [_notification] is called first on the highest ancestor ([godot.Object] itself), and then down to its successive inheriting classes.
   */
  open fun notification(what: Long, reversed: Boolean = false) {
    TransferContext.writeArguments(LONG to what, BOOL to reversed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFICATION, NIL)
  }

  /**
   * Notify the editor that the property list has changed, so that editor plugins can take the new values into account. Does nothing on export builds.
   */
  open fun propertyListChangedNotify() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_PROPERTY_LIST_CHANGED_NOTIFY,
        NIL)
  }

  /**
   * Removes a given entry from the object's metadata. See also [setMeta].
   */
  open fun removeMeta(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_REMOVE_META, NIL)
  }

  /**
   * Assigns a new value to the given property. If the `property` does not exist, nothing will happen.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  open fun set(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET, NIL)
  }

  /**
   * If set to `true`, signal emission is blocked.
   */
  open fun setBlockSignals(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_BLOCK_SIGNALS, NIL)
  }

  /**
   * Assigns a new value to the given property, after the current frame's physics step. This is equivalent to calling [set] via [callDeferred], i.e. `call_deferred("set", property, value)`.
   *
   * **Note:** In C#, the property name must be specified as snake_case if it is defined by a built-in Godot node. This doesn't apply to user-defined properties where you should use the same convention as in the C# source (typically PascalCase).
   */
  open fun setDeferred(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_DEFERRED, NIL)
  }

  /**
   * Assigns a new value to the property identified by the [godot.core.NodePath]. The node path should be relative to the current object and can use the colon character (`:`) to access nested properties. Example:
   *
   * ```
   * 				set_indexed("position", Vector2(42, 0))
   * 				set_indexed("position:y", -10)
   * 				print(position) # (42, -10)
   * 				```
   */
  open fun setIndexed(property: NodePath, value: Any?) {
    TransferContext.writeArguments(NODE_PATH to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_INDEXED, NIL)
  }

  /**
   * Defines whether the object can translate strings (with calls to [tr]). Enabled by default.
   */
  open fun setMessageTranslation(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_MESSAGE_TRANSLATION, NIL)
  }

  /**
   * Adds, changes or removes a given entry in the object's metadata. Metadata are serialized and can take any [Variant] value.
   *
   * To remove a given entry from the object's metadata, use [removeMeta]. Metadata is also removed if its value is set to `null`. This means you can also use `set_meta("name", null)` to remove metadata for `"name"`.
   */
  open fun setMeta(name: String, value: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_META, NIL)
  }

  /**
   * Assigns a script to the object. Each object can have a single script assigned to it, which are used to extend its functionality.
   *
   * If the object already had a script, the previous script instance will be freed and its variables and state will be lost. The new script's [_init] method will be called.
   */
  open fun setScript(script: Reference) {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_SCRIPT, NIL)
  }

  /**
   * Returns a [godot.String] representing the object. If not overridden, defaults to `"[godot.ClassName:RID]"`.
   *
   * Override the method [_toString] to customize the [godot.String] representation.
   */
  override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TO_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Translates a message using translation catalogs configured in the Project Settings.
   *
   * Only works if message translation is enabled (which it is by default), otherwise it returns the `message` unchanged. See [setMessageTranslation].
   */
  open fun tr(message: String): String {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  enum class ConnectFlags(
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

    /**
     * One-shot connections disconnect themselves after emission.
     */
    CONNECT_ONESHOT(4),

    /**
     * Connect a signal as reference-counted. This means that a given signal can be connected several times to the same target, and will only be fully disconnected once no references are left.
     */
    CONNECT_REFERENCE_COUNTED(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Connects a signal in deferred mode. This way, signal emissions are stored in a queue, then set on idle time.
     */
    final const val CONNECT_DEFERRED: Long = 1

    /**
     * One-shot connections disconnect themselves after emission.
     */
    final const val CONNECT_ONESHOT: Long = 4

    /**
     * Persisting connections are saved when the object is serialized to file.
     */
    final const val CONNECT_PERSIST: Long = 2

    /**
     * Connect a signal as reference-counted. This means that a given signal can be connected several times to the same target, and will only be fully disconnected once no references are left.
     */
    final const val CONNECT_REFERENCE_COUNTED: Long = 8

    /**
     * Called right when the object is initialized. Not available in script.
     */
    final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    /**
     * Called before the object is about to be deleted.
     */
    final const val NOTIFICATION_PREDELETE: Long = 1
  }
}
