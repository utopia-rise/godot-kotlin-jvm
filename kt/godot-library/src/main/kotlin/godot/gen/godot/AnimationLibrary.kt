// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An animation library stores a set of animations accessible through [StringName] keys, for use
 * with [AnimationPlayer] nodes.
 */
@GodotBaseType
public open class AnimationLibrary : Resource() {
  /**
   * Emitted when an [Animation] is added, under the key [name].
   */
  public val animationAdded: Signal1<StringName> by signal("name")

  /**
   * Emitted when an [Animation] stored with the key [name] is removed.
   */
  public val animationRemoved: Signal1<StringName> by signal("name")

  /**
   * Emitted when the key for an [Animation] is changed, from [name] to [toName].
   */
  public val animationRenamed: Signal2<StringName, StringName> by signal("name", "toName")

  /**
   * Emitted when there's a change in one of the animations, e.g. tracks are added, moved or have
   * changed paths. [name] is the key of the animation that was changed.
   * See also [signal Resource.changed], which this acts as a relay for.
   */
  public val animationChanged: Signal1<StringName> by signal("name")

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONLIBRARY, scriptIndex)
  }

  /**
   * Adds the [animation] to the library, accessible by the key [name].
   */
  public fun addAnimation(name: StringName, animation: Animation?): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the [Animation] with the key [name].
   */
  public fun removeAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationPtr, NIL)
  }

  /**
   * Changes the key of the [Animation] associated with the key [name] to [newname].
   */
  public fun renameAnimation(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationPtr, NIL)
  }

  /**
   * Returns `true` if the library stores an [Animation] with [name] as the key.
   */
  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [Animation] with the key [name]. If the animation does not exist, `null` is
   * returned and an error is logged.
   */
  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  /**
   * Returns the keys for the [Animation]s stored in the library.
   */
  public fun getAnimationList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public companion object

  internal object MethodBindings {
    public val addAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "add_animation", 1811855551)

    public val removeAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "remove_animation", 3304788590)

    public val renameAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "rename_animation", 3740211285)

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "has_animation", 2619796661)

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation", 2933122410)

    public val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationLibrary", "get_animation_list", 3995934104)
  }
}
