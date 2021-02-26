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
import godot.util.VoidPtr
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

@GodotBaseType
open class Object : KtObject() {
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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_OBJECT)

  open fun _get(property: String): Any? {
    throw NotImplementedError("_get is not implemented for Object")
  }

  open fun _getPropertyList(): VariantArray<Any?> {
    throw NotImplementedError("_get_property_list is not implemented for Object")
  }

  open fun _init() {
  }

  open fun _notification(what: Long) {
  }

  open fun _set(property: String, value: Any): Boolean {
    throw NotImplementedError("_set is not implemented for Object")
  }

  open fun _toString(): String {
    throw NotImplementedError("_to_string is not implemented for Object")
  }

  open fun addUserSignal(signal: String, arguments: VariantArray<Any?> = VariantArray()) {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_ADD_USER_SIGNAL, NIL)
  }

  open fun call(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun callDeferred(method: String, vararg __var_args: Any?) {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL_DEFERRED, NIL)
  }

  open fun callv(method: String, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING to method, ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALLV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CAN_TRANSLATE_MESSAGES, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

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

  open fun disconnect(
    signal: String,
    target: Object,
    method: String
  ) {
    TransferContext.writeArguments(STRING to signal, OBJECT to target, STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_DISCONNECT, NIL)
  }

  open fun emitSignal(signal: String, vararg __var_args: Any?) {
    TransferContext.writeArguments(STRING to signal,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_EMIT_SIGNAL, NIL)
  }

  open fun get(property: String): Any? {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getIncomingConnections(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INCOMING_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getIndexed(property: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INDEXED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open override fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMeta(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getMetaList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getMethodList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_METHOD_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getPropertyList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_PROPERTY_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getScript(): Reference? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SCRIPT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Reference?
  }

  open fun getSignalConnectionList(signal: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getSignalList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun hasMeta(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_META, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasMethod(method: String): Boolean {
    TransferContext.writeArguments(STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasSignal(signal: String): Boolean {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasUserSignal(signal: String): Boolean {
    TransferContext.writeArguments(STRING to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_USER_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_BLOCKING_SIGNALS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isClass(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isConnected(
    signal: String,
    target: Object,
    method: String
  ): Boolean {
    TransferContext.writeArguments(STRING to signal, OBJECT to target, STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_QUEUED_FOR_DELETION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun notification(what: Long, reversed: Boolean = false) {
    TransferContext.writeArguments(LONG to what, BOOL to reversed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFICATION, NIL)
  }

  open fun propertyListChangedNotify() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_PROPERTY_LIST_CHANGED_NOTIFY,
        NIL)
  }

  open fun removeMeta(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_REMOVE_META, NIL)
  }

  open fun set(property: String, value: Any) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET, NIL)
  }

  open fun setBlockSignals(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_BLOCK_SIGNALS, NIL)
  }

  open fun setDeferred(property: String, value: Any) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_DEFERRED, NIL)
  }

  open fun setIndexed(property: NodePath, value: Any) {
    TransferContext.writeArguments(NODE_PATH to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_INDEXED, NIL)
  }

  open fun setMessageTranslation(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_MESSAGE_TRANSLATION, NIL)
  }

  open fun setMeta(name: String, value: Any) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_META, NIL)
  }

  open fun setScript(script: Reference) {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_SCRIPT, NIL)
  }

  override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TO_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun tr(message: String): String {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  enum class ConnectFlags(
    id: Long
  ) {
    CONNECT_DEFERRED(1),

    CONNECT_PERSIST(2),

    CONNECT_ONESHOT(4),

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
    final const val CONNECT_DEFERRED: Long = 1

    final const val CONNECT_ONESHOT: Long = 4

    final const val CONNECT_PERSIST: Long = 2

    final const val CONNECT_REFERENCE_COUNTED: Long = 8

    final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    final const val NOTIFICATION_PREDELETE: Long = 1
  }
}
