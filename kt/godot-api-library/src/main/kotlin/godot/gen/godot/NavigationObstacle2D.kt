// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONOBSTACLE2D_INDEX: Int = 395

/**
 * An obstacle needs a navigation map and outline [vertices] defined to work correctly. The outlines
 * can not cross or overlap.
 * Obstacles can be included in the navigation mesh baking process when [affectNavigationMesh] is
 * enabled. They do not add walkable geometry, instead their role is to discard other source geometry
 * inside the shape. This can be used to prevent navigation mesh from appearing in unwanted places. If
 * [carveNavigationMesh] is enabled the baked shape will not be affected by offsets of the navigation
 * mesh baking, e.g. the agent radius.
 * With [avoidanceEnabled] the obstacle can constrain the avoidance velocities of avoidance using
 * agents. If the obstacle's vertices are wound in clockwise order, avoidance agents will be pushed in
 * by the obstacle, otherwise, avoidance agents will be pushed out. Obstacles using vertices and
 * avoidance can warp to a new position but should not be moved every single frame as each change
 * requires a rebuild of the avoidance map.
 */
@GodotBaseType
public open class NavigationObstacle2D : Node2D() {
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
   * The outline vertices of the obstacle. If the vertices are winded in clockwise order agents will
   * be pushed in by the obstacle, else they will be pushed out. Outlines can not be crossed or
   * overlap. Should the vertices using obstacle be warped to a new position agent's can not predict
   * this movement and may get trapped inside the obstacle.
   */
  public final inline var vertices: PackedVector2Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  /**
   * If enabled and parsed in a navigation mesh baking process the obstacle will discard source
   * geometry inside its [vertices] defined shape.
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
  public final inline var velocity: Vector2
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONOBSTACLE2D_INDEX, scriptIndex)
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
   * val myCoreType = navigationobstacle2d.velocity
   * //Your changes
   * navigationobstacle2d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * Returns the [RID] of this obstacle on the [NavigationServer2D].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setAvoidanceEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceEnabledPtr, NIL)
  }

  public final fun getAvoidanceEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationObstacle node should use and also updates
   * the `obstacle` on the NavigationServer.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    Internals.writeArguments(_RID to navigationMap)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationObstacle node. This function returns
   * always the map set on the NavigationObstacle node and not the map of the abstract obstacle on the
   * NavigationServer. If the obstacle map is changed directly with the NavigationServer API the
   * NavigationObstacle node will not be aware of the map change. Use [setNavigationMap] to change the
   * navigation map for the NavigationObstacle and also update the obstacle on the NavigationServer.
   */
  public final fun getNavigationMap(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVelocity(velocity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
  }

  public final fun getVelocity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setVertices(vertices: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to vertices)
    Internals.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  public final fun getVertices(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setAvoidanceLayers(layers: Long): Unit {
    Internals.writeArguments(LONG to layers)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceLayersPtr, NIL)
  }

  public final fun getAvoidanceLayers(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAffectNavigationMesh(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setAffectNavigationMeshPtr, NIL)
  }

  public final fun getAffectNavigationMesh(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAffectNavigationMeshPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCarveNavigationMesh(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setCarveNavigationMeshPtr, NIL)
  }

  public final fun getCarveNavigationMesh(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCarveNavigationMeshPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val getRidPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_rid", 2944877500)

    internal val setAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_enabled", 2586408642)

    internal val getAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_enabled", 36873697)

    internal val setNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_navigation_map", 2722037293)

    internal val getNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_navigation_map", 2944877500)

    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_radius", 1740695150)

    internal val setVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_velocity", 743155724)

    internal val getVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_velocity", 3341600327)

    internal val setVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_vertices", 1509147220)

    internal val getVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_vertices", 2961356807)

    internal val setAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_layers", 1286410249)

    internal val getAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_layers", 3905245786)

    internal val setAvoidanceLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_layer_value", 300928843)

    internal val getAvoidanceLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_layer_value", 1116898809)

    internal val setAffectNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_affect_navigation_mesh", 2586408642)

    internal val getAffectNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_affect_navigation_mesh", 36873697)

    internal val setCarveNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "set_carve_navigation_mesh", 2586408642)

    internal val getCarveNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationObstacle2D", "get_carve_navigation_mesh", 36873697)
  }
}
