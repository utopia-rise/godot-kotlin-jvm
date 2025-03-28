// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * The PointMesh is made from a single point. Instead of relying on triangles, points are rendered
 * as a single rectangle on the screen with a constant size. They are intended to be used with Particle
 * systems, but can be used as a cheap way to render constant size billboarded sprites (for example in
 * a point cloud).
 * PointMeshes, must be used with a material that has a point size. Point size can be accessed in a
 * shader with `POINT_SIZE`, or in a [BaseMaterial3D] by setting [BaseMaterial3D.usePointSize] and the
 * variable [BaseMaterial3D.pointSize].
 * When using PointMeshes, properties that normally alter vertices will be ignored, including
 * billboard mode, grow, and cull face.
 */
@GodotBaseType
public open class PointMesh : PrimitiveMesh() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(508, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
