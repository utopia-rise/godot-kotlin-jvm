// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(415, scriptIndex)
  }

  public final fun setClosed(closed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to closed)
    TransferContext.callMethod(ptr, MethodBindings.setClosedPtr, NIL)
  }

  public final fun isClosed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isClosedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCullMode(cullMode: CullMode): Unit {
    TransferContext.writeArguments(LONG to cullMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCullModePtr, NIL)
  }

  public final fun getCullMode(): CullMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCullModePtr, LONG)
    return OccluderPolygon2D.CullMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
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
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_closed", 2586408642)

    internal val isClosedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "is_closed", 36873697)

    internal val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_cull_mode", 3500863002)

    internal val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_cull_mode", 33931036)

    internal val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_polygon", 1509147220)

    internal val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_polygon", 2961356807)
  }
}
