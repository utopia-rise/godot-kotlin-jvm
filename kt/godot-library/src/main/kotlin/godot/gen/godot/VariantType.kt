// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class VariantType(
  id: Long,
) {
  /**
   * Variable is `null`.
   */
  TYPE_NIL(0),
  /**
   * Variable is of type [bool].
   */
  TYPE_BOOL(1),
  /**
   * Variable is of type [int].
   */
  TYPE_INT(2),
  /**
   * Variable is of type [float].
   */
  TYPE_FLOAT(3),
  /**
   * Variable is of type [String].
   */
  TYPE_STRING(4),
  /**
   * Variable is of type [Vector2].
   */
  TYPE_VECTOR2(5),
  /**
   * Variable is of type [Vector2i].
   */
  TYPE_VECTOR2I(6),
  /**
   * Variable is of type [Rect2].
   */
  TYPE_RECT2(7),
  /**
   * Variable is of type [Rect2i].
   */
  TYPE_RECT2I(8),
  /**
   * Variable is of type [Vector3].
   */
  TYPE_VECTOR3(9),
  /**
   * Variable is of type [Vector3i].
   */
  TYPE_VECTOR3I(10),
  /**
   * Variable is of type [Transform2D].
   */
  TYPE_TRANSFORM2D(11),
  /**
   * Variable is of type [Vector4].
   */
  TYPE_VECTOR4(12),
  /**
   * Variable is of type [Vector4i].
   */
  TYPE_VECTOR4I(13),
  /**
   * Variable is of type [Plane].
   */
  TYPE_PLANE(14),
  /**
   * Variable is of type [Quaternion].
   */
  TYPE_QUATERNION(15),
  /**
   * Variable is of type [AABB].
   */
  TYPE_AABB(16),
  /**
   * Variable is of type [Basis].
   */
  TYPE_BASIS(17),
  /**
   * Variable is of type [Transform3D].
   */
  TYPE_TRANSFORM3D(18),
  /**
   * Variable is of type [Projection].
   */
  TYPE_PROJECTION(19),
  /**
   * Variable is of type [Color].
   */
  TYPE_COLOR(20),
  /**
   * Variable is of type [StringName].
   */
  TYPE_STRING_NAME(21),
  /**
   * Variable is of type [NodePath].
   */
  TYPE_NODE_PATH(22),
  /**
   * Variable is of type [RID].
   */
  TYPE_RID(23),
  /**
   * Variable is of type [Object].
   */
  TYPE_OBJECT(24),
  /**
   * Variable is of type [Callable].
   */
  TYPE_CALLABLE(25),
  /**
   * Variable is of type [Signal].
   */
  TYPE_SIGNAL(26),
  /**
   * Variable is of type [Dictionary].
   */
  TYPE_DICTIONARY(27),
  /**
   * Variable is of type [Array].
   */
  TYPE_ARRAY(28),
  /**
   * Variable is of type [PackedByteArray].
   */
  TYPE_PACKED_BYTE_ARRAY(29),
  /**
   * Variable is of type [PackedInt32Array].
   */
  TYPE_PACKED_INT32_ARRAY(30),
  /**
   * Variable is of type [PackedInt64Array].
   */
  TYPE_PACKED_INT64_ARRAY(31),
  /**
   * Variable is of type [PackedFloat32Array].
   */
  TYPE_PACKED_FLOAT32_ARRAY(32),
  /**
   * Variable is of type [PackedFloat64Array].
   */
  TYPE_PACKED_FLOAT64_ARRAY(33),
  /**
   * Variable is of type [PackedStringArray].
   */
  TYPE_PACKED_STRING_ARRAY(34),
  /**
   * Variable is of type [PackedVector2Array].
   */
  TYPE_PACKED_VECTOR2_ARRAY(35),
  /**
   * Variable is of type [PackedVector3Array].
   */
  TYPE_PACKED_VECTOR3_ARRAY(36),
  /**
   * Variable is of type [PackedColorArray].
   */
  TYPE_PACKED_COLOR_ARRAY(37),
  /**
   * Variable is of type [PackedVector4Array].
   */
  TYPE_PACKED_VECTOR4_ARRAY(38),
  /**
   * Represents the size of the [Variant.Type] enum.
   */
  TYPE_MAX(39),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): VariantType = entries.single { it.id == `value` }
  }
}
