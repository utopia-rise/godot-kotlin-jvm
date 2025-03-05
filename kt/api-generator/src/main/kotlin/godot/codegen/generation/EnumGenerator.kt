package godot.codegen.generation

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.services.IApiGenerationService
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage

object EnumGenerator {

    fun generate(enum: EnrichedEnum, context: IApiGenerationService): Pair<List<TypeSpec>, List<FunSpec>> {
        val packageName = if (enum.outerClass == null) {
            godotCorePackage
        } else {
            "$godotApiPackage.${enum.outerClass}"
        }

        val enumBuilder = TypeSpec.enumBuilder(enum.name)
        enumBuilder.primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter("id", Long::class)
                .addStatement("this.%N = %N", "id", "id")
                .build()
        )
        enumBuilder.addProperty("id", Long::class)

        for (value in enum.values) {
            enumBuilder.addEnumConstant(
                value.name,
                TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%L", value.value)
                    .addKdoc(value)
                    .build()
            )
        }

        val companion = TypeSpec.companionObjectBuilder()
            .addFunction(
                FunSpec.builder("from")
                    .returns(ClassName(packageName, enum.name))
                    .addParameter("value", Long::class)
                    .addStatement("return·entries.single·{·it.%N·==·%N·}", "id", "value")
                    .build()
            )
            .build()
        enumBuilder.addType(companion)
        return listOf(enumBuilder.build()) to listOf()
    }


}
