package godot.intellij.plugin.inspections.registration.property.inspector

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.property.quickfix.ClassNotRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.typeUtil.isEnum

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
