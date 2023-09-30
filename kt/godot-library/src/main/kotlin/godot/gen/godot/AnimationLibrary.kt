// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for [godot.Animation] resources.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/index.html]($DOCS_URL/tutorials/animation/index.html)
 *
 * An animation library stores a set of animations accessible through [godot.StringName] keys, for use with [godot.AnimationPlayer] nodes.
 */
@GodotBaseType
public open class AnimationLibrary : Resource() {
  /**
   * Emitted when an [godot.Animation] is added, under the key [name].
   */
  public val animationAdded: Signal1<StringName> by signal("name")

  /**
   * Emitted when an [godot.Animation] stored with the key [name] is removed.
   */
  public val animationRemoved: Signal1<StringName> by signal("name")

  /**
   * Emitted when the key for an [godot.Animation] is changed, from [name] to [toName].
   */
  public val animationRenamed: Signal2<StringName, StringName> by signal("name", "toName")

  /**
   * Emitted when there's a change in one of the animations, e.g. tracks are added, moved or have changed paths. [name] is the key of the animation that was changed.
   *
   * See also [godot.Resource.changed], which this acts as a relay for.
   */
  public val animationChanged: Signal1<StringName> by signal("name")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONLIBRARY, scriptIndex)
    return true
  }

  /**
   * Adds the [animation] to the library, accessible by the key [name].
   */
  public fun addAnimation(name: StringName, animation: Animation): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_ADD_ANIMATION,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the [godot.Animation] with the key [name].
   */
  public fun removeAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_REMOVE_ANIMATION,
        NIL)
  }

  /**
   * Changes the key of the [godot.Animation] associated with the key [name] to [newname].
   */
  public fun renameAnimation(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_RENAME_ANIMATION,
        NIL)
  }

  /**
   * Returns `true` if the library stores an [godot.Animation] with [name] as the key.
   */
  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_HAS_ANIMATION,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.Animation] with the key [name]. If the animation does not exist, `null` is returned and an error is logged.
   */
  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_GET_ANIMATION,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  /**
   * Returns the keys for the [godot.Animation]s stored in the library.
   */
  public fun getAnimationList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONLIBRARY_GET_ANIMATION_LIST,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public companion object
}
