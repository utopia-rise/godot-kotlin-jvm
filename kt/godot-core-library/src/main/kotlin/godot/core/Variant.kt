package godot.core

import godot.Object
import godot.common.interop.ObjectID
import godot.common.interop.VariantConverter
import godot.common.interop.nullptr
import godot.common.util.toRealT
import godot.internal.memory.LongStringQueue
import java.nio.ByteBuffer

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

private var ByteBuffer.stringName: Any
    get() {
        val ptr = long
        return StringName(ptr)
    }
    set(value) {
        toGodotNativeCoreType<StringName>(this, value)
    }

private var ByteBuffer.obj: KtObject?
    get() {
        val constructorIndex = int
        val ptr = long
        val id = long

        if (ptr == nullptr) {
            return null
        }

        return KtObject.getOrCreate(ptr, ObjectID(id), constructorIndex)
    }
    set(value) {
        putLong(value?.ptr ?: nullptr)
    }

private var ByteBuffer.variantType: Int
    get() = int
    set(value) {
        putInt(value)
    }

enum class VariantParser(override val id: Int) : VariantConverter {
    NIL(0) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Unit
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {}
    },

    // atomic types
    BOOL(1) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.bool
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Boolean)
            buffer.bool = any
        }
    },
    LONG(2) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.long
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Long)
            buffer.putLong(any)
        }
    },
    DOUBLE(3) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.double
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Double)
            buffer.putDouble(any)
        }
    },
    STRING(4) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): String {
            val isLong = buffer.bool
            return if (isLong) {
                LongStringQueue.pollString()
            } else {
                /**
                 *  A CString is read from the buffer, they all end with a 0 character except if the String is empty
                 *  "" has a size of 0, but "a" has a size of 2.
                 *  We only read the buffer if the size is superior to 0.
                 *  When it's the case, we create a string without the last 0 character.
                 */
                val stringSize = buffer.int
                if (stringSize == 0) {
                    String()
                } else {
                    val charArray = ByteArray(stringSize)
                    buffer.get(charArray, 0, stringSize)
                    String(charArray, 0, stringSize - 1, Charsets.UTF_8)
                }
            }
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is String)
            val stringBytes = any.encodeToByteArray()
            if (stringBytes.size > LongStringQueue.stringMaxSize) {
                buffer.bool = true
                LongStringQueue.sendStringToCPP(any)
            } else {
                buffer.bool = false
                buffer.putInt(stringBytes.size)
                buffer.put(stringBytes)
            }
        }
    },

    // math types
    VECTOR2(5) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector2
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector2)
            buffer.vector2 = any
        }
    },
    VECTOR2I(6) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector2i
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector2i)
            buffer.vector2i = any
        }
    },
    RECT2(7) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Rect2(
            buffer.vector2,
            buffer.vector2
        )

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Rect2)
            buffer.vector2 = any._position
            buffer.vector2 = any._size
        }
    },
    RECT2I(8) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Rect2i(
            buffer.vector2i,
            buffer.vector2i
        )

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Rect2i)
            buffer.vector2i = any._position
            buffer.vector2i = any._size
        }
    },
    VECTOR3(9) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector3
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector3)
            buffer.vector3 = any
        }
    },
    VECTOR3I(10) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector3i
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector3i)
            buffer.vector3i = any
        }
    },
    TRANSFORM2D(11) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Transform2D {
            val x = buffer.vector2
            val y = buffer.vector2
            val origin = buffer.vector2
            return Transform2D(x, y, origin)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Transform2D)
            buffer.vector2 = any._x
            buffer.vector2 = any._y
            buffer.vector2 = any.origin
        }
    },
    VECTOR4(12) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector4
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector4)
            buffer.vector4 = any
        }
    },
    VECTOR4I(13) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.vector4i
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Vector4i)
            buffer.vector4i = any
        }
    },
    PLANE(14) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Plane {
            val normal = buffer.vector3
            val d = buffer.float.toRealT()
            return Plane(normal, d)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Plane)
            buffer.vector3 = any._normal
            buffer.putFloat(any.d.toFloat())
        }
    },
    QUATERNION(15) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Quaternion {
            val x = buffer.float.toRealT()
            val y = buffer.float.toRealT()
            val z = buffer.float.toRealT()
            val w = buffer.float.toRealT()

            return Quaternion(x, y, z, w)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Quaternion)
            buffer.putFloat(any.x.toFloat())
            buffer.putFloat(any.y.toFloat())
            buffer.putFloat(any.z.toFloat())
            buffer.putFloat(any.w.toFloat())
        }
    },
    AABB(16) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): godot.core.AABB {
            val position = buffer.vector3
            val size = buffer.vector3
            return AABB(position, size)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is godot.core.AABB)
            buffer.vector3 = any._position
            buffer.vector3 = any._size
        }
    },
    BASIS(17) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.basis
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Basis)
            buffer.basis = any
        }
    },
    TRANSFORM3D(18) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Transform3D {
            val basis = buffer.basis
            val origin = buffer.vector3
            return Transform3D(basis, origin)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Transform3D)
            buffer.basis = any._basis
            buffer.vector3 = any._origin
        }
    },
    PROJECTION(19) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Projection(
            buffer.vector4,
            buffer.vector4,
            buffer.vector4,
            buffer.vector4
        )

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Projection)
            buffer.vector4 = any._x
            buffer.vector4 = any._y
            buffer.vector4 = any._z
            buffer.vector4 = any._w
        }
    },

    // misc types
    COLOR(20) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Color(buffer.float, buffer.float, buffer.float, buffer.float)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Color)
            buffer.putFloat(any.r.toFloat())
            buffer.putFloat(any.g.toFloat())
            buffer.putFloat(any.b.toFloat())
            buffer.putFloat(any.a.toFloat())
        }
    },
    STRING_NAME(21) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.stringName
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is StringName)
            buffer.stringName = any
        }
    },
    NODE_PATH(22) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = NodePath(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) = toGodotNativeCoreType<NodePath>(buffer, any)
    },
    _RID(23) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = RID(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is RID)
            buffer.putLong(any.id)
        }
    },
    OBJECT(24) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = buffer.obj

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is KtObject?)
            buffer.obj = any
        }
    },
    CALLABLE(25) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Callable {
            val ptr = buffer.long
            return NativeCallable(ptr)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            if (any is NativeCallable) {
                buffer.bool = false
                buffer.putLong(any.ptr)
            } else {
                require(any is LambdaCallable<*>)
                buffer.bool = true
                buffer.putLong(any.wrapInCustomCallable())
            }
        }
    },
    SIGNAL(26) {
        override fun toUnsafeKotlin(buffer: ByteBuffer): Signal {
            val obj = buffer.obj
            val name = buffer.stringName
            require(obj is Object)
            require(name is StringName)
            return Signal(obj, name)
        }

        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) {
            require(any is Signal)
            buffer.obj = any.godotObject
            buffer.stringName = any.name
        }
    },
    DICTIONARY(27) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = Dictionary<Any, Any?>(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<Dictionary<Any, Any?>>(buffer, any)
    },
    ARRAY(28) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) : VariantArray<*>{
            val ptr = buffer.long
            val type = buffer.long
            // TODO: Use the type to create the correct VariantArray type. For now, we just use the less efficient but flexible Any type.
            return VariantArray<Any?>(ptr)
        }
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<VariantArray<Any?>>(buffer, any)
    },

    // PackedArray
    PACKED_BYTE_ARRAY(29) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedByteArray(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) = toGodotNativeCoreType<PackedByteArray>(buffer, any)
    },
    PACKED_INT_32_ARRAY(30) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedInt32Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) = toGodotNativeCoreType<PackedInt32Array>(buffer, any)
    },
    PACKED_INT_64_ARRAY(31) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedInt64Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) = toGodotNativeCoreType<PackedInt64Array>(buffer, any)
    },
    PACKED_FLOAT_32_ARRAY(32) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedFloat32Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedFloat32Array>(buffer, any)
    },
    PACKED_FLOAT_64_ARRAY(33) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedFloat64Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedFloat64Array>(buffer, any)
    },
    PACKED_STRING_ARRAY(34) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedStringArray(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedStringArray>(buffer, any)
    },
    PACKED_VECTOR2_ARRAY(35) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedVector2Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedVector2Array>(buffer, any)
    },
    PACKED_VECTOR3_ARRAY(36) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedVector3Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedVector3Array>(buffer, any)
    },
    PACKED_COLOR_ARRAY(37) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedColorArray(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) = toGodotNativeCoreType<PackedColorArray>(buffer, any)
    },
    PACKED_VECTOR4_ARRAY(38) {
        override fun toUnsafeKotlin(buffer: ByteBuffer) = PackedVector4Array(buffer.long)
        override fun toUnsafeGodot(buffer: ByteBuffer, any: Any?) =
            toGodotNativeCoreType<PackedVector4Array>(buffer, any)
    };

    override fun toKotlin(buffer: ByteBuffer): Any? {
        val idInBuffer = buffer.variantType
        if (idInBuffer == id) {
            return toUnsafeKotlin(buffer)
        } else if(id == OBJECT.id && idInBuffer == NIL.id) {
            // Godot can sometimes send null pointer as NIL variant, so we need to test for that case.
            return null
        }
        throw TypeCastException(
            "Shared Buffer Error: JVM expected a ${this::class.simpleName} but received a ${
                VariantParser.from(
                    idInBuffer.toLong()
                )
            }."
        )
    }

    override fun toGodot(buffer: ByteBuffer, any: Any?) {
        buffer.variantType = id
        toUnsafeGodot(buffer, any)
    }

    abstract fun toUnsafeKotlin(buffer: ByteBuffer): Any?
    abstract fun toUnsafeGodot(buffer: ByteBuffer, any: Any?)

    companion object {
        fun from(value: Long) = entries[value.toInt()]
    }
}

//TODO: Unify VariantCaster with Meta in the API gen + use it in entry gen. Or maybe get rid of it and just have both with their own solution.
sealed class VariantCaster(val coreVariant: VariantParser) : VariantConverter {
    override val id by coreVariant::id

    sealed class VariantSimpleCaster(coreVariant: VariantParser) : VariantCaster(coreVariant) {
        override fun toKotlin(buffer: ByteBuffer) = toKotlinCast(coreVariant.toKotlin(buffer))
        override fun toGodot(buffer: ByteBuffer, any: Any?) = coreVariant.toGodot(buffer, toGodotCast(any))

        abstract fun toKotlinCast(any: Any?): Any?
        abstract fun toGodotCast(any: Any?): Any?
    }

    data object BYTE : VariantSimpleCaster(VariantParser.LONG) {
        override fun toKotlinCast(any: Any?) = (any as Long).toByte()
        override fun toGodotCast(any: Any?) = (any as Byte).toLong()
    }

    data object INT : VariantSimpleCaster(VariantParser.LONG) {
        override fun toKotlinCast(any: Any?) = (any as Long).toInt()
        override fun toGodotCast(any: Any?) = (any as Int).toLong()
    }

    data object FLOAT : VariantSimpleCaster(VariantParser.DOUBLE) {
        override fun toKotlinCast(any: Any?) = (any as Double).toFloat()
        override fun toGodotCast(any: Any?) = (any as Float).toDouble()
    }

    // It can seem weird for ANY to have a NIL id, which is the opposite concept. But that's how Godot works.
    // Each parameter, property, or return type of Variant type actually uses a PropertyUsageFlag named NIL_IS_VARIANT.
    // https://docs.godotengine.org/en/stable/classes/class_%40globalscope.html#enum-globalscope-propertyusageflags
    data object ANY : VariantCaster(VariantParser.NIL) {
        override fun toKotlin(buffer: ByteBuffer): Any? {
            val expectedType = buffer.variantType
            return VariantParser.entries[expectedType].toUnsafeKotlin(buffer)
        }

        override fun toGodot(buffer: ByteBuffer, any: Any?) {
            if (any === null) {
                VariantParser.NIL.toGodot(buffer, null)
            } else {
                val type = variantMapper[any::class]
                    ?: throw UnsupportedOperationException("Can't convert type ${any::class} to Variant")
                type.toGodot(buffer, any)
            }
        }
    }
}

private inline fun <reified T : NativeCoreType> toGodotNativeCoreType(buffer: ByteBuffer, any: Any?) {
    require(any is T)
    buffer.putLong(any.ptr)
}

