// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Mesh with a single Point primitive.
 *
 * The PointMesh is made from a single point. Instead of relying on triangles, points are rendered as a single rectangle on the screen with a constant size. They are intended to be used with Particle systems, but can be used as a cheap way to render constant size billboarded sprites (for example in a point cloud).
 *
 * PointMeshes, must be used with a material that has a point size. Point size can be accessed in a shader with `POINT_SIZE`, or in a [godot.SpatialMaterial] by setting [godot.SpatialMaterial.flagsUsePointSize] and the variable [godot.SpatialMaterial.paramsPointSize].
 *
 * When using PointMeshes, properties that normally alter vertices will be ignored, including billboard mode, grow, and cull face.
 */
@GodotBaseType
open class PointMesh : PrimitiveMesh() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POINTMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
