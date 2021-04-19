package godot.entrygenerator.extension

fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z0-9])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }
}

fun String.isGodotPrimitive() =
    when (this) {
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Float",
        "kotlin.Double",
        "kotlin.Boolean",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.String" -> true
        else -> false
    }

fun String.getAsVariantTypeOrdinal() =
    when (this) {
        "kotlin.Boolean" -> "1"
        "kotlin.Int",
        "kotlin.Long",
        "kotlin.Byte",
        "kotlin.Short",
        "kotlin.Enum" -> "2"
        "kotlin.Float",
        "kotlin.Double" -> "3"
        "kotlin.String" -> "4"
        "godot.core.Vector2" -> "5"
        "godot.core.Rect2" -> "6"
        "godot.core.Vector3" -> "7"
        "godot.core.Transform2D" -> "8"
        "godot.core.Plane" -> "9"
        "godot.core.Quat" -> "10"
        "godot.core.AABB" -> "11"
        "godot.core.Basis" -> "12"
        "godot.core.Transform" -> "13"
        "godot.core.Color" -> "14"
        "godot.core.NodePath" -> "15"
        "godot.core.RID" -> "16"
        "godot.core.OBJECT" -> "17"
        "godot.core.Dictionary" -> "18"
        //Array -> handled in else branch
        "godot.core.PoolByteArray" -> "20"
        "godot.core.PoolIntArray" -> "21"
        "godot.core.PoolRealArray" -> "22"
        "godot.core.PoolStringArray" -> "23"
        "godot.core.PoolColorArray" -> "24"
        "godot.core.PoolVector2Array" -> "25"
        "godot.core.PoolVector3Array" -> "26"
        else -> if (this.isCompatibleListType()) {
            "19"
        } else {
            null
        }
    }

fun String.isCompatibleListType(): Boolean {
    return this.getCompatibleListType().isNotEmpty()
}

fun String.getCompatibleListType(): String {
    return when (this) {
        "godot.core.BoolVariantArray" -> "1"
        "godot.core.EnumArray",
        "godot.core.IntVariantArray" -> "2"
        "godot.core.RealVariantArray" -> "3"
        "godot.core.StringVariantArray" -> "4"
        "godot.core.Vector2Array" -> "5"
        "godot.core.Rect2Array" -> "6"
        "godot.core.Vector3Array" -> "7"
        "godot.core.Transform2DArray" -> "8"
        "godot.core.PlaneArray" -> "9"
        "godot.core.QuatArray" -> "10"
        "godot.core.AABBArray" -> "11"
        "godot.core.BasisArray" -> "12"
        "godot.core.TransformArray" -> "13"
        "godot.core.ColorArray" -> "14"
        "godot.core.NodePathArray" -> "15"
        "godot.core.RIDArray" -> "16"
        "godot.core.ObjectArray",
        "godot.core.CoreArray" -> "17"
        else -> ""
    }
}
