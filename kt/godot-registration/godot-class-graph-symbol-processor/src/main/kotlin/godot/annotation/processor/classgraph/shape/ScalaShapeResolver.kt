package godot.annotation.processor.classgraph.shape

import godot.annotation.processor.classgraph.extensions.fqName
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo

class ScalaShapeResolver : JvmShapeResolver {
    override fun supports(classInfo: ClassInfo): Boolean = classInfo.sourceFile.endsWith(".scala")

    override fun getterName(fieldInfo: FieldInfo, owner: ClassInfo): String = fieldInfo.name

    override fun setterName(fieldInfo: FieldInfo, owner: ClassInfo): String = "${fieldInfo.name}_\$eq"

    override fun propertyGetterFqName(fieldInfo: FieldInfo, owner: ClassInfo): String =
        getter(fieldInfo, owner).fqName.replace("$", ".")

    override fun propertySetterFqName(fieldInfo: FieldInfo, owner: ClassInfo): String {
        val fqName = setter(fieldInfo, owner).fqName
        val split = fqName.split("$")
        return "${split.dropLast(1).joinToString(".")}$${split.last()}"
    }

    override fun isFunctionReferenceSignal(fieldInfo: FieldInfo, owner: ClassInfo): Boolean = true
}
