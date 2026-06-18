package godot.annotation.processor.classgraph.shape

import godot.annotation.processor.classgraph.extensions.returnRawDescriptor
import godot.registration.model.types.TYPE_VOID
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

class ScalaJvmLanguage : JvmLanguage() {
    /** Scala classes are identified from the original source file extension emitted in class debug metadata. */
    override fun supports(classInfo: ClassInfo): Boolean = classInfo.sourceFile?.endsWith(".scala") == true

    /** Removes singleton/module and offset fields synthesized by the Scala compiler. */
    override fun filterFields(fields: List<FieldInfo>, classInfo: ClassInfo): List<FieldInfo> =
        fields.filterNot { fieldInfo ->
            fieldInfo.name.startsWith("OFFSET$") ||
                fieldInfo.name == "MODULE$"
        }

    /** Scala lazy vals add a `$lzy` marker to their backing field name. */
    override fun logicalFieldName(fieldInfo: FieldInfo): String {
        val lazyMarkerIndex = fieldInfo.name.indexOf($$"$lzy")
        return if (lazyMarkerIndex > 0) {
            fieldInfo.name.substring(0, lazyMarkerIndex)
        } else {
            fieldInfo.name
        }
    }

    /** Removes Scala compiler helpers for case classes, defaults, lazy vals, and extension encoding. */
    override fun filterMethods(methods: List<MethodInfo>, classInfo: ClassInfo): List<MethodInfo> =
        super.filterMethods(methods, classInfo).filterNot { methodInfo ->
            val name = methodInfo.name
            name == $$"$init$" ||
                name == "writeReplace" ||
                name.endsWith($$"$extension") ||
                name.contains($$"$default$") ||
                name.contains($$"$_setter_$") ||
                name.endsWith($$"$lzyINIT1") ||
                (methodInfo.annotationInfo.isEmpty() && name in unannotatedCaseClassMethods) ||
                (methodInfo.annotationInfo.isEmpty() && (name.startsWith("product") || name.isScalaComponentMethod()))
        }

    /** Scala properties compile to a no-arg getter and an optional `name_$eq` setter. */
    override fun propertyAccessorsOf(methodInfo: MethodInfo, classInfo: ClassInfo): List<PropertyAccessor> = when {
        methodInfo.parameterInfo.isEmpty() && methodInfo.returnRawDescriptor() != TYPE_VOID ->
            listOf(PropertyAccessor.Getter(methodInfo.name))

        methodInfo.parameterInfo.size == 1 &&
            methodInfo.returnRawDescriptor() == TYPE_VOID &&
            methodInfo.name.endsWith($$"_$eq") ->
            listOf(PropertyAccessor.Setter(methodInfo.name.removeSuffix($$"_$eq")))

        else -> emptyList()
    }

    private val unannotatedCaseClassMethods = setOf(
        "apply",
        "unapply",
        "fromProduct",
        "copy",
        "canEqual",
        "equals",
        "hashCode",
        "toString",
    )
}

private fun String.isScalaComponentMethod(): Boolean {
    if (length < 2 || this[0] != '_') {
        return false
    }
    for (index in 1 until length) {
        if (!this[index].isDigit()) {
            return false
        }
    }
    return true
}
