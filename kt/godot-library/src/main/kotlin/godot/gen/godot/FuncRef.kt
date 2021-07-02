// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Reference to a function in an object.
 *
 * In GDScript, functions are not *first-class objects*. This means it is impossible to store them directly as variables, return them from another function, or pass them as arguments.
 *
 * However, by creating a [godot.FuncRef] using the [@GDScript.funcref] function, a reference to a function in a given object can be created, passed around and called.
 */
@GodotBaseType
public open class FuncRef : Reference() {
  /**
   * The name of the referenced function.
   */
  public open var function: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_GET_FUNCTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_SET_FUNCTION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FUNCREF)
  }

  /**
   * Calls the referenced function previously set in [function] or [@GDScript.funcref].
   */
  public open fun callFunc(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_CALL_FUNC, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Calls the referenced function previously set in [function] or [@GDScript.funcref]. Contrarily to [callFunc], this method does not support a variable number of arguments but expects all parameters to be passed via a single [godot.Array].
   */
  public open fun callFuncv(argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_CALL_FUNCV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns whether the object still exists and has the function assigned.
   */
  public open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * The object containing the referenced function. This object must be of a type actually inheriting from [godot.Object], not a built-in type such as [int], [godot.core.Vector2] or [godot.core.Dictionary].
   */
  public open fun setInstance(instance: Object): Unit {
    TransferContext.writeArguments(OBJECT to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FUNCREF_SET_INSTANCE, NIL)
  }
}
