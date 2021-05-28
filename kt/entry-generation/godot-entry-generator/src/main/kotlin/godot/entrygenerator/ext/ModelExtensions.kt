package godot.entrygenerator.ext

import godot.entrygenerator.model.GodotAnnotation
import godot.entrygenerator.model.GodotBaseTypeAnnotation
import kotlin.reflect.KClass

inline fun <reified T> Collection<GodotAnnotation>.hasAnnotation() = this.any {
    it is T
}

inline fun <reified T> Collection<GodotAnnotation>.getAnnotationUnsafe() = this.first {
    it is T
} as T

inline fun <reified T> Collection<GodotAnnotation>.getAnnotation() = this.firstOrNull {
    it is T
} as T?
