// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

/**
 * Holds an [godot.Object], but does not contribute to the reference count if the object is a reference.
 *
 * A weakref can hold a [godot.RefCounted], without contributing to the reference counter. A weakref can be created from an [godot.Object] using [@GlobalScope.weakref]. If this object is not a reference, weakref still works, however, it does not have any effect on the object. Weakrefs are useful in cases where multiple classes have variables that refer to each other. Without weakrefs, using these classes could lead to memory leaks, since both references keep each other from being released. Making part of the variables a weakref can prevent this cyclic dependency, and allows the references to be released.
 */
@GodotBaseType
public open class WeakRef : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEAKREF)
  }

  /**
   * Returns the [godot.Object] this weakref is referring to.
   */
  public fun getRef(): Any? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEAKREF_GET_REF, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
