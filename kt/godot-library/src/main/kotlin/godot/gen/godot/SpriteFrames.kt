// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class SpriteFrames : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPRITEFRAMES)

  open fun _get_animations(): VariantArray<Any?> {
    throw NotImplementedError("_get_animations is not implemented for SpriteFrames")
  }

  open fun _get_frames(): VariantArray<Any?> {
    throw NotImplementedError("_get_frames is not implemented for SpriteFrames")
  }

  open fun _set_animations(arg0: VariantArray<Any?>) {
  }

  open fun _set_frames(arg0: VariantArray<Any?>) {
  }

  open fun addAnimation(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_ANIMATION, NIL)
  }

  open fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Long = -1
  ) {
    TransferContext.writeArguments(STRING to anim, OBJECT to frame, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_ADD_FRAME, NIL)
  }

  open fun clear(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR, NIL)
  }

  open fun clearAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_CLEAR_ALL, NIL)
  }

  open fun getAnimationLoop(anim: String): Boolean {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_LOOP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getAnimationNames(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_NAMES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getAnimationSpeed(anim: String): Double {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_ANIMATION_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getFrame(anim: String, idx: Long): Texture? {
    TransferContext.writeArguments(STRING to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getFrameCount(anim: String): Long {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_GET_FRAME_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasAnimation(anim: String): Boolean {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeAnimation(anim: String) {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_ANIMATION, NIL)
  }

  open fun removeFrame(anim: String, idx: Long) {
    TransferContext.writeArguments(STRING to anim, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_REMOVE_FRAME, NIL)
  }

  open fun renameAnimation(anim: String, newname: String) {
    TransferContext.writeArguments(STRING to anim, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_RENAME_ANIMATION, NIL)
  }

  open fun setAnimationLoop(anim: String, loop: Boolean) {
    TransferContext.writeArguments(STRING to anim, BOOL to loop)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_LOOP,
        NIL)
  }

  open fun setAnimationSpeed(anim: String, speed: Double) {
    TransferContext.writeArguments(STRING to anim, DOUBLE to speed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_ANIMATION_SPEED,
        NIL)
  }

  open fun setFrame(
    anim: String,
    idx: Long,
    txt: Texture
  ) {
    TransferContext.writeArguments(STRING to anim, LONG to idx, OBJECT to txt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEFRAMES_SET_FRAME, NIL)
  }
}
