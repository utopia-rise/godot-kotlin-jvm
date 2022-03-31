// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
 * [$DOCS_URL/tutorials/best_practices/node_alternatives.html]($DOCS_URL/tutorials/best_practices/node_alternatives.html)
 *
 * Base class for any object that keeps a reference count. [godot.Resource] and many other helper objects inherit this class.
 *
 * Unlike other [godot.Object] types, [godot.RefCounted]s keep an internal reference counter so that they are automatically released when no longer in use, and only then. [godot.RefCounted]s therefore do not need to be freed manually with [godot.Object.free].
 *
 * In the vast majority of use cases, instantiating and using [godot.RefCounted]-derived types is all you need to do. The methods provided in this class are only for advanced users, and can cause issues if misused.
 *
 * **Note:** In C#, reference-counted objects will not be freed instantly after they are no longer in use. Instead, garbage collection will run periodically and will free reference-counted objects that are no longer in use. This means that unused ones will linger on for a while before being removed.
 */
@GodotBaseType
public open class RefCounted : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_REFCOUNTED)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isRef____() = true

  /**
   * Initializes the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns whether the initialization was successful.
   */
  public open fun initRef(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFCOUNTED_INIT_REF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Increments the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns `true` if the increment was successful, `false` otherwise.
   */
  public open fun reference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFCOUNTED_REFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Decrements the internal reference counter. Use this only if you really know what you are doing.
   *
   * Returns `true` if the decrement was successful, `false` otherwise.
   */
  public open fun unreference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFCOUNTED_UNREFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
