package godot.intellij.plugin.analysis.kotlin

import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.isCoreType
import godot.intellij.plugin.project.isGodotPrimitive
import godot.intellij.plugin.project.isNullable
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.isSupportedJvmType
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import godot.tools.common.names.API
import godot.tools.common.names.Registration
import godot.tools.common.names.CoreType
import godot.tools.common.names.Kotlin
import godot.tools.common.names.qualifiedName
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
            if (property.findAnnotation(Registration.visible.asClassId()) != null) {
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

            if (property.findAnnotation(Registration.export.asClassId()) != null && property.findAnnotation(Registration.visible.asClassId()) == null) {
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
        val isEnumCollection = analyze(property) {
            property.returnType.symbol?.classId?.asFqNameString()?.let(Kotlin::isCollectionsType) == true
                && property.returnType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumCollection && property.findAnnotation(Registration.enumFlag.asClassId()) == null) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.registeredKotlinCollection"),
                property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
            )
        }

        val isEnumVariantArray = analyze(property) {
            property.returnType.symbol?.classId?.asFqNameString()?.startsWith(CoreType.variantArray.qualifiedName) == true
                && property.returnType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumVariantArray) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
            )
        }

        val isInheritingObject = property.isOrInheritsType(API.`object`)
        if (!isInheritingObject && !property.isCoreType() && !property.isSupportedJvmType()) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.export.triedToExportUnsupportedType"),
                property.nameIdentifier ?: property.navigationElement
            )
        }

        return problems
    }
}
