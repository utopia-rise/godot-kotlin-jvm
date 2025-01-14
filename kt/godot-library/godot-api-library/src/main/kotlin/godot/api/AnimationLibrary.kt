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
import godot.core.Error
import godot.core.Signal1
import godot.core.Signal2
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_ANIMATIONLIBRARY: Int = 49

/**
 * An animation library stores a set of animations accessible through [StringName] keys, for use
 * with [AnimationPlayer] nodes.
 */
@GodotBaseType
public open class AnimationLibrary : Resource() {
  /**
   * Emitted when an [Animation] is added, under the key [name].
   */
  public val animationAdded: Signal1<StringName> by Signal1

  /**
   * Emitted when an [Animation] stored with the key [name] is removed.
   */
  public val animationRemoved: Signal1<StringName> by Signal1

  /**
   * Emitted when the key for an [Animation] is changed, from [name] to [toName].
   */
  public val animationRenamed: Signal2<StringName, StringName> by Signal2

  /**
   * Emitted when there's a change in one of the animations, e.g. tracks are added, moved or have
   * changed paths. [name] is the key of the animation that was changed.
   * See also [signal Resource.changed], which this acts as a relay for.
   */
  public val animationChanged: Signal1<StringName> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_ANIMATIONLIBRARY, scriptIndex)
  }

  /**
   * Adds the [animation] to the library, accessible by the key [name].
   */
  public final fun addAnimation(name: StringName, animation: Animation?): Error {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to animation)
    TransferContext.callMethod(ptr, MethodBindings.addAnimationPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the [Animation] with the key [name].
   */
  public final fun removeAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeAnimationPtr, NIL)
  }

  /**
   * Changes the key of the [Animation] associated with the key [name] to [newname].
   */
  public final fun renameAnimation(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(ptr, MethodBindings.renameAnimationPtr, NIL)
  }

  /**
   * Returns `true` if the library stores an [Animation] with [name] as the key.
   */
  public final fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [Animation] with the key [name]. If the animation does not exist, `null` is
   * returned and an error is logged.
   */
  public final fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Animation?)
  }

  /**
   * Returns the keys for the [Animation]s stored in the library.
   */
  public final fun getAnimationList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public companion object

  public object MethodBindings {
    internal val addAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "add_animation", 1811855551)

    internal val removeAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "remove_animation", 3304788590)

    internal val renameAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "rename_animation", 3740211285)

    internal val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "has_animation", 2619796661)

    internal val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation", 2933122410)

    internal val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation_list", 3995934104)
  }
}
