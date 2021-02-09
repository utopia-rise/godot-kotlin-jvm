// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class OmniLight : Light() {
  open var omniShadowDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_DETAIL,
          NIL)
    }

  open var omniShadowMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_GET_OMNI_SHADOW_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT_SET_OMNI_SHADOW_MODE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_OMNILIGHT)

  enum class ShadowMode(
    id: Long
  ) {
    SHADOW_DUAL_PARABOLOID(0),

    SHADOW_CUBE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowDetail(
    id: Long
  ) {
    SHADOW_DETAIL_VERTICAL(0),

    SHADOW_DETAIL_HORIZONTAL(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SHADOW_CUBE: Long = 1

    final const val SHADOW_DETAIL_HORIZONTAL: Long = 1

    final const val SHADOW_DETAIL_VERTICAL: Long = 0

    final const val SHADOW_DUAL_PARABOLOID: Long = 0
  }
}
