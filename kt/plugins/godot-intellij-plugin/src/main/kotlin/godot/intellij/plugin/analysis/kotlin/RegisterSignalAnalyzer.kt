package godot.intellij.plugin.analysis.kotlin

import com.intellij.codeInspection.ProblemHighlightType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import godot.intellij.plugin.project.hasArgumentNameAnnotation
import godot.intellij.plugin.project.isGodotRegisteredSignal
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.quickfix.RegisterSignalMutabilityQuickFix
import godot.tools.common.names.CoreType
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

object RegisterSignalAnalyzer {
    private val mutabilityQuickFix = RegisterSignalMutabilityQuickFix()

    fun analyze(property: KtProperty): List<GodotProblem> {
        val isRegisteredSignal = property.isGodotRegisteredSignal()
        val hasArgumentNameAnnotation = property.hasArgumentNameAnnotation()

        if (!isRegisteredSignal && !hasArgumentNameAnnotation) return emptyList()

        return buildList {
            addAll(GenericRegistrationAnalyzer.analyze(property.toLightElements().firstIsInstance()))
            if (isRegisteredSignal && property.isVar) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.mutability"),
                        property.valOrVarKeyword,
                        arrayOf(mutabilityQuickFix),
                        ProblemHighlightType.WARNING
                    )
                )
            }
            if (isRegisteredSignal && (property.hasModifier(KtTokens.OPEN_KEYWORD) || property.hasModifier(KtTokens.ABSTRACT_KEYWORD))) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.openOrAbstract"),
                        property.modifierList ?: property.nameIdentifier ?: property.navigationElement
                    )
                )
            }
            if (isRegisteredSignal && property.hasModifier(KtTokens.OVERRIDE_KEYWORD)) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.override"),
                        property.modifierList ?: property.nameIdentifier ?: property.navigationElement
                    )
                )
            }
            if (!property.isOrInheritsType(CoreType.signal)) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.wrongType"),
                        property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
                    )
                )
            }
        }
    }
}
