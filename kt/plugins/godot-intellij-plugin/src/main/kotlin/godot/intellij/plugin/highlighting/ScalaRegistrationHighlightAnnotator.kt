package godot.intellij.plugin.highlighting

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.openapi.components.service
import com.intellij.psi.PsiElement
import godot.intellij.plugin.project.isInGodotRoot
import godot.intellij.plugin.registration.RegistrationSettings
import org.jetbrains.plugins.scala.lang.psi.api.statements.ScFunction
import org.jetbrains.plugins.scala.lang.psi.api.statements.ScFunctionDefinition
import org.jetbrains.plugins.scala.lang.psi.api.statements.ScValueOrVariable
import org.jetbrains.plugins.scala.lang.psi.api.statements.ScValueOrVariableDefinition
import org.jetbrains.plugins.scala.lang.psi.api.toplevel.typedef.ScTypeDefinition

class ScalaRegistrationHighlightAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.project.service<RegistrationSettings>().state.registrationHighlightsEnabled) return
        if (!element.isInGodotRoot()) return

        when (element) {
            is ScTypeDefinition ->
                highlightRegistrationDeclaration(
                    element,
                    element.nameIdentifier,
                    element.extendsBlock().templateBody().orNull(),
                    RegistrationHighlightClassifier.classify(element),
                    holder
                )

            is ScValueOrVariable ->
                highlightRegistrationDeclaration(
                    element,
                    element.keywordToken(),
                    (element as? ScValueOrVariableDefinition)?.assignment()?.orNull(),
                    element.registrationHighlight(),
                    holder
                )

            is ScFunction ->
                highlightRegistrationDeclaration(
                    element,
                    element.nameIdentifier,
                    (element as? ScFunctionDefinition)?.assignment()?.orNull(),
                    RegistrationHighlightClassifier.classify(element),
                    holder
                )
        }
    }

    private fun ScValueOrVariable.registrationHighlight(): RegistrationHighlight? {
        val owner = containingClass ?: return null
        val names = buildSet {
            val iterator = declaredElements().iterator()
            while (iterator.hasNext()) {
                add(iterator.next().name)
            }
        }
        val getter = owner.methods.firstOrNull { method ->
            method.name in names && method.parameterList.parametersCount == 0
        } ?: return null
        val type = getter.returnType ?: return null

        return RegistrationHighlightClassifier.classifyJvmProperty(
            property = this,
            owner = owner,
            type = type,
            isImmutable = isStable
        )
    }

    private fun <T> scala.Option<T>.orNull(): T? =
        takeIf { option -> option.isDefined }?.get()
}
