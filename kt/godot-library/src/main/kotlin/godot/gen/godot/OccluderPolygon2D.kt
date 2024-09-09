// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Editor facility that helps you draw a 2D polygon used as resource for [LightOccluder2D].
 */
@GodotBaseType
public open class OccluderPolygon2D : Resource() {
  /**
   * If `true`, closes the polygon. A closed OccluderPolygon2D occludes the light coming from any
   * direction. An opened OccluderPolygon2D occludes the light only at its outline's direction.
   */
  public var closed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isClosedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClosedPtr, NIL)
    }

  /**
   * The culling mode to use.
   */
  public var cullMode: CullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
      return OccluderPolygon2D.CullMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
    }

  /**
   * A [Vector2] array with the index for polygon's vertices positions.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OCCLUDERPOLYGON2D, scriptIndex)
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

  internal object MethodBindings {
    public val setClosedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_closed", 2586408642)

    public val isClosedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "is_closed", 36873697)

    public val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_cull_mode", 3500863002)

    public val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_cull_mode", 33931036)

    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "set_polygon", 1509147220)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderPolygon2D", "get_polygon", 2961356807)
  }
}
