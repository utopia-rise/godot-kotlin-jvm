// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OCCLUDERPOLYGON2D_INDEX: Int = 415

/**
 * Editor facility that helps you draw a 2D polygon used as resource for [LightOccluder2D].
 */
@GodotBaseType
public open class OccluderPolygon2D : Resource() {
  /**
   * If `true`, closes the polygon. A closed OccluderPolygon2D occludes the light coming from any
   * direction. An opened OccluderPolygon2D occludes the light only at its outline's direction.
   */
  public final inline var closed: Boolean
    @JvmName("closedProperty")
    get() = isClosed()
    @JvmName("closedProperty")
    set(`value`) {
      setClosed(value)
    }

  /**
   * The culling mode to use.
   */
  public final inline var cullMode: CullMode
    @JvmName("cullModeProperty")
    get() = getCullMode()
    @JvmName("cullModeProperty")
    set(`value`) {
      setCullMode(value)
    }

  /**
   * A [Vector2] array with the index for polygon's vertices positions.
   */
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OCCLUDERPOLYGON2D_INDEX, scriptIndex)
  }

  public final fun setClosed(closed: Boolean): Unit {
    Internals.writeArguments(BOOL to closed)
    Internals.callMethod(rawPtr, MethodBindings.setClosedPtr, NIL)
  }

  public final fun isClosed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isClosedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCullMode(cullMode: CullMode): Unit {
    Internals.writeArguments(LONG to cullMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
  }

  public final fun getCullMode(): CullMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
    return OccluderPolygon2D.CullMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    Internals.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public enum class CullMode(
    id: Long,
  ) {
    /**
     * Culling is disabled. See [cullMode].
     */
    CULL_DISABLED(0),
    /**
     * Culling is performed in the clockwise direction. See [cullMode].
     */
    CULL_CLOCKWISE(1),
    /**
     * Culling is performed in the counterclockwise direction. See [cullMode].
     */
    CULL_COUNTER_CLOCKWISE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CullMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setClosedPtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "set_closed", 2586408642)

    internal val isClosedPtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "is_closed", 36873697)

    internal val setCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "set_cull_mode", 3500863002)

    internal val getCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "get_cull_mode", 33931036)

    internal val setPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "set_polygon", 1509147220)

    internal val getPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("OccluderPolygon2D", "get_polygon", 2961356807)
  }
}
