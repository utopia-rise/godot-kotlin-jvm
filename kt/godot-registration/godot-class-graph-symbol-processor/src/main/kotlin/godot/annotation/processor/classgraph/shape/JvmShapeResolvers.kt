package godot.annotation.processor.classgraph.shape

import godot.annotation.processor.classgraph.exceptions.LanguageNotIdentified
import io.github.classgraph.ClassInfo

class JvmShapeResolvers(
    private val resolvers: List<JvmShapeResolver> = listOf(
        ScalaShapeResolver(),
        JavaShapeResolver(),
        KotlinShapeResolver(),
    ),
) {
    fun forClass(classInfo: ClassInfo): JvmShapeResolver =
        resolvers.firstOrNull { resolver -> resolver.supports(classInfo) }
            ?: throw LanguageNotIdentified(classInfo)
}
