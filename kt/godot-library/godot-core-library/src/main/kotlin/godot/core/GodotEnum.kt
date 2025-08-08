package godot.core

interface GodotEnum {
    val id: Long
}

val Enum<*>.godotOrdinal: Long
    get() {
        return if (this is GodotEnum) {
            this.id
        } else {
            this.ordinal.toLong()
        }
    }

inline fun <reified T : Enum<T>> enumFromGodotOrdinal(ordinal: Number): T {
    return requireNotNull(enumValues<T>().firstOrNull { it.godotOrdinal == ordinal.toLong() }) {
        "No enum entry with godotOrdinal $ordinal found in ${T::class.qualifiedName} with entries: [${enumValues<T>().joinToString()}]"
    }
}
