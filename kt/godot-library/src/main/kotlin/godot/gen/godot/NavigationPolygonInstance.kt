// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class NavigationPolygonInstance : Node2D() {
  /**
   *
   */
  open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_ENABLED, NIL)
    }

  /**
   *
   */
  open var navpoly: NavigationPolygon?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_NAVPOLY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_NAVPOLY, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGONINSTANCE)
  }

  open fun _navpolyChanged() {
  }
}
