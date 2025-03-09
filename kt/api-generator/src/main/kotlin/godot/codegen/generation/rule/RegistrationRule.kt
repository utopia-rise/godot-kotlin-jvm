package godot.codegen.generation.rule

import com.squareup.kotlinpoet.MemberName
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.jvmVariantTypeValue
import godot.codegen.generation.Context
import godot.codegen.generation.task.RegistrationTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.godotCorePackage

class RegistrationRule() : GodotApiRule<RegistrationTask>() {
    override fun apply(task: RegistrationTask, context: Context) {
        context
            .classRepository
            .listTypes()
            .filter { clazz ->  //Remove class extending singletons
                val parent = clazz.parent
                parent == null || parent.isSingleton == false
            }.onEach { clazz ->
                task.addVariantMapping(clazz)
                task.addClassRegistering(clazz)
                task.addMethodBindings(clazz)
            }
}

fun RegistrationTask.addVariantMapping(enrichedClass: EnrichedClass) {
    variantMapper.addStatement(
        "%M[%T::class] = %T",
        MemberName(godotCorePackage, "variantMapper"),
        enrichedClass.getClassName(),
        enrichedClass.jvmVariantTypeValue
    )
}

fun RegistrationTask.addClassRegistering(clazz: EnrichedClass) {
    val formatString: String
    if (clazz.isSingleton) {
        engineTypes.addStatement("%T.registerSingleton(%S)", TYPE_MANAGER, clazz.type)
        formatString = "%T.registerEngineType(%S, %T::class) { %T }"
    } else {
        formatString = "%T.registerEngineType(%S, %T::class, ::%T)"
    }
    engineTypes.addStatement(
        formatString,
        TYPE_MANAGER,
        clazz.type,
        clazz.getClassName(),
        clazz.getClassName()
    )
}

fun RegistrationTask.addMethodBindings(clazz: EnrichedClass) {
    engineMethods.addStatement(
        "%T",
        clazz.getClassName().nestedClass(methodBindingsInnerClassName)
    )
}
}
