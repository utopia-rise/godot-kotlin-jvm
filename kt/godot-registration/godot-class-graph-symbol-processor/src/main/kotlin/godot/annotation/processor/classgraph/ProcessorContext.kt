package godot.annotation.processor.classgraph

import godot.registration.model.types.ScriptFamily
import godot.registration.model.types.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult

class ProcessorContext(
    val scanResult: ScanResult,
    val settings: ProcessorSettings,
) {
    val mappedFamilyByFqName = mutableMapOf<String, ScriptFamily>()
    val mappedTypeByKey = mutableMapOf<TypeCacheKey, Type>()
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()
    val hierarchyMethodSignaturesByClass = mutableMapOf<String, Set<String>>()
    val errors = mutableListOf<String>()

    fun addError(error: String) {
        errors += error
    }

    fun getClassInfoOrNull(fqName: String): ClassInfo? = scanResult.getClassInfo(fqName)
}

data class TypeCacheKey(
    val fqName: String,
    val typeArgumentDescriptors: List<String>,
)
