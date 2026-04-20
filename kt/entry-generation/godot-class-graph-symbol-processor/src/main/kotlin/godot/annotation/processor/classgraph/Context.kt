package godot.annotation.processor.classgraph

import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
        private set

    val mappedClazzByFqName = mutableMapOf<String, Clazz>()
    val mappedTypeByKey = mutableMapOf<TypeCacheKey, Type>()
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()
    val hierarchyMethodSignaturesByClass = mutableMapOf<String, Set<String>>()
    val classInfoByName = mutableMapOf<String, ClassInfo?>()
    val extendsClassByKey = mutableMapOf<ExtendsClassCacheKey, Boolean>()

    fun reset(scanResult: ScanResult) {
        this.scanResult = scanResult
        mappedClazzByFqName.clear()
        mappedTypeByKey.clear()
        enumValueNamesByClass.clear()
        hierarchyMethodSignaturesByClass.clear()
        classInfoByName.clear()
        extendsClassByKey.clear()
    }

    fun getClassInfoOrNull(fqName: String): ClassInfo? = classInfoByName.getOrPut(fqName) {
        scanResult.getClassInfo(fqName)
    }
}

data class TypeCacheKey(
    val fqName: String,
    val typeArgumentDescriptors: List<String>
)

data class ExtendsClassCacheKey(
    val classFqName: String,
    val superClassFqName: String
)
