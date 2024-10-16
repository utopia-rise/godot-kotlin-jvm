// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An obstacle needs a navigation map and outline [vertices] defined to work correctly. The outlines
 * can not cross or overlap and are restricted to a plane projection. This means the y-axis of the
 * vertices is ignored, instead the obstacle's global y-axis position is used for placement. The
 * projected shape is extruded by the obstacles height along the y-axis.
 * Obstacles can be included in the navigation mesh baking process when [affectNavigationMesh] is
 * enabled. They do not add walkable geometry, instead their role is to discard other source geometry
 * inside the shape. This can be used to prevent navigation mesh from appearing in unwanted places,
 * e.g. inside "solid" geometry or on top of it. If [carveNavigationMesh] is enabled the baked shape
 * will not be affected by offsets of the navigation mesh baking, e.g. the agent radius.
 * With [avoidanceEnabled] the obstacle can constrain the avoidance velocities of avoidance using
 * agents. If the obstacle's vertices are wound in clockwise order, avoidance agents will be pushed in
 * by the obstacle, otherwise, avoidance agents will be pushed out. Obstacles using vertices and
 * avoidance can warp to a new position but should not be moved every single frame as each change
 * requires a rebuild of the avoidance map.
 */
@GodotBaseType
public open class NavigationObstacle3D : Node3D() {
  /**
   * Sets the avoidance radius for the obstacle.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * Sets the obstacle height used in 2D avoidance. 2D avoidance using agent's ignore obstacles that
   * are below or above them.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The outline vertices of the obstacle. If the vertices are winded in clockwise order agents will
   * be pushed in by the obstacle, else they will be pushed out. Outlines can not be crossed or
   * overlap. Should the vertices using obstacle be warped to a new position agent's can not predict
   * this movement and may get trapped inside the obstacle.
   */
  public final inline var vertices: PackedVector3Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  /**
   * If enabled and parsed in a navigation mesh baking process the obstacle will discard source
   * geometry inside its [vertices] and [height] defined shape.
   */
  public final inline var affectNavigationMesh: Boolean
    @JvmName("affectNavigationMeshProperty")
    get() = getAffectNavigationMesh()
    @JvmName("affectNavigationMeshProperty")
    set(`value`) {
      setAffectNavigationMesh(value)
    }

  /**
   * If enabled the obstacle vertices will carve into the baked navigation mesh with the shape
   * unaffected by additional offsets (e.g. agent radius).
   * It will still be affected by further postprocessing of the baking process, like edge and
   * polygon simplification.
   * Requires [affectNavigationMesh] to be enabled.
   */
  public final inline var carveNavigationMesh: Boolean
    @JvmName("carveNavigationMeshProperty")
    get() = getCarveNavigationMesh()
    @JvmName("carveNavigationMeshProperty")
    set(`value`) {
      setCarveNavigationMesh(value)
    }

  /**
   * If `true` the obstacle affects avoidance using agents.
   */
  public final inline var avoidanceEnabled: Boolean
    @JvmName("avoidanceEnabledProperty")
    get() = getAvoidanceEnabled()
    @JvmName("avoidanceEnabledProperty")
    set(`value`) {
      setAvoidanceEnabled(value)
    }

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if
   * it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only
   * affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
   */
  @CoreTypeLocalCopy
  public final inline var velocity: Vector3
    @JvmName("velocityProperty")
    get() = getVelocity()
    @JvmName("velocityProperty")
    set(`value`) {
      setVelocity(value)
    }

  /**
   * A bitfield determining the avoidance layers for this obstacle. Agents with a matching bit on
   * the their avoidance mask will avoid this obstacle.
   */
  public final inline var avoidanceLayers: Long
    @JvmName("avoidanceLayersProperty")
    get() = getAvoidanceLayers()
    @JvmName("avoidanceLayersProperty")
    set(`value`) {
      setAvoidanceLayers(value)
    }

  /**
   * If `true` the obstacle affects 3D avoidance using agent's with obstacle [radius].
   * If `false` the obstacle affects 2D avoidance using agent's with both obstacle [vertices] as
   * well as obstacle [radius].
   */
  public final inline var use3dAvoidance: Boolean
    @JvmName("use3dAvoidanceProperty")
    get() = getUse3dAvoidance()
    @JvmName("use3dAvoidanceProperty")
    set(`value`) {
      setUse3dAvoidance(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_NAVIGATIONOBSTACLE3D, this, scriptIndex)
  }

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if
   * it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only
   * affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = navigationobstacle3d.velocity
   * //Your changes
   * navigationobstacle3d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityMutate(block: Vector3.() -> Unit): Vector3 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * Returns the [RID] of this obstacle on the [NavigationServer3D].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setAvoidanceEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceEnabledPtr, NIL)
  }

  public final fun getAvoidanceEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationObstacle node should use and also updates
   * the `obstacle` on the NavigationServer.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationObstacle node. This function returns
   * always the map set on the NavigationObstacle node and not the map of the abstract obstacle on the
   * NavigationServer. If the obstacle map is changed directly with the NavigationServer API the
   * NavigationObstacle node will not be aware of the map change. Use [setNavigationMap] to change the
   * navigation map for the NavigationObstacle and also update the obstacle on the NavigationServer.
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityPtr, NIL)
  }

  public final fun getVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setVertices(vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(ptr, MethodBindings.setVerticesPtr, NIL)
  }

  public final fun getVertices(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public final fun setAvoidanceLayers(layers: Long): Unit {
    TransferContext.writeArguments(LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceLayersPtr, NIL)
  }

  public final fun getAvoidanceLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUse3dAvoidance(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUse3dAvoidancePtr, NIL)
  }

  public final fun getUse3dAvoidance(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAffectNavigationMesh(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAffectNavigationMeshPtr, NIL)
  }

  public final fun getAffectNavigationMesh(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAffectNavigationMeshPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCarveNavigationMesh(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCarveNavigationMeshPtr, NIL)
  }

  public final fun getCarveNavigationMesh(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCarveNavigationMeshPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_rid", 2944877500)

    public val setAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_enabled", 2586408642)

    public val getAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_enabled", 36873697)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_navigation_map", 2944877500)

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_height", 1740695150)

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_velocity", 3460891852)

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_velocity", 3360562783)

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_vertices", 334873810)

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_vertices", 497664490)

    public val setAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_layers", 1286410249)

    public val getAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_layers", 3905245786)

    public val setAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_avoidance_layer_value", 300928843)

    public val getAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_avoidance_layer_value", 1116898809)

    public val setUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_use_3d_avoidance", 2586408642)

    public val getUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_use_3d_avoidance", 36873697)

    public val setAffectNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_affect_navigation_mesh", 2586408642)

    public val getAffectNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_affect_navigation_mesh", 36873697)

    public val setCarveNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "set_carve_navigation_mesh", 2586408642)

    public val getCarveNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle3D", "get_carve_navigation_mesh", 36873697)
  }
}
