package godot.intellij.plugin.inspections.registration.inspector

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.quickfix.ClassNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.*

class RegisterClassInspection : AbstractKotlinInspection() {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return classVisitor { ktClass ->
            if (ktClass.findAnnotation(FqName("godot.annotation.RegisterClass")) == null) {
                if (ktClass.getProperties().any { ktProperty -> ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) != null }) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered properties but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
                if (ktClass.getProperties().any { ktProperty -> ktProperty.findAnnotation(FqName("godot.annotation.RegisterSignal")) != null }) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered signals but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
                if (ktClass.declarations.any { it.findAnnotation(FqName("godot.annotation.RegisterFunction")) != null }) {
                    holder.registerProblem(
                        ktClass.nameIdentifier ?: ktClass.navigationElement,
                        "This class contains registered functions but is not registered",
                        classNotRegisteredQuickFix
                    )
                }
            } else  {
                checkConstructorParameterCount(ktClass, holder)
            }
        }
    }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: ProblemsHolder) {
        ktClass.allConstructors.forEach { ktConstructor ->
            if (ktConstructor.valueParameters.size > 5) {
                holder.registerProblem(
                    ktConstructor.valueParameterList?.psiOrParent ?: ktConstructor.nameIdentifier ?: ktConstructor.navigationElement,
                    "Godot cannot handle constructors for registered classes with more than 5 parameters. Reduce your parameter count"
                )
            }
        }
    }
}
