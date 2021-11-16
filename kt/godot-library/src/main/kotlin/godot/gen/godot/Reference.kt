// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for reference-counted objects.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/getting_started/workflow/best_practices/node_alternatives.html](https://docs.godotengine.org/en/3.4/getting_started/workflow/best_practices/node_alternatives.html)
 *
 * Base class for any object that keeps a reference count. [godot.Resource] and many other helper objects inherit this class.
 *
 * Unlike other [godot.Object] types, References keep an internal reference counter so that they are automatically released when no longer in use, and only then. References therefore do not need to be freed manually with [godot.Object.free].
 *
 * In the vast majority of use cases, instantiating and using [godot.Reference]-derived types is all you need to do. The methods provided in this class are only for advanced users, and can cause issues if misused.
 *
 * **Note:** In C#, references will not be freed instantly after they are no longer in use. Instead, garbage collection will run periodically and will free references that are no longer in use. This means that unused references will linger on for a while before being removed.
 */
@GodotBaseType
public open class Reference : Object() {
  public override fun ____DO_NOT_TOUCH_THIS_isRef____() = true

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_REFERENCE)
  }

  /**
   * Initializes the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns whether the initialization was successful.
   */
  public open fun initRef(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_INIT_REF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Increments the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns `true` if the increment was successful, `false` otherwise.
   */
  public open fun reference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_REFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Decrements the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns `true` if the decrement was successful, `false` otherwise.
   */
  public open fun unreference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_UNREFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
