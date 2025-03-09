package godot.codegen.generation

import com.squareup.kotlinpoet.MemberName
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.jvmVariantTypeValue
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.services.IApiGenerationService
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.godotCorePackage
import java.io.File

object RegistrationGenerator {
    val registrationFileSpec = RegistrationFileSpec()

    fun generateCommonRegistrationForClass(
        clazz: EnrichedClass,
        registrationFunc: RegistrationFileSpec.(EnrichedClass) -> Unit,
    ) {
        registrationFileSpec.registrationFunc(clazz)
        addVariantMapping(clazz)

        registrationFileSpec.registerMethodsFunBuilder.addStatement(
            "%T",
            clazz.getClassName().nestedClass(methodBindingsInnerClassName)
        )
    }

    fun addVariantMapping(enrichedClass: EnrichedClass) {
        registrationFileSpec.registerVariantMappingFunBuilder.addStatement(
            "%M[%T::class] = %T",
            MemberName(godotCorePackage, "variantMapper"),
            enrichedClass.getClassName(),
            enrichedClass.jvmVariantTypeValue
        )
    }

    private fun addRegisterEngineType(clazz: EnrichedClass, isSingleton: Boolean) {
        val formatString = if (isSingleton) {
            "%T.registerEngineType(%S, %T::class) { %T }"
        } else {
            "%T.registerEngineType(%S, %T::class, ::%T)"
        }
        val typeName = clazz.getClassName()
        registrationFileSpec.registerTypesFunBuilder.addStatement(
            formatString,
            TYPE_MANAGER,
            clazz.type,
            typeName,
            typeName
        )
    }


    fun generateEngineTypesRegistrationForClass(
        clazz: EnrichedClass
    ) {
        generateCommonRegistrationForClass(
            clazz
        ) { addRegisterEngineType(it, false) }
    }

    fun generateEngineTypesRegistrationForSingleton(
        singleton: EnrichedClass
    ) {
        generateCommonRegistrationForClass(
            singleton
        ) {
            addRegisterEngineType(it, true)
            addRegisterSingleton(it)
        }
    }

    fun generateEngineRegistration(outputDir: File) {
        registrationFileSpec.build().writeTo(outputDir)
    }

    fun addRegisterSingleton(clazz: EnrichedClass) {
        registrationFileSpec.registerTypesFunBuilder.addStatement(
            "%T.registerSingleton(%S)",
            TYPE_MANAGER,
            clazz.type
        )
    }
}
