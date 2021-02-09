// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class CanvasItemMaterial : Material() {
  open var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_BLEND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_BLEND_MODE,
          NIL)
    }

  open var lightMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_LIGHT_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_LIGHT_MODE,
          NIL)
    }

  open var particlesAnimHFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_H_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_H_FRAMES, NIL)
    }

  open var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_LOOP, NIL)
    }

  open var particlesAnimVFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIM_V_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIM_V_FRAMES, NIL)
    }

  open var particlesAnimation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_GET_PARTICLES_ANIMATION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEMMATERIAL_SET_PARTICLES_ANIMATION, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CANVASITEMMATERIAL)

  enum class LightMode(
    id: Long
  ) {
    LIGHT_MODE_NORMAL(0),

    LIGHT_MODE_UNSHADED(1),

    LIGHT_MODE_LIGHT_ONLY(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BLEND_MODE_ADD: Long = 1

    final const val BLEND_MODE_MIX: Long = 0

    final const val BLEND_MODE_MUL: Long = 3

    final const val BLEND_MODE_PREMULT_ALPHA: Long = 4

    final const val BLEND_MODE_SUB: Long = 2

    final const val LIGHT_MODE_LIGHT_ONLY: Long = 2

    final const val LIGHT_MODE_NORMAL: Long = 0

    final const val LIGHT_MODE_UNSHADED: Long = 1
  }
}
