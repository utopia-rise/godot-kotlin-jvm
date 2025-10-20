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
import godot.core.Callable
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This is a support extension in OpenXR that allows other OpenXR extensions to start asynchronous
 * functions and get a callback after this function finishes. It is not intended for consumption within
 * GDScript but can be accessed from GDExtension.
 */
@GodotBaseType
public open class OpenXRFutureExtension : OpenXRExtensionWrapper() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(433, scriptIndex)
  }

  /**
   * Returns `true` if futures are available in the OpenXR runtime used. This function will only
   * return a usable result after OpenXR has been initialized.
   */
  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Register an OpenXR Future object so we monitor for completion. [future] must be an
   * `XrFutureEXT` value previously returned by an API that started an asynchronous function.
   *
   * You can optionally specify [onSuccess], it will be invoked on successful completion of the
   * future.
   *
   * Or you can use the returned [OpenXRFutureResult] object to `await` its [signal
   * OpenXRFutureResult.completed] signal.
   *
   * ```
   * var future_result = OpenXRFutureExtension.register_future(future)
   * await future_result.completed
   * if future_result.get_status() == OpenXRFutureResult.RESULT_FINISHED:
   * 	# Handle your success
   * 	pass
   * ```
   */
  @JvmOverloads
  public final fun registerFuture(future: Long, onSuccess: Callable = Callable()):
      OpenXRFutureResult? {
    TransferContext.writeArguments(LONG to future, CALLABLE to onSuccess)
    TransferContext.callMethod(ptr, MethodBindings.registerFuturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRFutureResult?)
  }

  /**
   * Cancels an in-progress future. [future] must be an `XrFutureEXT` value previously returned by
   * an API that started an asynchronous function.
   */
  public final fun cancelFuture(future: Long): Unit {
    TransferContext.writeArguments(LONG to future)
    TransferContext.callMethod(ptr, MethodBindings.cancelFuturePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRFutureExtension", "is_active", 36873697)

    internal val registerFuturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRFutureExtension", "register_future", 1038012256)

    internal val cancelFuturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRFutureExtension", "cancel_future", 1286410249)
  }
}
