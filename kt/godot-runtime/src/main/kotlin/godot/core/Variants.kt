package godot.core

import godot.util.toRealT
import java.nio.ByteBuffer


fun getVariantType(unit: Unit) = VariantType.NIL to unit
fun getVariantType(int: Int) = VariantType.LONG to int.toLong()
fun getVariantType(long: Long) = VariantType.LONG to long
fun getVariantType(float: Float) = VariantType.DOUBLE to float.toDouble()
fun getVariantType(double: Double) = VariantType.DOUBLE to double
fun getVariantType(str: String) = VariantType.STRING to str
fun getVariantType(bool: Boolean) = VariantType.BOOL to bool
fun getVariantType(vector2: Vector2) = VariantType.VECTOR2 to vector2
fun getVariantType(rect2: Rect2) = VariantType.RECT2 to rect2
fun getVariantType(vector3: Vector3) = VariantType.VECTOR3 to vector3
fun getVariantType(transform2D: Transform2D) = VariantType.TRANSFORM2D to transform2D
fun getVariantType(plane: Plane) = VariantType.PLANE to plane
fun getVariantType(quat: Quat) = VariantType.QUAT to quat
fun getVariantType(aabb: AABB) = VariantType.AABB to aabb
fun getVariantType(basis: Basis) = VariantType.BASIS to basis
fun getVariantType(transform: Transform) = VariantType.TRANSFORM to transform
fun getVariantType(variantArray: VariantArray) = VariantType.ARRAY to variantArray
fun getVariantType(ktObject: KtObject) = VariantType.OBJECT to ktObject

var ByteBuffer.bool: Boolean
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

private var ByteBuffer.vector3: Vector3
    get() = Vector3(float.toRealT(), float.toRealT(), float.toRealT())
    set(value) {
        putFloat(value.x.toFloat())
        putFloat(value.y.toFloat())
        putFloat(value.z.toFloat())
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


internal fun Any.encode(type: VariantType, buffer: ByteBuffer) {
    buffer.putInt(type.ordinal)
    type.toGodot(buffer, this)
}

internal fun parse(buffer: ByteBuffer): Any {
    val int = buffer.int
    return VariantType.values()[int].toKotlin(buffer)
}

inline fun <reified T> Any.asObject(): T = this as T

enum class VariantType (
        internal val toKotlin: (ByteBuffer) -> Any,
        internal val toGodot: (ByteBuffer, any: Any) -> Unit
) {
    NIL(
            { buffer: ByteBuffer -> Unit },
            { buffer: ByteBuffer, any: Any -> Unit }
    ),

    // atomic types
    BOOL(
            { buffer: ByteBuffer -> buffer.bool },
            { buffer: ByteBuffer, any: Any -> buffer.bool = any as Boolean }
    ),
    LONG(
            { buffer: ByteBuffer -> buffer.long },
            { buffer: ByteBuffer, any: Any -> buffer.putLong(any as Long) }
    ),
    DOUBLE(
            { buffer: ByteBuffer -> buffer.double},
            { buffer: ByteBuffer, any: Any -> buffer.putDouble(any as Double) }
    ),
    STRING(
            { buffer: ByteBuffer ->
                val stringSize = buffer.int
                val charArray = kotlin.ByteArray(stringSize)
                buffer.get(charArray, 0, stringSize)
                kotlin.text.String(charArray, kotlin.text.Charsets.UTF_8)
            },
            { buffer: ByteBuffer, any: Any ->
                any as String
                val stringBytes = any.encodeToByteArray()
                kotlin.io.println("char array size is: ${stringBytes.size}")
                buffer.putInt(stringBytes.size)
                buffer.put(stringBytes)
            }
    ),

    // math types

    VECTOR2(
            { buffer: ByteBuffer -> buffer.vector2 },
            { buffer: ByteBuffer, any: Any -> buffer.vector2 = any as Vector2 }
    ), // 5
    RECT2(
            { buffer: ByteBuffer ->
                Rect2(
                        buffer.vector2,
                        buffer.vector2
                )
            },
            { buffer: ByteBuffer, any: Any ->
                any as Rect2
                buffer.vector2 = any._position
                buffer.vector2 = any._size
            }
    ),
    VECTOR3(
            { buffer: ByteBuffer ->
                Vector3(buffer.float.toRealT(), buffer.float.toRealT(), buffer.float.toRealT())
            },
            { buffer: ByteBuffer, any: Any -> buffer.vector3 = any as Vector3 }
    ),
    TRANSFORM2D(
            { buffer: ByteBuffer ->
                val x = buffer.vector2
                val y = buffer.vector2
                val origin = buffer.vector2
                Transform2D(x, y, origin)
            },
            { buffer: ByteBuffer, any: Any ->
                any as Transform2D
                buffer.vector2 = any._x
                buffer.vector2 = any._y
                buffer.vector2 = any.origin
            }
    ),
    PLANE(
            { buffer: ByteBuffer ->
                val normal = buffer.vector3
                val d = buffer.float.toRealT()
                Plane(normal, d)
            },
            { buffer: ByteBuffer, any: Any ->
                any as Plane
                buffer.vector3 = any._normal
                buffer.putFloat(any.d.toFloat())
            }
    ),
    QUAT(
            { buffer: ByteBuffer ->
                val x = buffer.float.toRealT()
                val y = buffer.float.toRealT()
                val z = buffer.float.toRealT()
                val w = buffer.float.toRealT()

                Quat(x, y, z, w)
            },
            { buffer: ByteBuffer, any: Any ->
                any as Quat
                buffer.putFloat(any.x.toFloat())
                buffer.putFloat(any.y.toFloat())
                buffer.putFloat(any.z.toFloat())
                buffer.putFloat(any.w.toFloat())
            }
    ), // 10
    AABB(
            { buffer: ByteBuffer ->
                val position = buffer.vector3
                val size = buffer.vector3
                AABB(position, size)
            },
            { buffer: ByteBuffer, any: Any ->
                any as godot.core.AABB
                buffer.vector3 = any._position
                buffer.vector3 = any._size
            }
    ),
    BASIS(
            { buffer: ByteBuffer -> buffer.basis },
            { buffer: ByteBuffer, any: Any -> buffer.basis = any as Basis }
    ),
    TRANSFORM(
            { buffer: ByteBuffer ->
                val basis = buffer.basis
                val origin = buffer.vector3
                Transform(basis, origin)
            },
            { buffer: ByteBuffer, any: Any ->
                any as Transform
                buffer.basis = any._basis
                buffer.vector3 = any._origin
            }
    ),

    // misc types
    COLOR(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    NODE_PATH(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 15
    _RID(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    OBJECT(
            { buffer: ByteBuffer ->
                val ptr = buffer.long
                val constructorIndex = buffer.int
                val isRef = buffer.bool
                if (isRef) {
                    GarbageCollector.getRefInstance(ptr)
                } else {
                    GarbageCollector.getObjectInstance(ptr)
                } ?: KtObject.instantiateWith(
                        ptr,
                        buffer.long,
                        isRef,
                        TypeManager.engineTypesConstructors[constructorIndex]
                )
            },
            { buffer: ByteBuffer, any: Any ->
                any as KtObject
                buffer.putLong(any.rawPtr)
                buffer.bool = any.isRef
            }
    ),
    DICTIONARY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    ARRAY(
            { buffer: ByteBuffer -> VariantArray() },
            { buffer: ByteBuffer, any: Any -> Unit }
    ),

    // arrays
    POOL_BYTE_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 20
    POOL_INT_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_REAL_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_STRING_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_VECTOR2_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_VECTOR3_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 25
    POOL_COLOR_ARRAY(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),

    VARIANT_MAX(
            { buffer: ByteBuffer -> TODO() },
            { buffer: ByteBuffer, any: Any -> TODO() }
    )
}
