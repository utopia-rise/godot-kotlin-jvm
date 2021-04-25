// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class AspectRatioContainer : Container() {
  open var alignmentHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_ALIGNMENT_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_ALIGNMENT_HORIZONTAL, NIL)
    }

  open var alignmentVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_ALIGNMENT_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_ALIGNMENT_VERTICAL, NIL)
    }

  open var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_RATIO,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_RATIO,
          NIL)
    }

  open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_STRETCH_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_STRETCH_MODE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ASPECTRATIOCONTAINER)
  }

  enum class AlignMode(
    id: Long
  ) {
    ALIGN_BEGIN(0),

    ALIGN_CENTER(1),

    ALIGN_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_WIDTH_CONTROLS_HEIGHT(0),

    STRETCH_HEIGHT_CONTROLS_WIDTH(1),

    STRETCH_FIT(2),

    STRETCH_COVER(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_BEGIN: Long = 0

    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_END: Long = 2

    final const val STRETCH_COVER: Long = 3

    final const val STRETCH_FIT: Long = 2

    final const val STRETCH_HEIGHT_CONTROLS_WIDTH: Long = 1

    final const val STRETCH_WIDTH_CONTROLS_HEIGHT: Long = 0
  }
}
