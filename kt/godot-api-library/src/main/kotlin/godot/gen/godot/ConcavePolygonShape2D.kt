// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 2D polyline shape, intended for use in physics. Used internally in [CollisionPolygon2D] when
 * it's in [CollisionPolygon2D.BUILD_SEGMENTS] mode.
 * Being just a collection of interconnected line segments, [ConcavePolygonShape2D] is the most
 * freely configurable single 2D shape. It can be used to form polygons of any nature, or even shapes
 * that don't enclose an area. However, [ConcavePolygonShape2D] is *hollow* even if the interconnected
 * line segments do enclose an area, which often makes it unsuitable for physics or detection.
 * **Note:** When used for collision, [ConcavePolygonShape2D] is intended to work with static
 * [CollisionShape2D] nodes like [StaticBody2D] and will likely not behave well for [CharacterBody2D]s
 * or [RigidBody2D]s in a mode other than Static.
 * **Warning:** Physics bodies that are small have a chance to clip through this shape when moving
 * fast. This happens because on one frame, the physics body may be on the "outside" of the shape, and
 * on the next frame it may be "inside" it. [ConcavePolygonShape2D] is hollow, so it won't detect a
 * collision.
 * **Performance:** Due to its complexity, [ConcavePolygonShape2D] is the slowest 2D collision shape
 * to check collisions against. Its use should generally be limited to level geometry. If the polyline
 * is closed, [CollisionPolygon2D]'s [CollisionPolygon2D.BUILD_SOLIDS] mode can be used, which
 * decomposes the polygon into convex ones; see [ConvexPolygonShape2D]'s documentation for
 * instructions.
 */
@GodotBaseType
public open class ConcavePolygonShape2D : Shape2D() {
  /**
   * The array of points that make up the [ConcavePolygonShape2D]'s line segments. The array (of
   * length divisible by two) is naturally divided into pairs (one pair for each segment); each pair
   * consists of the starting point of a segment and the endpoint of a segment.
   */
  public final inline var segments: PackedVector2Array
    @JvmName("segmentsProperty")
    get() = getSegments()
    @JvmName("segmentsProperty")
    set(`value`) {
      setSegments(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE2D, scriptIndex)
  }

  public final fun setSegments(segments: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to segments)
    TransferContext.callMethod(rawPtr, MethodBindings.setSegmentsPtr, NIL)
  }

  public final fun getSegments(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSegmentsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public companion object

  internal object MethodBindings {
    public val setSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape2D", "set_segments", 1509147220)

    public val getSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConcavePolygonShape2D", "get_segments", 2961356807)
  }
}
