package godot.intellij.plugin.inspections.registration.inspector.clazz

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.quickfix.ClassNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.allConstructors
import org.jetbrains.kotlin.psi.classVisitor

private const val MAX_CONSTRUCTOR_ARGS = 5
class RegisterClassInspection : AbstractKotlinInspection() {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return classVisitor { ktClass ->
            if (ktClass.findAnnotation(FqName("godot.annotation.RegisterClass")) == null) {
                if (anyPropertyHasAnnotation(ktClass, "godot.annotation.RegisterProperty")) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered properties but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
                if (anyPropertyHasAnnotation(ktClass, "godot.annotation.RegisterSignal")) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered signals but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
                if (anyPropertyHasAnnotation(ktClass, "godot.annotation.RegisterFunction")) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered functions but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
            } else {
                checkConstructorParameterCount(ktClass, holder)
            }
        }
    }

    private fun anyPropertyHasAnnotation(ktClass: KtClass, annotationFqName: String) = ktClass
        .getProperties()
        .any { ktProperty ->
            ktProperty.findAnnotation(FqName(annotationFqName)) != null
        }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: ProblemsHolder) {
        ktClass.allConstructors.forEach { ktConstructor ->
            if (ktConstructor.valueParameters.size > MAX_CONSTRUCTOR_ARGS) {
                holder.registerProblem(
                    ktConstructor.valueParameterList?.psiOrParent ?: ktConstructor.nameIdentifier ?: ktConstructor.navigationElement,
                    "Godot cannot handle constructors for registered classes with more than 5 parameters. Reduce your parameter count"
                )
            }
        }
    }
}
