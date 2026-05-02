package godot.intellij.plugin.analysis.kotlin

import com.intellij.codeInspection.ProblemHighlightType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.quickfix.RegisterSignalMutabilityQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

object RegisterSignalAnalyzer {
    private val mutabilityQuickFix = RegisterSignalMutabilityQuickFix()

    fun analyze(property: KtProperty): List<GodotProblem> {
        if (property.findAnnotation(asClassId(REGISTER_SIGNAL_ANNOTATION)) == null) return emptyList()

        return buildList {
            addAll(GenericRegistrationAnalyzer.analyze(property.toLightElements().firstIsInstance()))
            if (property.isVar) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.mutability"),
                        property.valOrVarKeyword,
                        arrayOf(mutabilityQuickFix),
                        ProblemHighlightType.WARNING
                    )
                )
            }
            if (!property.isOrInheritsType(asClassId("$godotCorePackage.${GodotKotlinJvmTypes.signal}"))) {
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
