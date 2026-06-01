package godot.annotation.processor.classgraph

import godot.registration.model.types.ScriptFamily
import godot.registration.model.types.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
        private set

    // The same class is reached repeatedly when different registered classes share parents or interfaces.
    // Holds the mapped node (ScriptClass / GodotBaseClass / ScriptInterface — all are ScriptFamily).
    val mappedFamilyByFqName = mutableMapOf<String, ScriptFamily>()

    // The same generic type shape is revisited from multiple fields, parameters, return types, and supertypes.
    val mappedTypeByKey = mutableMapOf<TypeCacheKey, Type>()

    // The same enum type can appear in many annotation arguments while mapping annotations across multiple classes.
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()

    // The same class hierarchy is checked for inherited method signatures once per candidate method unless memoized.
    val hierarchyMethodSignaturesByClass = mutableMapOf<String, Set<String>>()

    fun reset(scanResult: ScanResult) {
        this.scanResult = scanResult
        mappedFamilyByFqName.clear()
        mappedTypeByKey.clear()
        enumValueNamesByClass.clear()
        hierarchyMethodSignaturesByClass.clear()
    }

    fun getClassInfoOrNull(fqName: String): ClassInfo? = scanResult.getClassInfo(fqName)
}

data class TypeCacheKey(
    val fqName: String,
    val typeArgumentDescriptors: List<String>
)
