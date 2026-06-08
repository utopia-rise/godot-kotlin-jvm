package godot.annotation.processor.classgraph.shape

import godot.annotation.processor.classgraph.extensions.returnRawDescriptor
import godot.registration.model.types.TYPE_BOOLEAN
import godot.registration.model.types.TYPE_BOXED_BOOLEAN
import godot.registration.model.types.TYPE_VOID
import io.github.classgraph.ClassInfo
import io.github.classgraph.MethodInfo

class JavaJvmLanguage : JvmLanguage() {
    /**
     * Java is checked last and matches only `.java` source files.
     *
     * This keeps language detection symmetric with Kotlin and Scala and avoids misclassifying classes whose
     * annotations come from Kotlin-compiled annotation types.
     */
    override fun supports(classInfo: ClassInfo): Boolean = classInfo.sourceFile?.endsWith(".java") == true

    /** Ignores plain Object-style methods unless the user explicitly annotated them. */
    override fun filterMethods(methods: List<MethodInfo>, classInfo: ClassInfo): List<MethodInfo> =
        super.filterMethods(methods, classInfo).filterNot { methodInfo ->
            methodInfo.annotationInfo.isEmpty() &&
                methodInfo.name in unannotatedObjectMethods
        }

    /** Uses standard JavaBean getter/setter conventions, including boolean `isFoo` getters. */
    override fun propertyAccessorsOf(methodInfo: MethodInfo, classInfo: ClassInfo): List<PropertyAccessor> = when {
        methodInfo.parameterInfo.isEmpty() && methodInfo.returnRawDescriptor() != TYPE_VOID ->
            when {
                methodInfo.name.startsWith("get") && methodInfo.name.length > 3 ->
                    listOf(PropertyAccessor.Getter(methodInfo.name.removePrefix("get").decapitalized()))
                methodInfo.name.startsWith("is") &&
                    methodInfo.name.length > 2 &&
                    methodInfo.returnRawDescriptor() in booleanDescriptors ->
                    listOf(PropertyAccessor.Getter(methodInfo.name.removePrefix("is").decapitalized()))
                else -> emptyList()
            }
        methodInfo.parameterInfo.size == 1 &&
            methodInfo.returnRawDescriptor() == TYPE_VOID &&
            methodInfo.name.startsWith("set") &&
            methodInfo.name.length > 3 ->
            listOf(PropertyAccessor.Setter(methodInfo.name.removePrefix("set").decapitalized()))
        else -> emptyList()
    }

    private companion object {
        val unannotatedObjectMethods = setOf("equals", "hashCode", "toString")
        val booleanDescriptors = setOf(TYPE_BOOLEAN, TYPE_BOXED_BOOLEAN)
    }
}

private fun String.decapitalized(): String =
    replaceFirstChar(Char::lowercaseChar)
