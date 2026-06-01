package godot.annotation.processor.classgraph.shape

import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo

class KotlinShapeResolver : JvmShapeResolver {
    override fun supports(classInfo: ClassInfo): Boolean = classInfo.hasAnnotation("kotlin.Metadata")

    override fun getterName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        if (fieldInfo.isKotlinBooleanIsProperty()) fieldInfo.name else "get${fieldInfo.capitalizedName()}"

    override fun setterName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        if (fieldInfo.isKotlinBooleanIsProperty()) {
            "set${fieldInfo.name.removePrefix("is")}"
        } else {
            "set${fieldInfo.capitalizedName()}"
        }

    override fun syntheticAnnotationMethodName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        "${getterName(fieldInfo, owner)}\$annotations"
}
