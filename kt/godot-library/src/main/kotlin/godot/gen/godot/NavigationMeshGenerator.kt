// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper class for creating and clearing navigation meshes.
 *
 * This class is responsible for creating and clearing 3D navigation meshes used as [godot.NavigationMesh] resources inside [godot.NavigationRegion3D]. The [godot.NavigationMeshGenerator] has very limited to no use for 2D as the navigation mesh baking process expects 3D node types and 3D source geometry to parse.
 *
 * The entire navigation mesh baking is best done in a separate thread as the voxelization, collision tests and mesh optimization steps involved are very performance and time hungry operations.
 *
 * Navigation mesh baking happens in multiple steps and the result depends on 3D source geometry and properties of the [godot.NavigationMesh] resource. In the first step, starting from a root node and depending on [godot.NavigationMesh] properties all valid 3D source geometry nodes are collected from the [godot.SceneTree]. Second, all collected nodes are parsed for their relevant 3D geometry data and a combined 3D mesh is build. Due to the many different types of parsable objects, from normal [godot.MeshInstance3D]s to [godot.CSGShape3D]s or various [godot.CollisionObject3D]s, some operations to collect geometry data can trigger [godot.RenderingServer] and [godot.PhysicsServer3D] synchronizations. Server synchronization can have a negative effect on baking time or framerate as it often involves [godot.Mutex] locking for thread security. Many parsable objects and the continuous synchronization with other threaded Servers can increase the baking time significantly. On the other hand only a few but very large and complex objects will take some time to prepare for the Servers which can noticeably stall the next frame render. As a general rule the total amount of parsable objects and their individual size and complexity should be balanced to avoid framerate issues or very long baking times. The combined mesh is then passed to the Recast Navigation Object to test the source geometry for walkable terrain suitable to [godot.NavigationMesh] agent properties by creating a voxel world around the meshes bounding area.
 *
 * The finalized navigation mesh is then returned and stored inside the [godot.NavigationMesh] for use as a resource inside [godot.NavigationRegion3D] nodes.
 *
 * **Note:** Using meshes to not only define walkable surfaces but also obstruct navigation baking does not always work. The navigation baking has no concept of what is a geometry "inside" when dealing with mesh source geometry and this is intentional. Depending on current baking parameters, as soon as the obstructing mesh is large enough to fit a navigation mesh area inside, the baking will generate navigation mesh areas that are inside the obstructing source geometry mesh.
 */
@GodotBaseType
public object NavigationMeshGenerator : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_NAVIGATIONMESHGENERATOR)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Bakes navigation data to the provided `nav_mesh` by parsing child nodes under the provided `root_node` or a specific group of nodes for potential source geometry. The parse behavior can be controlled with the [godot.NavigationMesh.geometryParsedGeometryType] and [godot.NavigationMesh.geometrySourceGeometryMode] properties on the [godot.NavigationMesh] resource.
   */
  public fun bake(navMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navMesh, OBJECT to rootNode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_BAKE,
        NIL.ordinal)
  }

  /**
   * Removes all polygons and vertices from the provided `nav_mesh` resource.
   */
  public fun clear(navMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(OBJECT to navMesh)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_CLEAR,
        NIL.ordinal)
  }
}
