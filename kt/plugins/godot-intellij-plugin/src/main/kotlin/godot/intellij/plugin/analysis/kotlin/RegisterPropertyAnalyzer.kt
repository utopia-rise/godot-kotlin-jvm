package godot.intellij.plugin.analysis.kotlin

import godot.annotation.EnumFlag
import godot.annotation.Export
import godot.annotation.RegisterProperty
import godot.core.KtObject
import godot.core.VariantArray
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import org.jetbrains.kotlin.scripting.resolve.classId
import godot.intellij.plugin.project.isCoreType
import godot.intellij.plugin.project.isGodotPrimitive
import godot.intellij.plugin.project.isNullable
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.isSupportedJvmType
import godot.intellij.plugin.project.withType
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import godot.tools.common.constants.isCollectionsType
import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.symbols.typeParameters
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

object RegisterPropertyAnalyzer {
    private val mutabilityQuickFix = RegisterPropertyMutabilityQuickFix()
    private val propertyNotRegisteredQuickFix = PropertyNotRegisteredQuickFix()

    fun analyze(property: KtProperty): List<GodotProblem> {
        return buildList {
            if (property.findAnnotation(RegisterProperty::class.classId) != null) {
                addAll(GenericRegistrationAnalyzer.analyze(property.toLightElements().firstIsInstance()))
                if (!property.isVar) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.property.mutability"),
                            property.valOrVarKeyword,
                            arrayOf(mutabilityQuickFix)
                        )
                    )
                }
                addAll(checkRegisteredType(property))
                if (property.hasModifier(org.jetbrains.kotlin.lexer.KtTokens.LATEINIT_KEYWORD) && (property.isCoreType() || property.isGodotPrimitive())) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.property.lateinit.coreType"),
                            property.nameIdentifier ?: property.navigationElement
                        )
                    )
                }
                if (property.isNullable() && (property.isCoreType() == true || property.isGodotPrimitive() == true)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.property.nullable"),
                            property.nameIdentifier ?: property.navigationElement
                        )
                    )
                }
            }

            if (property.findAnnotation(Export::class.classId) != null && property.findAnnotation(RegisterProperty::class.classId) == null) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.property.export.notRegistered"),
                        property.nameIdentifier ?: property.navigationElement,
                        arrayOf(propertyNotRegisteredQuickFix)
                    )
                )
            }
        }
    }

    @OptIn(KaExperimentalApi::class)
    private fun checkRegisteredType(property: KtProperty): List<GodotProblem> {
        val problems = mutableListOf<GodotProblem>()
        val isEnumCollection = property.withType { propertyType ->
            propertyType.symbol?.classId?.asFqNameString()?.let(::isCollectionsType) == true
                && propertyType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumCollection && property.findAnnotation(EnumFlag::class.classId) == null) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.registeredKotlinCollection"),
                property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
            )
        }

        val isEnumVariantArray = property.withType { propertyType ->
            propertyType.symbol?.classId?.asFqNameString()?.startsWith(VariantArray::class.qualifiedName!!) == true
                && propertyType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumVariantArray) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
            )
        }

        val isInheritingObject = property.isOrInheritsType(KtObject::class.classId)
        if (!isInheritingObject && !property.isCoreType() && !property.isSupportedJvmType()) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.export.triedToExportUnsupportedType"),
                property.nameIdentifier ?: property.navigationElement
            )
        }

        return problems
    }
}
