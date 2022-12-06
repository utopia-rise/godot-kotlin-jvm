package godot.core

import godot.core.VariantType.*
import godot.core.VariantType.AABB
import godot.core.memory.GarbageCollector
import godot.util.toRealT
import java.nio.ByteBuffer

@PublishedApi
internal val variantMapper = mutableMapOf(
    Unit::class to NIL,
    Any::class to ANY,
    Boolean::class to BOOL,
    Int::class to JVM_INT,
    Long::class to LONG,
    Float::class to JVM_FLOAT,
    Byte::class to JVM_BYTE,
    Double::class to DOUBLE,
    String::class to STRING,
    AABB::class to AABB,
    Basis::class to BASIS,
    Color::class to COLOR,
    Dictionary::class to DICTIONARY,
    VariantArray::class to ARRAY,
    Plane::class to PLANE,
    NodePath::class to NODE_PATH,
    Quaternion::class to QUATERNION,
    Rect2::class to RECT2,
    Rect2i::class to RECT2I,
    RID::class to _RID,
    Transform3D::class to TRANSFORM3D,
    Transform2D::class to TRANSFORM2D,
    Vector2::class to VECTOR2,
    Vector2i::class to VECTOR2I,
    Vector3::class to VECTOR3,
    Vector3i::class to VECTOR3I,
    Vector4::class to VECTOR4,
    Vector4i::class to VECTOR4I,
    Projection::class to PROJECTION,
    PackedByteArray::class to PACKED_BYTE_ARRAY,
    PackedColorArray::class to PACKED_COLOR_ARRAY,
    PackedInt32Array::class to PACKED_INT_32_ARRAY,
    PackedInt64Array::class to PACKED_INT_64_ARRAY,
    PackedFloat32Array::class to PACKED_FLOAT_32_ARRAY,
    PackedFloat64Array::class to PACKED_FLOAT_64_ARRAY,
    PackedStringArray::class to PACKED_STRING_ARRAY,
    PackedVector2Array::class to PACKED_VECTOR2_ARRAY,
    PackedVector3Array::class to PACKED_VECTOR3_ARRAY
)

private var ByteBuffer.bool: Boolean
    get() = int == 1
    set(value) {
        putInt(if (value) 1 else 0)
    }

private var ByteBuffer.vector2: Vector2
    get() = Vector2(float.toRealT(), float.toRealT())
    set(value) {
        putFloat(value.x.toFloat())
        putFloat(value.y.toFloat())
    }

private var ByteBuffer.vector2i: Vector2i
    get() = Vector2i(int, int)
    set(value) {
        putInt(value.x)
        putInt(value.y)
    }

private var ByteBuffer.vector3: Vector3
    get() = Vector3(float.toRealT(), float.toRealT(), float.toRealT())
    set(value) {
        putFloat(value.x.toFloat())
        putFloat(value.y.toFloat())
        putFloat(value.z.toFloat())
    }

private var ByteBuffer.vector3i: Vector3i
    get() = Vector3i(int, int, int)
    set(value) {
        putInt(value.x)
        putInt(value.y)
        putInt(value.z)
    }

private var ByteBuffer.vector4: Vector4
    get() = Vector4(float.toRealT(), float.toRealT(), float.toRealT(), float.toRealT())
    set(value) {
        putFloat(value.x.toFloat())
        putFloat(value.y.toFloat())
        putFloat(value.z.toFloat())
        putFloat(value.w.toFloat())
    }

private var ByteBuffer.vector4i: Vector4i
    get() = Vector4i(int, int, int, int)
    set(value) {
        putInt(value.x)
        putInt(value.y)
        putInt(value.z)
        putInt(value.w)
    }

private var ByteBuffer.basis: Basis
    get() = Basis().also {
        it._x = vector3
        it._y = vector3
        it._z = vector3
    }
    set(value) {
        vector3 = value._x
        vector3 = value._y
        vector3 = value._z
    }

private var ByteBuffer.obj: KtObject
    get() {
        val ptr = long
        val constructorIndex = int
        val id = long

        return GarbageCollector.getInstance(id) ?: KtObject.instantiateWith(
            ptr,
            id,
            true,
            TypeManager.engineTypesConstructors[constructorIndex],
        )
    }
    set(value) {
        putLong(value.rawPtr)
    }

private var ByteBuffer.variantType: Int
    get() = int
    set(value) {
        putInt(value)
    }

inline fun <reified T> Any.asObject(): T = this as T

@Suppress("EnumEntryName")
enum class VariantType(
    val id: Long,
    private val toKotlinWithoutNullCheck: (ByteBuffer, expectedType: Int) -> Any,
    private val toGodotWithoutNullCheck: (ByteBuffer, any: Any) -> Unit,
) {
    NIL(
        0,
        { _: ByteBuffer, _: Int ->
            Unit
        },
        { buffer: ByteBuffer, _: Any ->
            buffer.variantType = NIL.ordinal
        }
    ),

    // atomic types
    BOOL(
        1,
        { buffer: ByteBuffer, _: Int ->
            buffer.bool
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Boolean)
            buffer.variantType = BOOL.ordinal
            buffer.bool = any
        }
    ),
    LONG(
        2,
        { buffer: ByteBuffer, _: Int ->
            buffer.long
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Long)
            buffer.variantType = LONG.ordinal
            buffer.putLong(any)
        }
    ),
    DOUBLE(
        3,
        { buffer: ByteBuffer, _: Int ->
            buffer.double
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Double)
            buffer.variantType = DOUBLE.ordinal
            buffer.putDouble(any)
        }
    ),
    STRING(
        4,
        { buffer: ByteBuffer, _: Int ->
            val isLong = buffer.bool
            if (isLong) {
                val str = LongStringQueue.pollString()
                str
            } else {
                /**
                 *  A CString is read from the buffer, they all end with a 0 character except if the String is empty
                 *  "" has a size of 0, but "a" has a size of 2.
                 *  We only read the buffer if the size is superior to 0.
                 *  When it's the case, we create a string without the last 0 character.
                 */
                val stringSize = buffer.int
                val str = if (stringSize == 0) {
                    String()
                } else {
                    val charArray = ByteArray(stringSize)
                    buffer.get(charArray, 0, stringSize)
                    String(charArray, 0, stringSize - 1, Charsets.UTF_8)
                }
                str
            }
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is String)
            buffer.variantType = STRING.ordinal
            val stringBytes = any.encodeToByteArray()
            //TODO: Think of a way to reuse the encoded String
            if (stringBytes.size > LongStringQueue.stringMaxSize) {
                buffer.bool = true
                LongStringQueue.sendStringToCPP(any)
            } else {
                buffer.bool = false
                buffer.putInt(stringBytes.size)
                buffer.put(stringBytes)
            }
        }
    ),

    // math types

    VECTOR2(
        5,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector2
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector2)
            buffer.variantType = VECTOR2.ordinal
            buffer.vector2 = any
        }
    ),
    VECTOR2I(
        6,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector2i
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector2i)
            buffer.variantType = VECTOR2I.ordinal
            buffer.vector2i = any
        }
    ),
    RECT2(
        7,
        { buffer: ByteBuffer, _: Int ->
            Rect2(
                buffer.vector2,
                buffer.vector2
            )
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Rect2)
            buffer.variantType = RECT2.ordinal
            buffer.vector2 = any._position
            buffer.vector2 = any._size
        }
    ),
    RECT2I(
        8,
        { buffer: ByteBuffer, _: Int ->
            Rect2i(
                buffer.vector2i,
                buffer.vector2i
            )
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Rect2i)
            buffer.variantType = RECT2I.ordinal
            buffer.vector2i = any._position
            buffer.vector2i = any._size
        }
    ),
    VECTOR3(
        9,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector3
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector3)
            buffer.variantType = VECTOR3.ordinal
            buffer.vector3 = any
        }
    ),
    VECTOR3I(
        10,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector3i
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector3i)
            buffer.variantType = VECTOR3I.ordinal
            buffer.vector3i = any
        }
    ),
    TRANSFORM2D(
        11,
        { buffer: ByteBuffer, _: Int ->
            val x = buffer.vector2
            val y = buffer.vector2
            val origin = buffer.vector2
            Transform2D(x, y, origin)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Transform2D)
            buffer.variantType = TRANSFORM2D.ordinal
            buffer.vector2 = any._x
            buffer.vector2 = any._y
            buffer.vector2 = any.origin
        }
    ),
    VECTOR4(
        12,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector4
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector4)
            buffer.variantType = VECTOR4.ordinal
            buffer.vector4 = any
        }
    ),
    VECTOR4I(
        13,
        { buffer: ByteBuffer, _: Int ->
            buffer.vector4i
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Vector4i)
            buffer.variantType = VECTOR4I.ordinal
            buffer.vector4i = any
        }
    ),
    PLANE(
        14,
        { buffer: ByteBuffer, _: Int ->
            val normal = buffer.vector3
            val d = buffer.float.toRealT()
            Plane(normal, d)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Plane)
            buffer.variantType = PLANE.ordinal
            buffer.vector3 = any._normal
            buffer.putFloat(any.d.toFloat())
        }
    ),
    QUATERNION(
        15,
        { buffer: ByteBuffer, _: Int ->
            val x = buffer.float.toRealT()
            val y = buffer.float.toRealT()
            val z = buffer.float.toRealT()
            val w = buffer.float.toRealT()

            Quaternion(x, y, z, w)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Quaternion)
            buffer.variantType = QUATERNION.ordinal
            buffer.putFloat(any.x.toFloat())
            buffer.putFloat(any.y.toFloat())
            buffer.putFloat(any.z.toFloat())
            buffer.putFloat(any.w.toFloat())
        }
    ),
    AABB(
        16,
        { buffer: ByteBuffer, _: Int ->
            val position = buffer.vector3
            val size = buffer.vector3
            AABB(position, size)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is godot.core.AABB)
            buffer.variantType = AABB.ordinal
            buffer.vector3 = any._position
            buffer.vector3 = any._size
        }
    ),
    BASIS(
        17,
        { buffer: ByteBuffer, _: Int ->
            buffer.basis
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Basis)
            buffer.variantType = BASIS.ordinal
            buffer.basis = any
        }
    ),
    TRANSFORM3D(
        18,
        { buffer: ByteBuffer, _: Int ->
            val basis = buffer.basis
            val origin = buffer.vector3
            Transform3D(basis, origin)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Transform3D)
            buffer.variantType = TRANSFORM3D.ordinal
            buffer.basis = any._basis
            buffer.vector3 = any._origin
        }
    ),
    PROJECTION(
        19,
        { buffer: ByteBuffer, _: Int ->
            Projection(
                buffer.vector4,
                buffer.vector4,
                buffer.vector4,
                buffer.vector4
            )
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Projection)
            buffer.variantType = PROJECTION.ordinal
            buffer.vector4 = any._x
            buffer.vector4 = any._y
            buffer.vector4 = any._z
            buffer.vector4 = any._w
        }
    ),

    // misc types
    COLOR(
        20,
        { buffer: ByteBuffer, _: Int ->
            Color(buffer.float, buffer.float, buffer.float, buffer.float)
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is Color)
            buffer.variantType = COLOR.ordinal
            buffer.putFloat(any.r.toFloat())
            buffer.putFloat(any.g.toFloat())
            buffer.putFloat(any.b.toFloat())
            buffer.putFloat(any.a.toFloat())
        }
    ),
    STRING_NAME(
        21,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: StringName(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            STRING_NAME.toGodotNativeCoreType<StringName>(buffer, any)
        }
    ),
    NODE_PATH(
        22,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: NodePath(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            NODE_PATH.toGodotNativeCoreType<NodePath>(buffer, any)
        }
    ),
    _RID(
        23,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: RID(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            _RID.toGodotNativeCoreType<RID>(buffer, any)
        }
    ),
    OBJECT(
        24,
        { buffer: ByteBuffer, _: Int ->
            buffer.obj
        },
        { buffer: ByteBuffer, any: Any ->
            require(any is KtObject)
            buffer.variantType = OBJECT.ordinal
            buffer.obj = any
        }
    ),
    CALLABLE(
        25,
        { buffer: ByteBuffer, _: Int ->
            val isCustom = buffer.bool
            val ptr = buffer.long

            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: if (!isCustom) {
                val obj = buffer.obj
                val stringNamePtr = buffer.long
                Callable(ptr, obj as godot.Object, StringName(stringNamePtr))
            } else {
                throw NoSuchElementException("Cannot find managed kotlin callable with ptr: $ptr")
            }
        },
        { buffer: ByteBuffer, any: Any ->
            CALLABLE.toGodotNativeCoreType<Callable>(buffer, any)
        }
    ),
    SIGNAL(
        26,
        { buffer: ByteBuffer, _: Int ->
            //TODO/4.0: Implement
        },
        { buffer: ByteBuffer, any: Any ->
            //TODO/4.0: Implement
        }
    ),
    DICTIONARY(
        27,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: Dictionary<Any, Any?>(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            DICTIONARY.toGodotNativeCoreType<Dictionary<*, *>>(buffer, any)
        }
    ),
    ARRAY(
        28,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            GarbageCollector.getNativeCoreTypeInstance(ptr) ?: VariantArray<Any?>(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            ARRAY.toGodotNativeCoreType<VariantArray<*>>(buffer, any)
        }
    ),

    // arrays
    PACKED_BYTE_ARRAY(
        29,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedByteArray(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_BYTE_ARRAY.toGodotNativeCoreType<PackedByteArray>(buffer, any)
        }
    ),
    PACKED_INT_32_ARRAY(
        30,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedInt32Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_INT_32_ARRAY.toGodotNativeCoreType<PackedInt32Array>(buffer, any)
        }
    ),
    PACKED_INT_64_ARRAY(
        31,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedInt64Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_INT_64_ARRAY.toGodotNativeCoreType<PackedInt64Array>(buffer, any)
        }
    ),
    PACKED_FLOAT_32_ARRAY(
        32,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedFloat32Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_FLOAT_32_ARRAY.toGodotNativeCoreType<PackedFloat32Array>(buffer, any)
        }
    ),
    PACKED_FLOAT_64_ARRAY(
        33,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedFloat64Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_FLOAT_64_ARRAY.toGodotNativeCoreType<PackedFloat64Array>(buffer, any)
        }
    ),
    PACKED_STRING_ARRAY(
        34,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedStringArray(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_STRING_ARRAY.toGodotNativeCoreType<PackedStringArray>(buffer, any)
        }
    ),
    PACKED_VECTOR2_ARRAY(
        35,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedVector2Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_VECTOR2_ARRAY.toGodotNativeCoreType<PackedVector2Array>(buffer, any)
        }
    ),
    PACKED_VECTOR3_ARRAY(
        36,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedVector3Array(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_VECTOR3_ARRAY.toGodotNativeCoreType<PackedVector3Array>(buffer, any)
        }
    ),
    PACKED_COLOR_ARRAY(
        37,
        { buffer: ByteBuffer, _: Int ->
            val ptr = buffer.long
            PackedColorArray(ptr)
        },
        { buffer: ByteBuffer, any: Any ->
            PACKED_COLOR_ARRAY.toGodotNativeCoreType<PackedColorArray>(buffer, any)
        }
    ),

    VARIANT_MAX(
        38,
        { _: ByteBuffer, _: Int ->
            throw UnsupportedOperationException("Received VARIANT_MAX type, which should not happen.")
        },
        { _: ByteBuffer, _: Any ->
            throw UnsupportedOperationException("Try to send a VARIANT_MAX type, which should not be done.")
        }
    ),

    JVM_INT(
        LONG,
        { any -> (any as Long).toInt() },
        { any ->
            (any as Int).toLong()
        }
    ),

    JVM_FLOAT(
        DOUBLE,
        { any -> (any as Double).toFloat() },
        { any ->
            (any as Float).toDouble()
        }
    ),

    JVM_BYTE(
        LONG,
        { any -> (any as Long).toByte() },
        { any ->
            (any as Byte).toLong()
        }
    ),

    ANY(
        Long.MAX_VALUE,
        { buffer: ByteBuffer, expectedType: Int ->
            values()[expectedType].toKotlinWithoutNullCheck(buffer, expectedType)
        },
        { buffer: ByteBuffer, any: Any ->
            when (any) {
                is Unit -> NIL.toGodotWithoutNullCheck(buffer, any)
                is Byte -> JVM_BYTE.toGodotWithoutNullCheck(buffer, any)
                is Boolean -> BOOL.toGodotWithoutNullCheck(buffer, any)
                is Int -> JVM_INT.toGodotWithoutNullCheck(buffer, any)
                is Long -> LONG.toGodotWithoutNullCheck(buffer, any)
                is Float -> JVM_FLOAT.toGodotWithoutNullCheck(buffer, any)
                is Double -> DOUBLE.toGodotWithoutNullCheck(buffer, any)
                is String -> STRING.toGodotWithoutNullCheck(buffer, any)
                is Vector2 -> VECTOR2.toGodotWithoutNullCheck(buffer, any)
                is Vector2i -> VECTOR2I.toGodotWithoutNullCheck(buffer, any)
                is Rect2 -> RECT2.toGodotWithoutNullCheck(buffer, any)
                is Rect2i -> RECT2I.toGodotWithoutNullCheck(buffer, any)
                is Vector3 -> VECTOR3.toGodotWithoutNullCheck(buffer, any)
                is Vector3i -> VECTOR3I.toGodotWithoutNullCheck(buffer, any)
                is Transform2D -> TRANSFORM2D.toGodotWithoutNullCheck(buffer, any)
                is Plane -> PLANE.toGodotWithoutNullCheck(buffer, any)
                is Quaternion -> QUATERNION.toGodotWithoutNullCheck(buffer, any)
                is godot.core.AABB -> AABB.toGodotWithoutNullCheck(buffer, any)
                is Basis -> BASIS.toGodotWithoutNullCheck(buffer, any)
                is Transform3D -> TRANSFORM3D.toGodotWithoutNullCheck(buffer, any)
                is Color -> COLOR.toGodotWithoutNullCheck(buffer, any)
                is StringName -> STRING_NAME.toGodotWithoutNullCheck(buffer, any)
                is NodePath -> NODE_PATH.toGodotWithoutNullCheck(buffer, any)
                is RID -> _RID.toGodotWithoutNullCheck(buffer, any)
                is VariantArray<*> -> ARRAY.toGodotWithoutNullCheck(buffer, any)
                is Dictionary<*, *> -> DICTIONARY.toGodotWithoutNullCheck(buffer, any)
                is PackedByteArray -> PACKED_BYTE_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedInt32Array -> PACKED_INT_32_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedInt64Array -> PACKED_INT_64_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedFloat32Array -> PACKED_FLOAT_32_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedFloat64Array -> PACKED_FLOAT_64_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedStringArray -> PACKED_STRING_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedVector2Array -> PACKED_VECTOR2_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedVector3Array -> PACKED_VECTOR3_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is PackedColorArray -> PACKED_COLOR_ARRAY.toGodotWithoutNullCheck(buffer, any)
                is KtObject -> OBJECT.toGodotWithoutNullCheck(buffer, any)
                else -> throw UnsupportedOperationException("Can't convert type ${any::class} to Variant")
            }
        }
    );

    var baseOrdinal = ordinal

    constructor(
        originalVariantType: VariantType,
        toKotlinConverter: (Any) -> Any,
        toGodotConverter: (Any) -> Any
    ) : this(
        originalVariantType.id,
        { buffer: ByteBuffer, expectedType: Int ->
            toKotlinConverter(originalVariantType.toKotlinWithoutNullCheck(buffer, expectedType))
        },
        { buffer: ByteBuffer, any: Any -> originalVariantType.toGodotWithoutNullCheck(buffer, toGodotConverter(any)) }
    ) {
        baseOrdinal = originalVariantType.ordinal
    }

    internal val toGodot = { buffer: ByteBuffer, any: Any? ->
        if (any == null) {
            NIL.toGodotWithoutNullCheck(buffer, Unit)
        } else {
            toGodotWithoutNullCheck(buffer, any)
        }
    }

    internal val toKotlin = this.getToKotlinLambdaToExecute(toKotlinWithoutNullCheck)
}

internal fun VariantType.getToKotlinLambdaToExecute(defaultLambda: (ByteBuffer, Int) -> Any?): (ByteBuffer, Boolean) -> Any? {
    return if (this.ordinal == ANY_VARIANT_TYPE) {
        { buffer: ByteBuffer, isNullable: Boolean ->
            val variantType = buffer.variantType
            if (variantType == NIL.ordinal) {
                if (!isNullable) throw TypeCastException("Expected a non nullable ${this.name} but received a null.")
                null
            } else defaultLambda(buffer, variantType)
        }
    } else {
        { buffer: ByteBuffer, isNullable: Boolean ->
            when (val variantType = buffer.variantType) {
                baseOrdinal -> {
                    defaultLambda(buffer, variantType)
                }

                NIL.ordinal -> {
                    if (!isNullable) throw TypeCastException("Expected a non nullable ${this.name} but received a null.")
                    null
                }

                else -> throw TypeCastException("Cannot match $variantType to ${this.baseOrdinal}")
            }
        }
    }
}

private inline fun <reified T : NativeCoreType> VariantType.toGodotNativeCoreType(buffer: ByteBuffer, any: Any) {
    require(any is T)
    buffer.variantType = ordinal
    buffer.putLong(any._handle)
}

private const val ANY_VARIANT_TYPE = 31
