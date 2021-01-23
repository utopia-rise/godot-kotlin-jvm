package godot.intellij.plugin.inspections.registration.inspector.clazz

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.extension.getFqNameToRegisteredClassNamePair
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.inspections.registration.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.quickfix.ClassNotRegisteredQuickFix
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
                if (anyPropertyHasAnnotation(element, "godot.annotation.RegisterProperty")) {
                    holder.registerProblem(
                        "This class contains registered properties but is not registered",
                        errorLocation,
                        classNotRegisteredQuickFix
                    )
                }
                if (anyPropertyHasAnnotation(element, "godot.annotation.RegisterSignal")) {
                    holder.registerProblem(
                        "This class contains registered signals but is not registered",
                        errorLocation,
                        classNotRegisteredQuickFix
                    )
                }
                if (anyFunctionHasAnnotation(element, "godot.annotation.RegisterFunction")) {
                    holder.registerProblem(
                        "This class contains registered functions but is not registered",
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

    private fun anyPropertyHasAnnotation(ktClass: KtClass, annotationFqName: String) = ktClass
        .getProperties()
        .any { ktProperty ->
            ktProperty.findAnnotation(FqName(annotationFqName)) != null
        }

    private fun anyFunctionHasAnnotation(ktClass: KtClass, annotationFqName: String) = ktClass
        .declarations
        .any { declaration ->
            declaration.findAnnotation(FqName(annotationFqName)) != null
        }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: AnnotationHolder) {
        ktClass.allConstructors.forEach { ktConstructor ->
            if (ktConstructor.valueParameters.size > MAX_CONSTRUCTOR_ARGS) {
                holder.registerProblem(
                    "Godot cannot handle constructors for registered classes with more than 5 parameters. Reduce your parameter count",
                    ktConstructor.valueParameterList?.psiOrParent ?: ktConstructor.nameIdentifier ?: ktConstructor.navigationElement
                )
            }
        }
    }

    private fun checkRegisteredClassName(ktClass: KtClass, holder: AnnotationHolder) {
        val (fqName, registeredName) = ktClass.getFqNameToRegisteredClassNamePair() ?: return
        val fqNames = RegisteredClassNameCheckerProvider
            .provide(ktClass.project)
            .getFqNamesRegisteredWithName(registeredName)

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
                "Class name already registered",
                psiElement,
                ClassAlreadyRegisteredQuickFix(registeredName)
            )
        }
    }
}
