package godot.intellij.plugin.annotator.clazz

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.cache.RegisteredClassNameCacheProvider
import godot.intellij.plugin.extension.anyFunctionHasAnnotation
import godot.intellij.plugin.extension.anyPropertyHasAnnotation
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.allConstructors

private const val MAX_CONSTRUCTOR_ARGS = 5

class RegisterClassAnnotator : Annotator {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is KtClass) {
            if (element.findAnnotation(FqName("godot.annotation.RegisterClass")) == null) {
                val errorLocation = element.nameIdentifier ?: element.navigationElement
                if (element.anyPropertyHasAnnotation("godot.annotation.RegisterProperty")) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.notRegistered.properties"),
                        errorLocation,
                        classNotRegisteredQuickFix
                    )
                }
                if (element.anyPropertyHasAnnotation("godot.annotation.RegisterSignal")) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.notRegistered.signals"),
                        errorLocation,
                        classNotRegisteredQuickFix
                    )
                }
                if (element.anyFunctionHasAnnotation("godot.annotation.RegisterFunction")) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.notRegistered.functions"),
                        errorLocation,
                        classNotRegisteredQuickFix
                    )
                }
            } else {
                checkConstructorParameterCount(element, holder)
                checkRegisteredClassName(element, holder)
            }
        }
    }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: AnnotationHolder) {
        ktClass.allConstructors.forEach { ktConstructor ->
            if (ktConstructor.valueParameters.size > MAX_CONSTRUCTOR_ARGS) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.class.constructor.toManyParams"),
                    ktConstructor.valueParameterList?.psiOrParent ?: ktConstructor.nameIdentifier ?: ktConstructor.navigationElement
                )
            }
        }
    }

    private fun checkRegisteredClassName(ktClass: KtClass, holder: AnnotationHolder) {
        val (fqName, registeredName) = ktClass.getRegisteredClassName() ?: return
        val fqNames = RegisteredClassNameCacheProvider.provide(ktClass.project)
            .getContainersByName(registeredName)
            .map { container -> container.fqName }

        if (fqNames.size > 1 || (fqNames.size == 1 && !fqNames.contains(fqName))) {
            val registerClassAnnotation = ktClass.findAnnotation(FqName("godot.annotation.RegisterClass"))
            val psiElement = if (registerClassAnnotation == null) {
                ktClass.nameIdentifier ?: ktClass.navigationElement
            } else {
                val valueArgumentList = registerClassAnnotation.valueArgumentList
                if (valueArgumentList != null) {
                    valueArgumentList.arguments.firstOrNull { argument ->
                        argument.getArgumentName()?.asName?.asString() == "customClassName"
                    } ?: valueArgumentList.arguments.last()
                } else {
                    registerClassAnnotation
                }
            }
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                psiElement,
                ClassAlreadyRegisteredQuickFix(registeredName)
            )
        }
    }
}
