// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public object JavaScript : Object() {
  public val pwaUpdateAvailable: Signal0 by signal()

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_JAVASCRIPT)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  public fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_EVAL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun getInterface(_interface: String): JavaScriptObject? {
    TransferContext.writeArguments(STRING to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_GET_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?
  }

  public fun createCallback(callable: Callable): JavaScriptObject? {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_CREATE_CALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?
  }

  public fun createObject(_object: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to _object,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_CREATE_OBJECT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun downloadBuffer(
    buffer: PackedByteArray,
    name: String,
    mime: String = "application/octet-stream"
  ): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer, STRING to name, STRING to mime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_DOWNLOAD_BUFFER, NIL)
  }

  public fun pwaNeedsUpdate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_PWA_NEEDS_UPDATE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun pwaUpdate(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_PWA_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
