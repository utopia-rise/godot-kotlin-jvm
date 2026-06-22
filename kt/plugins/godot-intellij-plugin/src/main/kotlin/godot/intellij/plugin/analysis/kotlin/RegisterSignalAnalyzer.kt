package godot.intellij.plugin.analysis.kotlin

import com.intellij.codeInspection.ProblemHighlightType
import godot.annotation.Emit
import godot.core.Signal
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import org.jetbrains.kotlin.scripting.resolve.classId
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.quickfix.EmitMutabilityQuickFix
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

object EmitAnalyzer {
    private val mutabilityQuickFix = EmitMutabilityQuickFix()

    fun analyze(property: KtProperty): List<GodotProblem> {
        if (property.findAnnotation(Emit::class.classId) == null) return emptyList()

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
            if (!property.isOrInheritsType(Signal::class.classId)) {
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

