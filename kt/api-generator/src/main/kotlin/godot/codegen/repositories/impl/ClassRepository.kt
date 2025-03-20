package godot.codegen.repositories.impl


import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.models.Singleton
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.IClassRepository
import godot.tools.common.constants.GodotTypes

class ClassRepository(
    classes: List<Class>,
    singleton: List<Singleton>
) : IClassRepository {
    val typeList = classes.toEnriched().filter { it.apiType == ApiType.CORE }
    val typeMap = typeList.associateBy { it.identifier }

    init {
        // Set parent/child relationship
        classes.forEach {
            val enrichedChild = typeMap[it.name]
            val enrichedParent = typeMap[it.inherits]
            if (enrichedParent != null && enrichedChild != null) {
                enrichedChild.setParent(enrichedParent)
            }
        }

        // Set singletons
        singleton.forEach {
            typeMap[it.type]?.makeSingleton()
        }

        initializeProperties()
    }

    val singletonList = typeList.filter { it.isSingleton }
    val singletonMap = singletonList.associateBy { it.identifier }

    val classList = typeList.filter { !it.isSingleton && it.parent?.isSingleton != true }
    val classMap = classList.associateBy { it.identifier }

    override fun listTypes() = typeList
    override fun listClasses() = classList
    override fun listSingletons() = singletonList

    override fun findTypeByName(name: String) = typeMap[name]
    override fun findClassByName(name: String) = classMap[name]
    override fun findSingletonByName(name: String) = singletonMap[name]

    private fun validateGetter(property: EnrichedProperty, getter: EnrichedMethod?) {
        if (getter == null) return
        if (getter.type.isVoid() || getter.arguments.size > 1 || getter.isVirtual) return
        if (!property.isIndexed && getter.arguments.size == 1) return
        if (getter.arguments.size == 1 && !getter.arguments[0].type.isEnum() && getter.arguments[0].type.identifier != GodotTypes.int) return
        property.setGetter(getter)
    }

    private fun validateSetter(property: EnrichedProperty, setter: EnrichedMethod?) {
        if (setter == null) return
        if (!setter.type.isVoid() || setter.arguments.size > 2 || setter.isVirtual) return
        if (!property.isIndexed && setter.arguments.size == 2) return
        if (setter.arguments.size == 2 && !setter.arguments[0].type.isEnum() && setter.arguments[0].type.identifier != GodotTypes.int) return
        property.setSetter(setter)
    }

    private fun searchPropertyForClass(properties: List<EnrichedProperty>, clazz: EnrichedClass): Boolean {
        val methods = clazz.methods.associateBy { it.name }
        var allSet = true
        for (property in properties) {
            if (property.name == "") continue
            val needGetter = property.getterMethod == null
            val needSetter = property.setterName != null && property.setterMethod == null

            if (needGetter) {
                validateGetter(property, methods[property.getterName])
            }

            if (needSetter) {
                validateSetter(property, methods[property.setterName])
            }

            if (property.getterMethod == null || (property.setterName != null && property.setterMethod == null)) {
                allSet = false
            }
        }
        return allSet
    }

    private fun initializeProperties() {
        for (clazz in typeList) {
            var currentClass: EnrichedClass? = clazz
            do {
                searchPropertyForClass(clazz.properties, currentClass!!)
                currentClass = currentClass.parent
            } while (currentClass != null)
        }
    }

}
