// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_WEAKREF_INDEX: Int = 734

/**
 * A weakref can hold a [RefCounted] without contributing to the reference counter. A weakref can be
 * created from an [Object] using [@GlobalScope.weakref]. If this object is not a reference, weakref
 * still works, however, it does not have any effect on the object. Weakrefs are useful in cases where
 * multiple classes have variables that refer to each other. Without weakrefs, using these classes
 * could lead to memory leaks, since both references keep each other from being released. Making part
 * of the variables a weakref can prevent this cyclic dependency, and allows the references to be
 * released.
 */
@GodotBaseType
public open class WeakRef : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_WEAKREF_INDEX, scriptIndex)
  }

  /**
   * Returns the [Object] this weakref is referring to. Returns `null` if that object no longer
   * exists.
   */
  public final fun getRef(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRefPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val getRefPtr: VoidPtr = TypeManager.getMethodBindPtr("WeakRef", "get_ref", 1214101251)
  }
}
