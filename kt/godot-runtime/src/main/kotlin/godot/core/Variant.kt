package godot.core

import godot.util.toRealT
import java.nio.ByteBuffer


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

private var ByteBuffer.variantType: Int
    get() = int
    set(value) {
        putInt(value)
    }

private fun ByteBuffer.isReceivedNull() = variantType == VariantType.NIL.ordinal

inline fun <reified T> Any.asObject(): T = this as T

enum class VariantType(
        internal val toKotlinWithoutNullCheck: (ByteBuffer) -> Any,
        private val toGodotWithoutNullCheck: (ByteBuffer, any: Any) -> Unit
) {
    NIL(
            { buffer: ByteBuffer ->
                Unit
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = NIL.ordinal
            }
    ),

    // atomic types
    BOOL(
            { buffer: ByteBuffer ->
                buffer.bool
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = BOOL.ordinal
                buffer.bool = any as Boolean
            }
    ),
    LONG(
            { buffer: ByteBuffer ->
                buffer.long
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = LONG.ordinal
                buffer.putLong(any as Long)
            }
    ),
    DOUBLE(
            { buffer: ByteBuffer ->
                buffer.double
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = DOUBLE.ordinal
                buffer.putDouble(any as Double)
            }
    ),
    STRING(
            { buffer: ByteBuffer ->
                val stringSize = buffer.int
                val charArray = ByteArray(stringSize)
                buffer.get(charArray, 0, stringSize)
                String(charArray, Charsets.UTF_8)
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = STRING.ordinal
                any as String
                val stringBytes = any.encodeToByteArray()
                buffer.putInt(stringBytes.size)
                buffer.put(stringBytes)
            }
    ),

    // math types

    VECTOR2(
            { buffer: ByteBuffer ->
                buffer.vector2
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = VECTOR2.ordinal
                buffer.vector2 = any as Vector2
            }
    ), // 5
    RECT2(
            { buffer: ByteBuffer ->
                Rect2(
                        buffer.vector2,
                        buffer.vector2
                )
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = RECT2.ordinal
                any as Rect2
                buffer.vector2 = any._position
                buffer.vector2 = any._size
            }
    ),
    VECTOR3(
            { buffer: ByteBuffer ->
                Vector3(buffer.float.toRealT(), buffer.float.toRealT(), buffer.float.toRealT())
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = VECTOR3.ordinal
                buffer.vector3 = any as Vector3
            }
    ),
    TRANSFORM2D(
            { buffer: ByteBuffer ->
                val x = buffer.vector2
                val y = buffer.vector2
                val origin = buffer.vector2
                Transform2D(x, y, origin)
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = TRANSFORM2D.ordinal
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
                buffer.variantType = PLANE.ordinal
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
                buffer.variantType = QUAT.ordinal
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
                buffer.variantType = AABB.ordinal
                any as godot.core.AABB
                buffer.vector3 = any._position
                buffer.vector3 = any._size
            }
    ),
    BASIS(
            { buffer: ByteBuffer ->
                buffer.basis
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = BASIS.ordinal
                buffer.basis = any as Basis
            }
    ),
    TRANSFORM(
            { buffer: ByteBuffer ->
                val basis = buffer.basis
                val origin = buffer.vector3
                Transform(basis, origin)
            },
            { buffer: ByteBuffer, any: Any ->
                buffer.variantType = TRANSFORM.ordinal
                any as Transform
                buffer.basis = any._basis
                buffer.vector3 = any._origin
            }
    ),

    // misc types
    COLOR(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    NODE_PATH(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 15
    _RID(
            { buffer: ByteBuffer ->
                TODO()
            },
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
                buffer.variantType = OBJECT.ordinal
                any as KtObject
                buffer.putLong(any.rawPtr)
                buffer.bool = any.isRef
            }
    ),
    DICTIONARY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    ARRAY(
            { buffer: ByteBuffer ->
                // TODO: Placeholder for now, should be replaced when VariantArray is properly implemented.
                VariantArray<Unit>()
            },
            { buffer: ByteBuffer, any: Any ->
                // TODO: Placeholder for now, should be replaced when VariantArray is properly implemented.
                buffer.variantType = ARRAY.ordinal
                Unit
            }
    ),

    // arrays
    POOL_BYTE_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 20
    POOL_INT_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_REAL_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_STRING_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_VECTOR2_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),
    POOL_VECTOR3_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ), // 25
    POOL_COLOR_ARRAY(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
    ),

    VARIANT_MAX(
            { buffer: ByteBuffer ->
                TODO()
            },
            { buffer: ByteBuffer, any: Any -> TODO() }
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

    ANY(
            { buffer: ByteBuffer ->
                throw kotlin.Error()
            },
            { buffer: ByteBuffer, any: Any ->
                when (any) {
                    is Unit -> NIL.toGodotWithoutNullCheck(buffer, any)
                    is Boolean -> BOOL.toGodotWithoutNullCheck(buffer, any)
                    is Int -> JVM_INT.toGodotWithoutNullCheck(buffer, any)
                    is Long -> LONG.toGodotWithoutNullCheck(buffer, any)
                    is Float -> JVM_FLOAT.toGodotWithoutNullCheck(buffer, any)
                    is Double -> DOUBLE.toGodotWithoutNullCheck(buffer, any)
                    is String -> STRING.toGodotWithoutNullCheck(buffer, any)
                    is KtObject -> OBJECT.toGodotWithoutNullCheck(buffer, any)
                    else -> throw UnsupportedOperationException("Can't convert type ${any::class} to Variant")
                }
            }
    );

    constructor(
            originalVariantType: VariantType,
            toKotlinConverter: (Any) -> Any,
            toGodotConverter: (Any) -> Any
    ) : this(
            { buffer: ByteBuffer ->
                toKotlinConverter(originalVariantType.toKotlinWithoutNullCheck(buffer))
            },
            { buffer: ByteBuffer, any: Any -> originalVariantType.toGodotWithoutNullCheck(buffer, toGodotConverter(any)) }
    )

    internal val toGodot = { buffer: ByteBuffer, any: Any? ->
        if (any == null) {
            NIL.toGodotWithoutNullCheck(buffer, Unit)
        } else {
            toGodotWithoutNullCheck(buffer, any)
        }
    }

    internal val toKotlin = { buffer: ByteBuffer ->
        if (buffer.isReceivedNull()) null else toKotlinWithoutNullCheck(buffer)
    }
}
