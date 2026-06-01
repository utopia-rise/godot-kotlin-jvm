package godot.annotation.processor.classgraph.shape

import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo

class JavaShapeResolver : JvmShapeResolver {
    override fun supports(classInfo: ClassInfo): Boolean = classInfo.sourceFile.endsWith(".java")

    override fun getterName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        if (fieldInfo.isKotlinBooleanIsProperty()) fieldInfo.name else "get${fieldInfo.capitalizedName()}"

    override fun setterName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        if (fieldInfo.isKotlinBooleanIsProperty()) {
            "set${fieldInfo.name.removePrefix("is")}"
        } else {
            "set${fieldInfo.capitalizedName()}"
        }
}
