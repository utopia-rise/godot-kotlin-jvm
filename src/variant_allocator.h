#ifndef GODOT_JVM_VARIANT_ALLOCATOR_H
#define GODOT_JVM_VARIANT_ALLOCATOR_H

#include <core/templates/paged_allocator.h>
#include <core/variant/variant.h>

class VariantAllocator {
    union BucketSmall {
        BucketSmall() {}
        ~BucketSmall() {}

        StringName string_name;
        NodePath node_path;
        Array array;
        Dictionary dictionary;
    };

    union BucketLarge {
        BucketLarge() {}
        ~BucketLarge() {}

        Callable callable;
        PackedByteArray byte_array;
        PackedColorArray color_array;
        PackedInt32Array int32_array;
        PackedInt64Array int64_array;
        PackedFloat32Array float_array;
        PackedFloat64Array double_array;
        PackedVector2Array vector2_array;
        PackedVector3Array vector3_array;
        PackedVector4Array vector4_array;
        PackedStringArray string_array;
    };

    static_assert(sizeof(BucketSmall) <= 8, "BucketSmall should have at most a size of 8 bytes");
    static_assert(sizeof(BucketLarge) <= 16, "BucketLarge should have at most a size of 16 bytes");
    static_assert(sizeof(BucketSmall) < sizeof(BucketLarge), "BucketLarge should be larger than BucketSmall");

    inline static PagedAllocator<BucketSmall, true> bucket_small;
    inline static PagedAllocator<BucketLarge, true> bucket_large;

public:
    template<typename T>
    static T* alloc(T&& variant) {
        // Trigger compile-time error if T is larger than 16 bytes
        static_assert(sizeof(T) <= sizeof(BucketLarge), "Variant doesn't fit inside the VariantAllocator");

        T* ret;
        if constexpr (sizeof(T) <= sizeof(BucketSmall)) {
            ret = reinterpret_cast<T*>(bucket_small.alloc());
        } else {
            ret = reinterpret_cast<T*>(bucket_large.alloc());
        }
        memnew_placement(ret, T(variant));
        return ret;
    }

    template<typename T>
    static void free(T* variant) {
        // Trigger compile-time error if T is larger than 16 bytes
        static_assert(sizeof(T) <= sizeof(BucketLarge), "Variant doesn't fit inside the VariantAllocator");

        variant->~T();
        if constexpr (sizeof(T) <= sizeof(BucketSmall)) {
            bucket_small.free(reinterpret_cast<BucketSmall*>(variant));
        } else {
            bucket_large.free(reinterpret_cast<BucketLarge*>(variant));
        }
    }
};

#endif // GODOT_JVM_VARIANT_ALLOCATOR_H
