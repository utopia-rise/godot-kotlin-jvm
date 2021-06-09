package godot.core

import godot.core.VariantType.*
import godot.core.VariantType.AABB
import godot.util.toRealT
import java.nio.ByteBuffer


val variantMapper = mutableMapOf(
        Unit::class to NIL,
        Any::class to ANY,
        Boolean::class to BOOL,
        Int::class to JVM_INT,
        Long::class to LONG,
        Float::class to JVM_FLOAT,
        Byte::class to JVM_BYTE,
        Double::class to DOUBLE,
        String::class to STRING,
        godot.core.AABB::class to AABB,
        Basis::class to BASIS,
        Color::class to COLOR,
        Dictionary::class to DICTIONARY,
        VariantArray::class to ARRAY,
        Plane::class to PLANE,
        NodePath::class to NODE_PATH,
        Quat::class to QUAT,
        Rect2::class to RECT2,
        RID::class to _RID,
        Transform::class to TRANSFORM,
        Transform2D::class to TRANSFORM2D,
        Vector2::class to VECTOR2,
        Vector3::class to VECTOR3,
        PoolByteArray::class to POOL_BYTE_ARRAY,
        PoolColorArray::class to POOL_COLOR_ARRAY,
        PoolIntArray::class to POOL_INT_ARRAY,
        PoolRealArray::class to POOL_REAL_ARRAY,
        PoolStringArray::class to POOL_STRING_ARRAY,
        PoolVector2Array::class to POOL_VECTOR2_ARRAY,
        PoolVector3Array::class to POOL_VECTOR3_ARRAY
)

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

inline fun <reified T> Any.asObject(): T = this as T

@Suppress("EnumEntryName")
enum class VariantType(
        private val toKotlinWithoutNullCheck: (ByteBuffer, expectedType: Int) -> Any,
        private val toGodotWithoutNullCheck: (ByteBuffer, any: Any) -> Unit,
) {
    NIL(
            { _: ByteBuffer, _: Int ->
                Unit
            },
            { buffer: ByteBuffer, _: Any ->
                buffer.variantType = NIL.ordinal
            }
    ),

    // atomic types
    BOOL(
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
            { buffer: ByteBuffer, _: Int ->
                val isLong = buffer.bool
                if(isLong){
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
                if(stringBytes.size > LongStringQueue.stringMaxSize){
                    buffer.bool = true
                    LongStringQueue.sendStringToCPP(any)
                }
                else{
                    buffer.bool = false
                    buffer.putInt(stringBytes.size)
                    buffer.put(stringBytes)
                }
            }
    ),

    // math types

    VECTOR2(
            { buffer: ByteBuffer, _: Int ->
                buffer.vector2
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is Vector2)
                buffer.variantType = VECTOR2.ordinal
                buffer.vector2 = any
            }
    ), // 5
    RECT2(
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
    VECTOR3(
            { buffer: ByteBuffer, _: Int ->
                Vector3(buffer.float.toRealT(), buffer.float.toRealT(), buffer.float.toRealT())
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is Vector3)
                buffer.variantType = VECTOR3.ordinal
                buffer.vector3 = any
            }
    ),
    TRANSFORM2D(
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
    PLANE(
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
    QUAT(
            { buffer: ByteBuffer, _: Int ->
                val x = buffer.float.toRealT()
                val y = buffer.float.toRealT()
                val z = buffer.float.toRealT()
                val w = buffer.float.toRealT()

                Quat(x, y, z, w)
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is Quat)
                buffer.variantType = QUAT.ordinal
                buffer.putFloat(any.x.toFloat())
                buffer.putFloat(any.y.toFloat())
                buffer.putFloat(any.z.toFloat())
                buffer.putFloat(any.w.toFloat())
            }
    ), // 10
    AABB(
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
            { buffer: ByteBuffer, _: Int ->
                buffer.basis
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is Basis)
                buffer.variantType = BASIS.ordinal
                buffer.basis = any
            }
    ),
    TRANSFORM(
            { buffer: ByteBuffer, _: Int ->
                val basis = buffer.basis
                val origin = buffer.vector3
                Transform(basis, origin)
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is Transform)
                buffer.variantType = TRANSFORM.ordinal
                buffer.basis = any._basis
                buffer.vector3 = any._origin
            }
    ),

    // misc types
    COLOR(
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
    NODE_PATH(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                GarbageCollector.getNativeCoreTypeInstance(ptr) ?: NodePath(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                NODE_PATH.toGodotNativeCoreType<NodePath>(buffer, any)
            }
    ), // 15
    _RID(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                GarbageCollector.getNativeCoreTypeInstance(ptr) ?: RID(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                _RID.toGodotNativeCoreType<RID>(buffer, any)
            }
    ),
    OBJECT(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                val constructorIndex = buffer.int
                val isRef = buffer.bool
                val id = buffer.long

                val existingInstance = if (isRef) {
                    GarbageCollector.getRefInstance(id.toInt())
                } else {
                    GarbageCollector.getObjectInstance(ptr, id)
                }

                existingInstance ?: KtObject.instantiateWith(
                    ptr,
                    id,
                    TypeManager.engineTypesConstructors[constructorIndex])
            },
            { buffer: ByteBuffer, any: Any ->
                require(any is KtObject)
                buffer.variantType = OBJECT.ordinal
                buffer.putLong(any.rawPtr)
                buffer.bool = any.____DO_NOT_TOUCH_THIS_isRef____()
            }
    ),
    DICTIONARY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                GarbageCollector.getNativeCoreTypeInstance(ptr) ?: Dictionary<Any, Any?>(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                DICTIONARY.toGodotNativeCoreType<Dictionary<*, *>>(buffer, any)
            }
    ),
    ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                GarbageCollector.getNativeCoreTypeInstance(ptr) ?: VariantArray<Any?>(ptr)
            },
        { buffer: ByteBuffer, any: Any ->
            ARRAY.toGodotNativeCoreType<VariantArray<*>>(buffer, any)
        }
    ),

    // arrays
    POOL_BYTE_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolByteArray(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_BYTE_ARRAY.toGodotNativeCoreType<PoolByteArray>(buffer, any)
            }
    ), // 20
    POOL_INT_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolIntArray(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_INT_ARRAY.toGodotNativeCoreType<PoolIntArray>(buffer, any)
            }
    ),
    POOL_REAL_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolRealArray(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_REAL_ARRAY.toGodotNativeCoreType<PoolRealArray>(buffer, any)
            }
    ),
    POOL_STRING_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolStringArray(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_STRING_ARRAY.toGodotNativeCoreType<PoolStringArray>(buffer, any)
            }
    ),
    POOL_VECTOR2_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolVector2Array(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_VECTOR2_ARRAY.toGodotNativeCoreType<PoolVector2Array>(buffer, any)
            }
    ),
    POOL_VECTOR3_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolVector3Array(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_VECTOR3_ARRAY.toGodotNativeCoreType<PoolVector3Array>(buffer, any)
            }
    ), // 25
    POOL_COLOR_ARRAY(
            { buffer: ByteBuffer, _: Int ->
                val ptr = buffer.long
                PoolColorArray(ptr)
            },
            { buffer: ByteBuffer, any: Any ->
                POOL_COLOR_ARRAY.toGodotNativeCoreType<PoolColorArray>(buffer, any)
            }
    ),

    VARIANT_MAX(
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
                    is Rect2 -> RECT2.toGodotWithoutNullCheck(buffer, any)
                    is Vector3 -> VECTOR3.toGodotWithoutNullCheck(buffer, any)
                    is Transform2D -> TRANSFORM2D.toGodotWithoutNullCheck(buffer, any)
                    is Plane -> PLANE.toGodotWithoutNullCheck(buffer, any)
                    is Quat -> QUAT.toGodotWithoutNullCheck(buffer, any)
                    is godot.core.AABB -> AABB.toGodotWithoutNullCheck(buffer, any)
                    is Basis -> BASIS.toGodotWithoutNullCheck(buffer, any)
                    is Transform -> TRANSFORM.toGodotWithoutNullCheck(buffer, any)
                    is Color -> COLOR.toGodotWithoutNullCheck(buffer, any)
                    is NodePath -> NODE_PATH.toGodotWithoutNullCheck(buffer, any)
                    is RID -> _RID.toGodotWithoutNullCheck(buffer, any)
                    is VariantArray<*> -> ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is Dictionary<*, *> -> DICTIONARY.toGodotWithoutNullCheck(buffer, any)
                    is PoolByteArray -> POOL_BYTE_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolIntArray -> POOL_INT_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolRealArray -> POOL_REAL_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolStringArray -> POOL_STRING_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolVector2Array -> POOL_VECTOR2_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolVector3Array -> POOL_VECTOR3_ARRAY.toGodotWithoutNullCheck(buffer, any)
                    is PoolColorArray -> POOL_COLOR_ARRAY.toGodotWithoutNullCheck(buffer, any)
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

fun VariantType.getToKotlinLambdaToExecute(defaultLambda: (ByteBuffer, Int) -> Any?) : (ByteBuffer, Boolean) -> Any? {
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

private inline fun <reified T: NativeCoreType> VariantType.toGodotNativeCoreType(buffer: ByteBuffer, any: Any) {
    require(any is T)
    buffer.variantType = ordinal
    buffer.putLong(any._handle)
}

private const val ANY_VARIANT_TYPE = 31
