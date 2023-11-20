// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Helper class for creating and clearing navigation meshes.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html)
 *
 * This class is responsible for creating and clearing 3D navigation meshes used as [godot.NavigationMesh] resources inside [godot.NavigationRegion3D]. The [godot.NavigationMeshGenerator] has very limited to no use for 2D as the navigation mesh baking process expects 3D node types and 3D source geometry to parse.
 *
 * The entire navigation mesh baking is best done in a separate thread as the voxelization, collision tests and mesh optimization steps involved are very performance and time hungry operations.
 *
 * Navigation mesh baking happens in multiple steps and the result depends on 3D source geometry and properties of the [godot.NavigationMesh] resource. In the first step, starting from a root node and depending on [godot.NavigationMesh] properties all valid 3D source geometry nodes are collected from the [godot.SceneTree]. Second, all collected nodes are parsed for their relevant 3D geometry data and a combined 3D mesh is build. Due to the many different types of parsable objects, from normal [godot.MeshInstance3D]s to [godot.CSGShape3D]s or various [godot.CollisionObject3D]s, some operations to collect geometry data can trigger [godot.RenderingServer] and [godot.PhysicsServer3D] synchronizations. Server synchronization can have a negative effect on baking time or framerate as it often involves [godot.Mutex] locking for thread security. Many parsable objects and the continuous synchronization with other threaded Servers can increase the baking time significantly. On the other hand only a few but very large and complex objects will take some time to prepare for the Servers which can noticeably stall the next frame render. As a general rule the total number of parsable objects and their individual size and complexity should be balanced to avoid framerate issues or very long baking times. The combined mesh is then passed to the Recast Navigation Object to test the source geometry for walkable terrain suitable to [godot.NavigationMesh] agent properties by creating a voxel world around the meshes bounding area.
 *
 * The finalized navigation mesh is then returned and stored inside the [godot.NavigationMesh] for use as a resource inside [godot.NavigationRegion3D] nodes.
 *
 * **Note:** Using meshes to not only define walkable surfaces but also obstruct navigation baking does not always work. The navigation baking has no concept of what is a geometry "inside" when dealing with mesh source geometry and this is intentional. Depending on current baking parameters, as soon as the obstructing mesh is large enough to fit a navigation mesh area inside, the baking will generate navigation mesh areas that are inside the obstructing source geometry mesh.
 */
@GodotBaseType
public object NavigationMeshGenerator : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NAVIGATIONMESHGENERATOR)
    return false
  }

  /**
   * The bake function is deprecated due to core threading changes. To upgrade existing code, first create a [godot.NavigationMeshSourceGeometryData3D] resource. Use this resource with [parseSourceGeometryData] to parse the SceneTree for nodes that should contribute to the navigation mesh baking. The SceneTree parsing needs to happen on the main thread. After the parsing is finished use the resource with [bakeFromSourceGeometryData] to bake a navigation mesh.
   */
  public fun bake(navigationMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  /**
   * Removes all polygons and vertices from the provided [navigationMesh] resource.
   */
  public fun clear(navigationMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Parses the [godot.SceneTree] for source geometry according to the properties of [navigationMesh]. Updates the provided [sourceGeometryData] resource with the resulting data. The resource can then be used to bake a navigation mesh with [bakeFromSourceGeometryData]. After the process is finished the optional [callback] will be called.
   *
   * **Note:** This function needs to run on the main thread or with a deferred call as the SceneTree is not thread-safe.
   *
   * **Performance:** While convenient, reading data arrays from [godot.Mesh] resources can affect the frame rate negatively. The data needs to be received from the GPU, stalling the [godot.RenderingServer] in the process. For performance prefer the use of e.g. collision shapes or creating the data arrays entirely in code.
   */
  @JvmOverloads
  public fun parseSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    rootNode: Node,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationMesh] with the data from the provided [sourceGeometryData]. After the process is finished the optional [callback] will be called.
   */
  @JvmOverloads
  public fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  internal object MethodBindings {
    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationMeshGenerator", "bake")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationMeshGenerator", "clear")

    public val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshGenerator", "parse_source_geometry_data")

    public val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshGenerator", "bake_from_source_geometry_data")
  }
}
