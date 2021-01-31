// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class ImmediateGeometry : GeometryInstance() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_IMMEDIATEGEOMETRY)

  open fun addSphere(
    lats: Long,
    lons: Long,
    radius: Double,
    addUv: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to lats, LONG to lons, DOUBLE to radius, BOOL to addUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_ADD_SPHERE, NIL)
  }

  open fun addVertex(position: Vector3) {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_ADD_VERTEX, NIL)
  }

  open fun begin(primitive: Long, texture: Texture? = null) {
    TransferContext.writeArguments(LONG to primitive, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_BEGIN, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_CLEAR, NIL)
  }

  open fun end() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_END, NIL)
  }

  open fun setColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_COLOR, NIL)
  }

  open fun setNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_NORMAL, NIL)
  }

  open fun setTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_TANGENT, NIL)
  }

  open fun setUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_UV, NIL)
  }

  open fun setUv2(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_UV2, NIL)
  }
}
