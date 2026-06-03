package godot.core

interface GodotEnum {
    val value: Long
}

val Enum<*>.godotValue: Long
    get() {
        return if (this is GodotEnum) {
            this.value
        } else {
            this.ordinal.toLong()
        }
    }

inline fun <reified T : Enum<T>> Long.toEnum(): T {
    return requireNotNull(enumValues<T>().firstOrNull { it.godotValue == this }) {
        "No enum entry with godotValue $this found in ${T::class.qualifiedName} with entries: [${enumValues<T>().joinToString()}]"
    }
}
