// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class StaticBody2D : PhysicsBody2D() {
  open var bounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY2D_GET_BOUNCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY2D_SET_BOUNCE, NIL)
    }

  open var constantAngularVelocity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_GET_CONSTANT_ANGULAR_VELOCITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_SET_CONSTANT_ANGULAR_VELOCITY, NIL)
    }

  open var constantLinearVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_GET_CONSTANT_LINEAR_VELOCITY, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_SET_CONSTANT_LINEAR_VELOCITY, NIL)
    }

  open var friction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY2D_GET_FRICTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STATICBODY2D_SET_FRICTION, NIL)
    }

  open var physicsMaterialOverride: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_GET_PHYSICS_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STATICBODY2D_SET_PHYSICS_MATERIAL_OVERRIDE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_STATICBODY2D)

  open fun constantLinearVelocity(schedule: Vector2.() -> Unit): Vector2 =
      constantLinearVelocity.apply{
      schedule(this)
      constantLinearVelocity = this
  }


  open fun _reload_physics_characteristics() {
  }
}
