package godot.codegen.repositories.impl

import godot.codegen.models.ApiType
import godot.codegen.models.Singleton
import godot.codegen.models.Class
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.ClassRepository
import kotlin.collections.associateBy

class JsonClassRepository(
    classes: List<Class>,
    singleton: List<Singleton>
) : ClassRepository {
    val typeList = classes.toEnriched().filter { it.apiType == ApiType.CORE }
    val typeMap = typeList.associateBy { it.type }

    init {
        // Set parent/child relationship
        classes.forEach {
            val enrichedChild = typeMap[it.name]
            val enrichedParent = typeMap[it.inherits]
            if(enrichedParent != null && enrichedChild != null){
                enrichedChild.setParent(enrichedParent)
            }
        }

        // Set singletons
        singleton.forEach {
            typeMap[it.type]?.makeSingleton()
        }
    }

    val singletonList = typeList.filter { it.isSingleton }
    val singletonMap = singletonList.associateBy { it.type }

    val classList = typeList.filter { !it.isSingleton && it.parent?.isSingleton != true }
    val classMap= classList.associateBy { it.type }

    override fun listTypes() = typeList
    override fun listClasses() = classList
    override fun listSingleton() = singletonList

    override fun findTypeByName(name: String) = typeMap[name]
    override fun findClassByName(name: String) = classMap[name]
    override fun findSingletonByName(name: String) = singletonMap[name]
}
