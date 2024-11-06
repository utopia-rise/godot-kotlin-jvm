// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotApiMember
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for any object that keeps a reference count. [Resource] and many other helper objects
 * inherit this class.
 * Unlike other [Object] types, [RefCounted]s keep an internal reference counter so that they are
 * automatically released when no longer in use, and only then. [RefCounted]s therefore do not need to
 * be freed manually with [Object.free].
 * [RefCounted] instances caught in a cyclic reference will **not** be freed automatically. For
 * example, if a node holds a reference to instance `A`, which directly or indirectly holds a reference
 * back to `A`, `A`'s reference count will be 2. Destruction of the node will leave `A` dangling with a
 * reference count of 1, and there will be a memory leak. To prevent this, one of the references in the
 * cycle can be made weak with [@GlobalScope.weakref].
 * In the vast majority of use cases, instantiating and using [RefCounted]-derived types is all you
 * need to do. The methods provided in this class are only for advanced users, and can cause issues if
 * misused.
 * **Note:** In C#, reference-counted objects will not be freed instantly after they are no longer
 * in use. Instead, garbage collection will run periodically and will free reference-counted objects
 * that are no longer in use. This means that unused ones will remain in memory for a while before
 * being removed.
 */
@GodotBaseType
public open class RefCounted : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_REFCOUNTED, scriptIndex)
  }

  @GodotApiMember
  public final override fun _onDestroy(): Unit {

  }

  /**
   * Initializes the internal reference counter. Use this only if you really know what you are
   * doing.
   * Returns whether the initialization was successful.
   */
  public final fun initRef(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.initRefPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Increments the internal reference counter. Use this only if you really know what you are doing.
   * Returns `true` if the increment was successful, `false` otherwise.
   */
  public final fun reference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.referencePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Decrements the internal reference counter. Use this only if you really know what you are doing.
   * Returns `true` if the object should be freed after the decrement, `false` otherwise.
   */
  public final fun unreference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.unreferencePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current reference count.
   */
  public final fun getReferenceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReferenceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val initRefPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RefCounted", "init_ref", 2240911060)

    public val referencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RefCounted", "reference", 2240911060)

    public val unreferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RefCounted", "unreference", 2240911060)

    public val getReferenceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RefCounted", "get_reference_count", 3905245786)
  }
}
