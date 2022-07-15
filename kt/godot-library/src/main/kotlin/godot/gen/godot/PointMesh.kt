// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Mesh with a single Point primitive.
 *
 * The PointMesh is made from a single point. Instead of relying on triangles, points are rendered as a single rectangle on the screen with a constant size. They are intended to be used with Particle systems, but can be used as a cheap way to render constant size billboarded sprites (for example in a point cloud).
 *
 * PointMeshes, must be used with a material that has a point size. Point size can be accessed in a shader with `POINT_SIZE`, or in a [godot.BaseMaterial3D] by setting [godot.BaseMaterial3D.usePointSize] and the variable [godot.BaseMaterial3D.pointSize].
 *
 * When using PointMeshes, properties that normally alter vertices will be ignored, including billboard mode, grow, and cull face.
 */
@GodotBaseType
public open class PointMesh : PrimitiveMesh() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POINTMESH)
  }

  public companion object
}
