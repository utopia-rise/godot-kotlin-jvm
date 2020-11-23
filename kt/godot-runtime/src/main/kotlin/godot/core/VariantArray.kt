package godot.core

import kotlin.reflect.KClass


val variantMapper: Map<KClass<*>, VariantType> = mapOf(
        Unit::class to VariantType.NIL,
        Any::class to VariantType.ANY,
        Boolean::class to VariantType.BOOL,
        Int::class to VariantType.JVM_INT,
        Long::class to VariantType.LONG,
        Float::class to VariantType.JVM_FLOAT,
        Double::class to VariantType.DOUBLE,
        String::class to VariantType.STRING,
        AABB::class to VariantType.AABB,
        Basis::class to VariantType.BASIS,
        Color::class to VariantType.COLOR,
//        Dictionary::class to VariantType.DICTIONARY,
//        GodotArray::class to VariantType.ARRAY,
        Plane::class to VariantType.PLANE,
//        NodePath::class to VariantType.NODE_PATH,
        Quat::class to VariantType.QUAT,
        Rect2::class to VariantType.RECT2,
//        RID::class to VariantType.RID,
        Transform::class to VariantType.TRANSFORM,
        Transform2D::class to VariantType.TRANSFORM2D,
        Vector2::class to VariantType.VECTOR2,
        Vector3::class to VariantType.VECTOR3,
//        PoolByteArray::class to VariantType.POOL_BYTE_ARRAY,
//        PoolColorArray::class to VariantType.POOL_COLOR_ARRAY,
//        PoolIntArray::class to VariantType.POOL_INT_ARRAY,
//        PoolRealArray::class to VariantType.POOL_REAL_ARRAY,
//        PoolStringArray::class to VariantType.POOL_STRING_ARRAY,
//        PoolVector2Array::class to VariantType.POOL_VECTOR2_ARRAY,
//        PoolVector3Array::class to VariantType.POOL_VECTOR3_ARRAY,
)

class VariantArray<T : Any?>(val variantType: VariantType) : NativeCoreType {

    fun add(any: T) {
        TransferContext.writeArguments(variantType to any)
        TODO()
    }

    fun get(): T {
        //TODO
        return TransferContext.readReturnValue(variantType) as T
    }
}

inline fun <reified T> VariantArray() =
        VariantArray<T>(
                variantMapper[T::class]
                ?: throw UnsupportedOperationException("Can't create a VariantArray with generic ${T::class}.")
        )

fun variantArrayOf(vararg args: Any?) = VariantArray<Any?>()